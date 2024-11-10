package Logic1.Testcases;
import Logic1.SumLimit;

public final class _SumLimit
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int a, int b) {
            try { result = SumLimit.sumLimit(a, b); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "sumLimit(2, 3)",
        "sumLimit(8, 3)",
        "sumLimit(8, 1)",
        "sumLimit(11, 39)",
        "sumLimit(11, 99)",
        "sumLimit(0, 0)",
        "sumLimit(99, 0)",
        "sumLimit(99, 1)",
        "sumLimit(123, 1)",
        "sumLimit(1, 123)",
        "sumLimit(23, 60)",
        "sumLimit(23, 80)",
        "sumLimit(9000, 1)",
        "sumLimit(90000000, 1)",
        "sumLimit(9000, 1000)",
    };

    static final int[] expectedResults = {
        5,
        8,
        9,
        50,
        11,
        0,
        99,
        99,
        124,
        1,
        83,
        23,
        9001,
        90000001,
        9000,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(2, 3),
            new TestResult(8, 3),
            new TestResult(8, 1),
            new TestResult(11, 39),
            new TestResult(11, 99),
            new TestResult(0, 0),
            new TestResult(99, 0),
            new TestResult(99, 1),
            new TestResult(123, 1),
            new TestResult(1, 123),
            new TestResult(23, 60),
            new TestResult(23, 80),
            new TestResult(9000, 1),
            new TestResult(90000000, 1),
            new TestResult(9000, 1000),
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
