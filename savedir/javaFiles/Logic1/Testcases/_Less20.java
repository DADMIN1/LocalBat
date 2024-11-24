package Logic1.Testcases;
import Logic1.Less20;

public final class _Less20
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;
    public static boolean suppressOutput = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int n) {
            try { result = Less20.less20(n); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90mless20\u001B[0;90m(\u001b[0;1m18\u001B[0m\u001b[90m)",
        "\u001b[3;90mless20\u001B[0;90m(\u001b[0;1m19\u001B[0m\u001b[90m)",
        "\u001b[3;90mless20\u001B[0;90m(\u001b[0;1m20\u001B[0m\u001b[90m)",
        "\u001b[3;90mless20\u001B[0;90m(\u001b[0;1m8\u001B[0m\u001b[90m)",
        "\u001b[3;90mless20\u001B[0;90m(\u001b[0;1m17\u001B[0m\u001b[90m)",
        "\u001b[3;90mless20\u001B[0;90m(\u001b[0;1m23\u001B[0m\u001b[90m)",
        "\u001b[3;90mless20\u001B[0;90m(\u001b[0;1m25\u001B[0m\u001b[90m)",
        "\u001b[3;90mless20\u001B[0;90m(\u001b[0;1m30\u001B[0m\u001b[90m)",
        "\u001b[3;90mless20\u001B[0;90m(\u001b[0;1m31\u001B[0m\u001b[90m)",
        "\u001b[3;90mless20\u001B[0;90m(\u001b[0;1m58\u001B[0m\u001b[90m)",
        "\u001b[3;90mless20\u001B[0;90m(\u001b[0;1m59\u001B[0m\u001b[90m)",
        "\u001b[3;90mless20\u001B[0;90m(\u001b[0;1m60\u001B[0m\u001b[90m)",
        "\u001b[3;90mless20\u001B[0;90m(\u001b[0;1m61\u001B[0m\u001b[90m)",
        "\u001b[3;90mless20\u001B[0;90m(\u001b[0;1m62\u001B[0m\u001b[90m)",
        "\u001b[3;90mless20\u001B[0;90m(\u001b[0;1m1017\u001B[0m\u001b[90m)",
        "\u001b[3;90mless20\u001B[0;90m(\u001b[0;1m1018\u001B[0m\u001b[90m)",
        "\u001b[3;90mless20\u001B[0;90m(\u001b[0;1m1019\u001B[0m\u001b[90m)",
        "\u001b[3;90mless20\u001B[0;90m(\u001b[0;1m1020\u001B[0m\u001b[90m)",
        "\u001b[3;90mless20\u001B[0;90m(\u001b[0;1m1021\u001B[0m\u001b[90m)",
        "\u001b[3;90mless20\u001B[0;90m(\u001b[0;1m1022\u001B[0m\u001b[90m)",
        "\u001b[3;90mless20\u001B[0;90m(\u001b[0;1m1023\u001B[0m\u001b[90m)",
        "\u001b[3;90mless20\u001B[0;90m(\u001b[0;1m37\u001B[0m\u001b[90m)",
    };

    static final boolean[] expectedResults = {
        true,
        true,
        false,
        false,
        false,
        false,
        false,
        false,
        false,
        true,
        true,
        false,
        false,
        false,
        false,
        true,
        true,
        false,
        false,
        false,
        false,
        false,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(18),
            new TestResult(19),
            new TestResult(20),
            new TestResult(8),
            new TestResult(17),
            new TestResult(23),
            new TestResult(25),
            new TestResult(30),
            new TestResult(31),
            new TestResult(58),
            new TestResult(59),
            new TestResult(60),
            new TestResult(61),
            new TestResult(62),
            new TestResult(1017),
            new TestResult(1018),
            new TestResult(1019),
            new TestResult(1020),
            new TestResult(1021),
            new TestResult(1022),
            new TestResult(1023),
            new TestResult(37),
        };

        int successCount = 0;
        boolean allTestsPassed = true;
        boolean prevTestPassed = false;
        for (int i = 0; i < results.length; ++i)
        {
            if (results[i].caught != null) {
                allTestsPassed = false;
                if(suppressOutput) continue;
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
                if(suppressOutput) continue;
                if(prevTestPassed) { System.out.println(); prevTestPassed = false; }
                System.out.print("\u001b[91;1m[X]\u001B[0m \u001b[94;4m#"+(i+1)+"\u001b[0;90m - \u001B[0m");
                System.out.println(testcaseStrings[i]+" - \u001b[91;1;3mFailed!\u001B[0m");
                System.out.println("    \u001b[94;3;4mreceived:\u001B[0m \u001b[1m"+results[i].result);
                System.out.println("    \u001b[96;3;4mexpected:\u001B[0m \u001b[1m"+expectedResults[i]);
                System.out.println();
            } else if (printSuccesses && !suppressOutput) {
                successCount += 1;
                prevTestPassed = true;
                System.out.println("\u001b[92;1m[✓] \u001B[0m\u001b[94;4m#"+(i+1)+"\u001b[0;90m - \u001B[0m"+testcaseStrings[i]);
            }
        }
        if (suppressOutput) return allTestsPassed;
        if (allTestsPassed) System.out.println("\n \u001b[92;1m✓✓✓\u001B[0;1m\u001b[96;40m  ~  All tests passed  ~  \u001B[0m\u001b[92;1m✓✓✓\u001B[0m");
        else System.out.println("\n\u001b[92;1;40m "+successCount+"\u001B[0;1;40m / \u001b[94m"+results.length+"\u001b[90m tests passed \u001B[0m");
        return allTestsPassed;
    }
}
