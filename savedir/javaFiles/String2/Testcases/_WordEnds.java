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
        "wordEnds(\"abcXY123XYijk\", \"XY\")",
        "wordEnds(\"XY123XY\", \"XY\")",
        "wordEnds(\"XY1XY\", \"XY\")",
        "wordEnds(\"XYXY\", \"XY\")",
        "wordEnds(\"XY\", \"XY\")",
        "wordEnds(\"Hi\", \"XY\")",
        "wordEnds(\"\", \"XY\")",
        "wordEnds(\"abc1xyz1i1j\", \"1\")",
        "wordEnds(\"abc1xyz1\", \"1\")",
        "wordEnds(\"abc1xyz11\", \"1\")",
        "wordEnds(\"abc1xyz1abc\", \"abc\")",
        "wordEnds(\"abc1xyz1abc\", \"b\")",
        "wordEnds(\"abc1abc1abc\", \"abc\")",
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

        boolean allTestsPassed = true;
        boolean prevTestPassed = false;
        for (int i = 0; i < results.length; ++i)
        {
            if (results[i].caught != null) {
                allTestsPassed = false;
                if(prevTestPassed) { System.out.println(); prevTestPassed = false; }
                System.out.print("[!] #"+(i+1)+" - ");
                System.out.println(testcaseStrings[i]+" - Failed! [EXCEPTION]");
                System.out.println(results[i].caught.getClass().getName());
                System.out.println(results[i].caught.getMessage());
                if(getStacktraces) results[i].caught.printStackTrace();
                System.out.println(); continue;
            }
            if (!results[i].result.equals(expectedResults[i])) {
                allTestsPassed = false;
                if(prevTestPassed) { System.out.println(); prevTestPassed = false; }
                System.out.print("[x] #"+(i+1)+" - ");
                System.out.println(testcaseStrings[i]+" - Failed!");
                System.out.println("    received: "+results[i].result);
                System.out.println("    expected: "+expectedResults[i]);
                System.out.println();
            } else if (printSuccesses) {
                prevTestPassed = true;
                System.out.println("[✓] #"+(i+1)+" - "+testcaseStrings[i]);
            }
        }
        if (allTestsPassed) System.out.println("\n ✓✓✓  ~ All tests passed. ~  ✓✓✓");
        System.out.println();
        return allTestsPassed;
    }
}
