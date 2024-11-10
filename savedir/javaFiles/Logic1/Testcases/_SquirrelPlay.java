package Logic1.Testcases;
import Logic1.SquirrelPlay;

public final class _SquirrelPlay
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int temp, boolean isSummer) {
            try { result = SquirrelPlay.squirrelPlay(temp, isSummer); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "squirrelPlay(70, false)",
        "squirrelPlay(95, false)",
        "squirrelPlay(95, true)",
        "squirrelPlay(90, false)",
        "squirrelPlay(90, true)",
        "squirrelPlay(50, false)",
        "squirrelPlay(50, true)",
        "squirrelPlay(100, false)",
        "squirrelPlay(100, true)",
        "squirrelPlay(105, true)",
        "squirrelPlay(59, false)",
        "squirrelPlay(59, true)",
        "squirrelPlay(60, false)",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        true,
        true,
        true,
        false,
        false,
        false,
        true,
        false,
        false,
        false,
        true,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(70, false),
            new TestResult(95, false),
            new TestResult(95, true),
            new TestResult(90, false),
            new TestResult(90, true),
            new TestResult(50, false),
            new TestResult(50, true),
            new TestResult(100, false),
            new TestResult(100, true),
            new TestResult(105, true),
            new TestResult(59, false),
            new TestResult(59, true),
            new TestResult(60, false),
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
