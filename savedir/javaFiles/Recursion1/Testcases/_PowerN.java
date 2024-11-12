package Recursion1.Testcases;
import Recursion1.PowerN;

public final class _PowerN
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int base, int n) {
            try { result = PowerN.powerN(base, n); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90mpowerN\u001B[0;90m(\u001b[0;1m3, 1\u001B[0m\u001b[90m)",
        "\u001b[3;90mpowerN\u001B[0;90m(\u001b[0;1m3, 2\u001B[0m\u001b[90m)",
        "\u001b[3;90mpowerN\u001B[0;90m(\u001b[0;1m3, 3\u001B[0m\u001b[90m)",
        "\u001b[3;90mpowerN\u001B[0;90m(\u001b[0;1m2, 1\u001B[0m\u001b[90m)",
        "\u001b[3;90mpowerN\u001B[0;90m(\u001b[0;1m2, 2\u001B[0m\u001b[90m)",
        "\u001b[3;90mpowerN\u001B[0;90m(\u001b[0;1m2, 3\u001B[0m\u001b[90m)",
        "\u001b[3;90mpowerN\u001B[0;90m(\u001b[0;1m2, 4\u001B[0m\u001b[90m)",
        "\u001b[3;90mpowerN\u001B[0;90m(\u001b[0;1m2, 5\u001B[0m\u001b[90m)",
        "\u001b[3;90mpowerN\u001B[0;90m(\u001b[0;1m10, 1\u001B[0m\u001b[90m)",
        "\u001b[3;90mpowerN\u001B[0;90m(\u001b[0;1m10, 2\u001B[0m\u001b[90m)",
        "\u001b[3;90mpowerN\u001B[0;90m(\u001b[0;1m10, 3\u001B[0m\u001b[90m)",
    };

    static final int[] expectedResults = {
        3,
        9,
        27,
        2,
        4,
        8,
        16,
        32,
        10,
        100,
        1000,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(3, 1),
            new TestResult(3, 2),
            new TestResult(3, 3),
            new TestResult(2, 1),
            new TestResult(2, 2),
            new TestResult(2, 3),
            new TestResult(2, 4),
            new TestResult(2, 5),
            new TestResult(10, 1),
            new TestResult(10, 2),
            new TestResult(10, 3),
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
