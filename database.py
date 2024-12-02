from save import *
import textwrap

def WriteJavaValidation():
    print("writing Validation.java")
    problem_lists, problem_counts, validation_calls = ConstructSectionManifests().values()
    sorted_section_list = sorted(problem_lists.keys(), key=lambda S: len(S))
    
    section_array_def = "\n            ".join([f'//"{section}",' for section in sorted_section_list])
    
    java_imports = textwrap.dedent('''
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
    import com.sun.source.util.JavacTask;\n\n\n''').removeprefix('\n')
    
    parser_class_definition = textwrap.dedent('''
    class Parser
    {
        static final JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        static final StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, StandardCharsets.UTF_8);
        static final String javaVersion = System.getProperty("java.specification.version");
        //static final String highestJavaVer = Arrays.asList(compiler.getSourceVersions().toArray()).getLast().toString().replace("RELEASE_","");

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
                F.getParameters().toString(), F.getBody().toString()
            )).toList();
        }
    }\n\n''')
    
    manifest_type_definitions = '''
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
    }\n'''
    
    sql_functions = r'''
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
                System.out.println(");");
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
                    System.out.println(");");
                }
            }
            System.out.println();
        }
        System.out.println("-- END SQL --\n");
        return;
    }'''+"\n"
    
    general_purpose_functions = r'''
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
    
    static final List<File> ConstructFilePaths(String section, String[] filenames) 
    { return Arrays.asList(filenames).stream().map((str) -> new File(String.join(File.separator, cwd, section, str+".java"))).toList(); }
    
    static final void PrintFileInfo(File fobj) 
    {
        System.out.print(fobj.getPath());
        System.out.print("\n  exists: "+fobj.exists());
        System.out.print("\n  MTIME: "+fobj.lastModified());
        System.out.println(" ("+ReadableTimestamp(fobj)+")\n");
    }
    static final void PrintFileInfo(List<File> fobjs) { for(final File fobj: fobjs) PrintFileInfo(fobj); }'''+"\n"
    
    validate_section_function = '''
    // returns lists of problem-names sorted by pass/fail
    static final String[][] ValidateSection(String section)
    {
        String[] problems = GetProblemList(section);
        List<List<String>> results = new ArrayList<>(Arrays.asList(new ArrayList<String>(), new ArrayList<String>()));
        for (String problem: problems) {
            if (ValidateProblem(section+"."+problem)) results.get(0).add(problem);
            else results.get(1).add(problem);
        }
        return new String[][]{results.get(0).toArray(new String[0]), results.get(1).toArray(new String[0])};
    }\n\n''' 
    
    main_function = '''
    public static void main(String[] args) 
    {
        // uncomment the sections you want to validate.
        String[] sections = {
            ''' + section_array_def + '''
        };
        
        System.out.println("\\nJava version: "+Parser.javaVersion);
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
    }\n'''
    
    with open(savedir / "javaFiles" / "Validation.java", 'w') as file:
        file.write(java_imports)
        # importing Testcase files, sorting by length of name
        # for section in sorted_section_list:
        #     file.write(f"import {section}.Testcases.*;\n")
        # file.write("\n\n")
        # These imports are unnecessary because the 'Validate' function-calls use the full package/class.
        # which is required because some problems/classes from different sections have the same name.
        
        file.write("public class Validation\n{")
        file.write(manifest_type_definitions)
        file.write(main_function)
        file.write(general_purpose_functions)
        file.write(validate_section_function)
        file.write(sql_functions)
        
        # returns list of problems
        file.write("    static final String[] GetProblemList(String section)\n    {\n    ")
        file.write("    switch(section)\n        {\n")
        for (section, problemlist) in sorted(problem_lists.items(), key=lambda T: len(T[0])):
            file.write("            ")
            file.write(f'case "{section}": return new String[]'+'{')
            for problem in sorted(problemlist): file.write(f'"{problem}",');
            file.write('};\n')
        file.write('            default: System.err.println("unknown section: "+section+"\\n"); return new String[]{};\n')
        file.write("        }\n") # closing switch statement
        file.write("    }\n\n") # closing GetProblemList
        
        # function to map the 'Validate' function to a fully qualified name (section.problem_name)
        file.write("    static final boolean ValidateProblem(String fullname)\n    {\n        ")
        file.write("switch(fullname)\n        {\n")
        for (name, call) in validation_calls.items():
            file.write(f'            case "{name}": {call}\n')
        file.write('            default: System.err.println("unrecognized problem name: "+fullname+"\\n"); return false;\n')
        file.write("        }\n") # closing switch statement
        file.write("    }\n") # closing ValidateProblem function
        file.write("}\n") # closing 'Validation' class
        
        file.write(parser_class_definition)
    
    print("finished writing Validation.java")
    return


if __name__ == "__main__":
    WriteJavaValidation()
