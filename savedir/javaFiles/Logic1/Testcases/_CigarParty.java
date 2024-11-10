package Logic1.Testcases;
import Logic1.CigarParty;

public final class _CigarParty
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int cigars, boolean isWeekend) {
            try { result = CigarParty.cigarParty(cigars, isWeekend); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "cigarParty(30, false)",
        "cigarParty(50, false)",
        "cigarParty(70, true)",
        "cigarParty(30, true)",
        "cigarParty(50, true)",
        "cigarParty(60, false)",
        "cigarParty(61, false)",
        "cigarParty(40, false)",
        "cigarParty(39, false)",
        "cigarParty(40, true)",
        "cigarParty(39, true)",
    };

    static final boolean[] expectedResults = {
        false,
        true,
        true,
        false,
        true,
        true,
        false,
        true,
        false,
        true,
        false,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(30, false),
            new TestResult(50, false),
            new TestResult(70, true),
            new TestResult(30, true),
            new TestResult(50, true),
            new TestResult(60, false),
            new TestResult(61, false),
            new TestResult(40, false),
            new TestResult(39, false),
            new TestResult(40, true),
            new TestResult(39, true),
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
