package Logic2.Testcases;
import Logic2.EvenlySpaced;

public final class _EvenlySpaced
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int a, int b, int c) {
            try { result = EvenlySpaced.evenlySpaced(a, b, c); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "evenlySpaced(2, 4, 6)",
        "evenlySpaced(4, 6, 2)",
        "evenlySpaced(4, 6, 3)",
        "evenlySpaced(6, 2, 4)",
        "evenlySpaced(6, 2, 8)",
        "evenlySpaced(2, 2, 2)",
        "evenlySpaced(2, 2, 3)",
        "evenlySpaced(9, 10, 11)",
        "evenlySpaced(10, 9, 11)",
        "evenlySpaced(10, 9, 9)",
        "evenlySpaced(2, 4, 4)",
        "evenlySpaced(2, 2, 4)",
        "evenlySpaced(3, 6, 12)",
        "evenlySpaced(12, 3, 6)",
    };

    static final boolean[] expectedResults = {
        true,
        true,
        false,
        true,
        false,
        true,
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
            new TestResult(2, 4, 6),
            new TestResult(4, 6, 2),
            new TestResult(4, 6, 3),
            new TestResult(6, 2, 4),
            new TestResult(6, 2, 8),
            new TestResult(2, 2, 2),
            new TestResult(2, 2, 3),
            new TestResult(9, 10, 11),
            new TestResult(10, 9, 11),
            new TestResult(10, 9, 9),
            new TestResult(2, 4, 4),
            new TestResult(2, 2, 4),
            new TestResult(3, 6, 12),
            new TestResult(12, 3, 6),
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
