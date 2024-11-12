package Logic1.Testcases;
import Logic1.ShareDigit;

public final class _ShareDigit
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int a, int b) {
            try { result = ShareDigit.shareDigit(a, b); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;30mshareDigit\u001B[0;30m(\u001b[0;1m12, 23\u001B[0m\u001b[30m)",
        "\u001b[3;30mshareDigit\u001B[0;30m(\u001b[0;1m12, 43\u001B[0m\u001b[30m)",
        "\u001b[3;30mshareDigit\u001B[0;30m(\u001b[0;1m12, 44\u001B[0m\u001b[30m)",
        "\u001b[3;30mshareDigit\u001B[0;30m(\u001b[0;1m23, 12\u001B[0m\u001b[30m)",
        "\u001b[3;30mshareDigit\u001B[0;30m(\u001b[0;1m23, 39\u001B[0m\u001b[30m)",
        "\u001b[3;30mshareDigit\u001B[0;30m(\u001b[0;1m23, 19\u001B[0m\u001b[30m)",
        "\u001b[3;30mshareDigit\u001B[0;30m(\u001b[0;1m30, 90\u001B[0m\u001b[30m)",
        "\u001b[3;30mshareDigit\u001B[0;30m(\u001b[0;1m30, 91\u001B[0m\u001b[30m)",
        "\u001b[3;30mshareDigit\u001B[0;30m(\u001b[0;1m55, 55\u001B[0m\u001b[30m)",
        "\u001b[3;30mshareDigit\u001B[0;30m(\u001b[0;1m55, 44\u001B[0m\u001b[30m)",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        false,
        true,
        true,
        false,
        true,
        false,
        true,
        false,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(12, 23),
            new TestResult(12, 43),
            new TestResult(12, 44),
            new TestResult(23, 12),
            new TestResult(23, 39),
            new TestResult(23, 19),
            new TestResult(30, 90),
            new TestResult(30, 91),
            new TestResult(55, 55),
            new TestResult(55, 44),
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
