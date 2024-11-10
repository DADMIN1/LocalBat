package Logic2.Testcases;
import Logic2.NoTeenSum;

public final class _NoTeenSum
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int a, int b, int c) {
            try { result = NoTeenSum.noTeenSum(a, b, c); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "noTeenSum(1, 2, 3)",
        "noTeenSum(2, 13, 1)",
        "noTeenSum(2, 1, 14)",
        "noTeenSum(2, 1, 15)",
        "noTeenSum(2, 1, 16)",
        "noTeenSum(2, 1, 17)",
        "noTeenSum(17, 1, 2)",
        "noTeenSum(2, 15, 2)",
        "noTeenSum(16, 17, 18)",
        "noTeenSum(17, 18, 19)",
        "noTeenSum(15, 16, 1)",
        "noTeenSum(15, 15, 19)",
        "noTeenSum(15, 19, 16)",
        "noTeenSum(5, 17, 18)",
        "noTeenSum(17, 18, 16)",
        "noTeenSum(17, 19, 18)",
    };

    static final int[] expectedResults = {
        6,
        3,
        3,
        18,
        19,
        3,
        3,
        19,
        16,
        0,
        32,
        30,
        31,
        5,
        16,
        0,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(1, 2, 3),
            new TestResult(2, 13, 1),
            new TestResult(2, 1, 14),
            new TestResult(2, 1, 15),
            new TestResult(2, 1, 16),
            new TestResult(2, 1, 17),
            new TestResult(17, 1, 2),
            new TestResult(2, 15, 2),
            new TestResult(16, 17, 18),
            new TestResult(17, 18, 19),
            new TestResult(15, 16, 1),
            new TestResult(15, 15, 19),
            new TestResult(15, 19, 16),
            new TestResult(5, 17, 18),
            new TestResult(17, 18, 16),
            new TestResult(17, 19, 18),
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
