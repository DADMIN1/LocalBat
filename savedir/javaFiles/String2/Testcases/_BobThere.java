package String2.Testcases;
import String2.BobThere;

public final class _BobThere
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = BobThere.bobThere(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90mbobThere\u001B[0;90m(\u001b[0;1m\"abcbob\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mbobThere\u001B[0;90m(\u001b[0;1m\"b9b\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mbobThere\u001B[0;90m(\u001b[0;1m\"bac\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mbobThere\u001B[0;90m(\u001b[0;1m\"bbb\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mbobThere\u001B[0;90m(\u001b[0;1m\"abcdefb\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mbobThere\u001B[0;90m(\u001b[0;1m\"123abcbcdbabxyz\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mbobThere\u001B[0;90m(\u001b[0;1m\"b12\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mbobThere\u001B[0;90m(\u001b[0;1m\"b1b\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mbobThere\u001B[0;90m(\u001b[0;1m\"b12b1b\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mbobThere\u001B[0;90m(\u001b[0;1m\"bbc\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mbobThere\u001B[0;90m(\u001b[0;1m\"bbb\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mbobThere\u001B[0;90m(\u001b[0;1m\"bb\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mbobThere\u001B[0;90m(\u001b[0;1m\"b\"\u001B[0m\u001b[90m)",
    };

    static final boolean[] expectedResults = {
        true,
        true,
        false,
        true,
        false,
        true,
        false,
        true,
        true,
        false,
        true,
        false,
        false,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("abcbob"),
            new TestResult("b9b"),
            new TestResult("bac"),
            new TestResult("bbb"),
            new TestResult("abcdefb"),
            new TestResult("123abcbcdbabxyz"),
            new TestResult("b12"),
            new TestResult("b1b"),
            new TestResult("b12b1b"),
            new TestResult("bbc"),
            new TestResult("bbb"),
            new TestResult("bb"),
            new TestResult("b"),
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
