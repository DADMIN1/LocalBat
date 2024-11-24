package Recursion1.Testcases;
import Recursion1.PairStar;

public final class _PairStar
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;
    public static boolean suppressOutput = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = PairStar.pairStar(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90mpairStar\u001B[0;90m(\u001b[0;1m\"hello\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mpairStar\u001B[0;90m(\u001b[0;1m\"xxyy\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mpairStar\u001B[0;90m(\u001b[0;1m\"aaaa\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mpairStar\u001B[0;90m(\u001b[0;1m\"aaab\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mpairStar\u001B[0;90m(\u001b[0;1m\"aa\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mpairStar\u001B[0;90m(\u001b[0;1m\"a\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mpairStar\u001B[0;90m(\u001b[0;1m\"\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mpairStar\u001B[0;90m(\u001b[0;1m\"noadjacent\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mpairStar\u001B[0;90m(\u001b[0;1m\"abba\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mpairStar\u001B[0;90m(\u001b[0;1m\"abbba\"\u001B[0m\u001b[90m)",
    };

    static final String[] expectedResults = {
        "hel*lo",
        "x*xy*y",
        "a*a*a*a",
        "a*a*ab",
        "a*a",
        "a",
        "",
        "noadjacent",
        "ab*ba",
        "ab*b*ba",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("hello"),
            new TestResult("xxyy"),
            new TestResult("aaaa"),
            new TestResult("aaab"),
            new TestResult("aa"),
            new TestResult("a"),
            new TestResult(""),
            new TestResult("noadjacent"),
            new TestResult("abba"),
            new TestResult("abbba"),
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
