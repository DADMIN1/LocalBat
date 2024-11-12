package Warmup1.Testcases;
import Warmup1.NearHundred;

public final class _NearHundred
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int n) {
            try { result = NearHundred.nearHundred(n); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90mnearHundred\u001B[0;90m(\u001b[0;1m93\u001B[0m\u001b[90m)",
        "\u001b[3;90mnearHundred\u001B[0;90m(\u001b[0;1m90\u001B[0m\u001b[90m)",
        "\u001b[3;90mnearHundred\u001B[0;90m(\u001b[0;1m89\u001B[0m\u001b[90m)",
        "\u001b[3;90mnearHundred\u001B[0;90m(\u001b[0;1m110\u001B[0m\u001b[90m)",
        "\u001b[3;90mnearHundred\u001B[0;90m(\u001b[0;1m111\u001B[0m\u001b[90m)",
        "\u001b[3;90mnearHundred\u001B[0;90m(\u001b[0;1m121\u001B[0m\u001b[90m)",
        "\u001b[3;90mnearHundred\u001B[0;90m(\u001b[0;1m-101\u001B[0m\u001b[90m)",
        "\u001b[3;90mnearHundred\u001B[0;90m(\u001b[0;1m-209\u001B[0m\u001b[90m)",
        "\u001b[3;90mnearHundred\u001B[0;90m(\u001b[0;1m190\u001B[0m\u001b[90m)",
        "\u001b[3;90mnearHundred\u001B[0;90m(\u001b[0;1m209\u001B[0m\u001b[90m)",
        "\u001b[3;90mnearHundred\u001B[0;90m(\u001b[0;1m0\u001B[0m\u001b[90m)",
        "\u001b[3;90mnearHundred\u001B[0;90m(\u001b[0;1m5\u001B[0m\u001b[90m)",
        "\u001b[3;90mnearHundred\u001B[0;90m(\u001b[0;1m-50\u001B[0m\u001b[90m)",
        "\u001b[3;90mnearHundred\u001B[0;90m(\u001b[0;1m191\u001B[0m\u001b[90m)",
        "\u001b[3;90mnearHundred\u001B[0;90m(\u001b[0;1m189\u001B[0m\u001b[90m)",
        "\u001b[3;90mnearHundred\u001B[0;90m(\u001b[0;1m200\u001B[0m\u001b[90m)",
        "\u001b[3;90mnearHundred\u001B[0;90m(\u001b[0;1m210\u001B[0m\u001b[90m)",
        "\u001b[3;90mnearHundred\u001B[0;90m(\u001b[0;1m211\u001B[0m\u001b[90m)",
        "\u001b[3;90mnearHundred\u001B[0;90m(\u001b[0;1m290\u001B[0m\u001b[90m)",
    };

    static final boolean[] expectedResults = {
        true,
        true,
        false,
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
        true,
        false,
        true,
        true,
        false,
        false,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(93),
            new TestResult(90),
            new TestResult(89),
            new TestResult(110),
            new TestResult(111),
            new TestResult(121),
            new TestResult(-101),
            new TestResult(-209),
            new TestResult(190),
            new TestResult(209),
            new TestResult(0),
            new TestResult(5),
            new TestResult(-50),
            new TestResult(191),
            new TestResult(189),
            new TestResult(200),
            new TestResult(210),
            new TestResult(211),
            new TestResult(290),
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
