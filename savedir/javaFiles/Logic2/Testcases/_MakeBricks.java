package Logic2.Testcases;
import Logic2.MakeBricks;

public final class _MakeBricks
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int small, int big, int goal) {
            try { result = MakeBricks.makeBricks(small, big, goal); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90mmakeBricks\u001B[0;90m(\u001b[0;1m3, 1, 8\u001B[0m\u001b[90m)",
        "\u001b[3;90mmakeBricks\u001B[0;90m(\u001b[0;1m3, 1, 9\u001B[0m\u001b[90m)",
        "\u001b[3;90mmakeBricks\u001B[0;90m(\u001b[0;1m3, 2, 10\u001B[0m\u001b[90m)",
        "\u001b[3;90mmakeBricks\u001B[0;90m(\u001b[0;1m3, 2, 8\u001B[0m\u001b[90m)",
        "\u001b[3;90mmakeBricks\u001B[0;90m(\u001b[0;1m3, 2, 9\u001B[0m\u001b[90m)",
        "\u001b[3;90mmakeBricks\u001B[0;90m(\u001b[0;1m6, 1, 11\u001B[0m\u001b[90m)",
        "\u001b[3;90mmakeBricks\u001B[0;90m(\u001b[0;1m6, 0, 11\u001B[0m\u001b[90m)",
        "\u001b[3;90mmakeBricks\u001B[0;90m(\u001b[0;1m1, 4, 11\u001B[0m\u001b[90m)",
        "\u001b[3;90mmakeBricks\u001B[0;90m(\u001b[0;1m0, 3, 10\u001B[0m\u001b[90m)",
        "\u001b[3;90mmakeBricks\u001B[0;90m(\u001b[0;1m1, 4, 12\u001B[0m\u001b[90m)",
        "\u001b[3;90mmakeBricks\u001B[0;90m(\u001b[0;1m3, 1, 7\u001B[0m\u001b[90m)",
        "\u001b[3;90mmakeBricks\u001B[0;90m(\u001b[0;1m1, 1, 7\u001B[0m\u001b[90m)",
        "\u001b[3;90mmakeBricks\u001B[0;90m(\u001b[0;1m2, 1, 7\u001B[0m\u001b[90m)",
        "\u001b[3;90mmakeBricks\u001B[0;90m(\u001b[0;1m7, 1, 11\u001B[0m\u001b[90m)",
        "\u001b[3;90mmakeBricks\u001B[0;90m(\u001b[0;1m7, 1, 8\u001B[0m\u001b[90m)",
        "\u001b[3;90mmakeBricks\u001B[0;90m(\u001b[0;1m7, 1, 13\u001B[0m\u001b[90m)",
        "\u001b[3;90mmakeBricks\u001B[0;90m(\u001b[0;1m43, 1, 46\u001B[0m\u001b[90m)",
        "\u001b[3;90mmakeBricks\u001B[0;90m(\u001b[0;1m40, 1, 46\u001B[0m\u001b[90m)",
        "\u001b[3;90mmakeBricks\u001B[0;90m(\u001b[0;1m40, 2, 47\u001B[0m\u001b[90m)",
        "\u001b[3;90mmakeBricks\u001B[0;90m(\u001b[0;1m40, 2, 50\u001B[0m\u001b[90m)",
        "\u001b[3;90mmakeBricks\u001B[0;90m(\u001b[0;1m40, 2, 52\u001B[0m\u001b[90m)",
        "\u001b[3;90mmakeBricks\u001B[0;90m(\u001b[0;1m22, 2, 33\u001B[0m\u001b[90m)",
        "\u001b[3;90mmakeBricks\u001B[0;90m(\u001b[0;1m0, 2, 10\u001B[0m\u001b[90m)",
        "\u001b[3;90mmakeBricks\u001B[0;90m(\u001b[0;1m1000000, 1000, 1000100\u001B[0m\u001b[90m)",
        "\u001b[3;90mmakeBricks\u001B[0;90m(\u001b[0;1m2, 1000000, 100003\u001B[0m\u001b[90m)",
        "\u001b[3;90mmakeBricks\u001B[0;90m(\u001b[0;1m20, 0, 19\u001B[0m\u001b[90m)",
        "\u001b[3;90mmakeBricks\u001B[0;90m(\u001b[0;1m20, 0, 21\u001B[0m\u001b[90m)",
        "\u001b[3;90mmakeBricks\u001B[0;90m(\u001b[0;1m20, 4, 51\u001B[0m\u001b[90m)",
        "\u001b[3;90mmakeBricks\u001B[0;90m(\u001b[0;1m20, 4, 39\u001B[0m\u001b[90m)",
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
        true,
        false,
        true,
        false,
        true,
        true,
        false,
        false,
        true,
        true,
        false,
        true,
        false,
        false,
        true,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(3, 1, 8),
            new TestResult(3, 1, 9),
            new TestResult(3, 2, 10),
            new TestResult(3, 2, 8),
            new TestResult(3, 2, 9),
            new TestResult(6, 1, 11),
            new TestResult(6, 0, 11),
            new TestResult(1, 4, 11),
            new TestResult(0, 3, 10),
            new TestResult(1, 4, 12),
            new TestResult(3, 1, 7),
            new TestResult(1, 1, 7),
            new TestResult(2, 1, 7),
            new TestResult(7, 1, 11),
            new TestResult(7, 1, 8),
            new TestResult(7, 1, 13),
            new TestResult(43, 1, 46),
            new TestResult(40, 1, 46),
            new TestResult(40, 2, 47),
            new TestResult(40, 2, 50),
            new TestResult(40, 2, 52),
            new TestResult(22, 2, 33),
            new TestResult(0, 2, 10),
            new TestResult(1000000, 1000, 1000100),
            new TestResult(2, 1000000, 100003),
            new TestResult(20, 0, 19),
            new TestResult(20, 0, 21),
            new TestResult(20, 4, 51),
            new TestResult(20, 4, 39),
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
