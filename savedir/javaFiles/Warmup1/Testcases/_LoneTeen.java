package Warmup1.Testcases;
import Warmup1.LoneTeen;

public final class _LoneTeen
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int a, int b) {
            try { result = LoneTeen.loneTeen(a, b); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;30mloneTeen\u001B[0;30m(\u001b[0;1m13, 99\u001B[0m\u001b[30m)",
        "\u001b[3;30mloneTeen\u001B[0;30m(\u001b[0;1m21, 19\u001B[0m\u001b[30m)",
        "\u001b[3;30mloneTeen\u001B[0;30m(\u001b[0;1m13, 13\u001B[0m\u001b[30m)",
        "\u001b[3;30mloneTeen\u001B[0;30m(\u001b[0;1m14, 20\u001B[0m\u001b[30m)",
        "\u001b[3;30mloneTeen\u001B[0;30m(\u001b[0;1m20, 15\u001B[0m\u001b[30m)",
        "\u001b[3;30mloneTeen\u001B[0;30m(\u001b[0;1m16, 17\u001B[0m\u001b[30m)",
        "\u001b[3;30mloneTeen\u001B[0;30m(\u001b[0;1m16, 9\u001B[0m\u001b[30m)",
        "\u001b[3;30mloneTeen\u001B[0;30m(\u001b[0;1m16, 18\u001B[0m\u001b[30m)",
        "\u001b[3;30mloneTeen\u001B[0;30m(\u001b[0;1m13, 19\u001B[0m\u001b[30m)",
        "\u001b[3;30mloneTeen\u001B[0;30m(\u001b[0;1m13, 20\u001B[0m\u001b[30m)",
        "\u001b[3;30mloneTeen\u001B[0;30m(\u001b[0;1m6, 18\u001B[0m\u001b[30m)",
        "\u001b[3;30mloneTeen\u001B[0;30m(\u001b[0;1m99, 13\u001B[0m\u001b[30m)",
        "\u001b[3;30mloneTeen\u001B[0;30m(\u001b[0;1m99, 99\u001B[0m\u001b[30m)",
    };

    static final boolean[] expectedResults = {
        true,
        true,
        false,
        true,
        true,
        false,
        true,
        false,
        false,
        true,
        true,
        true,
        false,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(13, 99),
            new TestResult(21, 19),
            new TestResult(13, 13),
            new TestResult(14, 20),
            new TestResult(20, 15),
            new TestResult(16, 17),
            new TestResult(16, 9),
            new TestResult(16, 18),
            new TestResult(13, 19),
            new TestResult(13, 20),
            new TestResult(6, 18),
            new TestResult(99, 13),
            new TestResult(99, 99),
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
