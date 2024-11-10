package Logic2.Testcases;
import Logic2.LoneSum;

public final class _LoneSum
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int a, int b, int c) {
            try { result = LoneSum.loneSum(a, b, c); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "loneSum(1, 2, 3)",
        "loneSum(3, 2, 3)",
        "loneSum(3, 3, 3)",
        "loneSum(9, 2, 2)",
        "loneSum(2, 2, 9)",
        "loneSum(2, 9, 2)",
        "loneSum(2, 9, 3)",
        "loneSum(4, 2, 3)",
        "loneSum(1, 3, 1)",
    };

    static final int[] expectedResults = {
        6,
        2,
        0,
        9,
        9,
        9,
        14,
        9,
        3,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(1, 2, 3),
            new TestResult(3, 2, 3),
            new TestResult(3, 3, 3),
            new TestResult(9, 2, 2),
            new TestResult(2, 2, 9),
            new TestResult(2, 9, 2),
            new TestResult(2, 9, 3),
            new TestResult(4, 2, 3),
            new TestResult(1, 3, 1),
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
