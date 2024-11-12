package String1.Testcases;
import String1.DeFront;

public final class _DeFront
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = DeFront.deFront(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;30mdeFront\u001B[0;30m(\u001b[0;1m\"Hello\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mdeFront\u001B[0;30m(\u001b[0;1m\"java\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mdeFront\u001B[0;30m(\u001b[0;1m\"away\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mdeFront\u001B[0;30m(\u001b[0;1m\"axy\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mdeFront\u001B[0;30m(\u001b[0;1m\"abc\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mdeFront\u001B[0;30m(\u001b[0;1m\"xby\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mdeFront\u001B[0;30m(\u001b[0;1m\"ab\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mdeFront\u001B[0;30m(\u001b[0;1m\"ax\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mdeFront\u001B[0;30m(\u001b[0;1m\"axb\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mdeFront\u001B[0;30m(\u001b[0;1m\"aaa\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mdeFront\u001B[0;30m(\u001b[0;1m\"xbc\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mdeFront\u001B[0;30m(\u001b[0;1m\"bbb\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mdeFront\u001B[0;30m(\u001b[0;1m\"bazz\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mdeFront\u001B[0;30m(\u001b[0;1m\"ba\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mdeFront\u001B[0;30m(\u001b[0;1m\"abxyz\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mdeFront\u001B[0;30m(\u001b[0;1m\"hi\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mdeFront\u001B[0;30m(\u001b[0;1m\"his\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mdeFront\u001B[0;30m(\u001b[0;1m\"xz\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mdeFront\u001B[0;30m(\u001b[0;1m\"zzz\"\u001B[0m\u001b[30m)",
    };

    static final String[] expectedResults = {
        "llo",
        "va",
        "aay",
        "ay",
        "abc",
        "by",
        "ab",
        "a",
        "ab",
        "aa",
        "bc",
        "bb",
        "zz",
        "",
        "abxyz",
        "",
        "s",
        "",
        "z",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("Hello"),
            new TestResult("java"),
            new TestResult("away"),
            new TestResult("axy"),
            new TestResult("abc"),
            new TestResult("xby"),
            new TestResult("ab"),
            new TestResult("ax"),
            new TestResult("axb"),
            new TestResult("aaa"),
            new TestResult("xbc"),
            new TestResult("bbb"),
            new TestResult("bazz"),
            new TestResult("ba"),
            new TestResult("abxyz"),
            new TestResult("hi"),
            new TestResult("his"),
            new TestResult("xz"),
            new TestResult("zzz"),
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
            if (!results[i].result.equals(expectedResults[i])) {
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
