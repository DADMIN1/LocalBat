package Logic1.Testcases;
import Logic1.TeenSum;

public final class _TeenSum
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int a, int b) {
            try { result = TeenSum.teenSum(a, b); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "teenSum(3, 4)",
        "teenSum(10, 13)",
        "teenSum(13, 2)",
        "teenSum(3, 19)",
        "teenSum(13, 13)",
        "teenSum(10, 10)",
        "teenSum(6, 14)",
        "teenSum(15, 2)",
        "teenSum(19, 19)",
        "teenSum(19, 20)",
        "teenSum(2, 18)",
        "teenSum(12, 4)",
        "teenSum(2, 20)",
        "teenSum(2, 17)",
        "teenSum(2, 16)",
        "teenSum(6, 7)",
    };

    static final int[] expectedResults = {
        7,
        19,
        19,
        19,
        19,
        20,
        19,
        19,
        19,
        19,
        19,
        16,
        22,
        19,
        19,
        13,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(3, 4),
            new TestResult(10, 13),
            new TestResult(13, 2),
            new TestResult(3, 19),
            new TestResult(13, 13),
            new TestResult(10, 10),
            new TestResult(6, 14),
            new TestResult(15, 2),
            new TestResult(19, 19),
            new TestResult(19, 20),
            new TestResult(2, 18),
            new TestResult(12, 4),
            new TestResult(2, 20),
            new TestResult(2, 17),
            new TestResult(2, 16),
            new TestResult(6, 7),
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
