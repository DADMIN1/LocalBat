package Logic2.Testcases;
import Logic2.RoundSum;

public final class _RoundSum
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int a, int b, int c) {
            try { result = RoundSum.roundSum(a, b, c); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;30mroundSum\u001B[0;30m(\u001b[0;1m16, 17, 18\u001B[0m\u001b[30m)",
        "\u001b[3;30mroundSum\u001B[0;30m(\u001b[0;1m12, 13, 14\u001B[0m\u001b[30m)",
        "\u001b[3;30mroundSum\u001B[0;30m(\u001b[0;1m6, 4, 4\u001B[0m\u001b[30m)",
        "\u001b[3;30mroundSum\u001B[0;30m(\u001b[0;1m4, 6, 5\u001B[0m\u001b[30m)",
        "\u001b[3;30mroundSum\u001B[0;30m(\u001b[0;1m4, 4, 6\u001B[0m\u001b[30m)",
        "\u001b[3;30mroundSum\u001B[0;30m(\u001b[0;1m9, 4, 4\u001B[0m\u001b[30m)",
        "\u001b[3;30mroundSum\u001B[0;30m(\u001b[0;1m0, 0, 1\u001B[0m\u001b[30m)",
        "\u001b[3;30mroundSum\u001B[0;30m(\u001b[0;1m0, 9, 0\u001B[0m\u001b[30m)",
        "\u001b[3;30mroundSum\u001B[0;30m(\u001b[0;1m10, 10, 19\u001B[0m\u001b[30m)",
        "\u001b[3;30mroundSum\u001B[0;30m(\u001b[0;1m20, 30, 40\u001B[0m\u001b[30m)",
        "\u001b[3;30mroundSum\u001B[0;30m(\u001b[0;1m45, 21, 30\u001B[0m\u001b[30m)",
        "\u001b[3;30mroundSum\u001B[0;30m(\u001b[0;1m23, 11, 26\u001B[0m\u001b[30m)",
        "\u001b[3;30mroundSum\u001B[0;30m(\u001b[0;1m23, 24, 25\u001B[0m\u001b[30m)",
        "\u001b[3;30mroundSum\u001B[0;30m(\u001b[0;1m25, 24, 25\u001B[0m\u001b[30m)",
        "\u001b[3;30mroundSum\u001B[0;30m(\u001b[0;1m23, 24, 29\u001B[0m\u001b[30m)",
        "\u001b[3;30mroundSum\u001B[0;30m(\u001b[0;1m11, 24, 36\u001B[0m\u001b[30m)",
        "\u001b[3;30mroundSum\u001B[0;30m(\u001b[0;1m24, 36, 32\u001B[0m\u001b[30m)",
        "\u001b[3;30mroundSum\u001B[0;30m(\u001b[0;1m14, 12, 26\u001B[0m\u001b[30m)",
        "\u001b[3;30mroundSum\u001B[0;30m(\u001b[0;1m12, 10, 24\u001B[0m\u001b[30m)",
    };

    static final int[] expectedResults = {
        60,
        30,
        10,
        20,
        10,
        10,
        0,
        10,
        40,
        90,
        100,
        60,
        70,
        80,
        70,
        70,
        90,
        50,
        40,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(16, 17, 18),
            new TestResult(12, 13, 14),
            new TestResult(6, 4, 4),
            new TestResult(4, 6, 5),
            new TestResult(4, 4, 6),
            new TestResult(9, 4, 4),
            new TestResult(0, 0, 1),
            new TestResult(0, 9, 0),
            new TestResult(10, 10, 19),
            new TestResult(20, 30, 40),
            new TestResult(45, 21, 30),
            new TestResult(23, 11, 26),
            new TestResult(23, 24, 25),
            new TestResult(25, 24, 25),
            new TestResult(23, 24, 29),
            new TestResult(11, 24, 36),
            new TestResult(24, 36, 32),
            new TestResult(14, 12, 26),
            new TestResult(12, 10, 24),
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
