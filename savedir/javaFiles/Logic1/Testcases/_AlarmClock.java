package Logic1.Testcases;
import Logic1.AlarmClock;

public final class _AlarmClock
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(int day, boolean vacation) {
            try { result = AlarmClock.alarmClock(day, vacation); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "alarmClock(1, false)",
        "alarmClock(5, false)",
        "alarmClock(0, false)",
        "alarmClock(6, false)",
        "alarmClock(0, true)",
        "alarmClock(6, true)",
        "alarmClock(1, true)",
        "alarmClock(3, true)",
        "alarmClock(5, true)",
    };

    static final String[] expectedResults = {
        "7:00",
        "7:00",
        "10:00",
        "10:00",
        "off",
        "off",
        "10:00",
        "10:00",
        "10:00",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(1, false),
            new TestResult(5, false),
            new TestResult(0, false),
            new TestResult(6, false),
            new TestResult(0, true),
            new TestResult(6, true),
            new TestResult(1, true),
            new TestResult(3, true),
            new TestResult(5, true),
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
            if (!results[i].result.equals(expectedResults[i])) {
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
