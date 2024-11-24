package Logic1.Testcases;
import Logic1.More20;

public final class _More20
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;
    public static boolean suppressOutput = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int n) {
            try { result = More20.more20(n); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90mmore20\u001B[0;90m(\u001b[0;1m20\u001B[0m\u001b[90m)",
        "\u001b[3;90mmore20\u001B[0;90m(\u001b[0;1m21\u001B[0m\u001b[90m)",
        "\u001b[3;90mmore20\u001B[0;90m(\u001b[0;1m22\u001B[0m\u001b[90m)",
        "\u001b[3;90mmore20\u001B[0;90m(\u001b[0;1m23\u001B[0m\u001b[90m)",
        "\u001b[3;90mmore20\u001B[0;90m(\u001b[0;1m25\u001B[0m\u001b[90m)",
        "\u001b[3;90mmore20\u001B[0;90m(\u001b[0;1m30\u001B[0m\u001b[90m)",
        "\u001b[3;90mmore20\u001B[0;90m(\u001b[0;1m31\u001B[0m\u001b[90m)",
        "\u001b[3;90mmore20\u001B[0;90m(\u001b[0;1m59\u001B[0m\u001b[90m)",
        "\u001b[3;90mmore20\u001B[0;90m(\u001b[0;1m60\u001B[0m\u001b[90m)",
        "\u001b[3;90mmore20\u001B[0;90m(\u001b[0;1m61\u001B[0m\u001b[90m)",
        "\u001b[3;90mmore20\u001B[0;90m(\u001b[0;1m62\u001B[0m\u001b[90m)",
        "\u001b[3;90mmore20\u001B[0;90m(\u001b[0;1m1020\u001B[0m\u001b[90m)",
        "\u001b[3;90mmore20\u001B[0;90m(\u001b[0;1m1021\u001B[0m\u001b[90m)",
        "\u001b[3;90mmore20\u001B[0;90m(\u001b[0;1m1000\u001B[0m\u001b[90m)",
        "\u001b[3;90mmore20\u001B[0;90m(\u001b[0;1m1001\u001B[0m\u001b[90m)",
        "\u001b[3;90mmore20\u001B[0;90m(\u001b[0;1m50\u001B[0m\u001b[90m)",
        "\u001b[3;90mmore20\u001B[0;90m(\u001b[0;1m55\u001B[0m\u001b[90m)",
        "\u001b[3;90mmore20\u001B[0;90m(\u001b[0;1m40\u001B[0m\u001b[90m)",
        "\u001b[3;90mmore20\u001B[0;90m(\u001b[0;1m41\u001B[0m\u001b[90m)",
        "\u001b[3;90mmore20\u001B[0;90m(\u001b[0;1m39\u001B[0m\u001b[90m)",
        "\u001b[3;90mmore20\u001B[0;90m(\u001b[0;1m42\u001B[0m\u001b[90m)",
    };

    static final boolean[] expectedResults = {
        false,
        true,
        true,
        false,
        false,
        false,
        false,
        false,
        false,
        true,
        true,
        false,
        true,
        false,
        true,
        false,
        false,
        false,
        true,
        false,
        true,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(20),
            new TestResult(21),
            new TestResult(22),
            new TestResult(23),
            new TestResult(25),
            new TestResult(30),
            new TestResult(31),
            new TestResult(59),
            new TestResult(60),
            new TestResult(61),
            new TestResult(62),
            new TestResult(1020),
            new TestResult(1021),
            new TestResult(1000),
            new TestResult(1001),
            new TestResult(50),
            new TestResult(55),
            new TestResult(40),
            new TestResult(41),
            new TestResult(39),
            new TestResult(42),
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
