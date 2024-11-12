package String2.Testcases;
import String2.XyBalance;

public final class _XyBalance
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = XyBalance.xyBalance(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;30mxyBalance\u001B[0;30m(\u001b[0;1m\"aaxbby\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mxyBalance\u001B[0;30m(\u001b[0;1m\"aaxbb\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mxyBalance\u001B[0;30m(\u001b[0;1m\"yaaxbb\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mxyBalance\u001B[0;30m(\u001b[0;1m\"yaaxbby\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mxyBalance\u001B[0;30m(\u001b[0;1m\"xaxxbby\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mxyBalance\u001B[0;30m(\u001b[0;1m\"xaxxbbyx\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mxyBalance\u001B[0;30m(\u001b[0;1m\"xxbxy\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mxyBalance\u001B[0;30m(\u001b[0;1m\"xxbx\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mxyBalance\u001B[0;30m(\u001b[0;1m\"bbb\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mxyBalance\u001B[0;30m(\u001b[0;1m\"bxbb\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mxyBalance\u001B[0;30m(\u001b[0;1m\"bxyb\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mxyBalance\u001B[0;30m(\u001b[0;1m\"xy\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mxyBalance\u001B[0;30m(\u001b[0;1m\"y\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mxyBalance\u001B[0;30m(\u001b[0;1m\"x\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mxyBalance\u001B[0;30m(\u001b[0;1m\"\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mxyBalance\u001B[0;30m(\u001b[0;1m\"yxyxyxyx\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mxyBalance\u001B[0;30m(\u001b[0;1m\"yxyxyxyxy\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mxyBalance\u001B[0;30m(\u001b[0;1m\"12xabxxydxyxyzz\"\u001B[0m\u001b[30m)",
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
        true,
        true,
        true,
        false,
        true,
        false,
        true,
        true,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("aaxbby"),
            new TestResult("aaxbb"),
            new TestResult("yaaxbb"),
            new TestResult("yaaxbby"),
            new TestResult("xaxxbby"),
            new TestResult("xaxxbbyx"),
            new TestResult("xxbxy"),
            new TestResult("xxbx"),
            new TestResult("bbb"),
            new TestResult("bxbb"),
            new TestResult("bxyb"),
            new TestResult("xy"),
            new TestResult("y"),
            new TestResult("x"),
            new TestResult(""),
            new TestResult("yxyxyxyx"),
            new TestResult("yxyxyxyxy"),
            new TestResult("12xabxxydxyxyzz"),
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
