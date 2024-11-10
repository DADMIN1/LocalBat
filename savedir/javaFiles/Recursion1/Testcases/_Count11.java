package Recursion1.Testcases;
import Recursion1.Count11;

public final class _Count11
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = Count11.count11(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "count11(\"11abc11\")",
        "count11(\"abc11x11x11\")",
        "count11(\"111\")",
        "count11(\"1111\")",
        "count11(\"1\")",
        "count11(\"\")",
        "count11(\"hi\")",
        "count11(\"11x111x1111\")",
        "count11(\"1x111\")",
        "count11(\"1Hello1\")",
        "count11(\"Hello\")",
    };

    static final int[] expectedResults = {
        2,
        3,
        1,
        2,
        0,
        0,
        0,
        4,
        1,
        0,
        0,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("11abc11"),
            new TestResult("abc11x11x11"),
            new TestResult("111"),
            new TestResult("1111"),
            new TestResult("1"),
            new TestResult(""),
            new TestResult("hi"),
            new TestResult("11x111x1111"),
            new TestResult("1x111"),
            new TestResult("1Hello1"),
            new TestResult("Hello"),
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
