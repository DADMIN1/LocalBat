package Logic1.Testcases;
import Logic1.SortaSum;

public final class _SortaSum
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int a, int b) {
            try { result = SortaSum.sortaSum(a, b); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "sortaSum(3, 4)",
        "sortaSum(9, 4)",
        "sortaSum(10, 11)",
        "sortaSum(12, -3)",
        "sortaSum(-3, 12)",
        "sortaSum(4, 5)",
        "sortaSum(4, 6)",
        "sortaSum(14, 7)",
        "sortaSum(14, 6)",
    };

    static final int[] expectedResults = {
        7,
        20,
        21,
        9,
        9,
        9,
        20,
        21,
        20,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(3, 4),
            new TestResult(9, 4),
            new TestResult(10, 11),
            new TestResult(12, -3),
            new TestResult(-3, 12),
            new TestResult(4, 5),
            new TestResult(4, 6),
            new TestResult(14, 7),
            new TestResult(14, 6),
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
