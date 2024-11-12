package Logic1.Testcases;
import Logic1.TeenSum;

public final class _TeenSum
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int a, int b) {
            try { result = TeenSum.teenSum(a, b); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90mteenSum\u001B[0;90m(\u001b[0;1m3, 4\u001B[0m\u001b[90m)",
        "\u001b[3;90mteenSum\u001B[0;90m(\u001b[0;1m10, 13\u001B[0m\u001b[90m)",
        "\u001b[3;90mteenSum\u001B[0;90m(\u001b[0;1m13, 2\u001B[0m\u001b[90m)",
        "\u001b[3;90mteenSum\u001B[0;90m(\u001b[0;1m3, 19\u001B[0m\u001b[90m)",
        "\u001b[3;90mteenSum\u001B[0;90m(\u001b[0;1m13, 13\u001B[0m\u001b[90m)",
        "\u001b[3;90mteenSum\u001B[0;90m(\u001b[0;1m10, 10\u001B[0m\u001b[90m)",
        "\u001b[3;90mteenSum\u001B[0;90m(\u001b[0;1m6, 14\u001B[0m\u001b[90m)",
        "\u001b[3;90mteenSum\u001B[0;90m(\u001b[0;1m15, 2\u001B[0m\u001b[90m)",
        "\u001b[3;90mteenSum\u001B[0;90m(\u001b[0;1m19, 19\u001B[0m\u001b[90m)",
        "\u001b[3;90mteenSum\u001B[0;90m(\u001b[0;1m19, 20\u001B[0m\u001b[90m)",
        "\u001b[3;90mteenSum\u001B[0;90m(\u001b[0;1m2, 18\u001B[0m\u001b[90m)",
        "\u001b[3;90mteenSum\u001B[0;90m(\u001b[0;1m12, 4\u001B[0m\u001b[90m)",
        "\u001b[3;90mteenSum\u001B[0;90m(\u001b[0;1m2, 20\u001B[0m\u001b[90m)",
        "\u001b[3;90mteenSum\u001B[0;90m(\u001b[0;1m2, 17\u001B[0m\u001b[90m)",
        "\u001b[3;90mteenSum\u001B[0;90m(\u001b[0;1m2, 16\u001B[0m\u001b[90m)",
        "\u001b[3;90mteenSum\u001B[0;90m(\u001b[0;1m6, 7\u001B[0m\u001b[90m)",
    };

    static final int[] expectedResults = {
        7,
        19,
        19,
        19,
        19,
        20,
        19,
        19,
        19,
        19,
        19,
        16,
        22,
        19,
        19,
        13,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(3, 4),
            new TestResult(10, 13),
            new TestResult(13, 2),
            new TestResult(3, 19),
            new TestResult(13, 13),
            new TestResult(10, 10),
            new TestResult(6, 14),
            new TestResult(15, 2),
            new TestResult(19, 19),
            new TestResult(19, 20),
            new TestResult(2, 18),
            new TestResult(12, 4),
            new TestResult(2, 20),
            new TestResult(2, 17),
            new TestResult(2, 16),
            new TestResult(6, 7),
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
