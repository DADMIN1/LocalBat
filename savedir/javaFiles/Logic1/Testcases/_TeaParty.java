package Logic1.Testcases;
import Logic1.TeaParty;

public final class _TeaParty
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int tea, int candy) {
            try { result = TeaParty.teaParty(tea, candy); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "teaParty(6, 8)",
        "teaParty(3, 8)",
        "teaParty(20, 6)",
        "teaParty(12, 6)",
        "teaParty(11, 6)",
        "teaParty(11, 4)",
        "teaParty(4, 5)",
        "teaParty(5, 5)",
        "teaParty(6, 6)",
        "teaParty(5, 10)",
        "teaParty(5, 9)",
        "teaParty(10, 4)",
        "teaParty(10, 20)",
    };

    static final int[] expectedResults = {
        1,
        0,
        2,
        2,
        1,
        0,
        0,
        1,
        1,
        2,
        1,
        0,
        2,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(6, 8),
            new TestResult(3, 8),
            new TestResult(20, 6),
            new TestResult(12, 6),
            new TestResult(11, 6),
            new TestResult(11, 4),
            new TestResult(4, 5),
            new TestResult(5, 5),
            new TestResult(6, 6),
            new TestResult(5, 10),
            new TestResult(5, 9),
            new TestResult(10, 4),
            new TestResult(10, 20),
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
