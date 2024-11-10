package Warmup1.Testcases;
import Warmup1.PosNeg;

public final class _PosNeg
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int a, int b, boolean negative) {
            try { result = PosNeg.posNeg(a, b, negative); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "posNeg(1, -1, false)",
        "posNeg(-1, 1, false)",
        "posNeg(-4, -5, true)",
        "posNeg(-4, -5, false)",
        "posNeg(-4, 5, false)",
        "posNeg(-4, 5, true)",
        "posNeg(1, 1, false)",
        "posNeg(-1, -1, false)",
        "posNeg(1, -1, true)",
        "posNeg(-1, 1, true)",
        "posNeg(1, 1, true)",
        "posNeg(-1, -1, true)",
        "posNeg(5, -5, false)",
        "posNeg(-6, 6, false)",
        "posNeg(-5, -6, false)",
        "posNeg(-2, -1, false)",
        "posNeg(1, 2, false)",
        "posNeg(-5, 6, true)",
        "posNeg(-5, -5, true)",
    };

    static final boolean[] expectedResults = {
        true,
        true,
        true,
        false,
        true,
        false,
        false,
        false,
        false,
        false,
        false,
        true,
        true,
        true,
        false,
        false,
        false,
        false,
        true,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(1, -1, false),
            new TestResult(-1, 1, false),
            new TestResult(-4, -5, true),
            new TestResult(-4, -5, false),
            new TestResult(-4, 5, false),
            new TestResult(-4, 5, true),
            new TestResult(1, 1, false),
            new TestResult(-1, -1, false),
            new TestResult(1, -1, true),
            new TestResult(-1, 1, true),
            new TestResult(1, 1, true),
            new TestResult(-1, -1, true),
            new TestResult(5, -5, false),
            new TestResult(-6, 6, false),
            new TestResult(-5, -6, false),
            new TestResult(-2, -1, false),
            new TestResult(1, 2, false),
            new TestResult(-5, 6, true),
            new TestResult(-5, -5, true),
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
