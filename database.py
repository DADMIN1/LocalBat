from save import *
from generate import WriteJavaFile

import textwrap
import sqlite3
from collections import namedtuple


# location of the 'Database.java' file and SQLite database
DATABASE_PATH = savedir / "javaFiles"

# if you're using Eclipse, set it to the 'src' directory of the workspace
#DATABASE_PATH = pathlib.Path().home() / "localbat-workspace" / "localBat" / "src"

assert (DATABASE_PATH.is_dir() and DATABASE_PATH.exists())


def QuoteSQL(text:str): return "'"+text.replace("'", r"\'")+"'";

table_definitions = """
CREATE TABLE IF NOT EXISTS SectionManifest (
    problem TEXT NOT NULL,
    section TEXT NOT NULL,
    passed INTEGER,
    lastcheck INTEGER,
    PRIMARY KEY (problem,section)
);

CREATE TABLE IF NOT EXISTS Solutions (
    problem TEXT NOT NULL,
    section TEXT NOT NULL,
    functionName TEXT NOT NULL,
    returnType TEXT NOT NULL,
    parameters TEXT NOT NULL,
    functionBody TEXT NOT NULL,
    PRIMARY KEY (problem,section,functionName),
    FOREIGN KEY (problem,section) REFERENCES SectionManifest(problem,section)
    DEFERRABLE INITIALLY DEFERRED
);

CREATE TABLE IF NOT EXISTS Archive (
    problem TEXT NOT NULL,
    section TEXT NOT NULL,
    fullText TEXT NOT NULL,
    timestamp INTEGER NOT NULL,
    status INTEGER DEFAULT -1,
    PRIMARY KEY (problem,section,fullText)
);
"""

# https://docs.python.org/3/library/sqlite3.html#sqlite3-howto-row-factory
# allows column-access by attribute ('SELECT column AS asdf...' -> row.asdf)
def namedtuple_factory(cursor:sqlite3.Cursor, row:sqlite3.Row):
    fields = [column[0] for column in cursor.description]
    cls = namedtuple("Row", fields)
    return cls._make(row)

def dict_factory(cursor, row):
    fields = [column[0] for column in cursor.description]
    return {key: value for key, value in zip(fields, row)}

def LoadDB(factory=namedtuple_factory, inMem=False) -> sqlite3.Connection:
    if inMem: return sqlite3.connect(":memory:");
    dbfile = DATABASE_PATH / "localbat.db"
    if not dbfile.exists(): print(f"No database file found; creating new database");
    dbconn = sqlite3.connect(dbfile)
    print(f"loaded database: {dbfile.relative_to(DATABASE_PATH)}")
    dbconn.row_factory = factory
    with dbconn: # context manager enables autocommit/rollback for these transactions.
        dbconn.executescript(table_definitions)
    return dbconn


# combines all the stored data for a problem's functions into a single string
def CreateFulltext(section:str, problem: str):
    return (f"SELECT problem, group_concat(CONCAT(returnType,' ',functionName,' (',parameters,') ',functionBody), '\\n ') "
            f"AS fullText FROM Solutions WHERE section = {QuoteSQL(section)} AND problem = {QuoteSQL(problem)};")
    # returns one row for each function in the problem
    # f"SELECT returnType,functionName,parameters,functionBody FROM Solutions WHERE problem = {QuoteSQL(problem)};"
    # return f"SELECT problem, CONCAT(returnType,' ',functionName,' (',parameters,') ',functionBody) AS fullText FROM Solutions WHERE problem = {QuoteSQL(problem)};"


# moves new solutions into Archive/upload-queue
def Commit():
    statusCode = {
        -2: "unsubmitted & unqueued",
        -1: "queued for submit",
         0: "rejected",
         1: "accepted",
    }
    
    rowcount = 0
    submit_queue_count = 0
    db = LoadDB()
    with db: rowcount = db.execute('''INSERT INTO Archive 
        SELECT SectionManifest.problem, SectionManifest.section,
        group_concat(CONCAT(returnType,' ',functionName,' (',parameters,') ',functionBody), '\\n\\n ') AS fullText,
        SectionManifest.lastcheck AS timestamp, -1 AS status
        FROM SectionManifest JOIN Solutions 
        WHERE Solutions.section = SectionManifest.section AND Solutions.problem = SectionManifest.problem
        GROUP BY SectionManifest.problem, SectionManifest.section
        ON CONFLICT DO UPDATE SET timestamp = EXCLUDED.timestamp;''').rowcount;
    submit_queue_count = len(db.execute("SELECT * FROM Archive WHERE status = -1;").fetchall())
    db.close()
    print(f"committed {rowcount} solutions")
    print(f"{submit_queue_count} solutions queued for submission")
    # TODO: remove archived solutions
    return


def WriteJavaDatabase():
    print("writing Database.java")
    problem_lists, problem_counts, validation_calls = ConstructSectionManifests().values()
    
    db = LoadDB(factory=namedtuple_factory)
    lastchecked = [row for row in db.execute("SELECT DISTINCT section,problem,lastcheck AS timestamp FROM SectionManifest;")]
    archived = [row for row in db.execute("SELECT DISTINCT section,problem,timestamp FROM Archive;")]
    archived_accepted = [f"{row.section}.{row.problem}" for row in db.execute("SELECT DISTINCT section,problem FROM Archive WHERE status = 1;")]
    db.close()
    
    # absolutely disgusting comprehensions to isolate duplicates and get the most recent timestamp
    duplicate_rows = frozenset((r.section,r.problem) for r in lastchecked).intersection(frozenset((r.section,r.problem) for r in archived))
    corrections = {
        (section,problem): max(r.timestamp for r in {*lastchecked, *archived} if (r.section,r.problem)==(section,problem))
        for (section,problem) in duplicate_rows
    }
    
    # TODO: implement this early-out correctly by checking solutions
    #if len(lastchecked) == 0: return; # avoid rewriting file if no changes have been made
    # recording the timestamps for ALL problems (including failed/not-accepted) for exclusion (by MTIME)
    mtime_checks = "\n            ".join([
        f'case "{section}.{problem}": return mtime > {timestamp}L;'
        for (section,problem,timestamp) in {
            record if (record.section, record.problem) not in duplicate_rows
            else (record.section, record.problem, corrections[(record.section, record.problem)])
            for record in {*lastchecked, *archived}
        }
    ])
    
    CheckMTIME_defintion = '''
    static final boolean CheckMTIME(String fullname, long mtime)
    {
        switch(fullname)
        {
            ''' + mtime_checks + '''
            default: return true;
        }
    }\n\n'''
    
    with open(DATABASE_PATH / "Database.java", 'w', encoding="utf-8") as file:
        file.write("// the data in this file is regenerated by 'database.py' on commit\n")
        file.write("public class Database\n{\n")
        
         # returns list of problems
        file.write("    static final String[] GetProblemList(String section)\n    {\n    ")
        file.write("    switch(section)\n        {\n")
        for (section, problemlist) in sorted(problem_lists.items(), key=lambda T: len(T[0])):
            file.write("            ")
            file.write(f'case "{section}": return new String[]'+'{')
            
            for problem in sorted(problemlist):
                if not (f"{section}.{problem}" in archived_accepted): file.write(f'"{problem}",');
                else: file.write(f'/*"{problem}",*/'); # commenting-out archived problems with accepted submissions.
            file.write('};\n')
        file.write('            default: System.err.println("unknown section: "+section+"\\n"); return new String[]{};\n')
        file.write("        }\n") # closing switch statement
        file.write("    }\n") # closing GetProblemList
        
        file.write(CheckMTIME_defintion)
        
        # function to map the 'Validate' function to a fully qualified name (section.problem_name)
        file.write("    static final boolean ValidateProblem(String fullname)\n    {\n        ")
        file.write("switch(fullname)\n        {\n")
        for (name, call) in validation_calls.items():
            file.write(f'            case "{name}": {call}\n')
        file.write('            default: System.err.println("unrecognized problem name: "+fullname+"\\n"); return false;\n')
        file.write("        }\n") # closing switch statement
        file.write("    }\n") # closing ValidateProblem function
        file.write("}\n") # closing 'Database' class
    
    print("finished writing Database.java")
    return


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
    static final void PrintFileInfo(List<File> fobjs) { for(final File fobj: fobjs) PrintFileInfo(fobj); }'''+"\n"
    
    validate_section_function = '''
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
    }\n''' 
    
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
    
    with open(DATABASE_PATH / "Validation.java", 'w', encoding="utf-8") as file:
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
        file.write("}\n") # closing 'Validation' class
        file.write(parser_class_definition)
    
    print("finished writing Validation.java")
    return


# regenerates java files with archived solutions
def RestoreSolutions(targetDir=sub_savedirs[1]):
    print(f"restoring archived solutions to: {targetDir}")
    userinput = input("proceed? [Y/N]: ")
    if not userinput.capitalize() == 'Y': print("cancelled."); return;
    db = LoadDB()
    solutions = [row for row in db.execute("SELECT DISTINCT problem,section,fullText FROM Archive;")]
    db.close()
    print(f"loaded {len(solutions)} solutions")
    for (problem, section, fullText) in solutions:
        section_name = section[:-1] + "-" + section[-1] # putting the dash back in
        problem_name = problem[0].lower() + problem[1:] # first letter lowercase
        with open (sub_savedirs[0] / section_name / str(problem_name+".json")) as file:
            jsonData = json.load(file)
            provided_code = "public static final "+fullText.replace(r"\n\n", r"\n\npublic static final ") # jank hack to apply qualifiers to all functions (in WriteJavaFile) 
            WriteJavaFile(section_name, jsonData, provided_code=provided_code.replace(r'\n','\n    '), targetDir=targetDir)
    print("finished restoring solutions")
    return


if __name__ == "__main__":
    Commit()
    WriteJavaDatabase()
    #WriteJavaValidation()
    #RestoreSolutions()
