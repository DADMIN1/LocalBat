package Recursion1.Testcases;
import Recursion1.StrDist;

public final class _StrDist
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(String str, String sub) {
            try { result = StrDist.strDist(str, sub); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "strDist(\"catcowcat\", \"cat\")",
        "strDist(\"catcowcat\", \"cow\")",
        "strDist(\"cccatcowcatxx\", \"cat\")",
        "strDist(\"abccatcowcatcatxyz\", \"cat\")",
        "strDist(\"xyx\", \"x\")",
        "strDist(\"xyx\", \"y\")",
        "strDist(\"xyx\", \"z\")",
        "strDist(\"z\", \"z\")",
        "strDist(\"x\", \"z\")",
        "strDist(\"\", \"z\")",
        "strDist(\"hiHellohihihi\", \"hi\")",
        "strDist(\"hiHellohihihi\", \"hih\")",
        "strDist(\"hiHellohihihi\", \"o\")",
        "strDist(\"hiHellohihihi\", \"ll\")",
    };

    static final int[] expectedResults = {
        9,
        3,
        9,
        12,
        3,
        1,
        0,
        1,
        0,
        0,
        13,
        5,
        1,
        2,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("catcowcat", "cat"),
            new TestResult("catcowcat", "cow"),
            new TestResult("cccatcowcatxx", "cat"),
            new TestResult("abccatcowcatcatxyz", "cat"),
            new TestResult("xyx", "x"),
            new TestResult("xyx", "y"),
            new TestResult("xyx", "z"),
            new TestResult("z", "z"),
            new TestResult("x", "z"),
            new TestResult("", "z"),
            new TestResult("hiHellohihihi", "hi"),
            new TestResult("hiHellohihihi", "hih"),
            new TestResult("hiHellohihihi", "o"),
            new TestResult("hiHellohihihi", "ll"),
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
