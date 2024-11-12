package Recursion1.Testcases;
import Recursion1.SumDigits;

public final class _SumDigits
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int n) {
            try { result = SumDigits.sumDigits(n); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;30msumDigits\u001B[0;30m(\u001b[0;1m126\u001B[0m\u001b[30m)",
        "\u001b[3;30msumDigits\u001B[0;30m(\u001b[0;1m49\u001B[0m\u001b[30m)",
        "\u001b[3;30msumDigits\u001B[0;30m(\u001b[0;1m12\u001B[0m\u001b[30m)",
        "\u001b[3;30msumDigits\u001B[0;30m(\u001b[0;1m10\u001B[0m\u001b[30m)",
        "\u001b[3;30msumDigits\u001B[0;30m(\u001b[0;1m1\u001B[0m\u001b[30m)",
        "\u001b[3;30msumDigits\u001B[0;30m(\u001b[0;1m0\u001B[0m\u001b[30m)",
        "\u001b[3;30msumDigits\u001B[0;30m(\u001b[0;1m730\u001B[0m\u001b[30m)",
        "\u001b[3;30msumDigits\u001B[0;30m(\u001b[0;1m1111\u001B[0m\u001b[30m)",
        "\u001b[3;30msumDigits\u001B[0;30m(\u001b[0;1m11111\u001B[0m\u001b[30m)",
        "\u001b[3;30msumDigits\u001B[0;30m(\u001b[0;1m10110\u001B[0m\u001b[30m)",
        "\u001b[3;30msumDigits\u001B[0;30m(\u001b[0;1m235\u001B[0m\u001b[30m)",
    };

    static final int[] expectedResults = {
        9,
        13,
        3,
        1,
        1,
        0,
        10,
        4,
        5,
        3,
        10,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(126),
            new TestResult(49),
            new TestResult(12),
            new TestResult(10),
            new TestResult(1),
            new TestResult(0),
            new TestResult(730),
            new TestResult(1111),
            new TestResult(11111),
            new TestResult(10110),
            new TestResult(235),
        };

        int successCount = 0;
        boolean allTestsPassed = true;
        boolean prevTestPassed = false;
        for (int i = 0; i < results.length; ++i)
        {
            if (results[i].caught != null) {
                allTestsPassed = false;
                if(prevTestPassed) { System.out.println(); prevTestPassed = false; }
                System.out.print("\u001b[31;1m[!]\u001B[0m \u001b[34;4m#"+(i+1)+"\u001b[0;30m - \u001B[0m");
                System.out.println(testcaseStrings[i]+" - \u001b[3;31;1mFailed!\u001B[0;31;1m \u001b[40;7m[EXCEPTION]\u001B[0m");
                System.out.println("\u001b[31;40;1m"+results[i].caught.getClass().getName());
                System.out.println("\u001b[0;33;40m"+results[i].caught.getMessage());
                if(getStacktraces) System.out.print("\u001b[30;3m");
                if(getStacktraces) results[i].caught.printStackTrace();
                System.out.println("\u001b[0m\u001B[0m"); continue;
            }
            if (results[i].result != expectedResults[i]) {
                allTestsPassed = false;
                if(prevTestPassed) { System.out.println(); prevTestPassed = false; }
                System.out.print("\u001b[31;1m[X]\u001B[0m \u001b[34;4m#"+(i+1)+"\u001b[0;30m - \u001B[0m");
                System.out.println(testcaseStrings[i]+" - \u001b[31;1;3mFailed!\u001B[0m");
                System.out.println("    \u001b[34;3;4mreceived:\u001B[0m \u001b[1m"+results[i].result);
                System.out.println("    \u001b[36;3;4mexpected:\u001B[0m \u001b[1m"+expectedResults[i]);
                System.out.println();
            } else if (printSuccesses) {
                successCount += 1;
                prevTestPassed = true;
                System.out.println("\u001b[32;1m[✓] \u001B[0m\u001b[34;4m#"+(i+1)+"\u001b[0;30m - \u001B[0m"+testcaseStrings[i]);
            }
        }
        if (allTestsPassed) System.out.println("\n \u001b[32;1m✓✓✓\u001B[0;1m\u001b[36;40m  ~  All tests passed  ~  \u001B[0m\u001b[32;1m✓✓✓\u001B[0m");
        else System.out.println("\n\u001b[32;1;40m "+successCount+"\u001B[0;1;40m / \u001b[34m"+results.length+"\u001b[30m tests passed \u001B[0m");
        return allTestsPassed;
    }
}
