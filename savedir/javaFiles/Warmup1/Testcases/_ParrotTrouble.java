package Warmup1.Testcases;
import Warmup1.ParrotTrouble;

public final class _ParrotTrouble
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(boolean talking, int hour) {
            try { result = ParrotTrouble.parrotTrouble(talking, hour); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "parrotTrouble(true, 6)",
        "parrotTrouble(true, 7)",
        "parrotTrouble(false, 6)",
        "parrotTrouble(true, 21)",
        "parrotTrouble(false, 21)",
        "parrotTrouble(false, 20)",
        "parrotTrouble(true, 23)",
        "parrotTrouble(false, 23)",
        "parrotTrouble(true, 20)",
        "parrotTrouble(false, 12)",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        false,
        true,
        false,
        false,
        true,
        false,
        false,
        false,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(true, 6),
            new TestResult(true, 7),
            new TestResult(false, 6),
            new TestResult(true, 21),
            new TestResult(false, 21),
            new TestResult(false, 20),
            new TestResult(true, 23),
            new TestResult(false, 23),
            new TestResult(true, 20),
            new TestResult(false, 12),
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
