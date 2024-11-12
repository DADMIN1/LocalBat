package Warmup2.Testcases;
import Warmup2.Last2;

public final class _Last2
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = Last2.last2(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90mlast2\u001B[0;90m(\u001b[0;1m\"hixxhi\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mlast2\u001B[0;90m(\u001b[0;1m\"xaxxaxaxx\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mlast2\u001B[0;90m(\u001b[0;1m\"axxxaaxx\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mlast2\u001B[0;90m(\u001b[0;1m\"xxaxxaxxaxx\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mlast2\u001B[0;90m(\u001b[0;1m\"xaxaxaxx\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mlast2\u001B[0;90m(\u001b[0;1m\"xxxx\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mlast2\u001B[0;90m(\u001b[0;1m\"13121312\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mlast2\u001B[0;90m(\u001b[0;1m\"11212\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mlast2\u001B[0;90m(\u001b[0;1m\"13121311\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mlast2\u001B[0;90m(\u001b[0;1m\"1717171\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mlast2\u001B[0;90m(\u001b[0;1m\"hi\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mlast2\u001B[0;90m(\u001b[0;1m\"h\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mlast2\u001B[0;90m(\u001b[0;1m\"\"\u001B[0m\u001b[90m)",
    };

    static final int[] expectedResults = {
        1,
        1,
        2,
        3,
        0,
        2,
        1,
        1,
        0,
        2,
        0,
        0,
        0,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("hixxhi"),
            new TestResult("xaxxaxaxx"),
            new TestResult("axxxaaxx"),
            new TestResult("xxaxxaxxaxx"),
            new TestResult("xaxaxaxx"),
            new TestResult("xxxx"),
            new TestResult("13121312"),
            new TestResult("11212"),
            new TestResult("13121311"),
            new TestResult("1717171"),
            new TestResult("hi"),
            new TestResult("h"),
            new TestResult(""),
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
