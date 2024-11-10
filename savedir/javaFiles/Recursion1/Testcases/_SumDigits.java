package Recursion1.Testcases;
import Recursion1.SumDigits;

public final class _SumDigits
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int n) {
            try { result = SumDigits.sumDigits(n); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "sumDigits(126)",
        "sumDigits(49)",
        "sumDigits(12)",
        "sumDigits(10)",
        "sumDigits(1)",
        "sumDigits(0)",
        "sumDigits(730)",
        "sumDigits(1111)",
        "sumDigits(11111)",
        "sumDigits(10110)",
        "sumDigits(235)",
    };

    static final int[] expectedResults = {
        9,
        13,
        3,
        1,
        1,
        0,
        10,
        4,
        5,
        3,
        10,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(126),
            new TestResult(49),
            new TestResult(12),
            new TestResult(10),
            new TestResult(1),
            new TestResult(0),
            new TestResult(730),
            new TestResult(1111),
            new TestResult(11111),
            new TestResult(10110),
            new TestResult(235),
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
