package Recursion1.Testcases;
import Recursion1.CountPairs;

public final class _CountPairs
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = CountPairs.countPairs(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "countPairs(\"axa\")",
        "countPairs(\"axax\")",
        "countPairs(\"axbx\")",
        "countPairs(\"hi\")",
        "countPairs(\"hihih\")",
        "countPairs(\"ihihhh\")",
        "countPairs(\"ihjxhh\")",
        "countPairs(\"\")",
        "countPairs(\"a\")",
        "countPairs(\"aa\")",
        "countPairs(\"aaa\")",
    };

    static final int[] expectedResults = {
        1,
        2,
        1,
        0,
        3,
        3,
        0,
        0,
        0,
        0,
        1,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("axa"),
            new TestResult("axax"),
            new TestResult("axbx"),
            new TestResult("hi"),
            new TestResult("hihih"),
            new TestResult("ihihhh"),
            new TestResult("ihjxhh"),
            new TestResult(""),
            new TestResult("a"),
            new TestResult("aa"),
            new TestResult("aaa"),
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
