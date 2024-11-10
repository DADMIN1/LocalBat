package Recursion1.Testcases;
import Recursion1.StrCount;

public final class _StrCount
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(String str, String sub) {
            try { result = StrCount.strCount(str, sub); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "strCount(\"catcowcat\", \"cat\")",
        "strCount(\"catcowcat\", \"cow\")",
        "strCount(\"catcowcat\", \"dog\")",
        "strCount(\"cacatcowcat\", \"cat\")",
        "strCount(\"xyx\", \"x\")",
        "strCount(\"iiiijj\", \"i\")",
        "strCount(\"iiiijj\", \"ii\")",
        "strCount(\"iiiijj\", \"iii\")",
        "strCount(\"iiiijj\", \"j\")",
        "strCount(\"iiiijj\", \"jj\")",
        "strCount(\"aaabababab\", \"ab\")",
        "strCount(\"aaabababab\", \"aa\")",
        "strCount(\"aaabababab\", \"a\")",
        "strCount(\"aaabababab\", \"b\")",
    };

    static final int[] expectedResults = {
        2,
        1,
        0,
        2,
        2,
        4,
        2,
        1,
        2,
        1,
        4,
        1,
        6,
        4,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("catcowcat", "cat"),
            new TestResult("catcowcat", "cow"),
            new TestResult("catcowcat", "dog"),
            new TestResult("cacatcowcat", "cat"),
            new TestResult("xyx", "x"),
            new TestResult("iiiijj", "i"),
            new TestResult("iiiijj", "ii"),
            new TestResult("iiiijj", "iii"),
            new TestResult("iiiijj", "j"),
            new TestResult("iiiijj", "jj"),
            new TestResult("aaabababab", "ab"),
            new TestResult("aaabababab", "aa"),
            new TestResult("aaabababab", "a"),
            new TestResult("aaabababab", "b"),
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
            if (results[i].result != expectedResults[i]) {
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
