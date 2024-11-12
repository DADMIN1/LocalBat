package Recursion1.Testcases;
import Recursion1.CountHi2;

public final class _CountHi2
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = CountHi2.countHi2(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90mcountHi2\u001B[0;90m(\u001b[0;1m\"ahixhi\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mcountHi2\u001B[0;90m(\u001b[0;1m\"ahibhi\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mcountHi2\u001B[0;90m(\u001b[0;1m\"xhixhi\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mcountHi2\u001B[0;90m(\u001b[0;1m\"hixhi\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mcountHi2\u001B[0;90m(\u001b[0;1m\"hixhhi\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mcountHi2\u001B[0;90m(\u001b[0;1m\"hihihi\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mcountHi2\u001B[0;90m(\u001b[0;1m\"hihihix\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mcountHi2\u001B[0;90m(\u001b[0;1m\"xhihihix\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mcountHi2\u001B[0;90m(\u001b[0;1m\"xxhi\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mcountHi2\u001B[0;90m(\u001b[0;1m\"hixxhi\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mcountHi2\u001B[0;90m(\u001b[0;1m\"hi\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mcountHi2\u001B[0;90m(\u001b[0;1m\"xxxx\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mcountHi2\u001B[0;90m(\u001b[0;1m\"h\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mcountHi2\u001B[0;90m(\u001b[0;1m\"x\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mcountHi2\u001B[0;90m(\u001b[0;1m\"\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mcountHi2\u001B[0;90m(\u001b[0;1m\"Hellohi\"\u001B[0m\u001b[90m)",
    };

    static final int[] expectedResults = {
        1,
        2,
        0,
        1,
        2,
        3,
        3,
        2,
        0,
        1,
        1,
        0,
        0,
        0,
        0,
        1,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("ahixhi"),
            new TestResult("ahibhi"),
            new TestResult("xhixhi"),
            new TestResult("hixhi"),
            new TestResult("hixhhi"),
            new TestResult("hihihi"),
            new TestResult("hihihix"),
            new TestResult("xhihihix"),
            new TestResult("xxhi"),
            new TestResult("hixxhi"),
            new TestResult("hi"),
            new TestResult("xxxx"),
            new TestResult("h"),
            new TestResult("x"),
            new TestResult(""),
            new TestResult("Hellohi"),
        };

        int successCount = 0;
        boolean allTestsPassed = true;
        boolean prevTestPassed = false;
        for (int i = 0; i < results.length; ++i)
        {
            if (results[i].caught != null) {
                allTestsPassed = false;
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
                if(prevTestPassed) { System.out.println(); prevTestPassed = false; }
                System.out.print("\u001b[91;1m[X]\u001B[0m \u001b[94;4m#"+(i+1)+"\u001b[0;90m - \u001B[0m");
                System.out.println(testcaseStrings[i]+" - \u001b[91;1;3mFailed!\u001B[0m");
                System.out.println("    \u001b[94;3;4mreceived:\u001B[0m \u001b[1m"+results[i].result);
                System.out.println("    \u001b[96;3;4mexpected:\u001B[0m \u001b[1m"+expectedResults[i]);
                System.out.println();
            } else if (printSuccesses) {
                successCount += 1;
                prevTestPassed = true;
                System.out.println("\u001b[92;1m[✓] \u001B[0m\u001b[94;4m#"+(i+1)+"\u001b[0;90m - \u001B[0m"+testcaseStrings[i]);
            }
        }
        if (allTestsPassed) System.out.println("\n \u001b[92;1m✓✓✓\u001B[0;1m\u001b[96;40m  ~  All tests passed  ~  \u001B[0m\u001b[92;1m✓✓✓\u001B[0m");
        else System.out.println("\n\u001b[92;1;40m "+successCount+"\u001B[0;1;40m / \u001b[94m"+results.length+"\u001b[90m tests passed \u001B[0m");
        return allTestsPassed;
    }
}
