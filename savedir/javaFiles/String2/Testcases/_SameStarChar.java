package String2.Testcases;
import String2.SameStarChar;

public final class _SameStarChar
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = SameStarChar.sameStarChar(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90msameStarChar\u001B[0;90m(\u001b[0;1m\"xy*yzz\"\u001B[0m\u001b[90m)",
        "\u001b[3;90msameStarChar\u001B[0;90m(\u001b[0;1m\"xy*zzz\"\u001B[0m\u001b[90m)",
        "\u001b[3;90msameStarChar\u001B[0;90m(\u001b[0;1m\"*xa*az\"\u001B[0m\u001b[90m)",
        "\u001b[3;90msameStarChar\u001B[0;90m(\u001b[0;1m\"*xa*bz\"\u001B[0m\u001b[90m)",
        "\u001b[3;90msameStarChar\u001B[0;90m(\u001b[0;1m\"*xa*a*\"\u001B[0m\u001b[90m)",
        "\u001b[3;90msameStarChar\u001B[0;90m(\u001b[0;1m\"\"\u001B[0m\u001b[90m)",
        "\u001b[3;90msameStarChar\u001B[0;90m(\u001b[0;1m\"*xa*a*a\"\u001B[0m\u001b[90m)",
        "\u001b[3;90msameStarChar\u001B[0;90m(\u001b[0;1m\"*xa*a*b\"\u001B[0m\u001b[90m)",
        "\u001b[3;90msameStarChar\u001B[0;90m(\u001b[0;1m\"*12*2*2\"\u001B[0m\u001b[90m)",
        "\u001b[3;90msameStarChar\u001B[0;90m(\u001b[0;1m\"12*2*3*\"\u001B[0m\u001b[90m)",
        "\u001b[3;90msameStarChar\u001B[0;90m(\u001b[0;1m\"abcDEF\"\u001B[0m\u001b[90m)",
        "\u001b[3;90msameStarChar\u001B[0;90m(\u001b[0;1m\"XY*YYYY*Z*\"\u001B[0m\u001b[90m)",
        "\u001b[3;90msameStarChar\u001B[0;90m(\u001b[0;1m\"XY*YYYY*Y*\"\u001B[0m\u001b[90m)",
        "\u001b[3;90msameStarChar\u001B[0;90m(\u001b[0;1m\"12*2*3*\"\u001B[0m\u001b[90m)",
        "\u001b[3;90msameStarChar\u001B[0;90m(\u001b[0;1m\"*\"\u001B[0m\u001b[90m)",
        "\u001b[3;90msameStarChar\u001B[0;90m(\u001b[0;1m\"**\"\u001B[0m\u001b[90m)",
    };

    static final boolean[] expectedResults = {
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
        false,
        true,
        false,
        true,
        true,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("xy*yzz"),
            new TestResult("xy*zzz"),
            new TestResult("*xa*az"),
            new TestResult("*xa*bz"),
            new TestResult("*xa*a*"),
            new TestResult(""),
            new TestResult("*xa*a*a"),
            new TestResult("*xa*a*b"),
            new TestResult("*12*2*2"),
            new TestResult("12*2*3*"),
            new TestResult("abcDEF"),
            new TestResult("XY*YYYY*Z*"),
            new TestResult("XY*YYYY*Y*"),
            new TestResult("12*2*3*"),
            new TestResult("*"),
            new TestResult("**"),
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
