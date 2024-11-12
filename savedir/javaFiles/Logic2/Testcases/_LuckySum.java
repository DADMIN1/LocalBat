package Logic2.Testcases;
import Logic2.LuckySum;

public final class _LuckySum
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int a, int b, int c) {
            try { result = LuckySum.luckySum(a, b, c); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;30mluckySum\u001B[0;30m(\u001b[0;1m1, 2, 3\u001B[0m\u001b[30m)",
        "\u001b[3;30mluckySum\u001B[0;30m(\u001b[0;1m1, 2, 13\u001B[0m\u001b[30m)",
        "\u001b[3;30mluckySum\u001B[0;30m(\u001b[0;1m1, 13, 3\u001B[0m\u001b[30m)",
        "\u001b[3;30mluckySum\u001B[0;30m(\u001b[0;1m1, 13, 13\u001B[0m\u001b[30m)",
        "\u001b[3;30mluckySum\u001B[0;30m(\u001b[0;1m6, 5, 2\u001B[0m\u001b[30m)",
        "\u001b[3;30mluckySum\u001B[0;30m(\u001b[0;1m13, 2, 3\u001B[0m\u001b[30m)",
        "\u001b[3;30mluckySum\u001B[0;30m(\u001b[0;1m13, 2, 13\u001B[0m\u001b[30m)",
        "\u001b[3;30mluckySum\u001B[0;30m(\u001b[0;1m13, 13, 2\u001B[0m\u001b[30m)",
        "\u001b[3;30mluckySum\u001B[0;30m(\u001b[0;1m9, 4, 13\u001B[0m\u001b[30m)",
        "\u001b[3;30mluckySum\u001B[0;30m(\u001b[0;1m8, 13, 2\u001B[0m\u001b[30m)",
        "\u001b[3;30mluckySum\u001B[0;30m(\u001b[0;1m7, 2, 1\u001B[0m\u001b[30m)",
        "\u001b[3;30mluckySum\u001B[0;30m(\u001b[0;1m3, 3, 13\u001B[0m\u001b[30m)",
    };

    static final int[] expectedResults = {
        6,
        3,
        1,
        1,
        13,
        0,
        0,
        0,
        13,
        8,
        10,
        6,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(1, 2, 3),
            new TestResult(1, 2, 13),
            new TestResult(1, 13, 3),
            new TestResult(1, 13, 13),
            new TestResult(6, 5, 2),
            new TestResult(13, 2, 3),
            new TestResult(13, 2, 13),
            new TestResult(13, 13, 2),
            new TestResult(9, 4, 13),
            new TestResult(8, 13, 2),
            new TestResult(7, 2, 1),
            new TestResult(3, 3, 13),
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
