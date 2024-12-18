package Map2.Testcases;
import Map2.WordCount;
import java.util.Map;
import java.util.HashMap;

public final class _WordCount
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;
    public static boolean suppressOutput = false;

    static final class TestResult {
        private Map<?,?> result;
        private RuntimeException caught = null;
        TestResult(String[] strings) {
            try { result = WordCount.wordCount(strings); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90mwordCount\u001B[0;90m(\u001b[0;1m[\"a\", \"b\", \"a\", \"c\", \"b\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mwordCount\u001B[0;90m(\u001b[0;1m[\"c\", \"b\", \"a\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mwordCount\u001B[0;90m(\u001b[0;1m[\"c\", \"c\", \"c\", \"c\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mwordCount\u001B[0;90m(\u001b[0;1m[]\u001B[0m\u001b[90m)",
        "\u001b[3;90mwordCount\u001B[0;90m(\u001b[0;1m[\"this\", \"and\", \"this\", \"\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mwordCount\u001B[0;90m(\u001b[0;1m[\"x\", \"y\", \"x\", \"Y\", \"X\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mwordCount\u001B[0;90m(\u001b[0;1m[\"123\", \"0\", \"123\", \"1\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mwordCount\u001B[0;90m(\u001b[0;1m[\"d\", \"a\", \"e\", \"d\", \"a\", \"d\", \"b\", \"b\", \"z\", \"a\", \"a\", \"b\", \"z\", \"x\", \"b\", \"f\", \"x\", \"two\", \"b\", \"one\", \"two\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mwordCount\u001B[0;90m(\u001b[0;1m[\"apple\", \"banana\", \"apple\", \"apple\", \"tea\", \"coffee\", \"banana\"]\u001B[0m\u001b[90m)",
    };

    static final Map<?,?>[] expectedResults = {
        Map.of("a", 2, "b", 2, "c", 1),
        Map.of("a", 1, "b", 1, "c", 1),
        Map.of("c", 4),
        Map.of(),
        Map.of("", 1, "and", 1, "this", 2),
        Map.of("x", 2, "X", 1, "y", 1, "Y", 1),
        Map.of("0", 1, "1", 1, "123", 2),
        Map.of("a", 4, "b", 5, "d", 3, "e", 1, "f", 1, "one", 1, "x", 2, "z", 2, "two", 2),
        Map.of("banana", 2, "apple", 3, "tea", 1, "coffee", 1),
    };

    public static final boolean Validate()
    {
        final String[] strings0 = {"a", "b", "a", "c", "b"}; 
        final String[] strings1 = {"c", "b", "a"}; 
        final String[] strings2 = {"c", "c", "c", "c"}; 
        final String[] strings3 = {}; 
        final String[] strings4 = {"this", "and", "this", ""}; 
        final String[] strings5 = {"x", "y", "x", "Y", "X"}; 
        final String[] strings6 = {"123", "0", "123", "1"}; 
        final String[] strings7 = {"d", "a", "e", "d", "a", "d", "b", "b", "z", "a", "a", "b", "z", "x", "b", "f", "x", "two", "b", "one", "two"}; 
        final String[] strings8 = {"apple", "banana", "apple", "apple", "tea", "coffee", "banana"}; 

        final TestResult[] results = {
            new TestResult(strings0),
            new TestResult(strings1),
            new TestResult(strings2),
            new TestResult(strings3),
            new TestResult(strings4),
            new TestResult(strings5),
            new TestResult(strings6),
            new TestResult(strings7),
            new TestResult(strings8),
        };

        int successCount = 0;
        boolean allTestsPassed = true;
        boolean prevTestPassed = false;
        for (int i = 0; i < results.length; ++i)
        {
            if (results[i].caught != null) {
                allTestsPassed = false;
                if(suppressOutput) continue;
                if(prevTestPassed) { System.out.println(); prevTestPassed = false; }
                System.out.print("\u001b[91;1m[!]\u001B[0m \u001b[94;4m#"+(i+1)+"\u001b[0;90m - \u001B[0m");
                System.out.println(testcaseStrings[i]+" - \u001b[3;91;1mFailed!\u001B[0;91;1m \u001b[40;7m[EXCEPTION]\u001B[0m");
                System.out.println("\u001b[91;40;1m    "+results[i].caught.getClass().getName());
                System.out.println("\u001b[0;93;40m    "+results[i].caught.getMessage());
                if(getStacktraces) System.out.print("\u001b[90;3m    ");
                if(getStacktraces) results[i].caught.printStackTrace();
                System.out.println("\u001b[0m\u001B[0m"); continue;
            }
            if (!results[i].result.equals(expectedResults[i])) {
                allTestsPassed = false;
                if(suppressOutput) continue;
                if(prevTestPassed) { System.out.println(); prevTestPassed = false; }
                System.out.print("\u001b[91;1m[X]\u001B[0m \u001b[94;4m#"+(i+1)+"\u001b[0;90m - \u001B[0m");
                System.out.println(testcaseStrings[i]+" - \u001b[91;1;3mFailed!\u001B[0m");
                System.out.println("    \u001b[94;3;4mreceived:\u001B[0m \u001b[1m"+results[i].result);
                System.out.println("    \u001b[96;3;4mexpected:\u001B[0m \u001b[1m"+expectedResults[i]);
                System.out.println();
            } else if (printSuccesses && !suppressOutput) {
                successCount += 1;
                prevTestPassed = true;
                System.out.println("\u001b[92;1m[✓] \u001B[0m\u001b[94;4m#"+(i+1)+"\u001b[0;90m - \u001B[0m"+testcaseStrings[i]);
            }
        }
        if (suppressOutput) return allTestsPassed;
        if (allTestsPassed) System.out.println("\n \u001b[92;1m✓✓✓\u001B[0;1m\u001b[96;40m  ~  All tests passed  ~  \u001B[0m\u001b[92;1m✓✓✓\u001B[0m");
        else System.out.println("\n\u001b[92;1;40m "+successCount+"\u001B[0;1;40m / \u001b[94m"+results.length+"\u001b[90m tests passed \u001B[0m");
        return allTestsPassed;
    }
}
