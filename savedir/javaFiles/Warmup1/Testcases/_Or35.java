package Warmup1.Testcases;
import Warmup1.Or35;

public final class _Or35
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int n) {
            try { result = Or35.or35(n); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;30mor35\u001B[0;30m(\u001b[0;1m3\u001B[0m\u001b[30m)",
        "\u001b[3;30mor35\u001B[0;30m(\u001b[0;1m10\u001B[0m\u001b[30m)",
        "\u001b[3;30mor35\u001B[0;30m(\u001b[0;1m8\u001B[0m\u001b[30m)",
        "\u001b[3;30mor35\u001B[0;30m(\u001b[0;1m15\u001B[0m\u001b[30m)",
        "\u001b[3;30mor35\u001B[0;30m(\u001b[0;1m5\u001B[0m\u001b[30m)",
        "\u001b[3;30mor35\u001B[0;30m(\u001b[0;1m9\u001B[0m\u001b[30m)",
        "\u001b[3;30mor35\u001B[0;30m(\u001b[0;1m4\u001B[0m\u001b[30m)",
        "\u001b[3;30mor35\u001B[0;30m(\u001b[0;1m7\u001B[0m\u001b[30m)",
        "\u001b[3;30mor35\u001B[0;30m(\u001b[0;1m6\u001B[0m\u001b[30m)",
        "\u001b[3;30mor35\u001B[0;30m(\u001b[0;1m17\u001B[0m\u001b[30m)",
        "\u001b[3;30mor35\u001B[0;30m(\u001b[0;1m18\u001B[0m\u001b[30m)",
        "\u001b[3;30mor35\u001B[0;30m(\u001b[0;1m29\u001B[0m\u001b[30m)",
        "\u001b[3;30mor35\u001B[0;30m(\u001b[0;1m20\u001B[0m\u001b[30m)",
        "\u001b[3;30mor35\u001B[0;30m(\u001b[0;1m21\u001B[0m\u001b[30m)",
        "\u001b[3;30mor35\u001B[0;30m(\u001b[0;1m22\u001B[0m\u001b[30m)",
        "\u001b[3;30mor35\u001B[0;30m(\u001b[0;1m45\u001B[0m\u001b[30m)",
        "\u001b[3;30mor35\u001B[0;30m(\u001b[0;1m99\u001B[0m\u001b[30m)",
        "\u001b[3;30mor35\u001B[0;30m(\u001b[0;1m100\u001B[0m\u001b[30m)",
        "\u001b[3;30mor35\u001B[0;30m(\u001b[0;1m101\u001B[0m\u001b[30m)",
        "\u001b[3;30mor35\u001B[0;30m(\u001b[0;1m121\u001B[0m\u001b[30m)",
        "\u001b[3;30mor35\u001B[0;30m(\u001b[0;1m122\u001B[0m\u001b[30m)",
        "\u001b[3;30mor35\u001B[0;30m(\u001b[0;1m123\u001B[0m\u001b[30m)",
    };

    static final boolean[] expectedResults = {
        true,
        true,
        false,
        true,
        true,
        true,
        false,
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
        false,
        false,
        false,
        true,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(3),
            new TestResult(10),
            new TestResult(8),
            new TestResult(15),
            new TestResult(5),
            new TestResult(9),
            new TestResult(4),
            new TestResult(7),
            new TestResult(6),
            new TestResult(17),
            new TestResult(18),
            new TestResult(29),
            new TestResult(20),
            new TestResult(21),
            new TestResult(22),
            new TestResult(45),
            new TestResult(99),
            new TestResult(100),
            new TestResult(101),
            new TestResult(121),
            new TestResult(122),
            new TestResult(123),
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
