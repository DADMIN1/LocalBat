package Recursion1.Testcases;
import Recursion1.Count7;

public final class _Count7
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int n) {
            try { result = Count7.count7(n); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "count7(717)",
        "count7(7)",
        "count7(123)",
        "count7(77)",
        "count7(7123)",
        "count7(771237)",
        "count7(771737)",
        "count7(47571)",
        "count7(777777)",
        "count7(70701277)",
        "count7(777576197)",
        "count7(99999)",
        "count7(99799)",
    };

    static final int[] expectedResults = {
        2,
        1,
        0,
        2,
        1,
        3,
        4,
        2,
        6,
        4,
        5,
        0,
        1,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(717),
            new TestResult(7),
            new TestResult(123),
            new TestResult(77),
            new TestResult(7123),
            new TestResult(771237),
            new TestResult(771737),
            new TestResult(47571),
            new TestResult(777777),
            new TestResult(70701277),
            new TestResult(777576197),
            new TestResult(99999),
            new TestResult(99799),
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
