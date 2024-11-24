package Logic2.Testcases;
import Logic2.NoTeenSum;

public final class _NoTeenSum
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;
    public static boolean suppressOutput = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int a, int b, int c) {
            try { result = NoTeenSum.noTeenSum(a, b, c); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90mnoTeenSum\u001B[0;90m(\u001b[0;1m1, 2, 3\u001B[0m\u001b[90m)",
        "\u001b[3;90mnoTeenSum\u001B[0;90m(\u001b[0;1m2, 13, 1\u001B[0m\u001b[90m)",
        "\u001b[3;90mnoTeenSum\u001B[0;90m(\u001b[0;1m2, 1, 14\u001B[0m\u001b[90m)",
        "\u001b[3;90mnoTeenSum\u001B[0;90m(\u001b[0;1m2, 1, 15\u001B[0m\u001b[90m)",
        "\u001b[3;90mnoTeenSum\u001B[0;90m(\u001b[0;1m2, 1, 16\u001B[0m\u001b[90m)",
        "\u001b[3;90mnoTeenSum\u001B[0;90m(\u001b[0;1m2, 1, 17\u001B[0m\u001b[90m)",
        "\u001b[3;90mnoTeenSum\u001B[0;90m(\u001b[0;1m17, 1, 2\u001B[0m\u001b[90m)",
        "\u001b[3;90mnoTeenSum\u001B[0;90m(\u001b[0;1m2, 15, 2\u001B[0m\u001b[90m)",
        "\u001b[3;90mnoTeenSum\u001B[0;90m(\u001b[0;1m16, 17, 18\u001B[0m\u001b[90m)",
        "\u001b[3;90mnoTeenSum\u001B[0;90m(\u001b[0;1m17, 18, 19\u001B[0m\u001b[90m)",
        "\u001b[3;90mnoTeenSum\u001B[0;90m(\u001b[0;1m15, 16, 1\u001B[0m\u001b[90m)",
        "\u001b[3;90mnoTeenSum\u001B[0;90m(\u001b[0;1m15, 15, 19\u001B[0m\u001b[90m)",
        "\u001b[3;90mnoTeenSum\u001B[0;90m(\u001b[0;1m15, 19, 16\u001B[0m\u001b[90m)",
        "\u001b[3;90mnoTeenSum\u001B[0;90m(\u001b[0;1m5, 17, 18\u001B[0m\u001b[90m)",
        "\u001b[3;90mnoTeenSum\u001B[0;90m(\u001b[0;1m17, 18, 16\u001B[0m\u001b[90m)",
        "\u001b[3;90mnoTeenSum\u001B[0;90m(\u001b[0;1m17, 19, 18\u001B[0m\u001b[90m)",
    };

    static final int[] expectedResults = {
        6,
        3,
        3,
        18,
        19,
        3,
        3,
        19,
        16,
        0,
        32,
        30,
        31,
        5,
        16,
        0,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(1, 2, 3),
            new TestResult(2, 13, 1),
            new TestResult(2, 1, 14),
            new TestResult(2, 1, 15),
            new TestResult(2, 1, 16),
            new TestResult(2, 1, 17),
            new TestResult(17, 1, 2),
            new TestResult(2, 15, 2),
            new TestResult(16, 17, 18),
            new TestResult(17, 18, 19),
            new TestResult(15, 16, 1),
            new TestResult(15, 15, 19),
            new TestResult(15, 19, 16),
            new TestResult(5, 17, 18),
            new TestResult(17, 18, 16),
            new TestResult(17, 19, 18),
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
