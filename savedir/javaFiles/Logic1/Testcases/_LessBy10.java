package Logic1.Testcases;
import Logic1.LessBy10;

public final class _LessBy10
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int a, int b, int c) {
            try { result = LessBy10.lessBy10(a, b, c); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "lessBy10(1, 7, 11)",
        "lessBy10(1, 7, 10)",
        "lessBy10(11, 1, 7)",
        "lessBy10(10, 7, 1)",
        "lessBy10(-10, 2, 2)",
        "lessBy10(2, 11, 11)",
        "lessBy10(3, 3, 30)",
        "lessBy10(3, 3, 3)",
        "lessBy10(10, 1, 11)",
        "lessBy10(10, 11, 1)",
        "lessBy10(10, 11, 2)",
        "lessBy10(3, 30, 3)",
        "lessBy10(2, 2, -8)",
        "lessBy10(2, 8, 12)",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        true,
        false,
        true,
        false,
        true,
        false,
        true,
        true,
        false,
        true,
        true,
        true,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(1, 7, 11),
            new TestResult(1, 7, 10),
            new TestResult(11, 1, 7),
            new TestResult(10, 7, 1),
            new TestResult(-10, 2, 2),
            new TestResult(2, 11, 11),
            new TestResult(3, 3, 30),
            new TestResult(3, 3, 3),
            new TestResult(10, 1, 11),
            new TestResult(10, 11, 1),
            new TestResult(10, 11, 2),
            new TestResult(3, 30, 3),
            new TestResult(2, 2, -8),
            new TestResult(2, 8, 12),
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
