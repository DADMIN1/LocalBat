package String2.Testcases;
import String2.XyzMiddle;

public final class _XyzMiddle
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;
    public static boolean suppressOutput = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = XyzMiddle.xyzMiddle(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90mxyzMiddle\u001B[0;90m(\u001b[0;1m\"AAxyzBB\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mxyzMiddle\u001B[0;90m(\u001b[0;1m\"AxyzBB\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mxyzMiddle\u001B[0;90m(\u001b[0;1m\"AxyzBBB\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mxyzMiddle\u001B[0;90m(\u001b[0;1m\"AxyzBBBB\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mxyzMiddle\u001B[0;90m(\u001b[0;1m\"AAAxyzB\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mxyzMiddle\u001B[0;90m(\u001b[0;1m\"AAAxyzBB\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mxyzMiddle\u001B[0;90m(\u001b[0;1m\"AAAAxyzBB\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mxyzMiddle\u001B[0;90m(\u001b[0;1m\"AAAAAxyzBBB\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mxyzMiddle\u001B[0;90m(\u001b[0;1m\"1x345xyz12x4\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mxyzMiddle\u001B[0;90m(\u001b[0;1m\"xyzAxyzBBB\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mxyzMiddle\u001B[0;90m(\u001b[0;1m\"xyzAxyzBxyz\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mxyzMiddle\u001B[0;90m(\u001b[0;1m\"xyzxyzAxyzBxyzxyz\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mxyzMiddle\u001B[0;90m(\u001b[0;1m\"xyzxyzxyzBxyzxyz\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mxyzMiddle\u001B[0;90m(\u001b[0;1m\"xyzxyzAxyzxyzxyz\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mxyzMiddle\u001B[0;90m(\u001b[0;1m\"xyzxyzAxyzxyzxy\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mxyzMiddle\u001B[0;90m(\u001b[0;1m\"AxyzxyzBB\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mxyzMiddle\u001B[0;90m(\u001b[0;1m\"\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mxyzMiddle\u001B[0;90m(\u001b[0;1m\"x\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mxyzMiddle\u001B[0;90m(\u001b[0;1m\"xy\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mxyzMiddle\u001B[0;90m(\u001b[0;1m\"xyz\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mxyzMiddle\u001B[0;90m(\u001b[0;1m\"xyzz\"\u001B[0m\u001b[90m)",
    };

    static final boolean[] expectedResults = {
        true,
        true,
        false,
        false,
        false,
        true,
        false,
        false,
        true,
        true,
        true,
        true,
        true,
        true,
        false,
        false,
        false,
        false,
        false,
        true,
        true,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("AAxyzBB"),
            new TestResult("AxyzBB"),
            new TestResult("AxyzBBB"),
            new TestResult("AxyzBBBB"),
            new TestResult("AAAxyzB"),
            new TestResult("AAAxyzBB"),
            new TestResult("AAAAxyzBB"),
            new TestResult("AAAAAxyzBBB"),
            new TestResult("1x345xyz12x4"),
            new TestResult("xyzAxyzBBB"),
            new TestResult("xyzAxyzBxyz"),
            new TestResult("xyzxyzAxyzBxyzxyz"),
            new TestResult("xyzxyzxyzBxyzxyz"),
            new TestResult("xyzxyzAxyzxyzxyz"),
            new TestResult("xyzxyzAxyzxyzxy"),
            new TestResult("AxyzxyzBB"),
            new TestResult(""),
            new TestResult("x"),
            new TestResult("xy"),
            new TestResult("xyz"),
            new TestResult("xyzz"),
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
