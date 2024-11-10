package Logic2.Testcases;
import Logic2.CloseFar;

public final class _CloseFar
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int a, int b, int c) {
            try { result = CloseFar.closeFar(a, b, c); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "closeFar(1, 2, 10)",
        "closeFar(1, 2, 3)",
        "closeFar(4, 1, 3)",
        "closeFar(4, 5, 3)",
        "closeFar(4, 3, 5)",
        "closeFar(-1, 10, 0)",
        "closeFar(0, -1, 10)",
        "closeFar(10, 10, 8)",
        "closeFar(10, 8, 9)",
        "closeFar(8, 9, 10)",
        "closeFar(8, 9, 7)",
        "closeFar(8, 6, 9)",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        true,
        false,
        false,
        true,
        true,
        true,
        false,
        false,
        false,
        true,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(1, 2, 10),
            new TestResult(1, 2, 3),
            new TestResult(4, 1, 3),
            new TestResult(4, 5, 3),
            new TestResult(4, 3, 5),
            new TestResult(-1, 10, 0),
            new TestResult(0, -1, 10),
            new TestResult(10, 10, 8),
            new TestResult(10, 8, 9),
            new TestResult(8, 9, 10),
            new TestResult(8, 9, 7),
            new TestResult(8, 6, 9),
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
