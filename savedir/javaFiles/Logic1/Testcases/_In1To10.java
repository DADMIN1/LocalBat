package Logic1.Testcases;
import Logic1.In1To10;

public final class _In1To10
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int n, boolean outsideMode) {
            try { result = In1To10.in1To10(n, outsideMode); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "in1To10(5, false)",
        "in1To10(11, false)",
        "in1To10(11, true)",
        "in1To10(10, false)",
        "in1To10(10, true)",
        "in1To10(9, false)",
        "in1To10(9, true)",
        "in1To10(1, false)",
        "in1To10(1, true)",
        "in1To10(0, false)",
        "in1To10(0, true)",
        "in1To10(-1, false)",
        "in1To10(-1, true)",
        "in1To10(99, false)",
        "in1To10(-99, true)",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        true,
        true,
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
        true,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(5, false),
            new TestResult(11, false),
            new TestResult(11, true),
            new TestResult(10, false),
            new TestResult(10, true),
            new TestResult(9, false),
            new TestResult(9, true),
            new TestResult(1, false),
            new TestResult(1, true),
            new TestResult(0, false),
            new TestResult(0, true),
            new TestResult(-1, false),
            new TestResult(-1, true),
            new TestResult(99, false),
            new TestResult(-99, true),
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
