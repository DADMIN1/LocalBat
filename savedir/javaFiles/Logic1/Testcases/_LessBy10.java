package Logic1.Testcases;
import Logic1.LessBy10;

public final class _LessBy10
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;
    public static boolean suppressOutput = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int a, int b, int c) {
            try { result = LessBy10.lessBy10(a, b, c); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90mlessBy10\u001B[0;90m(\u001b[0;1m1, 7, 11\u001B[0m\u001b[90m)",
        "\u001b[3;90mlessBy10\u001B[0;90m(\u001b[0;1m1, 7, 10\u001B[0m\u001b[90m)",
        "\u001b[3;90mlessBy10\u001B[0;90m(\u001b[0;1m11, 1, 7\u001B[0m\u001b[90m)",
        "\u001b[3;90mlessBy10\u001B[0;90m(\u001b[0;1m10, 7, 1\u001B[0m\u001b[90m)",
        "\u001b[3;90mlessBy10\u001B[0;90m(\u001b[0;1m-10, 2, 2\u001B[0m\u001b[90m)",
        "\u001b[3;90mlessBy10\u001B[0;90m(\u001b[0;1m2, 11, 11\u001B[0m\u001b[90m)",
        "\u001b[3;90mlessBy10\u001B[0;90m(\u001b[0;1m3, 3, 30\u001B[0m\u001b[90m)",
        "\u001b[3;90mlessBy10\u001B[0;90m(\u001b[0;1m3, 3, 3\u001B[0m\u001b[90m)",
        "\u001b[3;90mlessBy10\u001B[0;90m(\u001b[0;1m10, 1, 11\u001B[0m\u001b[90m)",
        "\u001b[3;90mlessBy10\u001B[0;90m(\u001b[0;1m10, 11, 1\u001B[0m\u001b[90m)",
        "\u001b[3;90mlessBy10\u001B[0;90m(\u001b[0;1m10, 11, 2\u001B[0m\u001b[90m)",
        "\u001b[3;90mlessBy10\u001B[0;90m(\u001b[0;1m3, 30, 3\u001B[0m\u001b[90m)",
        "\u001b[3;90mlessBy10\u001B[0;90m(\u001b[0;1m2, 2, -8\u001B[0m\u001b[90m)",
        "\u001b[3;90mlessBy10\u001B[0;90m(\u001b[0;1m2, 8, 12\u001B[0m\u001b[90m)",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        true,
        false,
        true,
        false,
        true,
        false,
        true,
        true,
        false,
        true,
        true,
        true,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(1, 7, 11),
            new TestResult(1, 7, 10),
            new TestResult(11, 1, 7),
            new TestResult(10, 7, 1),
            new TestResult(-10, 2, 2),
            new TestResult(2, 11, 11),
            new TestResult(3, 3, 30),
            new TestResult(3, 3, 3),
            new TestResult(10, 1, 11),
            new TestResult(10, 11, 1),
            new TestResult(10, 11, 2),
            new TestResult(3, 30, 3),
            new TestResult(2, 2, -8),
            new TestResult(2, 8, 12),
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
