package Warmup1.Testcases;
import Warmup1.Max1020;

public final class _Max1020
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int a, int b) {
            try { result = Max1020.max1020(a, b); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "max1020(11, 19)",
        "max1020(19, 11)",
        "max1020(11, 9)",
        "max1020(9, 21)",
        "max1020(10, 21)",
        "max1020(21, 10)",
        "max1020(9, 11)",
        "max1020(23, 10)",
        "max1020(20, 10)",
        "max1020(7, 20)",
        "max1020(17, 16)",
    };

    static final int[] expectedResults = {
        19,
        19,
        11,
        0,
        10,
        10,
        11,
        10,
        20,
        20,
        17,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(11, 19),
            new TestResult(19, 11),
            new TestResult(11, 9),
            new TestResult(9, 21),
            new TestResult(10, 21),
            new TestResult(21, 10),
            new TestResult(9, 11),
            new TestResult(23, 10),
            new TestResult(20, 10),
            new TestResult(7, 20),
            new TestResult(17, 16),
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
