package String3.Testcases;
import String3.CountYZ;

public final class _CountYZ
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;
    public static boolean suppressOutput = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = CountYZ.countYZ(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90mcountYZ\u001B[0;90m(\u001b[0;1m\"fez day\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mcountYZ\u001B[0;90m(\u001b[0;1m\"day fez\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mcountYZ\u001B[0;90m(\u001b[0;1m\"day fyyyz\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mcountYZ\u001B[0;90m(\u001b[0;1m\"day yak\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mcountYZ\u001B[0;90m(\u001b[0;1m\"day:yak\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mcountYZ\u001B[0;90m(\u001b[0;1m\"!!day--yaz!!\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mcountYZ\u001B[0;90m(\u001b[0;1m\"yak zak\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mcountYZ\u001B[0;90m(\u001b[0;1m\"DAY abc XYZ\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mcountYZ\u001B[0;90m(\u001b[0;1m\"aaz yyz my\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mcountYZ\u001B[0;90m(\u001b[0;1m\"y2bz\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mcountYZ\u001B[0;90m(\u001b[0;1m\"zxyx\"\u001B[0m\u001b[90m)",
    };

    static final int[] expectedResults = {
        2,
        2,
        2,
        1,
        1,
        2,
        0,
        2,
        3,
        2,
        0,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("fez day"),
            new TestResult("day fez"),
            new TestResult("day fyyyz"),
            new TestResult("day yak"),
            new TestResult("day:yak"),
            new TestResult("!!day--yaz!!"),
            new TestResult("yak zak"),
            new TestResult("DAY abc XYZ"),
            new TestResult("aaz yyz my"),
            new TestResult("y2bz"),
            new TestResult("zxyx"),
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
