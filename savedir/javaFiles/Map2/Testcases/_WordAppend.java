package Map2.Testcases;
import Map2.WordAppend;

public final class _WordAppend
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;
    public static boolean suppressOutput = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String[] strings) {
            try { result = WordAppend.wordAppend(strings); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90mwordAppend\u001B[0;90m(\u001b[0;1m[\"a\", \"b\", \"a\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mwordAppend\u001B[0;90m(\u001b[0;1m[\"a\", \"b\", \"a\", \"c\", \"a\", \"d\", \"a\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mwordAppend\u001B[0;90m(\u001b[0;1m[\"a\", \"\", \"a\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mwordAppend\u001B[0;90m(\u001b[0;1m[]\u001B[0m\u001b[90m)",
        "\u001b[3;90mwordAppend\u001B[0;90m(\u001b[0;1m[\"a\", \"b\", \"b\", \"a\", \"a\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mwordAppend\u001B[0;90m(\u001b[0;1m[\"a\", \"b\", \"b\", \"b\", \"a\", \"c\", \"a\", \"a\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mwordAppend\u001B[0;90m(\u001b[0;1m[\"a\", \"b\", \"b\", \"b\", \"a\", \"c\", \"a\", \"a\", \"a\", \"b\", \"a\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mwordAppend\u001B[0;90m(\u001b[0;1m[\"not\", \"and\", \"or\", \"and\", \"this\", \"and\", \"or\", \"that\", \"not\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mwordAppend\u001B[0;90m(\u001b[0;1m[\"a\", \"b\", \"c\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mwordAppend\u001B[0;90m(\u001b[0;1m[\"this\", \"or\", \"that\", \"and\", \"this\", \"and\", \"that\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mwordAppend\u001B[0;90m(\u001b[0;1m[\"xx\", \"xx\", \"yy\", \"xx\", \"zz\", \"yy\", \"zz\", \"xx\"]\u001B[0m\u001b[90m)",
    };

    static final String[] expectedResults = {
        "a",
        "aa",
        "a",
        "",
        "ba",
        "baa",
        "baaba",
        "andornot",
        "",
        "thisandthat",
        "xxyyzzxx",
    };

    public static final boolean Validate()
    {
        final String[] strings0 = {"a", "b", "a"}; 
        final String[] strings1 = {"a", "b", "a", "c", "a", "d", "a"}; 
        final String[] strings2 = {"a", "", "a"}; 
        final String[] strings3 = {}; 
        final String[] strings4 = {"a", "b", "b", "a", "a"}; 
        final String[] strings5 = {"a", "b", "b", "b", "a", "c", "a", "a"}; 
        final String[] strings6 = {"a", "b", "b", "b", "a", "c", "a", "a", "a", "b", "a"}; 
        final String[] strings7 = {"not", "and", "or", "and", "this", "and", "or", "that", "not"}; 
        final String[] strings8 = {"a", "b", "c"}; 
        final String[] strings9 = {"this", "or", "that", "and", "this", "and", "that"}; 
        final String[] strings10 = {"xx", "xx", "yy", "xx", "zz", "yy", "zz", "xx"}; 

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
            new TestResult(strings9),
            new TestResult(strings10),
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
