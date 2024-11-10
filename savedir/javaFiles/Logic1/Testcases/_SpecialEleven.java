package Logic1.Testcases;
import Logic1.SpecialEleven;

public final class _SpecialEleven
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int n) {
            try { result = SpecialEleven.specialEleven(n); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "specialEleven(22)",
        "specialEleven(23)",
        "specialEleven(24)",
        "specialEleven(21)",
        "specialEleven(11)",
        "specialEleven(12)",
        "specialEleven(10)",
        "specialEleven(9)",
        "specialEleven(8)",
        "specialEleven(0)",
        "specialEleven(1)",
        "specialEleven(2)",
        "specialEleven(121)",
        "specialEleven(122)",
        "specialEleven(123)",
        "specialEleven(46)",
        "specialEleven(49)",
        "specialEleven(52)",
        "specialEleven(54)",
        "specialEleven(55)",
    };

    static final boolean[] expectedResults = {
        true,
        true,
        false,
        false,
        true,
        true,
        false,
        false,
        false,
        true,
        true,
        false,
        true,
        true,
        false,
        false,
        false,
        false,
        false,
        true,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(22),
            new TestResult(23),
            new TestResult(24),
            new TestResult(21),
            new TestResult(11),
            new TestResult(12),
            new TestResult(10),
            new TestResult(9),
            new TestResult(8),
            new TestResult(0),
            new TestResult(1),
            new TestResult(2),
            new TestResult(121),
            new TestResult(122),
            new TestResult(123),
            new TestResult(46),
            new TestResult(49),
            new TestResult(52),
            new TestResult(54),
            new TestResult(55),
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
