package Recursion1.Testcases;
import Recursion1.PowerN;

public final class _PowerN
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int base, int n) {
            try { result = PowerN.powerN(base, n); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "powerN(3, 1)",
        "powerN(3, 2)",
        "powerN(3, 3)",
        "powerN(2, 1)",
        "powerN(2, 2)",
        "powerN(2, 3)",
        "powerN(2, 4)",
        "powerN(2, 5)",
        "powerN(10, 1)",
        "powerN(10, 2)",
        "powerN(10, 3)",
    };

    static final int[] expectedResults = {
        3,
        9,
        27,
        2,
        4,
        8,
        16,
        32,
        10,
        100,
        1000,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(3, 1),
            new TestResult(3, 2),
            new TestResult(3, 3),
            new TestResult(2, 1),
            new TestResult(2, 2),
            new TestResult(2, 3),
            new TestResult(2, 4),
            new TestResult(2, 5),
            new TestResult(10, 1),
            new TestResult(10, 2),
            new TestResult(10, 3),
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
