package Warmup1.Testcases;
import Warmup1.SumDouble;

public final class _SumDouble
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int a, int b) {
            try { result = SumDouble.sumDouble(a, b); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "sumDouble(1, 2)",
        "sumDouble(3, 2)",
        "sumDouble(2, 2)",
        "sumDouble(-1, 0)",
        "sumDouble(3, 3)",
        "sumDouble(0, 0)",
        "sumDouble(0, 1)",
        "sumDouble(3, 4)",
    };

    static final int[] expectedResults = {
        3,
        5,
        8,
        -1,
        12,
        0,
        1,
        7,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(1, 2),
            new TestResult(3, 2),
            new TestResult(2, 2),
            new TestResult(-1, 0),
            new TestResult(3, 3),
            new TestResult(0, 0),
            new TestResult(0, 1),
            new TestResult(3, 4),
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
