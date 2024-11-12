package Warmup1.Testcases;
import Warmup1.In3050;

public final class _In3050
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int a, int b) {
            try { result = In3050.in3050(a, b); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90min3050\u001B[0;90m(\u001b[0;1m30, 31\u001B[0m\u001b[90m)",
        "\u001b[3;90min3050\u001B[0;90m(\u001b[0;1m30, 41\u001B[0m\u001b[90m)",
        "\u001b[3;90min3050\u001B[0;90m(\u001b[0;1m40, 50\u001B[0m\u001b[90m)",
        "\u001b[3;90min3050\u001B[0;90m(\u001b[0;1m40, 51\u001B[0m\u001b[90m)",
        "\u001b[3;90min3050\u001B[0;90m(\u001b[0;1m39, 50\u001B[0m\u001b[90m)",
        "\u001b[3;90min3050\u001B[0;90m(\u001b[0;1m50, 39\u001B[0m\u001b[90m)",
        "\u001b[3;90min3050\u001B[0;90m(\u001b[0;1m40, 39\u001B[0m\u001b[90m)",
        "\u001b[3;90min3050\u001B[0;90m(\u001b[0;1m49, 48\u001B[0m\u001b[90m)",
        "\u001b[3;90min3050\u001B[0;90m(\u001b[0;1m50, 40\u001B[0m\u001b[90m)",
        "\u001b[3;90min3050\u001B[0;90m(\u001b[0;1m50, 51\u001B[0m\u001b[90m)",
        "\u001b[3;90min3050\u001B[0;90m(\u001b[0;1m35, 36\u001B[0m\u001b[90m)",
        "\u001b[3;90min3050\u001B[0;90m(\u001b[0;1m35, 45\u001B[0m\u001b[90m)",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        true,
        false,
        false,
        false,
        true,
        true,
        true,
        false,
        true,
        false,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(30, 31),
            new TestResult(30, 41),
            new TestResult(40, 50),
            new TestResult(40, 51),
            new TestResult(39, 50),
            new TestResult(50, 39),
            new TestResult(40, 39),
            new TestResult(49, 48),
            new TestResult(50, 40),
            new TestResult(50, 51),
            new TestResult(35, 36),
            new TestResult(35, 45),
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
