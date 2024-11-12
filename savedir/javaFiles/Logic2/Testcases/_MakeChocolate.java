package Logic2.Testcases;
import Logic2.MakeChocolate;

public final class _MakeChocolate
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int small, int big, int goal) {
            try { result = MakeChocolate.makeChocolate(small, big, goal); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;30mmakeChocolate\u001B[0;30m(\u001b[0;1m4, 1, 9\u001B[0m\u001b[30m)",
        "\u001b[3;30mmakeChocolate\u001B[0;30m(\u001b[0;1m4, 1, 10\u001B[0m\u001b[30m)",
        "\u001b[3;30mmakeChocolate\u001B[0;30m(\u001b[0;1m4, 1, 7\u001B[0m\u001b[30m)",
        "\u001b[3;30mmakeChocolate\u001B[0;30m(\u001b[0;1m6, 2, 7\u001B[0m\u001b[30m)",
        "\u001b[3;30mmakeChocolate\u001B[0;30m(\u001b[0;1m4, 1, 5\u001B[0m\u001b[30m)",
        "\u001b[3;30mmakeChocolate\u001B[0;30m(\u001b[0;1m4, 1, 4\u001B[0m\u001b[30m)",
        "\u001b[3;30mmakeChocolate\u001B[0;30m(\u001b[0;1m5, 4, 9\u001B[0m\u001b[30m)",
        "\u001b[3;30mmakeChocolate\u001B[0;30m(\u001b[0;1m9, 3, 18\u001B[0m\u001b[30m)",
        "\u001b[3;30mmakeChocolate\u001B[0;30m(\u001b[0;1m3, 1, 9\u001B[0m\u001b[30m)",
        "\u001b[3;30mmakeChocolate\u001B[0;30m(\u001b[0;1m1, 2, 7\u001B[0m\u001b[30m)",
        "\u001b[3;30mmakeChocolate\u001B[0;30m(\u001b[0;1m1, 2, 6\u001B[0m\u001b[30m)",
        "\u001b[3;30mmakeChocolate\u001B[0;30m(\u001b[0;1m1, 2, 5\u001B[0m\u001b[30m)",
        "\u001b[3;30mmakeChocolate\u001B[0;30m(\u001b[0;1m6, 1, 10\u001B[0m\u001b[30m)",
        "\u001b[3;30mmakeChocolate\u001B[0;30m(\u001b[0;1m6, 1, 11\u001B[0m\u001b[30m)",
        "\u001b[3;30mmakeChocolate\u001B[0;30m(\u001b[0;1m6, 1, 12\u001B[0m\u001b[30m)",
        "\u001b[3;30mmakeChocolate\u001B[0;30m(\u001b[0;1m6, 1, 13\u001B[0m\u001b[30m)",
        "\u001b[3;30mmakeChocolate\u001B[0;30m(\u001b[0;1m6, 2, 10\u001B[0m\u001b[30m)",
        "\u001b[3;30mmakeChocolate\u001B[0;30m(\u001b[0;1m6, 2, 11\u001B[0m\u001b[30m)",
        "\u001b[3;30mmakeChocolate\u001B[0;30m(\u001b[0;1m6, 2, 12\u001B[0m\u001b[30m)",
        "\u001b[3;30mmakeChocolate\u001B[0;30m(\u001b[0;1m60, 100, 550\u001B[0m\u001b[30m)",
        "\u001b[3;30mmakeChocolate\u001B[0;30m(\u001b[0;1m1000, 1000000, 5000006\u001B[0m\u001b[30m)",
        "\u001b[3;30mmakeChocolate\u001B[0;30m(\u001b[0;1m7, 1, 12\u001B[0m\u001b[30m)",
        "\u001b[3;30mmakeChocolate\u001B[0;30m(\u001b[0;1m7, 1, 13\u001B[0m\u001b[30m)",
        "\u001b[3;30mmakeChocolate\u001B[0;30m(\u001b[0;1m7, 2, 13\u001B[0m\u001b[30m)",
    };

    static final int[] expectedResults = {
        4,
        -1,
        2,
        2,
        0,
        4,
        4,
        3,
        -1,
        -1,
        1,
        0,
        5,
        6,
        -1,
        -1,
        0,
        1,
        2,
        50,
        6,
        7,
        -1,
        3,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(4, 1, 9),
            new TestResult(4, 1, 10),
            new TestResult(4, 1, 7),
            new TestResult(6, 2, 7),
            new TestResult(4, 1, 5),
            new TestResult(4, 1, 4),
            new TestResult(5, 4, 9),
            new TestResult(9, 3, 18),
            new TestResult(3, 1, 9),
            new TestResult(1, 2, 7),
            new TestResult(1, 2, 6),
            new TestResult(1, 2, 5),
            new TestResult(6, 1, 10),
            new TestResult(6, 1, 11),
            new TestResult(6, 1, 12),
            new TestResult(6, 1, 13),
            new TestResult(6, 2, 10),
            new TestResult(6, 2, 11),
            new TestResult(6, 2, 12),
            new TestResult(60, 100, 550),
            new TestResult(1000, 1000000, 5000006),
            new TestResult(7, 1, 12),
            new TestResult(7, 1, 13),
            new TestResult(7, 2, 13),
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
