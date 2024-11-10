package Logic2.Testcases;
import Logic2.LuckySum;

public final class _LuckySum
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int a, int b, int c) {
            try { result = LuckySum.luckySum(a, b, c); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "luckySum(1, 2, 3)",
        "luckySum(1, 2, 13)",
        "luckySum(1, 13, 3)",
        "luckySum(1, 13, 13)",
        "luckySum(6, 5, 2)",
        "luckySum(13, 2, 3)",
        "luckySum(13, 2, 13)",
        "luckySum(13, 13, 2)",
        "luckySum(9, 4, 13)",
        "luckySum(8, 13, 2)",
        "luckySum(7, 2, 1)",
        "luckySum(3, 3, 13)",
    };

    static final int[] expectedResults = {
        6,
        3,
        1,
        1,
        13,
        0,
        0,
        0,
        13,
        8,
        10,
        6,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(1, 2, 3),
            new TestResult(1, 2, 13),
            new TestResult(1, 13, 3),
            new TestResult(1, 13, 13),
            new TestResult(6, 5, 2),
            new TestResult(13, 2, 3),
            new TestResult(13, 2, 13),
            new TestResult(13, 13, 2),
            new TestResult(9, 4, 13),
            new TestResult(8, 13, 2),
            new TestResult(7, 2, 1),
            new TestResult(3, 3, 13),
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
