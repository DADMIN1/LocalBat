package Logic1.Testcases;
import Logic1.Love6;

public final class _Love6
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int a, int b) {
            try { result = Love6.love6(a, b); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;30mlove6\u001B[0;30m(\u001b[0;1m6, 4\u001B[0m\u001b[30m)",
        "\u001b[3;30mlove6\u001B[0;30m(\u001b[0;1m4, 5\u001B[0m\u001b[30m)",
        "\u001b[3;30mlove6\u001B[0;30m(\u001b[0;1m1, 5\u001B[0m\u001b[30m)",
        "\u001b[3;30mlove6\u001B[0;30m(\u001b[0;1m1, 6\u001B[0m\u001b[30m)",
        "\u001b[3;30mlove6\u001B[0;30m(\u001b[0;1m1, 8\u001B[0m\u001b[30m)",
        "\u001b[3;30mlove6\u001B[0;30m(\u001b[0;1m1, 7\u001B[0m\u001b[30m)",
        "\u001b[3;30mlove6\u001B[0;30m(\u001b[0;1m7, 5\u001B[0m\u001b[30m)",
        "\u001b[3;30mlove6\u001B[0;30m(\u001b[0;1m8, 2\u001B[0m\u001b[30m)",
        "\u001b[3;30mlove6\u001B[0;30m(\u001b[0;1m6, 6\u001B[0m\u001b[30m)",
        "\u001b[3;30mlove6\u001B[0;30m(\u001b[0;1m-6, 2\u001B[0m\u001b[30m)",
        "\u001b[3;30mlove6\u001B[0;30m(\u001b[0;1m-4, -10\u001B[0m\u001b[30m)",
        "\u001b[3;30mlove6\u001B[0;30m(\u001b[0;1m-7, 1\u001B[0m\u001b[30m)",
        "\u001b[3;30mlove6\u001B[0;30m(\u001b[0;1m7, -1\u001B[0m\u001b[30m)",
        "\u001b[3;30mlove6\u001B[0;30m(\u001b[0;1m-6, 12\u001B[0m\u001b[30m)",
        "\u001b[3;30mlove6\u001B[0;30m(\u001b[0;1m-2, -4\u001B[0m\u001b[30m)",
        "\u001b[3;30mlove6\u001B[0;30m(\u001b[0;1m7, 1\u001B[0m\u001b[30m)",
        "\u001b[3;30mlove6\u001B[0;30m(\u001b[0;1m0, 9\u001B[0m\u001b[30m)",
        "\u001b[3;30mlove6\u001B[0;30m(\u001b[0;1m8, 3\u001B[0m\u001b[30m)",
        "\u001b[3;30mlove6\u001B[0;30m(\u001b[0;1m3, 3\u001B[0m\u001b[30m)",
        "\u001b[3;30mlove6\u001B[0;30m(\u001b[0;1m3, 4\u001B[0m\u001b[30m)",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        true,
        true,
        false,
        true,
        false,
        true,
        true,
        false,
        true,
        false,
        true,
        true,
        false,
        true,
        false,
        false,
        true,
        false,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(6, 4),
            new TestResult(4, 5),
            new TestResult(1, 5),
            new TestResult(1, 6),
            new TestResult(1, 8),
            new TestResult(1, 7),
            new TestResult(7, 5),
            new TestResult(8, 2),
            new TestResult(6, 6),
            new TestResult(-6, 2),
            new TestResult(-4, -10),
            new TestResult(-7, 1),
            new TestResult(7, -1),
            new TestResult(-6, 12),
            new TestResult(-2, -4),
            new TestResult(7, 1),
            new TestResult(0, 9),
            new TestResult(8, 3),
            new TestResult(3, 3),
            new TestResult(3, 4),
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
