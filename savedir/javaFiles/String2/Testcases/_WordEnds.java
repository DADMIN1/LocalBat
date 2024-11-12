package String2.Testcases;
import String2.WordEnds;

public final class _WordEnds
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String str, String word) {
            try { result = WordEnds.wordEnds(str, word); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;30mwordEnds\u001B[0;30m(\u001b[0;1m\"abcXY123XYijk\", \"XY\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mwordEnds\u001B[0;30m(\u001b[0;1m\"XY123XY\", \"XY\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mwordEnds\u001B[0;30m(\u001b[0;1m\"XY1XY\", \"XY\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mwordEnds\u001B[0;30m(\u001b[0;1m\"XYXY\", \"XY\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mwordEnds\u001B[0;30m(\u001b[0;1m\"XY\", \"XY\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mwordEnds\u001B[0;30m(\u001b[0;1m\"Hi\", \"XY\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mwordEnds\u001B[0;30m(\u001b[0;1m\"\", \"XY\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mwordEnds\u001B[0;30m(\u001b[0;1m\"abc1xyz1i1j\", \"1\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mwordEnds\u001B[0;30m(\u001b[0;1m\"abc1xyz1\", \"1\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mwordEnds\u001B[0;30m(\u001b[0;1m\"abc1xyz11\", \"1\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mwordEnds\u001B[0;30m(\u001b[0;1m\"abc1xyz1abc\", \"abc\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mwordEnds\u001B[0;30m(\u001b[0;1m\"abc1xyz1abc\", \"b\"\u001B[0m\u001b[30m)",
        "\u001b[3;30mwordEnds\u001B[0;30m(\u001b[0;1m\"abc1abc1abc\", \"abc\"\u001B[0m\u001b[30m)",
    };

    static final String[] expectedResults = {
        "c13i",
        "13",
        "11",
        "XY",
        "",
        "",
        "",
        "cxziij",
        "cxz",
        "cxz11",
        "11",
        "acac",
        "1111",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("abcXY123XYijk", "XY"),
            new TestResult("XY123XY", "XY"),
            new TestResult("XY1XY", "XY"),
            new TestResult("XYXY", "XY"),
            new TestResult("XY", "XY"),
            new TestResult("Hi", "XY"),
            new TestResult("", "XY"),
            new TestResult("abc1xyz1i1j", "1"),
            new TestResult("abc1xyz1", "1"),
            new TestResult("abc1xyz11", "1"),
            new TestResult("abc1xyz1abc", "abc"),
            new TestResult("abc1xyz1abc", "b"),
            new TestResult("abc1abc1abc", "abc"),
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
