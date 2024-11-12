package Logic1.Testcases;
import Logic1.In1To10;

public final class _In1To10
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int n, boolean outsideMode) {
            try { result = In1To10.in1To10(n, outsideMode); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90min1To10\u001B[0;90m(\u001b[0;1m5, false\u001B[0m\u001b[90m)",
        "\u001b[3;90min1To10\u001B[0;90m(\u001b[0;1m11, false\u001B[0m\u001b[90m)",
        "\u001b[3;90min1To10\u001B[0;90m(\u001b[0;1m11, true\u001B[0m\u001b[90m)",
        "\u001b[3;90min1To10\u001B[0;90m(\u001b[0;1m10, false\u001B[0m\u001b[90m)",
        "\u001b[3;90min1To10\u001B[0;90m(\u001b[0;1m10, true\u001B[0m\u001b[90m)",
        "\u001b[3;90min1To10\u001B[0;90m(\u001b[0;1m9, false\u001B[0m\u001b[90m)",
        "\u001b[3;90min1To10\u001B[0;90m(\u001b[0;1m9, true\u001B[0m\u001b[90m)",
        "\u001b[3;90min1To10\u001B[0;90m(\u001b[0;1m1, false\u001B[0m\u001b[90m)",
        "\u001b[3;90min1To10\u001B[0;90m(\u001b[0;1m1, true\u001B[0m\u001b[90m)",
        "\u001b[3;90min1To10\u001B[0;90m(\u001b[0;1m0, false\u001B[0m\u001b[90m)",
        "\u001b[3;90min1To10\u001B[0;90m(\u001b[0;1m0, true\u001B[0m\u001b[90m)",
        "\u001b[3;90min1To10\u001B[0;90m(\u001b[0;1m-1, false\u001B[0m\u001b[90m)",
        "\u001b[3;90min1To10\u001B[0;90m(\u001b[0;1m-1, true\u001B[0m\u001b[90m)",
        "\u001b[3;90min1To10\u001B[0;90m(\u001b[0;1m99, false\u001B[0m\u001b[90m)",
        "\u001b[3;90min1To10\u001B[0;90m(\u001b[0;1m-99, true\u001B[0m\u001b[90m)",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        true,
        true,
        true,
        true,
        false,
        true,
        true,
        false,
        true,
        false,
        true,
        false,
        true,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(5, false),
            new TestResult(11, false),
            new TestResult(11, true),
            new TestResult(10, false),
            new TestResult(10, true),
            new TestResult(9, false),
            new TestResult(9, true),
            new TestResult(1, false),
            new TestResult(1, true),
            new TestResult(0, false),
            new TestResult(0, true),
            new TestResult(-1, false),
            new TestResult(-1, true),
            new TestResult(99, false),
            new TestResult(-99, true),
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
