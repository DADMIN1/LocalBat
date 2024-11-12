package Logic1.Testcases;
import Logic1.SpecialEleven;

public final class _SpecialEleven
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int n) {
            try { result = SpecialEleven.specialEleven(n); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90mspecialEleven\u001B[0;90m(\u001b[0;1m22\u001B[0m\u001b[90m)",
        "\u001b[3;90mspecialEleven\u001B[0;90m(\u001b[0;1m23\u001B[0m\u001b[90m)",
        "\u001b[3;90mspecialEleven\u001B[0;90m(\u001b[0;1m24\u001B[0m\u001b[90m)",
        "\u001b[3;90mspecialEleven\u001B[0;90m(\u001b[0;1m21\u001B[0m\u001b[90m)",
        "\u001b[3;90mspecialEleven\u001B[0;90m(\u001b[0;1m11\u001B[0m\u001b[90m)",
        "\u001b[3;90mspecialEleven\u001B[0;90m(\u001b[0;1m12\u001B[0m\u001b[90m)",
        "\u001b[3;90mspecialEleven\u001B[0;90m(\u001b[0;1m10\u001B[0m\u001b[90m)",
        "\u001b[3;90mspecialEleven\u001B[0;90m(\u001b[0;1m9\u001B[0m\u001b[90m)",
        "\u001b[3;90mspecialEleven\u001B[0;90m(\u001b[0;1m8\u001B[0m\u001b[90m)",
        "\u001b[3;90mspecialEleven\u001B[0;90m(\u001b[0;1m0\u001B[0m\u001b[90m)",
        "\u001b[3;90mspecialEleven\u001B[0;90m(\u001b[0;1m1\u001B[0m\u001b[90m)",
        "\u001b[3;90mspecialEleven\u001B[0;90m(\u001b[0;1m2\u001B[0m\u001b[90m)",
        "\u001b[3;90mspecialEleven\u001B[0;90m(\u001b[0;1m121\u001B[0m\u001b[90m)",
        "\u001b[3;90mspecialEleven\u001B[0;90m(\u001b[0;1m122\u001B[0m\u001b[90m)",
        "\u001b[3;90mspecialEleven\u001B[0;90m(\u001b[0;1m123\u001B[0m\u001b[90m)",
        "\u001b[3;90mspecialEleven\u001B[0;90m(\u001b[0;1m46\u001B[0m\u001b[90m)",
        "\u001b[3;90mspecialEleven\u001B[0;90m(\u001b[0;1m49\u001B[0m\u001b[90m)",
        "\u001b[3;90mspecialEleven\u001B[0;90m(\u001b[0;1m52\u001B[0m\u001b[90m)",
        "\u001b[3;90mspecialEleven\u001B[0;90m(\u001b[0;1m54\u001B[0m\u001b[90m)",
        "\u001b[3;90mspecialEleven\u001B[0;90m(\u001b[0;1m55\u001B[0m\u001b[90m)",
    };

    static final boolean[] expectedResults = {
        true,
        true,
        false,
        false,
        true,
        true,
        false,
        false,
        false,
        true,
        true,
        false,
        true,
        true,
        false,
        false,
        false,
        false,
        false,
        true,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(22),
            new TestResult(23),
            new TestResult(24),
            new TestResult(21),
            new TestResult(11),
            new TestResult(12),
            new TestResult(10),
            new TestResult(9),
            new TestResult(8),
            new TestResult(0),
            new TestResult(1),
            new TestResult(2),
            new TestResult(121),
            new TestResult(122),
            new TestResult(123),
            new TestResult(46),
            new TestResult(49),
            new TestResult(52),
            new TestResult(54),
            new TestResult(55),
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
