package Logic1.Testcases;
import Logic1.Love6;

public final class _Love6
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int a, int b) {
            try { result = Love6.love6(a, b); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "love6(6, 4)",
        "love6(4, 5)",
        "love6(1, 5)",
        "love6(1, 6)",
        "love6(1, 8)",
        "love6(1, 7)",
        "love6(7, 5)",
        "love6(8, 2)",
        "love6(6, 6)",
        "love6(-6, 2)",
        "love6(-4, -10)",
        "love6(-7, 1)",
        "love6(7, -1)",
        "love6(-6, 12)",
        "love6(-2, -4)",
        "love6(7, 1)",
        "love6(0, 9)",
        "love6(8, 3)",
        "love6(3, 3)",
        "love6(3, 4)",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        true,
        true,
        false,
        true,
        false,
        true,
        true,
        false,
        true,
        false,
        true,
        true,
        false,
        true,
        false,
        false,
        true,
        false,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(6, 4),
            new TestResult(4, 5),
            new TestResult(1, 5),
            new TestResult(1, 6),
            new TestResult(1, 8),
            new TestResult(1, 7),
            new TestResult(7, 5),
            new TestResult(8, 2),
            new TestResult(6, 6),
            new TestResult(-6, 2),
            new TestResult(-4, -10),
            new TestResult(-7, 1),
            new TestResult(7, -1),
            new TestResult(-6, 12),
            new TestResult(-2, -4),
            new TestResult(7, 1),
            new TestResult(0, 9),
            new TestResult(8, 3),
            new TestResult(3, 3),
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
