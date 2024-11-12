package Logic1.Testcases;
import Logic1.SumLimit;

public final class _SumLimit
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int a, int b) {
            try { result = SumLimit.sumLimit(a, b); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90msumLimit\u001B[0;90m(\u001b[0;1m2, 3\u001B[0m\u001b[90m)",
        "\u001b[3;90msumLimit\u001B[0;90m(\u001b[0;1m8, 3\u001B[0m\u001b[90m)",
        "\u001b[3;90msumLimit\u001B[0;90m(\u001b[0;1m8, 1\u001B[0m\u001b[90m)",
        "\u001b[3;90msumLimit\u001B[0;90m(\u001b[0;1m11, 39\u001B[0m\u001b[90m)",
        "\u001b[3;90msumLimit\u001B[0;90m(\u001b[0;1m11, 99\u001B[0m\u001b[90m)",
        "\u001b[3;90msumLimit\u001B[0;90m(\u001b[0;1m0, 0\u001B[0m\u001b[90m)",
        "\u001b[3;90msumLimit\u001B[0;90m(\u001b[0;1m99, 0\u001B[0m\u001b[90m)",
        "\u001b[3;90msumLimit\u001B[0;90m(\u001b[0;1m99, 1\u001B[0m\u001b[90m)",
        "\u001b[3;90msumLimit\u001B[0;90m(\u001b[0;1m123, 1\u001B[0m\u001b[90m)",
        "\u001b[3;90msumLimit\u001B[0;90m(\u001b[0;1m1, 123\u001B[0m\u001b[90m)",
        "\u001b[3;90msumLimit\u001B[0;90m(\u001b[0;1m23, 60\u001B[0m\u001b[90m)",
        "\u001b[3;90msumLimit\u001B[0;90m(\u001b[0;1m23, 80\u001B[0m\u001b[90m)",
        "\u001b[3;90msumLimit\u001B[0;90m(\u001b[0;1m9000, 1\u001B[0m\u001b[90m)",
        "\u001b[3;90msumLimit\u001B[0;90m(\u001b[0;1m90000000, 1\u001B[0m\u001b[90m)",
        "\u001b[3;90msumLimit\u001B[0;90m(\u001b[0;1m9000, 1000\u001B[0m\u001b[90m)",
    };

    static final int[] expectedResults = {
        5,
        8,
        9,
        50,
        11,
        0,
        99,
        99,
        124,
        1,
        83,
        23,
        9001,
        90000001,
        9000,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(2, 3),
            new TestResult(8, 3),
            new TestResult(8, 1),
            new TestResult(11, 39),
            new TestResult(11, 99),
            new TestResult(0, 0),
            new TestResult(99, 0),
            new TestResult(99, 1),
            new TestResult(123, 1),
            new TestResult(1, 123),
            new TestResult(23, 60),
            new TestResult(23, 80),
            new TestResult(9000, 1),
            new TestResult(90000000, 1),
            new TestResult(9000, 1000),
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
