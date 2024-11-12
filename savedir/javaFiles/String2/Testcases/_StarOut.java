package String2.Testcases;
import String2.StarOut;

public final class _StarOut
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = StarOut.starOut(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90mstarOut\u001B[0;90m(\u001b[0;1m\"ab*cd\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mstarOut\u001B[0;90m(\u001b[0;1m\"ab**cd\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mstarOut\u001B[0;90m(\u001b[0;1m\"sm*eilly\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mstarOut\u001B[0;90m(\u001b[0;1m\"sm*eil*ly\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mstarOut\u001B[0;90m(\u001b[0;1m\"sm**eil*ly\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mstarOut\u001B[0;90m(\u001b[0;1m\"sm***eil*ly\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mstarOut\u001B[0;90m(\u001b[0;1m\"stringy*\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mstarOut\u001B[0;90m(\u001b[0;1m\"*stringy\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mstarOut\u001B[0;90m(\u001b[0;1m\"*str*in*gy\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mstarOut\u001B[0;90m(\u001b[0;1m\"abc\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mstarOut\u001B[0;90m(\u001b[0;1m\"a*bc\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mstarOut\u001B[0;90m(\u001b[0;1m\"ab\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mstarOut\u001B[0;90m(\u001b[0;1m\"a*b\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mstarOut\u001B[0;90m(\u001b[0;1m\"a\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mstarOut\u001B[0;90m(\u001b[0;1m\"a*\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mstarOut\u001B[0;90m(\u001b[0;1m\"*a\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mstarOut\u001B[0;90m(\u001b[0;1m\"*\"\u001B[0m\u001b[90m)",
        "\u001b[3;90mstarOut\u001B[0;90m(\u001b[0;1m\"\"\u001B[0m\u001b[90m)",
    };

    static final String[] expectedResults = {
        "ad",
        "ad",
        "silly",
        "siy",
        "siy",
        "siy",
        "string",
        "tringy",
        "ty",
        "abc",
        "c",
        "ab",
        "",
        "a",
        "",
        "",
        "",
        "",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("ab*cd"),
            new TestResult("ab**cd"),
            new TestResult("sm*eilly"),
            new TestResult("sm*eil*ly"),
            new TestResult("sm**eil*ly"),
            new TestResult("sm***eil*ly"),
            new TestResult("stringy*"),
            new TestResult("*stringy"),
            new TestResult("*str*in*gy"),
            new TestResult("abc"),
            new TestResult("a*bc"),
            new TestResult("ab"),
            new TestResult("a*b"),
            new TestResult("a"),
            new TestResult("a*"),
            new TestResult("*a"),
            new TestResult("*"),
            new TestResult(""),
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
