package Warmup1.Testcases;
import Warmup1.StartOz;

public final class _StartOz
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;
    public static boolean suppressOutput = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = StartOz.startOz(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90mstartOz\u001B[0;90m(\u001b[0;1m\"ozymandias\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mstartOz\u001B[0;90m(\u001b[0;1m\"bzoo\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mstartOz\u001B[0;90m(\u001b[0;1m\"oxx\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mstartOz\u001B[0;90m(\u001b[0;1m\"oz\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mstartOz\u001B[0;90m(\u001b[0;1m\"ounce\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mstartOz\u001B[0;90m(\u001b[0;1m\"o\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mstartOz\u001B[0;90m(\u001b[0;1m\"abc\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mstartOz\u001B[0;90m(\u001b[0;1m\"\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mstartOz\u001B[0;90m(\u001b[0;1m\"zoo\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mstartOz\u001B[0;90m(\u001b[0;1m\"aztec\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mstartOz\u001B[0;90m(\u001b[0;1m\"zzzz\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mstartOz\u001B[0;90m(\u001b[0;1m\"oznic\"\u001B[0m\u001b[90m)",
    };

    static final String[] expectedResults = {
        "oz",
        "z",
        "o",
        "oz",
        "o",
        "o",
        "",
        "",
        "",
        "z",
        "z",
        "oz",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("ozymandias"),
            new TestResult("bzoo"),
            new TestResult("oxx"),
            new TestResult("oz"),
            new TestResult("ounce"),
            new TestResult("o"),
            new TestResult("abc"),
            new TestResult(""),
            new TestResult("zoo"),
            new TestResult("aztec"),
            new TestResult("zzzz"),
            new TestResult("oznic"),
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
            if (!results[i].result.equals(expectedResults[i])) {
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
