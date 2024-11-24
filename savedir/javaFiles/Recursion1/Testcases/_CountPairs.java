package Recursion1.Testcases;
import Recursion1.CountPairs;

public final class _CountPairs
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;
    public static boolean suppressOutput = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = CountPairs.countPairs(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90mcountPairs\u001B[0;90m(\u001b[0;1m\"axa\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mcountPairs\u001B[0;90m(\u001b[0;1m\"axax\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mcountPairs\u001B[0;90m(\u001b[0;1m\"axbx\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mcountPairs\u001B[0;90m(\u001b[0;1m\"hi\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mcountPairs\u001B[0;90m(\u001b[0;1m\"hihih\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mcountPairs\u001B[0;90m(\u001b[0;1m\"ihihhh\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mcountPairs\u001B[0;90m(\u001b[0;1m\"ihjxhh\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mcountPairs\u001B[0;90m(\u001b[0;1m\"\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mcountPairs\u001B[0;90m(\u001b[0;1m\"a\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mcountPairs\u001B[0;90m(\u001b[0;1m\"aa\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mcountPairs\u001B[0;90m(\u001b[0;1m\"aaa\"\u001B[0m\u001b[90m)",
    };

    static final int[] expectedResults = {
        1,
        2,
        1,
        0,
        3,
        3,
        0,
        0,
        0,
        0,
        1,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("axa"),
            new TestResult("axax"),
            new TestResult("axbx"),
            new TestResult("hi"),
            new TestResult("hihih"),
            new TestResult("ihihhh"),
            new TestResult("ihjxhh"),
            new TestResult(""),
            new TestResult("a"),
            new TestResult("aa"),
            new TestResult("aaa"),
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
            if (results[i].result != expectedResults[i]) {
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
