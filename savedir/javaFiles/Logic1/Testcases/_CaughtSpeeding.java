package Logic1.Testcases;
import Logic1.CaughtSpeeding;

public final class _CaughtSpeeding
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int speed, boolean isBirthday) {
            try { result = CaughtSpeeding.caughtSpeeding(speed, isBirthday); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "caughtSpeeding(60, false)",
        "caughtSpeeding(65, false)",
        "caughtSpeeding(65, true)",
        "caughtSpeeding(80, false)",
        "caughtSpeeding(85, false)",
        "caughtSpeeding(85, true)",
        "caughtSpeeding(70, false)",
        "caughtSpeeding(75, false)",
        "caughtSpeeding(75, true)",
        "caughtSpeeding(40, false)",
        "caughtSpeeding(40, true)",
        "caughtSpeeding(90, false)",
    };

    static final int[] expectedResults = {
        0,
        1,
        0,
        1,
        2,
        1,
        1,
        1,
        1,
        0,
        0,
        2,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(60, false),
            new TestResult(65, false),
            new TestResult(65, true),
            new TestResult(80, false),
            new TestResult(85, false),
            new TestResult(85, true),
            new TestResult(70, false),
            new TestResult(75, false),
            new TestResult(75, true),
            new TestResult(40, false),
            new TestResult(40, true),
            new TestResult(90, false),
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
