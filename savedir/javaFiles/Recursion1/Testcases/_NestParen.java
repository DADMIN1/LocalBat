package Recursion1.Testcases;
import Recursion1.NestParen;

public final class _NestParen
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = NestParen.nestParen(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90mnestParen\u001B[0;90m(\u001b[0;1m\"(())\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mnestParen\u001B[0;90m(\u001b[0;1m\"((()))\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mnestParen\u001B[0;90m(\u001b[0;1m\"(((x))\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mnestParen\u001B[0;90m(\u001b[0;1m\"((())\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mnestParen\u001B[0;90m(\u001b[0;1m\"((()()\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mnestParen\u001B[0;90m(\u001b[0;1m\"()\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mnestParen\u001B[0;90m(\u001b[0;1m\"\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mnestParen\u001B[0;90m(\u001b[0;1m\"(yy)\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mnestParen\u001B[0;90m(\u001b[0;1m\"(())\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mnestParen\u001B[0;90m(\u001b[0;1m\"(((y))\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mnestParen\u001B[0;90m(\u001b[0;1m\"((y)))\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mnestParen\u001B[0;90m(\u001b[0;1m\"((()))\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mnestParen\u001B[0;90m(\u001b[0;1m\"(())))\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mnestParen\u001B[0;90m(\u001b[0;1m\"((yy())))\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mnestParen\u001B[0;90m(\u001b[0;1m\"(((())))\"\u001B[0m\u001b[90m)",
    };

    static final boolean[] expectedResults = {
        true,
        true,
        false,
        false,
        false,
        true,
        true,
        false,
        true,
        false,
        false,
        true,
        false,
        false,
        true,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("(())"),
            new TestResult("((()))"),
            new TestResult("(((x))"),
            new TestResult("((())"),
            new TestResult("((()()"),
            new TestResult("()"),
            new TestResult(""),
            new TestResult("(yy)"),
            new TestResult("(())"),
            new TestResult("(((y))"),
            new TestResult("((y)))"),
            new TestResult("((()))"),
            new TestResult("(())))"),
            new TestResult("((yy())))"),
            new TestResult("(((())))"),
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
