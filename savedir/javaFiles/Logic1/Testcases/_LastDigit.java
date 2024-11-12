package Logic1.Testcases;
import Logic1.LastDigit;

public final class _LastDigit
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int a, int b, int c) {
            try { result = LastDigit.lastDigit(a, b, c); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;30mlastDigit\u001B[0;30m(\u001b[0;1m23, 19, 13\u001B[0m\u001b[30m)",
        "\u001b[3;30mlastDigit\u001B[0;30m(\u001b[0;1m23, 19, 12\u001B[0m\u001b[30m)",
        "\u001b[3;30mlastDigit\u001B[0;30m(\u001b[0;1m23, 19, 3\u001B[0m\u001b[30m)",
        "\u001b[3;30mlastDigit\u001B[0;30m(\u001b[0;1m23, 19, 39\u001B[0m\u001b[30m)",
        "\u001b[3;30mlastDigit\u001B[0;30m(\u001b[0;1m1, 2, 3\u001B[0m\u001b[30m)",
        "\u001b[3;30mlastDigit\u001B[0;30m(\u001b[0;1m1, 1, 2\u001B[0m\u001b[30m)",
        "\u001b[3;30mlastDigit\u001B[0;30m(\u001b[0;1m1, 2, 2\u001B[0m\u001b[30m)",
        "\u001b[3;30mlastDigit\u001B[0;30m(\u001b[0;1m14, 25, 43\u001B[0m\u001b[30m)",
        "\u001b[3;30mlastDigit\u001B[0;30m(\u001b[0;1m14, 25, 45\u001B[0m\u001b[30m)",
        "\u001b[3;30mlastDigit\u001B[0;30m(\u001b[0;1m248, 106, 1002\u001B[0m\u001b[30m)",
        "\u001b[3;30mlastDigit\u001B[0;30m(\u001b[0;1m248, 106, 1008\u001B[0m\u001b[30m)",
        "\u001b[3;30mlastDigit\u001B[0;30m(\u001b[0;1m10, 11, 20\u001B[0m\u001b[30m)",
        "\u001b[3;30mlastDigit\u001B[0;30m(\u001b[0;1m0, 11, 0\u001B[0m\u001b[30m)",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        true,
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
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(23, 19, 13),
            new TestResult(23, 19, 12),
            new TestResult(23, 19, 3),
            new TestResult(23, 19, 39),
            new TestResult(1, 2, 3),
            new TestResult(1, 1, 2),
            new TestResult(1, 2, 2),
            new TestResult(14, 25, 43),
            new TestResult(14, 25, 45),
            new TestResult(248, 106, 1002),
            new TestResult(248, 106, 1008),
            new TestResult(10, 11, 20),
            new TestResult(0, 11, 0),
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
