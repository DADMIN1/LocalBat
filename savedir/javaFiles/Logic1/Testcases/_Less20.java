package Logic1.Testcases;
import Logic1.Less20;

public final class _Less20
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int n) {
            try { result = Less20.less20(n); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "less20(18)",
        "less20(19)",
        "less20(20)",
        "less20(8)",
        "less20(17)",
        "less20(23)",
        "less20(25)",
        "less20(30)",
        "less20(31)",
        "less20(58)",
        "less20(59)",
        "less20(60)",
        "less20(61)",
        "less20(62)",
        "less20(1017)",
        "less20(1018)",
        "less20(1019)",
        "less20(1020)",
        "less20(1021)",
        "less20(1022)",
        "less20(1023)",
        "less20(37)",
    };

    static final boolean[] expectedResults = {
        true,
        true,
        false,
        false,
        false,
        false,
        false,
        false,
        false,
        true,
        true,
        false,
        false,
        false,
        false,
        true,
        true,
        false,
        false,
        false,
        false,
        false,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(18),
            new TestResult(19),
            new TestResult(20),
            new TestResult(8),
            new TestResult(17),
            new TestResult(23),
            new TestResult(25),
            new TestResult(30),
            new TestResult(31),
            new TestResult(58),
            new TestResult(59),
            new TestResult(60),
            new TestResult(61),
            new TestResult(62),
            new TestResult(1017),
            new TestResult(1018),
            new TestResult(1019),
            new TestResult(1020),
            new TestResult(1021),
            new TestResult(1022),
            new TestResult(1023),
            new TestResult(37),
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
