package Warmup1.Testcases;
import Warmup1.Max1020;

public final class _Max1020
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int a, int b) {
            try { result = Max1020.max1020(a, b); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;30mmax1020\u001B[0;30m(\u001b[0;1m11, 19\u001B[0m\u001b[30m)",
        "\u001b[3;30mmax1020\u001B[0;30m(\u001b[0;1m19, 11\u001B[0m\u001b[30m)",
        "\u001b[3;30mmax1020\u001B[0;30m(\u001b[0;1m11, 9\u001B[0m\u001b[30m)",
        "\u001b[3;30mmax1020\u001B[0;30m(\u001b[0;1m9, 21\u001B[0m\u001b[30m)",
        "\u001b[3;30mmax1020\u001B[0;30m(\u001b[0;1m10, 21\u001B[0m\u001b[30m)",
        "\u001b[3;30mmax1020\u001B[0;30m(\u001b[0;1m21, 10\u001B[0m\u001b[30m)",
        "\u001b[3;30mmax1020\u001B[0;30m(\u001b[0;1m9, 11\u001B[0m\u001b[30m)",
        "\u001b[3;30mmax1020\u001B[0;30m(\u001b[0;1m23, 10\u001B[0m\u001b[30m)",
        "\u001b[3;30mmax1020\u001B[0;30m(\u001b[0;1m20, 10\u001B[0m\u001b[30m)",
        "\u001b[3;30mmax1020\u001B[0;30m(\u001b[0;1m7, 20\u001B[0m\u001b[30m)",
        "\u001b[3;30mmax1020\u001B[0;30m(\u001b[0;1m17, 16\u001B[0m\u001b[30m)",
    };

    static final int[] expectedResults = {
        19,
        19,
        11,
        0,
        10,
        10,
        11,
        10,
        20,
        20,
        17,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(11, 19),
            new TestResult(19, 11),
            new TestResult(11, 9),
            new TestResult(9, 21),
            new TestResult(10, 21),
            new TestResult(21, 10),
            new TestResult(9, 11),
            new TestResult(23, 10),
            new TestResult(20, 10),
            new TestResult(7, 20),
            new TestResult(17, 16),
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
