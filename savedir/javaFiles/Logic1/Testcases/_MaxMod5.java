package Logic1.Testcases;
import Logic1.MaxMod5;

public final class _MaxMod5
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int a, int b) {
            try { result = MaxMod5.maxMod5(a, b); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "maxMod5(2, 3)",
        "maxMod5(6, 2)",
        "maxMod5(3, 2)",
        "maxMod5(8, 12)",
        "maxMod5(7, 12)",
        "maxMod5(11, 6)",
        "maxMod5(2, 7)",
        "maxMod5(7, 7)",
        "maxMod5(9, 1)",
        "maxMod5(9, 14)",
        "maxMod5(1, 2)",
    };

    static final int[] expectedResults = {
        3,
        6,
        3,
        12,
        7,
        6,
        2,
        0,
        9,
        9,
        2,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(2, 3),
            new TestResult(6, 2),
            new TestResult(3, 2),
            new TestResult(8, 12),
            new TestResult(7, 12),
            new TestResult(11, 6),
            new TestResult(2, 7),
            new TestResult(7, 7),
            new TestResult(9, 1),
            new TestResult(9, 14),
            new TestResult(1, 2),
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
