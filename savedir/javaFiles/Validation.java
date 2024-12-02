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
    
    static final List<File> ConstructFilePaths(String section, String[] filenames) 
    { return Arrays.asList(filenames).stream().map((str) -> new File(String.join(File.separator, cwd, section, str+".java"))).toList(); }
    
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
        String[] problems = GetProblemList(section);
        List<List<String>> results = new ArrayList<>(Arrays.asList(new ArrayList<String>(), new ArrayList<String>()));
        for (String problem: problems) {
            if (ValidateProblem(section+"."+problem)) results.get(0).add(problem);
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
    }
    static final String[] GetProblemList(String section)
    {
        switch(section)
        {
            case "AP1": return new String[]{"BigHeights","CommonTwo","CopyEndy","CopyEvens","DividesSelf","HasOne","MatchUp","MergeTwo","ScoreUp","Scores100","ScoresAverage","ScoresClump","ScoresIncreasing","ScoresSpecial","SumHeights","SumHeights2","UserCompare","WordsCount","WordsFront","WordsWithout","WordsWithoutList",};
            case "Map1": return new String[]{"MapAB","MapAB2","MapAB3","MapAB4","MapBully","MapShare","Topping1","Topping2","Topping3",};
            case "Map2": return new String[]{"AllSwap","FirstChar","FirstSwap","Pairs","Word0","WordAppend","WordCount","WordLen","WordMultiple",};
            case "Array1": return new String[]{"BiggerTwo","CommonEnd","Double23","FirstLast6","Fix23","Front11","FrontPiece","Has23","Make2","MakeEnds","MakeLast","MakeMiddle","MakePi","MaxEnd3","MaxTriple","MidThree","MiddleWay","No23","PlusTwo","Reverse3","RotateLeft3","SameFirstLast","Start1","Sum2","Sum3","SwapEnds","Unlucky1",};
            case "Logic1": return new String[]{"AlarmClock","AnswerCell","BlueTicket","CaughtSpeeding","CigarParty","DateFashion","FizzString","FizzString2","GreenTicket","In1To10","InOrder","InOrderEqual","LastDigit","Less20","LessBy10","Love6","MaxMod5","More20","NearTen","Old35","RedTicket","ShareDigit","SortaSum","SpecialEleven","SquirrelPlay","SumLimit","TeaParty","TeenSum","TwoAsOne","WithoutDoubles",};
            case "Logic2": return new String[]{"Blackjack","CloseFar","EvenlySpaced","LoneSum","LuckySum","MakeBricks","MakeChocolate","NoTeenSum","RoundSum",};
            case "Array2": return new String[]{"BigDiff","CenteredAverage","CountEvens","Either24","EvenOdd","FizzArray","FizzArray2","FizzArray3","FizzBuzz","Has12","Has22","Has77","HaveThree","IsEverywhere","Lucky13","MatchUp","ModThree","More14","No14","NotAlone","Only14","Post4","Pre4","SameEnds","ShiftLeft","Sum13","Sum28","Sum67","TenRun","TripleUp","TwoTwo","WithoutTen","ZeroFront","ZeroMax",};
            case "Array3": return new String[]{"CanBalance","CountClumps","Fix34","Fix45","LinearIn","MaxMirror","MaxSpan","SeriesUp","SquareUp",};
            case "Warmup1": return new String[]{"BackAround","Close10","DelDel","Diff21","EndUp","EveryNth","Front22","Front3","FrontBack","HasTeen","IcyHot","In1020","In3050","IntMax","LastDigit","LoneTeen","Makes10","Max1020","MissingChar","MixStart","MonkeyTrouble","NearHundred","NotString","Or35","ParrotTrouble","PosNeg","SleepIn","StartHi","StartOz","StringE","SumDouble",};
            case "Warmup2": return new String[]{"AltPairs","Array123","Array667","ArrayCount9","ArrayFront9","CountXX","DoubleX","FrontTimes","Has271","Last2","NoTriples","StringBits","StringMatch","StringSplosion","StringTimes","StringX","StringYak",};
            case "String1": return new String[]{"AtFirst","ComboString","ConCat","DeFront","EndsLy","ExtraEnd","ExtraFront","FirstHalf","FirstTwo","FrontAgain","HasBad","HelloName","LastChars","LastTwo","Left2","MakeAbba","MakeOutWord","MakeTags","MiddleThree","MiddleTwo","MinCat","NTwice","NonStart","Right2","SeeColor","StartWord","TheEnd","TwoChar","WithouEnd2","Without2","WithoutEnd","WithoutX","WithoutX2",};
            case "String2": return new String[]{"BobThere","CatDog","CountCode","CountHi","DoubleChar","EndOther","GetSandwich","MixString","OneTwo","PlusOut","PrefixAgain","RepeatEnd","RepeatFront","RepeatSeparator","SameStarChar","StarOut","WordEnds","XyBalance","XyzMiddle","XyzThere","ZipZap",};
            case "String3": return new String[]{"CountTriple","CountYZ","EqualIsNot","GHappy","MaxBlock","MirrorEnds","NotReplace","SameEnds","SumDigits","SumNumbers","WithoutString",};
            case "Recursion1": return new String[]{"AllStar","Array11","Array220","Array6","BunnyEars","BunnyEars2","ChangePi","ChangeXY","Count11","Count7","Count8","CountAbc","CountHi","CountHi2","CountPairs","CountX","EndX","Factorial","Fibonacci","NestParen","NoX","PairStar","ParenBit","PowerN","StrCopies","StrCount","StrDist","StringClean","SumDigits","Triangle",};
            case "Recursion2": return new String[]{"GroupNoAdj","GroupSum","GroupSum5","GroupSum6","GroupSumClump","Split53","SplitArray","SplitOdd10",};
            case "Functional1": return new String[]{"AddStar","Copies3","Doubling","Lower","Math1","MoreY","NoX","RightDigit","Square",};
            case "Functional2": return new String[]{"No34","No9","NoLong","NoNeg","NoTeen","NoYY","NoZ","Square56","Two2",};
            default: System.err.println("unknown section: "+section+"\n"); return new String[]{};
        }
    }

    static final boolean ValidateProblem(String fullname)
    {
        switch(fullname)
        {
            case "AP1.HasOne": AP1.Testcases._HasOne.suppressOutput = true; return AP1.Testcases._HasOne.Validate();
            case "AP1.MatchUp": AP1.Testcases._MatchUp.suppressOutput = true; return AP1.Testcases._MatchUp.Validate();
            case "AP1.ScoreUp": AP1.Testcases._ScoreUp.suppressOutput = true; return AP1.Testcases._ScoreUp.Validate();
            case "AP1.CopyEndy": AP1.Testcases._CopyEndy.suppressOutput = true; return AP1.Testcases._CopyEndy.Validate();
            case "AP1.MergeTwo": AP1.Testcases._MergeTwo.suppressOutput = true; return AP1.Testcases._MergeTwo.Validate();
            case "AP1.Scores100": AP1.Testcases._Scores100.suppressOutput = true; return AP1.Testcases._Scores100.Validate();
            case "AP1.CopyEvens": AP1.Testcases._CopyEvens.suppressOutput = true; return AP1.Testcases._CopyEvens.Validate();
            case "AP1.CommonTwo": AP1.Testcases._CommonTwo.suppressOutput = true; return AP1.Testcases._CommonTwo.Validate();
            case "AP1.WordsCount": AP1.Testcases._WordsCount.suppressOutput = true; return AP1.Testcases._WordsCount.Validate();
            case "AP1.WordsFront": AP1.Testcases._WordsFront.suppressOutput = true; return AP1.Testcases._WordsFront.Validate();
            case "AP1.SumHeights": AP1.Testcases._SumHeights.suppressOutput = true; return AP1.Testcases._SumHeights.Validate();
            case "AP1.BigHeights": AP1.Testcases._BigHeights.suppressOutput = true; return AP1.Testcases._BigHeights.Validate();
            case "AP1.ScoresClump": AP1.Testcases._ScoresClump.suppressOutput = true; return AP1.Testcases._ScoresClump.Validate();
            case "AP1.DividesSelf": AP1.Testcases._DividesSelf.suppressOutput = true; return AP1.Testcases._DividesSelf.Validate();
            case "AP1.SumHeights2": AP1.Testcases._SumHeights2.suppressOutput = true; return AP1.Testcases._SumHeights2.Validate();
            case "AP1.UserCompare": AP1.Testcases._UserCompare.suppressOutput = true; return AP1.Testcases._UserCompare.Validate();
            case "AP1.WordsWithout": AP1.Testcases._WordsWithout.suppressOutput = true; return AP1.Testcases._WordsWithout.Validate();
            case "AP1.ScoresAverage": AP1.Testcases._ScoresAverage.suppressOutput = true; return AP1.Testcases._ScoresAverage.Validate();
            case "AP1.ScoresSpecial": AP1.Testcases._ScoresSpecial.suppressOutput = true; return AP1.Testcases._ScoresSpecial.Validate();
            case "AP1.ScoresIncreasing": AP1.Testcases._ScoresIncreasing.suppressOutput = true; return AP1.Testcases._ScoresIncreasing.Validate();
            case "AP1.WordsWithoutList": AP1.Testcases._WordsWithoutList.suppressOutput = true; return AP1.Testcases._WordsWithoutList.Validate();
            case "Map1.MapAB": Map1.Testcases._MapAB.suppressOutput = true; return Map1.Testcases._MapAB.Validate();
            case "Map1.MapAB2": Map1.Testcases._MapAB2.suppressOutput = true; return Map1.Testcases._MapAB2.Validate();
            case "Map1.MapAB3": Map1.Testcases._MapAB3.suppressOutput = true; return Map1.Testcases._MapAB3.Validate();
            case "Map1.MapAB4": Map1.Testcases._MapAB4.suppressOutput = true; return Map1.Testcases._MapAB4.Validate();
            case "Map1.MapBully": Map1.Testcases._MapBully.suppressOutput = true; return Map1.Testcases._MapBully.Validate();
            case "Map1.MapShare": Map1.Testcases._MapShare.suppressOutput = true; return Map1.Testcases._MapShare.Validate();
            case "Map1.Topping1": Map1.Testcases._Topping1.suppressOutput = true; return Map1.Testcases._Topping1.Validate();
            case "Map1.Topping2": Map1.Testcases._Topping2.suppressOutput = true; return Map1.Testcases._Topping2.Validate();
            case "Map1.Topping3": Map1.Testcases._Topping3.suppressOutput = true; return Map1.Testcases._Topping3.Validate();
            case "Map2.Word0": Map2.Testcases._Word0.suppressOutput = true; return Map2.Testcases._Word0.Validate();
            case "Map2.Pairs": Map2.Testcases._Pairs.suppressOutput = true; return Map2.Testcases._Pairs.Validate();
            case "Map2.WordLen": Map2.Testcases._WordLen.suppressOutput = true; return Map2.Testcases._WordLen.Validate();
            case "Map2.AllSwap": Map2.Testcases._AllSwap.suppressOutput = true; return Map2.Testcases._AllSwap.Validate();
            case "Map2.WordCount": Map2.Testcases._WordCount.suppressOutput = true; return Map2.Testcases._WordCount.Validate();
            case "Map2.FirstChar": Map2.Testcases._FirstChar.suppressOutput = true; return Map2.Testcases._FirstChar.Validate();
            case "Map2.FirstSwap": Map2.Testcases._FirstSwap.suppressOutput = true; return Map2.Testcases._FirstSwap.Validate();
            case "Map2.WordAppend": Map2.Testcases._WordAppend.suppressOutput = true; return Map2.Testcases._WordAppend.Validate();
            case "Map2.WordMultiple": Map2.Testcases._WordMultiple.suppressOutput = true; return Map2.Testcases._WordMultiple.Validate();
            case "Array1.Sum3": Array1.Testcases._Sum3.suppressOutput = true; return Array1.Testcases._Sum3.Validate();
            case "Array1.Sum2": Array1.Testcases._Sum2.suppressOutput = true; return Array1.Testcases._Sum2.Validate();
            case "Array1.No23": Array1.Testcases._No23.suppressOutput = true; return Array1.Testcases._No23.Validate();
            case "Array1.Has23": Array1.Testcases._Has23.suppressOutput = true; return Array1.Testcases._Has23.Validate();
            case "Array1.Fix23": Array1.Testcases._Fix23.suppressOutput = true; return Array1.Testcases._Fix23.Validate();
            case "Array1.Make2": Array1.Testcases._Make2.suppressOutput = true; return Array1.Testcases._Make2.Validate();
            case "Array1.MakePi": Array1.Testcases._MakePi.suppressOutput = true; return Array1.Testcases._MakePi.Validate();
            case "Array1.Start1": Array1.Testcases._Start1.suppressOutput = true; return Array1.Testcases._Start1.Validate();
            case "Array1.MaxEnd3": Array1.Testcases._MaxEnd3.suppressOutput = true; return Array1.Testcases._MaxEnd3.Validate();
            case "Array1.PlusTwo": Array1.Testcases._PlusTwo.suppressOutput = true; return Array1.Testcases._PlusTwo.Validate();
            case "Array1.Front11": Array1.Testcases._Front11.suppressOutput = true; return Array1.Testcases._Front11.Validate();
            case "Array1.Reverse3": Array1.Testcases._Reverse3.suppressOutput = true; return Array1.Testcases._Reverse3.Validate();
            case "Array1.MakeEnds": Array1.Testcases._MakeEnds.suppressOutput = true; return Array1.Testcases._MakeEnds.Validate();
            case "Array1.MakeLast": Array1.Testcases._MakeLast.suppressOutput = true; return Array1.Testcases._MakeLast.Validate();
            case "Array1.Double23": Array1.Testcases._Double23.suppressOutput = true; return Array1.Testcases._Double23.Validate();
            case "Array1.SwapEnds": Array1.Testcases._SwapEnds.suppressOutput = true; return Array1.Testcases._SwapEnds.Validate();
            case "Array1.MidThree": Array1.Testcases._MidThree.suppressOutput = true; return Array1.Testcases._MidThree.Validate();
            case "Array1.Unlucky1": Array1.Testcases._Unlucky1.suppressOutput = true; return Array1.Testcases._Unlucky1.Validate();
            case "Array1.CommonEnd": Array1.Testcases._CommonEnd.suppressOutput = true; return Array1.Testcases._CommonEnd.Validate();
            case "Array1.MiddleWay": Array1.Testcases._MiddleWay.suppressOutput = true; return Array1.Testcases._MiddleWay.Validate();
            case "Array1.BiggerTwo": Array1.Testcases._BiggerTwo.suppressOutput = true; return Array1.Testcases._BiggerTwo.Validate();
            case "Array1.MaxTriple": Array1.Testcases._MaxTriple.suppressOutput = true; return Array1.Testcases._MaxTriple.Validate();
            case "Array1.FirstLast6": Array1.Testcases._FirstLast6.suppressOutput = true; return Array1.Testcases._FirstLast6.Validate();
            case "Array1.MakeMiddle": Array1.Testcases._MakeMiddle.suppressOutput = true; return Array1.Testcases._MakeMiddle.Validate();
            case "Array1.FrontPiece": Array1.Testcases._FrontPiece.suppressOutput = true; return Array1.Testcases._FrontPiece.Validate();
            case "Array1.RotateLeft3": Array1.Testcases._RotateLeft3.suppressOutput = true; return Array1.Testcases._RotateLeft3.Validate();
            case "Array1.SameFirstLast": Array1.Testcases._SameFirstLast.suppressOutput = true; return Array1.Testcases._SameFirstLast.Validate();
            case "Logic1.Love6": Logic1.Testcases._Love6.suppressOutput = true; return Logic1.Testcases._Love6.Validate();
            case "Logic1.Old35": Logic1.Testcases._Old35.suppressOutput = true; return Logic1.Testcases._Old35.Validate();
            case "Logic1.More20": Logic1.Testcases._More20.suppressOutput = true; return Logic1.Testcases._More20.Validate();
            case "Logic1.Less20": Logic1.Testcases._Less20.suppressOutput = true; return Logic1.Testcases._Less20.Validate();
            case "Logic1.In1To10": Logic1.Testcases._In1To10.suppressOutput = true; return Logic1.Testcases._In1To10.Validate();
            case "Logic1.NearTen": Logic1.Testcases._NearTen.suppressOutput = true; return Logic1.Testcases._NearTen.Validate();
            case "Logic1.TeenSum": Logic1.Testcases._TeenSum.suppressOutput = true; return Logic1.Testcases._TeenSum.Validate();
            case "Logic1.InOrder": Logic1.Testcases._InOrder.suppressOutput = true; return Logic1.Testcases._InOrder.Validate();
            case "Logic1.MaxMod5": Logic1.Testcases._MaxMod5.suppressOutput = true; return Logic1.Testcases._MaxMod5.Validate();
            case "Logic1.SortaSum": Logic1.Testcases._SortaSum.suppressOutput = true; return Logic1.Testcases._SortaSum.Validate();
            case "Logic1.TeaParty": Logic1.Testcases._TeaParty.suppressOutput = true; return Logic1.Testcases._TeaParty.Validate();
            case "Logic1.TwoAsOne": Logic1.Testcases._TwoAsOne.suppressOutput = true; return Logic1.Testcases._TwoAsOne.Validate();
            case "Logic1.LessBy10": Logic1.Testcases._LessBy10.suppressOutput = true; return Logic1.Testcases._LessBy10.Validate();
            case "Logic1.SumLimit": Logic1.Testcases._SumLimit.suppressOutput = true; return Logic1.Testcases._SumLimit.Validate();
            case "Logic1.LastDigit": Logic1.Testcases._LastDigit.suppressOutput = true; return Logic1.Testcases._LastDigit.Validate();
            case "Logic1.RedTicket": Logic1.Testcases._RedTicket.suppressOutput = true; return Logic1.Testcases._RedTicket.Validate();
            case "Logic1.CigarParty": Logic1.Testcases._CigarParty.suppressOutput = true; return Logic1.Testcases._CigarParty.Validate();
            case "Logic1.AlarmClock": Logic1.Testcases._AlarmClock.suppressOutput = true; return Logic1.Testcases._AlarmClock.Validate();
            case "Logic1.AnswerCell": Logic1.Testcases._AnswerCell.suppressOutput = true; return Logic1.Testcases._AnswerCell.Validate();
            case "Logic1.FizzString": Logic1.Testcases._FizzString.suppressOutput = true; return Logic1.Testcases._FizzString.Validate();
            case "Logic1.BlueTicket": Logic1.Testcases._BlueTicket.suppressOutput = true; return Logic1.Testcases._BlueTicket.Validate();
            case "Logic1.ShareDigit": Logic1.Testcases._ShareDigit.suppressOutput = true; return Logic1.Testcases._ShareDigit.Validate();
            case "Logic1.DateFashion": Logic1.Testcases._DateFashion.suppressOutput = true; return Logic1.Testcases._DateFashion.Validate();
            case "Logic1.FizzString2": Logic1.Testcases._FizzString2.suppressOutput = true; return Logic1.Testcases._FizzString2.Validate();
            case "Logic1.GreenTicket": Logic1.Testcases._GreenTicket.suppressOutput = true; return Logic1.Testcases._GreenTicket.Validate();
            case "Logic1.SquirrelPlay": Logic1.Testcases._SquirrelPlay.suppressOutput = true; return Logic1.Testcases._SquirrelPlay.Validate();
            case "Logic1.InOrderEqual": Logic1.Testcases._InOrderEqual.suppressOutput = true; return Logic1.Testcases._InOrderEqual.Validate();
            case "Logic1.SpecialEleven": Logic1.Testcases._SpecialEleven.suppressOutput = true; return Logic1.Testcases._SpecialEleven.Validate();
            case "Logic1.CaughtSpeeding": Logic1.Testcases._CaughtSpeeding.suppressOutput = true; return Logic1.Testcases._CaughtSpeeding.Validate();
            case "Logic1.WithoutDoubles": Logic1.Testcases._WithoutDoubles.suppressOutput = true; return Logic1.Testcases._WithoutDoubles.Validate();
            case "Logic2.LoneSum": Logic2.Testcases._LoneSum.suppressOutput = true; return Logic2.Testcases._LoneSum.Validate();
            case "Logic2.LuckySum": Logic2.Testcases._LuckySum.suppressOutput = true; return Logic2.Testcases._LuckySum.Validate();
            case "Logic2.RoundSum": Logic2.Testcases._RoundSum.suppressOutput = true; return Logic2.Testcases._RoundSum.Validate();
            case "Logic2.CloseFar": Logic2.Testcases._CloseFar.suppressOutput = true; return Logic2.Testcases._CloseFar.Validate();
            case "Logic2.NoTeenSum": Logic2.Testcases._NoTeenSum.suppressOutput = true; return Logic2.Testcases._NoTeenSum.Validate();
            case "Logic2.Blackjack": Logic2.Testcases._Blackjack.suppressOutput = true; return Logic2.Testcases._Blackjack.Validate();
            case "Logic2.MakeBricks": Logic2.Testcases._MakeBricks.suppressOutput = true; return Logic2.Testcases._MakeBricks.Validate();
            case "Logic2.EvenlySpaced": Logic2.Testcases._EvenlySpaced.suppressOutput = true; return Logic2.Testcases._EvenlySpaced.Validate();
            case "Logic2.MakeChocolate": Logic2.Testcases._MakeChocolate.suppressOutput = true; return Logic2.Testcases._MakeChocolate.Validate();
            case "Array2.No14": Array2.Testcases._No14.suppressOutput = true; return Array2.Testcases._No14.Validate();
            case "Array2.Pre4": Array2.Testcases._Pre4.suppressOutput = true; return Array2.Testcases._Pre4.Validate();
            case "Array2.Sum13": Array2.Testcases._Sum13.suppressOutput = true; return Array2.Testcases._Sum13.Validate();
            case "Array2.Sum67": Array2.Testcases._Sum67.suppressOutput = true; return Array2.Testcases._Sum67.Validate();
            case "Array2.Has22": Array2.Testcases._Has22.suppressOutput = true; return Array2.Testcases._Has22.Validate();
            case "Array2.Sum28": Array2.Testcases._Sum28.suppressOutput = true; return Array2.Testcases._Sum28.Validate();
            case "Array2.Has77": Array2.Testcases._Has77.suppressOutput = true; return Array2.Testcases._Has77.Validate();
            case "Array2.Has12": Array2.Testcases._Has12.suppressOutput = true; return Array2.Testcases._Has12.Validate();
            case "Array2.Post4": Array2.Testcases._Post4.suppressOutput = true; return Array2.Testcases._Post4.Validate();
            case "Array2.More14": Array2.Testcases._More14.suppressOutput = true; return Array2.Testcases._More14.Validate();
            case "Array2.Only14": Array2.Testcases._Only14.suppressOutput = true; return Array2.Testcases._Only14.Validate();
            case "Array2.TwoTwo": Array2.Testcases._TwoTwo.suppressOutput = true; return Array2.Testcases._TwoTwo.Validate();
            case "Array2.TenRun": Array2.Testcases._TenRun.suppressOutput = true; return Array2.Testcases._TenRun.Validate();
            case "Array2.BigDiff": Array2.Testcases._BigDiff.suppressOutput = true; return Array2.Testcases._BigDiff.Validate();
            case "Array2.Lucky13": Array2.Testcases._Lucky13.suppressOutput = true; return Array2.Testcases._Lucky13.Validate();
            case "Array2.MatchUp": Array2.Testcases._MatchUp.suppressOutput = true; return Array2.Testcases._MatchUp.Validate();
            case "Array2.ZeroMax": Array2.Testcases._ZeroMax.suppressOutput = true; return Array2.Testcases._ZeroMax.Validate();
            case "Array2.EvenOdd": Array2.Testcases._EvenOdd.suppressOutput = true; return Array2.Testcases._EvenOdd.Validate();
            case "Array2.Either24": Array2.Testcases._Either24.suppressOutput = true; return Array2.Testcases._Either24.Validate();
            case "Array2.ModThree": Array2.Testcases._ModThree.suppressOutput = true; return Array2.Testcases._ModThree.Validate();
            case "Array2.SameEnds": Array2.Testcases._SameEnds.suppressOutput = true; return Array2.Testcases._SameEnds.Validate();
            case "Array2.TripleUp": Array2.Testcases._TripleUp.suppressOutput = true; return Array2.Testcases._TripleUp.Validate();
            case "Array2.NotAlone": Array2.Testcases._NotAlone.suppressOutput = true; return Array2.Testcases._NotAlone.Validate();
            case "Array2.FizzBuzz": Array2.Testcases._FizzBuzz.suppressOutput = true; return Array2.Testcases._FizzBuzz.Validate();
            case "Array2.FizzArray": Array2.Testcases._FizzArray.suppressOutput = true; return Array2.Testcases._FizzArray.Validate();
            case "Array2.HaveThree": Array2.Testcases._HaveThree.suppressOutput = true; return Array2.Testcases._HaveThree.Validate();
            case "Array2.ShiftLeft": Array2.Testcases._ShiftLeft.suppressOutput = true; return Array2.Testcases._ShiftLeft.Validate();
            case "Array2.ZeroFront": Array2.Testcases._ZeroFront.suppressOutput = true; return Array2.Testcases._ZeroFront.Validate();
            case "Array2.CountEvens": Array2.Testcases._CountEvens.suppressOutput = true; return Array2.Testcases._CountEvens.Validate();
            case "Array2.FizzArray2": Array2.Testcases._FizzArray2.suppressOutput = true; return Array2.Testcases._FizzArray2.Validate();
            case "Array2.FizzArray3": Array2.Testcases._FizzArray3.suppressOutput = true; return Array2.Testcases._FizzArray3.Validate();
            case "Array2.WithoutTen": Array2.Testcases._WithoutTen.suppressOutput = true; return Array2.Testcases._WithoutTen.Validate();
            case "Array2.IsEverywhere": Array2.Testcases._IsEverywhere.suppressOutput = true; return Array2.Testcases._IsEverywhere.Validate();
            case "Array2.CenteredAverage": Array2.Testcases._CenteredAverage.suppressOutput = true; return Array2.Testcases._CenteredAverage.Validate();
            case "Array3.Fix34": Array3.Testcases._Fix34.suppressOutput = true; return Array3.Testcases._Fix34.Validate();
            case "Array3.Fix45": Array3.Testcases._Fix45.suppressOutput = true; return Array3.Testcases._Fix45.Validate();
            case "Array3.MaxSpan": Array3.Testcases._MaxSpan.suppressOutput = true; return Array3.Testcases._MaxSpan.Validate();
            case "Array3.LinearIn": Array3.Testcases._LinearIn.suppressOutput = true; return Array3.Testcases._LinearIn.Validate();
            case "Array3.SquareUp": Array3.Testcases._SquareUp.suppressOutput = true; return Array3.Testcases._SquareUp.Validate();
            case "Array3.SeriesUp": Array3.Testcases._SeriesUp.suppressOutput = true; return Array3.Testcases._SeriesUp.Validate();
            case "Array3.MaxMirror": Array3.Testcases._MaxMirror.suppressOutput = true; return Array3.Testcases._MaxMirror.Validate();
            case "Array3.CanBalance": Array3.Testcases._CanBalance.suppressOutput = true; return Array3.Testcases._CanBalance.Validate();
            case "Array3.CountClumps": Array3.Testcases._CountClumps.suppressOutput = true; return Array3.Testcases._CountClumps.Validate();
            case "Warmup1.Or35": Warmup1.Testcases._Or35.suppressOutput = true; return Warmup1.Testcases._Or35.Validate();
            case "Warmup1.EndUp": Warmup1.Testcases._EndUp.suppressOutput = true; return Warmup1.Testcases._EndUp.Validate();
            case "Warmup1.Diff21": Warmup1.Testcases._Diff21.suppressOutput = true; return Warmup1.Testcases._Diff21.Validate();
            case "Warmup1.PosNeg": Warmup1.Testcases._PosNeg.suppressOutput = true; return Warmup1.Testcases._PosNeg.Validate();
            case "Warmup1.Front3": Warmup1.Testcases._Front3.suppressOutput = true; return Warmup1.Testcases._Front3.Validate();
            case "Warmup1.IcyHot": Warmup1.Testcases._IcyHot.suppressOutput = true; return Warmup1.Testcases._IcyHot.Validate();
            case "Warmup1.In1020": Warmup1.Testcases._In1020.suppressOutput = true; return Warmup1.Testcases._In1020.Validate();
            case "Warmup1.DelDel": Warmup1.Testcases._DelDel.suppressOutput = true; return Warmup1.Testcases._DelDel.Validate();
            case "Warmup1.IntMax": Warmup1.Testcases._IntMax.suppressOutput = true; return Warmup1.Testcases._IntMax.Validate();
            case "Warmup1.In3050": Warmup1.Testcases._In3050.suppressOutput = true; return Warmup1.Testcases._In3050.Validate();
            case "Warmup1.SleepIn": Warmup1.Testcases._SleepIn.suppressOutput = true; return Warmup1.Testcases._SleepIn.Validate();
            case "Warmup1.Makes10": Warmup1.Testcases._Makes10.suppressOutput = true; return Warmup1.Testcases._Makes10.Validate();
            case "Warmup1.Front22": Warmup1.Testcases._Front22.suppressOutput = true; return Warmup1.Testcases._Front22.Validate();
            case "Warmup1.StartHi": Warmup1.Testcases._StartHi.suppressOutput = true; return Warmup1.Testcases._StartHi.Validate();
            case "Warmup1.HasTeen": Warmup1.Testcases._HasTeen.suppressOutput = true; return Warmup1.Testcases._HasTeen.Validate();
            case "Warmup1.StartOz": Warmup1.Testcases._StartOz.suppressOutput = true; return Warmup1.Testcases._StartOz.Validate();
            case "Warmup1.Close10": Warmup1.Testcases._Close10.suppressOutput = true; return Warmup1.Testcases._Close10.Validate();
            case "Warmup1.Max1020": Warmup1.Testcases._Max1020.suppressOutput = true; return Warmup1.Testcases._Max1020.Validate();
            case "Warmup1.StringE": Warmup1.Testcases._StringE.suppressOutput = true; return Warmup1.Testcases._StringE.Validate();
            case "Warmup1.LoneTeen": Warmup1.Testcases._LoneTeen.suppressOutput = true; return Warmup1.Testcases._LoneTeen.Validate();
            case "Warmup1.MixStart": Warmup1.Testcases._MixStart.suppressOutput = true; return Warmup1.Testcases._MixStart.Validate();
            case "Warmup1.EveryNth": Warmup1.Testcases._EveryNth.suppressOutput = true; return Warmup1.Testcases._EveryNth.Validate();
            case "Warmup1.SumDouble": Warmup1.Testcases._SumDouble.suppressOutput = true; return Warmup1.Testcases._SumDouble.Validate();
            case "Warmup1.NotString": Warmup1.Testcases._NotString.suppressOutput = true; return Warmup1.Testcases._NotString.Validate();
            case "Warmup1.FrontBack": Warmup1.Testcases._FrontBack.suppressOutput = true; return Warmup1.Testcases._FrontBack.Validate();
            case "Warmup1.LastDigit": Warmup1.Testcases._LastDigit.suppressOutput = true; return Warmup1.Testcases._LastDigit.Validate();
            case "Warmup1.BackAround": Warmup1.Testcases._BackAround.suppressOutput = true; return Warmup1.Testcases._BackAround.Validate();
            case "Warmup1.NearHundred": Warmup1.Testcases._NearHundred.suppressOutput = true; return Warmup1.Testcases._NearHundred.Validate();
            case "Warmup1.MissingChar": Warmup1.Testcases._MissingChar.suppressOutput = true; return Warmup1.Testcases._MissingChar.Validate();
            case "Warmup1.MonkeyTrouble": Warmup1.Testcases._MonkeyTrouble.suppressOutput = true; return Warmup1.Testcases._MonkeyTrouble.Validate();
            case "Warmup1.ParrotTrouble": Warmup1.Testcases._ParrotTrouble.suppressOutput = true; return Warmup1.Testcases._ParrotTrouble.Validate();
            case "Warmup2.Last2": Warmup2.Testcases._Last2.suppressOutput = true; return Warmup2.Testcases._Last2.Validate();
            case "Warmup2.Has271": Warmup2.Testcases._Has271.suppressOutput = true; return Warmup2.Testcases._Has271.Validate();
            case "Warmup2.CountXX": Warmup2.Testcases._CountXX.suppressOutput = true; return Warmup2.Testcases._CountXX.Validate();
            case "Warmup2.DoubleX": Warmup2.Testcases._DoubleX.suppressOutput = true; return Warmup2.Testcases._DoubleX.Validate();
            case "Warmup2.StringX": Warmup2.Testcases._StringX.suppressOutput = true; return Warmup2.Testcases._StringX.Validate();
            case "Warmup2.Array123": Warmup2.Testcases._Array123.suppressOutput = true; return Warmup2.Testcases._Array123.Validate();
            case "Warmup2.AltPairs": Warmup2.Testcases._AltPairs.suppressOutput = true; return Warmup2.Testcases._AltPairs.Validate();
            case "Warmup2.Array667": Warmup2.Testcases._Array667.suppressOutput = true; return Warmup2.Testcases._Array667.Validate();
            case "Warmup2.StringYak": Warmup2.Testcases._StringYak.suppressOutput = true; return Warmup2.Testcases._StringYak.Validate();
            case "Warmup2.NoTriples": Warmup2.Testcases._NoTriples.suppressOutput = true; return Warmup2.Testcases._NoTriples.Validate();
            case "Warmup2.FrontTimes": Warmup2.Testcases._FrontTimes.suppressOutput = true; return Warmup2.Testcases._FrontTimes.Validate();
            case "Warmup2.StringBits": Warmup2.Testcases._StringBits.suppressOutput = true; return Warmup2.Testcases._StringBits.Validate();
            case "Warmup2.StringTimes": Warmup2.Testcases._StringTimes.suppressOutput = true; return Warmup2.Testcases._StringTimes.Validate();
            case "Warmup2.ArrayCount9": Warmup2.Testcases._ArrayCount9.suppressOutput = true; return Warmup2.Testcases._ArrayCount9.Validate();
            case "Warmup2.ArrayFront9": Warmup2.Testcases._ArrayFront9.suppressOutput = true; return Warmup2.Testcases._ArrayFront9.Validate();
            case "Warmup2.StringMatch": Warmup2.Testcases._StringMatch.suppressOutput = true; return Warmup2.Testcases._StringMatch.Validate();
            case "Warmup2.StringSplosion": Warmup2.Testcases._StringSplosion.suppressOutput = true; return Warmup2.Testcases._StringSplosion.Validate();
            case "String1.Left2": String1.Testcases._Left2.suppressOutput = true; return String1.Testcases._Left2.Validate();
            case "String1.Right2": String1.Testcases._Right2.suppressOutput = true; return String1.Testcases._Right2.Validate();
            case "String1.TheEnd": String1.Testcases._TheEnd.suppressOutput = true; return String1.Testcases._TheEnd.Validate();
            case "String1.EndsLy": String1.Testcases._EndsLy.suppressOutput = true; return String1.Testcases._EndsLy.Validate();
            case "String1.NTwice": String1.Testcases._NTwice.suppressOutput = true; return String1.Testcases._NTwice.Validate();
            case "String1.HasBad": String1.Testcases._HasBad.suppressOutput = true; return String1.Testcases._HasBad.Validate();
            case "String1.ConCat": String1.Testcases._ConCat.suppressOutput = true; return String1.Testcases._ConCat.Validate();
            case "String1.MinCat": String1.Testcases._MinCat.suppressOutput = true; return String1.Testcases._MinCat.Validate();
            case "String1.TwoChar": String1.Testcases._TwoChar.suppressOutput = true; return String1.Testcases._TwoChar.Validate();
            case "String1.AtFirst": String1.Testcases._AtFirst.suppressOutput = true; return String1.Testcases._AtFirst.Validate();
            case "String1.LastTwo": String1.Testcases._LastTwo.suppressOutput = true; return String1.Testcases._LastTwo.Validate();
            case "String1.DeFront": String1.Testcases._DeFront.suppressOutput = true; return String1.Testcases._DeFront.Validate();
            case "String1.MakeAbba": String1.Testcases._MakeAbba.suppressOutput = true; return String1.Testcases._MakeAbba.Validate();
            case "String1.MakeTags": String1.Testcases._MakeTags.suppressOutput = true; return String1.Testcases._MakeTags.Validate();
            case "String1.ExtraEnd": String1.Testcases._ExtraEnd.suppressOutput = true; return String1.Testcases._ExtraEnd.Validate();
            case "String1.FirstTwo": String1.Testcases._FirstTwo.suppressOutput = true; return String1.Testcases._FirstTwo.Validate();
            case "String1.NonStart": String1.Testcases._NonStart.suppressOutput = true; return String1.Testcases._NonStart.Validate();
            case "String1.SeeColor": String1.Testcases._SeeColor.suppressOutput = true; return String1.Testcases._SeeColor.Validate();
            case "String1.Without2": String1.Testcases._Without2.suppressOutput = true; return String1.Testcases._Without2.Validate();
            case "String1.WithoutX": String1.Testcases._WithoutX.suppressOutput = true; return String1.Testcases._WithoutX.Validate();
            case "String1.HelloName": String1.Testcases._HelloName.suppressOutput = true; return String1.Testcases._HelloName.Validate();
            case "String1.FirstHalf": String1.Testcases._FirstHalf.suppressOutput = true; return String1.Testcases._FirstHalf.Validate();
            case "String1.MiddleTwo": String1.Testcases._MiddleTwo.suppressOutput = true; return String1.Testcases._MiddleTwo.Validate();
            case "String1.LastChars": String1.Testcases._LastChars.suppressOutput = true; return String1.Testcases._LastChars.Validate();
            case "String1.StartWord": String1.Testcases._StartWord.suppressOutput = true; return String1.Testcases._StartWord.Validate();
            case "String1.WithoutX2": String1.Testcases._WithoutX2.suppressOutput = true; return String1.Testcases._WithoutX2.Validate();
            case "String1.WithoutEnd": String1.Testcases._WithoutEnd.suppressOutput = true; return String1.Testcases._WithoutEnd.Validate();
            case "String1.WithouEnd2": String1.Testcases._WithouEnd2.suppressOutput = true; return String1.Testcases._WithouEnd2.Validate();
            case "String1.FrontAgain": String1.Testcases._FrontAgain.suppressOutput = true; return String1.Testcases._FrontAgain.Validate();
            case "String1.ExtraFront": String1.Testcases._ExtraFront.suppressOutput = true; return String1.Testcases._ExtraFront.Validate();
            case "String1.MakeOutWord": String1.Testcases._MakeOutWord.suppressOutput = true; return String1.Testcases._MakeOutWord.Validate();
            case "String1.ComboString": String1.Testcases._ComboString.suppressOutput = true; return String1.Testcases._ComboString.Validate();
            case "String1.MiddleThree": String1.Testcases._MiddleThree.suppressOutput = true; return String1.Testcases._MiddleThree.Validate();
            case "String2.CatDog": String2.Testcases._CatDog.suppressOutput = true; return String2.Testcases._CatDog.Validate();
            case "String2.OneTwo": String2.Testcases._OneTwo.suppressOutput = true; return String2.Testcases._OneTwo.Validate();
            case "String2.ZipZap": String2.Testcases._ZipZap.suppressOutput = true; return String2.Testcases._ZipZap.Validate();
            case "String2.CountHi": String2.Testcases._CountHi.suppressOutput = true; return String2.Testcases._CountHi.Validate();
            case "String2.StarOut": String2.Testcases._StarOut.suppressOutput = true; return String2.Testcases._StarOut.Validate();
            case "String2.PlusOut": String2.Testcases._PlusOut.suppressOutput = true; return String2.Testcases._PlusOut.Validate();
            case "String2.EndOther": String2.Testcases._EndOther.suppressOutput = true; return String2.Testcases._EndOther.Validate();
            case "String2.XyzThere": String2.Testcases._XyzThere.suppressOutput = true; return String2.Testcases._XyzThere.Validate();
            case "String2.BobThere": String2.Testcases._BobThere.suppressOutput = true; return String2.Testcases._BobThere.Validate();
            case "String2.WordEnds": String2.Testcases._WordEnds.suppressOutput = true; return String2.Testcases._WordEnds.Validate();
            case "String2.CountCode": String2.Testcases._CountCode.suppressOutput = true; return String2.Testcases._CountCode.Validate();
            case "String2.XyBalance": String2.Testcases._XyBalance.suppressOutput = true; return String2.Testcases._XyBalance.Validate();
            case "String2.MixString": String2.Testcases._MixString.suppressOutput = true; return String2.Testcases._MixString.Validate();
            case "String2.RepeatEnd": String2.Testcases._RepeatEnd.suppressOutput = true; return String2.Testcases._RepeatEnd.Validate();
            case "String2.XyzMiddle": String2.Testcases._XyzMiddle.suppressOutput = true; return String2.Testcases._XyzMiddle.Validate();
            case "String2.DoubleChar": String2.Testcases._DoubleChar.suppressOutput = true; return String2.Testcases._DoubleChar.Validate();
            case "String2.RepeatFront": String2.Testcases._RepeatFront.suppressOutput = true; return String2.Testcases._RepeatFront.Validate();
            case "String2.PrefixAgain": String2.Testcases._PrefixAgain.suppressOutput = true; return String2.Testcases._PrefixAgain.Validate();
            case "String2.GetSandwich": String2.Testcases._GetSandwich.suppressOutput = true; return String2.Testcases._GetSandwich.Validate();
            case "String2.SameStarChar": String2.Testcases._SameStarChar.suppressOutput = true; return String2.Testcases._SameStarChar.Validate();
            case "String2.RepeatSeparator": String2.Testcases._RepeatSeparator.suppressOutput = true; return String2.Testcases._RepeatSeparator.Validate();
            case "String3.GHappy": String3.Testcases._GHappy.suppressOutput = true; return String3.Testcases._GHappy.Validate();
            case "String3.CountYZ": String3.Testcases._CountYZ.suppressOutput = true; return String3.Testcases._CountYZ.Validate();
            case "String3.SameEnds": String3.Testcases._SameEnds.suppressOutput = true; return String3.Testcases._SameEnds.Validate();
            case "String3.MaxBlock": String3.Testcases._MaxBlock.suppressOutput = true; return String3.Testcases._MaxBlock.Validate();
            case "String3.SumDigits": String3.Testcases._SumDigits.suppressOutput = true; return String3.Testcases._SumDigits.Validate();
            case "String3.EqualIsNot": String3.Testcases._EqualIsNot.suppressOutput = true; return String3.Testcases._EqualIsNot.Validate();
            case "String3.MirrorEnds": String3.Testcases._MirrorEnds.suppressOutput = true; return String3.Testcases._MirrorEnds.Validate();
            case "String3.SumNumbers": String3.Testcases._SumNumbers.suppressOutput = true; return String3.Testcases._SumNumbers.Validate();
            case "String3.NotReplace": String3.Testcases._NotReplace.suppressOutput = true; return String3.Testcases._NotReplace.Validate();
            case "String3.CountTriple": String3.Testcases._CountTriple.suppressOutput = true; return String3.Testcases._CountTriple.Validate();
            case "String3.WithoutString": String3.Testcases._WithoutString.suppressOutput = true; return String3.Testcases._WithoutString.Validate();
            case "Recursion1.NoX": Recursion1.Testcases._NoX.suppressOutput = true; return Recursion1.Testcases._NoX.Validate();
            case "Recursion1.EndX": Recursion1.Testcases._EndX.suppressOutput = true; return Recursion1.Testcases._EndX.Validate();
            case "Recursion1.Count7": Recursion1.Testcases._Count7.suppressOutput = true; return Recursion1.Testcases._Count7.Validate();
            case "Recursion1.Count8": Recursion1.Testcases._Count8.suppressOutput = true; return Recursion1.Testcases._Count8.Validate();
            case "Recursion1.PowerN": Recursion1.Testcases._PowerN.suppressOutput = true; return Recursion1.Testcases._PowerN.Validate();
            case "Recursion1.CountX": Recursion1.Testcases._CountX.suppressOutput = true; return Recursion1.Testcases._CountX.Validate();
            case "Recursion1.Array6": Recursion1.Testcases._Array6.suppressOutput = true; return Recursion1.Testcases._Array6.Validate();
            case "Recursion1.CountHi": Recursion1.Testcases._CountHi.suppressOutput = true; return Recursion1.Testcases._CountHi.Validate();
            case "Recursion1.Array11": Recursion1.Testcases._Array11.suppressOutput = true; return Recursion1.Testcases._Array11.Validate();
            case "Recursion1.AllStar": Recursion1.Testcases._AllStar.suppressOutput = true; return Recursion1.Testcases._AllStar.Validate();
            case "Recursion1.Count11": Recursion1.Testcases._Count11.suppressOutput = true; return Recursion1.Testcases._Count11.Validate();
            case "Recursion1.StrDist": Recursion1.Testcases._StrDist.suppressOutput = true; return Recursion1.Testcases._StrDist.Validate();
            case "Recursion1.Triangle": Recursion1.Testcases._Triangle.suppressOutput = true; return Recursion1.Testcases._Triangle.Validate();
            case "Recursion1.ChangeXY": Recursion1.Testcases._ChangeXY.suppressOutput = true; return Recursion1.Testcases._ChangeXY.Validate();
            case "Recursion1.ChangePi": Recursion1.Testcases._ChangePi.suppressOutput = true; return Recursion1.Testcases._ChangePi.Validate();
            case "Recursion1.Array220": Recursion1.Testcases._Array220.suppressOutput = true; return Recursion1.Testcases._Array220.Validate();
            case "Recursion1.PairStar": Recursion1.Testcases._PairStar.suppressOutput = true; return Recursion1.Testcases._PairStar.Validate();
            case "Recursion1.CountAbc": Recursion1.Testcases._CountAbc.suppressOutput = true; return Recursion1.Testcases._CountAbc.Validate();
            case "Recursion1.CountHi2": Recursion1.Testcases._CountHi2.suppressOutput = true; return Recursion1.Testcases._CountHi2.Validate();
            case "Recursion1.ParenBit": Recursion1.Testcases._ParenBit.suppressOutput = true; return Recursion1.Testcases._ParenBit.Validate();
            case "Recursion1.StrCount": Recursion1.Testcases._StrCount.suppressOutput = true; return Recursion1.Testcases._StrCount.Validate();
            case "Recursion1.Factorial": Recursion1.Testcases._Factorial.suppressOutput = true; return Recursion1.Testcases._Factorial.Validate();
            case "Recursion1.BunnyEars": Recursion1.Testcases._BunnyEars.suppressOutput = true; return Recursion1.Testcases._BunnyEars.Validate();
            case "Recursion1.Fibonacci": Recursion1.Testcases._Fibonacci.suppressOutput = true; return Recursion1.Testcases._Fibonacci.Validate();
            case "Recursion1.SumDigits": Recursion1.Testcases._SumDigits.suppressOutput = true; return Recursion1.Testcases._SumDigits.Validate();
            case "Recursion1.NestParen": Recursion1.Testcases._NestParen.suppressOutput = true; return Recursion1.Testcases._NestParen.Validate();
            case "Recursion1.StrCopies": Recursion1.Testcases._StrCopies.suppressOutput = true; return Recursion1.Testcases._StrCopies.Validate();
            case "Recursion1.BunnyEars2": Recursion1.Testcases._BunnyEars2.suppressOutput = true; return Recursion1.Testcases._BunnyEars2.Validate();
            case "Recursion1.CountPairs": Recursion1.Testcases._CountPairs.suppressOutput = true; return Recursion1.Testcases._CountPairs.Validate();
            case "Recursion1.StringClean": Recursion1.Testcases._StringClean.suppressOutput = true; return Recursion1.Testcases._StringClean.Validate();
            case "Recursion2.Split53": Recursion2.Testcases._Split53.suppressOutput = true; return Recursion2.Testcases._Split53.Validate();
            case "Recursion2.GroupSum": Recursion2.Testcases._GroupSum.suppressOutput = true; return Recursion2.Testcases._GroupSum.Validate();
            case "Recursion2.GroupSum6": Recursion2.Testcases._GroupSum6.suppressOutput = true; return Recursion2.Testcases._GroupSum6.Validate();
            case "Recursion2.GroupSum5": Recursion2.Testcases._GroupSum5.suppressOutput = true; return Recursion2.Testcases._GroupSum5.Validate();
            case "Recursion2.GroupNoAdj": Recursion2.Testcases._GroupNoAdj.suppressOutput = true; return Recursion2.Testcases._GroupNoAdj.Validate();
            case "Recursion2.SplitArray": Recursion2.Testcases._SplitArray.suppressOutput = true; return Recursion2.Testcases._SplitArray.Validate();
            case "Recursion2.SplitOdd10": Recursion2.Testcases._SplitOdd10.suppressOutput = true; return Recursion2.Testcases._SplitOdd10.Validate();
            case "Recursion2.GroupSumClump": Recursion2.Testcases._GroupSumClump.suppressOutput = true; return Recursion2.Testcases._GroupSumClump.Validate();
            case "Functional1.NoX": Functional1.Testcases._NoX.suppressOutput = true; return Functional1.Testcases._NoX.Validate();
            case "Functional1.MoreY": Functional1.Testcases._MoreY.suppressOutput = true; return Functional1.Testcases._MoreY.Validate();
            case "Functional1.Math1": Functional1.Testcases._Math1.suppressOutput = true; return Functional1.Testcases._Math1.Validate();
            case "Functional1.Lower": Functional1.Testcases._Lower.suppressOutput = true; return Functional1.Testcases._Lower.Validate();
            case "Functional1.Square": Functional1.Testcases._Square.suppressOutput = true; return Functional1.Testcases._Square.Validate();
            case "Functional1.AddStar": Functional1.Testcases._AddStar.suppressOutput = true; return Functional1.Testcases._AddStar.Validate();
            case "Functional1.Copies3": Functional1.Testcases._Copies3.suppressOutput = true; return Functional1.Testcases._Copies3.Validate();
            case "Functional1.Doubling": Functional1.Testcases._Doubling.suppressOutput = true; return Functional1.Testcases._Doubling.Validate();
            case "Functional1.RightDigit": Functional1.Testcases._RightDigit.suppressOutput = true; return Functional1.Testcases._RightDigit.Validate();
            case "Functional2.No9": Functional2.Testcases._No9.suppressOutput = true; return Functional2.Testcases._No9.Validate();
            case "Functional2.NoZ": Functional2.Testcases._NoZ.suppressOutput = true; return Functional2.Testcases._NoZ.Validate();
            case "Functional2.No34": Functional2.Testcases._No34.suppressOutput = true; return Functional2.Testcases._No34.Validate();
            case "Functional2.NoYY": Functional2.Testcases._NoYY.suppressOutput = true; return Functional2.Testcases._NoYY.Validate();
            case "Functional2.Two2": Functional2.Testcases._Two2.suppressOutput = true; return Functional2.Testcases._Two2.Validate();
            case "Functional2.NoNeg": Functional2.Testcases._NoNeg.suppressOutput = true; return Functional2.Testcases._NoNeg.Validate();
            case "Functional2.NoTeen": Functional2.Testcases._NoTeen.suppressOutput = true; return Functional2.Testcases._NoTeen.Validate();
            case "Functional2.NoLong": Functional2.Testcases._NoLong.suppressOutput = true; return Functional2.Testcases._NoLong.Validate();
            case "Functional2.Square56": Functional2.Testcases._Square56.suppressOutput = true; return Functional2.Testcases._Square56.Validate();
            default: System.err.println("unrecognized problem name: "+fullname+"\n"); return false;
        }
    }
}

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
}

