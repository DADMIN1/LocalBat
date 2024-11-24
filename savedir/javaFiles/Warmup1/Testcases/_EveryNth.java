package Warmup1.Testcases;
import Warmup1.EveryNth;

public final class _EveryNth
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;
    public static boolean suppressOutput = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String str, int n) {
            try { result = EveryNth.everyNth(str, n); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90meveryNth\u001B[0;90m(\u001b[0;1m\"Miracle\", 2\u001B[0m\u001b[90m)",
        "\u001b[3;90meveryNth\u001B[0;90m(\u001b[0;1m\"abcdefg\", 2\u001B[0m\u001b[90m)",
        "\u001b[3;90meveryNth\u001B[0;90m(\u001b[0;1m\"abcdefg\", 3\u001B[0m\u001b[90m)",
        "\u001b[3;90meveryNth\u001B[0;90m(\u001b[0;1m\"Chocolate\", 3\u001B[0m\u001b[90m)",
        "\u001b[3;90meveryNth\u001B[0;90m(\u001b[0;1m\"Chocolates\", 3\u001B[0m\u001b[90m)",
        "\u001b[3;90meveryNth\u001B[0;90m(\u001b[0;1m\"Chocolates\", 4\u001B[0m\u001b[90m)",
        "\u001b[3;90meveryNth\u001B[0;90m(\u001b[0;1m\"Chocolates\", 100\u001B[0m\u001b[90m)",
    };

    static final String[] expectedResults = {
        "Mrce",
        "aceg",
        "adg",
        "Cca",
        "Ccas",
        "Coe",
        "C",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("Miracle", 2),
            new TestResult("abcdefg", 2),
            new TestResult("abcdefg", 3),
            new TestResult("Chocolate", 3),
            new TestResult("Chocolates", 3),
            new TestResult("Chocolates", 4),
            new TestResult("Chocolates", 100),
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
