package String3.Testcases;
import String3.WithoutString;

public final class _WithoutString
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String base, String remove) {
            try { result = WithoutString.withoutString(base, remove); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;30mwithoutString\u001B[0;30m(\u001b[0;1m\"Hello there\", \"llo\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mwithoutString\u001B[0;30m(\u001b[0;1m\"Hello there\", \"e\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mwithoutString\u001B[0;30m(\u001b[0;1m\"Hello there\", \"x\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mwithoutString\u001B[0;30m(\u001b[0;1m\"This is a FISH\", \"IS\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mwithoutString\u001B[0;30m(\u001b[0;1m\"THIS is a FISH\", \"is\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mwithoutString\u001B[0;30m(\u001b[0;1m\"THIS is a FISH\", \"iS\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mwithoutString\u001B[0;30m(\u001b[0;1m\"abxxxxab\", \"xx\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mwithoutString\u001B[0;30m(\u001b[0;1m\"abxxxab\", \"xx\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mwithoutString\u001B[0;30m(\u001b[0;1m\"abxxxab\", \"x\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mwithoutString\u001B[0;30m(\u001b[0;1m\"xxx\", \"x\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mwithoutString\u001B[0;30m(\u001b[0;1m\"xxx\", \"xx\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mwithoutString\u001B[0;30m(\u001b[0;1m\"xyzzy\", \"Y\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mwithoutString\u001B[0;30m(\u001b[0;1m\"\", \"x\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mwithoutString\u001B[0;30m(\u001b[0;1m\"abcabc\", \"b\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mwithoutString\u001B[0;30m(\u001b[0;1m\"AA22bb\", \"2\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mwithoutString\u001B[0;30m(\u001b[0;1m\"1111\", \"1\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mwithoutString\u001B[0;30m(\u001b[0;1m\"1111\", \"11\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mwithoutString\u001B[0;30m(\u001b[0;1m\"MkjtMkx\", \"Mk\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mwithoutString\u001B[0;30m(\u001b[0;1m\"Hi HoHo\", \"Ho\"\u001B[0m\u001b[30m)",
    };

    static final String[] expectedResults = {
        "He there",
        "Hllo thr",
        "Hello there",
        "Th a FH",
        "TH a FH",
        "TH a FH",
        "abab",
        "abxab",
        "abab",
        "",
        "x",
        "xzz",
        "",
        "acac",
        "AAbb",
        "",
        "",
        "jtx",
        "Hi ",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("Hello there", "llo"),
            new TestResult("Hello there", "e"),
            new TestResult("Hello there", "x"),
            new TestResult("This is a FISH", "IS"),
            new TestResult("THIS is a FISH", "is"),
            new TestResult("THIS is a FISH", "iS"),
            new TestResult("abxxxxab", "xx"),
            new TestResult("abxxxab", "xx"),
            new TestResult("abxxxab", "x"),
            new TestResult("xxx", "x"),
            new TestResult("xxx", "xx"),
            new TestResult("xyzzy", "Y"),
            new TestResult("", "x"),
            new TestResult("abcabc", "b"),
            new TestResult("AA22bb", "2"),
            new TestResult("1111", "1"),
            new TestResult("1111", "11"),
            new TestResult("MkjtMkx", "Mk"),
            new TestResult("Hi HoHo", "Ho"),
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
