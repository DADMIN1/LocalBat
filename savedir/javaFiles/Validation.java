import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import javax.tools.ToolProvider;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import com.sun.source.tree.CompilationUnitTree;
import com.sun.source.tree.ClassTree;
import com.sun.source.tree.MethodTree;
import com.sun.source.util.JavacTask;


public class Validation
{
    record FunctionRec(String functionName, String returnType, String parameters, String body) {}
    record ProblemRec(String name, String section, boolean passed, Timestamp lastcheck) {}
    static class SectionManifest
    {
        String sectionName;
        Map<String, Validation.ProblemRec> problems;
        Map<String, List<Validation.FunctionRec>> solutions;
        SectionManifest(String sectionName) {
            this.sectionName = sectionName;
            problems = new HashMap<>();
            solutions = new HashMap<>();
        }
    }

    public static void main(String[] args) 
    {
        // uncomment the sections you want to validate.
        String[] sections = {
            //"AP1",
            //"Map1",
            //"Map2",
            //"Array1",
            //"Logic1",
            //"Logic2",
            //"Array2",
            //"Array3",
            //"Warmup1",
            //"Warmup2",
            //"String1",
            //"String2",
            //"String3",
            //"Recursion1",
            //"Recursion2",
            //"Functional1",
            //"Functional2",
        };
        
        System.out.println("\nJava version: "+Parser.javaVersion);
        System.out.println("Source-Path: "+QuoteSQL(cwd));
        if (!(new File(String.join(File.separator, cwd, "Validation.java"))).exists()) // this file
        { System.err.println("ERROR: this file does not exist under source path!"); System.exit(1); }
        System.out.println();
        
        Map<String, SectionManifest> sectionManifests = new HashMap<>();
        for (String section: sections)
        {
            SectionManifest manifest = new SectionManifest(section);
            String[][] sectionResults = ValidateSection(section); // pass/fail lists
            for (int i=0; i<2; ++i) for (String filename: sectionResults[i]) {
                ProblemRec prec = new ProblemRec(filename, section, (i==0), currentTime);
                manifest.problems.put(filename, prec);
                //System.out.println(prec);
            }
            System.out.println();
            
            // parsing files that passed validation
            List<File> sourceFiles = ConstructFilePaths(section, sectionResults[0]);
            for (File file: sourceFiles) {
                //PrintFileInfo(file);
                List<FunctionRec> solution = Parser.ParseFunctions(Parser.Compile(file));
                manifest.solutions.put(file.getName().replace(".java",""), solution);
                //solution.forEach(System.out::println);
                //System.out.println();
            }
            sectionManifests.put(section, manifest);
        }
        
        WriteSQL(sectionManifests);
        System.out.println();
    }

    static final LocalDateTime ReadableTimestamp(long timestamp) { return new Timestamp(timestamp).toLocalDateTime().truncatedTo(ChronoUnit.SECONDS); }
    static final LocalDateTime ReadableTimestamp(File fobj) { return ReadableTimestamp(fobj.lastModified()); }
    static final LocalDateTime ReadableTimestamp() { return ReadableTimestamp(System.currentTimeMillis()); }
    static final void PrintCurrentTime() {System.out.println("Current time: "+System.currentTimeMillis()+" ("+ReadableTimestamp()+")");}
    static final Timestamp CurrentTime() { return new Timestamp(System.currentTimeMillis()); }
    static final Timestamp currentTime = CurrentTime();
    static final String cwd = ( // locating actual source-directory; all methods of getting 'working directory' return the project-root directory in Eclipse.
        new File(String.join(File.separator, System.getProperty("user.dir"), "Validation.java")).exists()? // this file
        new File(System.getProperty("user.dir")): // source directory is project root; no problem.
        new File(String.join(File.separator, System.getProperty("user.dir"), "src")) // assuming Eclipse structure where this file is in the 'src' subdirectory
    ).getAbsolutePath();
    
    static final File ConstructFilePath(String section, String problem) 
    { return new File(String.join(File.separator, cwd, section, problem+".java")); }
    static final List<File> ConstructFilePaths(String section, String[] problems) 
    { return Arrays.asList(problems).stream().map((str) -> new File(String.join(File.separator, cwd, section, str+".java"))).toList(); }
    
    static final void PrintFileInfo(File fobj) 
    {
        System.out.print(fobj.getPath());
        System.out.print("\n  exists: "+fobj.exists());
        System.out.print("\n  MTIME: "+fobj.lastModified());
        System.out.println(" ("+ReadableTimestamp(fobj)+")\n");
    }
    static final void PrintFileInfo(List<File> fobjs) { for(final File fobj: fobjs) PrintFileInfo(fobj); }

    // returns lists of problem-names sorted by pass/fail
    static final String[][] ValidateSection(String section)
    {
        String[] problems = Database.GetProblemList(section);
        List<List<String>> results = new ArrayList<>(Arrays.asList(new ArrayList<String>(), new ArrayList<String>()));
        for (String problem: problems) {
            if (!Database.CheckMTIME(section+"."+problem, ConstructFilePath(section, problem).lastModified())) continue;
            if (Database.ValidateProblem(section+"."+problem)) results.get(0).add(problem);
            else results.get(1).add(problem);
        }
        return new String[][]{results.get(0).toArray(new String[0]), results.get(1).toArray(new String[0])};
    }

    static final String QuoteSQL(String str) { return "'"+str.replace("'", "\\'")+"'"; };
    static final void WriteSQL(Map<String, SectionManifest> sectionManifests)
    {
        System.out.println("-- BEGIN SQL --\n");
        System.out.println(
            "CREATE TABLE IF NOT EXISTS SectionManifest (\n" +
            "    problem TEXT NOT NULL,\n" +
            "    section TEXT NOT NULL,\n" +
            "    passed INTEGER,\n" +
            "    lastcheck INTEGER,\n" +
            "    PRIMARY KEY (problem,section)\n" +
            ");\n"
        );
        System.out.println(
            "CREATE TABLE IF NOT EXISTS Solutions (\n" +
            "    problem TEXT NOT NULL,\n" +
            "    section TEXT NOT NULL,\n" +
            "    functionName TEXT NOT NULL,\n" +
            "    returnType TEXT NOT NULL,\n" +
            "    parameters TEXT NOT NULL,\n" +
            "    functionBody TEXT NOT NULL,\n" +
            "    PRIMARY KEY (problem,section,functionName),\n" +
            "    FOREIGN KEY (problem,section) REFERENCES SectionManifest(problem,section)\n" +
            "    DEFERRABLE INITIALLY DEFERRED\n" +
            ");\n"
        );
        
        for (Entry<String, SectionManifest> entry: sectionManifests.entrySet()) 
        {
            String section = entry.getKey();
            for (Entry<String, ProblemRec> problem_entry: entry.getValue().problems.entrySet())
            {
                ProblemRec problem = problem_entry.getValue();
                System.out.print("INSERT INTO SectionManifest VALUES (");
                System.out.print(QuoteSQL(problem.name)+", ");
                System.out.print(QuoteSQL(section)+", ");
                System.out.print(problem.passed? 1 : 0);
                System.out.print(", ");
                System.out.print(currentTime.getTime());
                System.out.print(") ");
                System.out.println("ON CONFLICT DO UPDATE SET (passed, lastcheck) = (EXCLUDED.passed, EXCLUDED.lastcheck);");
            }
            System.out.println();
            for (Entry<String, List<FunctionRec>> solution_entry: entry.getValue().solutions.entrySet())
            {
                List<FunctionRec> solutions = solution_entry.getValue();
                for (FunctionRec solution: solutions) {
                    System.out.print("INSERT INTO Solutions VALUES (");
                    System.out.print(QuoteSQL(solution_entry.getKey())+", ");
                    System.out.print(QuoteSQL(section)+", ");
                    System.out.print(QuoteSQL(solution.functionName)+", ");
                    System.out.print(QuoteSQL(solution.returnType)+", ");
                    System.out.print(QuoteSQL(solution.parameters)+", ");
                    System.out.print(QuoteSQL(solution.body.replace(System.lineSeparator(), "\\n")));
                    System.out.print(") ");
                    System.out.println("ON CONFLICT DO UPDATE SET (functionName, returnType, parameters, functionBody) = (EXCLUDED.functionName, EXCLUDED.returnType, EXCLUDED.parameters, EXCLUDED.functionBody);");
                }
            }
            System.out.println();
        }
        System.out.println("-- END SQL --\n");
        return;
    }
}

class Parser
{
    static final JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
    static final StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, StandardCharsets.UTF_8);
    static final String javaVersion = System.getProperty("java.specification.version");
    //static final String highestJavaVer = Arrays.asList(compiler.getSourceVersions().toArray()).getLast().toString().replace("RELEASE_","");
    static final String ParamList(List<?> paramList) { return paramList.toString().replace(",", ", "); }

    static final JavacTask CreateTask(List<File> sourceFiles) {
        final Iterable<? extends JavaFileObject> compilationUnits = fileManager.getJavaFileObjectsFromFiles(sourceFiles);
        return (JavacTask) compiler.getTask(null, fileManager, null, List.of("--enable-preview", "--release", javaVersion), null, compilationUnits);
    }
    static final Iterable<? extends CompilationUnitTree> CompileFiles(List<File> sourceFiles) { 
        try { return CreateTask(sourceFiles).parse(); }
        catch (IOException E) { System.err.println(E); return null; }
    }
    static final CompilationUnitTree Compile(File sourceFile) {
        try { return CreateTask(new ArrayList<>(List.of(sourceFile))).parse().iterator().next(); }
        catch (IOException E) { System.err.println(E); return null; }
    }
    static final List<Validation.FunctionRec> ParseFunctions(CompilationUnitTree tree)
    {
        return ((ClassTree) tree.getTypeDecls().getLast()).getMembers().stream()
        .filter(MethodTree.class::isInstance).map(MethodTree.class::cast)
        .filter((mem) -> !mem.getName().toString().equals("main"))
        .map(F -> new Validation.FunctionRec(
            F.getName().toString(), F.getReturnType().toString(),
            ParamList(F.getParameters()), F.getBody().toString()
        )).toList();
    }
}

