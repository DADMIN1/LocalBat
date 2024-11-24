package String3.Testcases;
import String3.MaxBlock;

public final class _MaxBlock
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;
    public static boolean suppressOutput = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = MaxBlock.maxBlock(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90mmaxBlock\u001B[0;90m(\u001b[0;1m\"hoopla\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mmaxBlock\u001B[0;90m(\u001b[0;1m\"abbCCCddBBBxx\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mmaxBlock\u001B[0;90m(\u001b[0;1m\"\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mmaxBlock\u001B[0;90m(\u001b[0;1m\"xyz\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mmaxBlock\u001B[0;90m(\u001b[0;1m\"xxyz\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mmaxBlock\u001B[0;90m(\u001b[0;1m\"xyzz\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mmaxBlock\u001B[0;90m(\u001b[0;1m\"abbbcbbbxbbbx\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mmaxBlock\u001B[0;90m(\u001b[0;1m\"XXBBBbbxx\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mmaxBlock\u001B[0;90m(\u001b[0;1m\"XXBBBBbbxx\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mmaxBlock\u001B[0;90m(\u001b[0;1m\"XXBBBbbxxXXXX\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mmaxBlock\u001B[0;90m(\u001b[0;1m\"XX2222BBBbbXX2222\"\u001B[0m\u001b[90m)",
    };

    static final int[] expectedResults = {
        2,
        3,
        0,
        1,
        2,
        2,
        3,
        3,
        4,
        4,
        4,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("hoopla"),
            new TestResult("abbCCCddBBBxx"),
            new TestResult(""),
            new TestResult("xyz"),
            new TestResult("xxyz"),
            new TestResult("xyzz"),
            new TestResult("abbbcbbbxbbbx"),
            new TestResult("XXBBBbbxx"),
            new TestResult("XXBBBBbbxx"),
            new TestResult("XXBBBbbxxXXXX"),
            new TestResult("XX2222BBBbbXX2222"),
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
