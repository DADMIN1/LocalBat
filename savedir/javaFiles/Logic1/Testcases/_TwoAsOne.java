package Logic1.Testcases;
import Logic1.TwoAsOne;

public final class _TwoAsOne
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int a, int b, int c) {
            try { result = TwoAsOne.twoAsOne(a, b, c); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "twoAsOne(1, 2, 3)",
        "twoAsOne(3, 1, 2)",
        "twoAsOne(3, 2, 2)",
        "twoAsOne(2, 3, 1)",
        "twoAsOne(5, 3, -2)",
        "twoAsOne(5, 3, -3)",
        "twoAsOne(2, 5, 3)",
        "twoAsOne(9, 5, 5)",
        "twoAsOne(9, 4, 5)",
        "twoAsOne(5, 4, 9)",
        "twoAsOne(3, 3, 0)",
        "twoAsOne(3, 3, 2)",
    };

    static final boolean[] expectedResults = {
        true,
        true,
        false,
        true,
        true,
        false,
        true,
        false,
        true,
        true,
        true,
        false,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(1, 2, 3),
            new TestResult(3, 1, 2),
            new TestResult(3, 2, 2),
            new TestResult(2, 3, 1),
            new TestResult(5, 3, -2),
            new TestResult(5, 3, -3),
            new TestResult(2, 5, 3),
            new TestResult(9, 5, 5),
            new TestResult(9, 4, 5),
            new TestResult(5, 4, 9),
            new TestResult(3, 3, 0),
            new TestResult(3, 3, 2),
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
