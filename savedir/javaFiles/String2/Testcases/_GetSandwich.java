package String2.Testcases;
import String2.GetSandwich;

public final class _GetSandwich
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = GetSandwich.getSandwich(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;30mgetSandwich\u001B[0;30m(\u001b[0;1m\"breadjambread\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mgetSandwich\u001B[0;30m(\u001b[0;1m\"xxbreadjambreadyy\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mgetSandwich\u001B[0;30m(\u001b[0;1m\"xxbreadyy\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mgetSandwich\u001B[0;30m(\u001b[0;1m\"xxbreadbreadjambreadyy\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mgetSandwich\u001B[0;30m(\u001b[0;1m\"breadAbread\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mgetSandwich\u001B[0;30m(\u001b[0;1m\"breadbread\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mgetSandwich\u001B[0;30m(\u001b[0;1m\"abcbreaz\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mgetSandwich\u001B[0;30m(\u001b[0;1m\"xyz\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mgetSandwich\u001B[0;30m(\u001b[0;1m\"\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mgetSandwich\u001B[0;30m(\u001b[0;1m\"breadbreaxbread\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mgetSandwich\u001B[0;30m(\u001b[0;1m\"breaxbreadybread\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mgetSandwich\u001B[0;30m(\u001b[0;1m\"breadbreadbreadbread\"\u001B[0m\u001b[30m)",
    };

    static final String[] expectedResults = {
        "jam",
        "jam",
        "",
        "breadjam",
        "A",
        "",
        "",
        "",
        "",
        "breax",
        "y",
        "breadbread",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("breadjambread"),
            new TestResult("xxbreadjambreadyy"),
            new TestResult("xxbreadyy"),
            new TestResult("xxbreadbreadjambreadyy"),
            new TestResult("breadAbread"),
            new TestResult("breadbread"),
            new TestResult("abcbreaz"),
            new TestResult("xyz"),
            new TestResult(""),
            new TestResult("breadbreaxbread"),
            new TestResult("breaxbreadybread"),
            new TestResult("breadbreadbreadbread"),
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
