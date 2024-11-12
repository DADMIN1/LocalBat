package String1.Testcases;
import String1.NonStart;

public final class _NonStart
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String a, String b) {
            try { result = NonStart.nonStart(a, b); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90mnonStart\u001B[0;90m(\u001b[0;1m\"Hello\", \"There\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mnonStart\u001B[0;90m(\u001b[0;1m\"java\", \"code\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mnonStart\u001B[0;90m(\u001b[0;1m\"shotl\", \"java\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mnonStart\u001B[0;90m(\u001b[0;1m\"ab\", \"xy\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mnonStart\u001B[0;90m(\u001b[0;1m\"ab\", \"x\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mnonStart\u001B[0;90m(\u001b[0;1m\"x\", \"ac\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mnonStart\u001B[0;90m(\u001b[0;1m\"a\", \"x\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mnonStart\u001B[0;90m(\u001b[0;1m\"kit\", \"kat\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mnonStart\u001B[0;90m(\u001b[0;1m\"mart\", \"dart\"\u001B[0m\u001b[90m)",
    };

    static final String[] expectedResults = {
        "ellohere",
        "avaode",
        "hotlava",
        "by",
        "b",
        "c",
        "",
        "itat",
        "artart",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("Hello", "There"),
            new TestResult("java", "code"),
            new TestResult("shotl", "java"),
            new TestResult("ab", "xy"),
            new TestResult("ab", "x"),
            new TestResult("x", "ac"),
            new TestResult("a", "x"),
            new TestResult("kit", "kat"),
            new TestResult("mart", "dart"),
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
            if (!results[i].result.equals(expectedResults[i])) {
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
