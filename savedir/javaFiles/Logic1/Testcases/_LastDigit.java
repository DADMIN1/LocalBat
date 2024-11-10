package Logic1.Testcases;
import Logic1.LastDigit;

public final class _LastDigit
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int a, int b, int c) {
            try { result = LastDigit.lastDigit(a, b, c); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "lastDigit(23, 19, 13)",
        "lastDigit(23, 19, 12)",
        "lastDigit(23, 19, 3)",
        "lastDigit(23, 19, 39)",
        "lastDigit(1, 2, 3)",
        "lastDigit(1, 1, 2)",
        "lastDigit(1, 2, 2)",
        "lastDigit(14, 25, 43)",
        "lastDigit(14, 25, 45)",
        "lastDigit(248, 106, 1002)",
        "lastDigit(248, 106, 1008)",
        "lastDigit(10, 11, 20)",
        "lastDigit(0, 11, 0)",
    };

    static final boolean[] expectedResults = {
        true,
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
        true,
        true,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(23, 19, 13),
            new TestResult(23, 19, 12),
            new TestResult(23, 19, 3),
            new TestResult(23, 19, 39),
            new TestResult(1, 2, 3),
            new TestResult(1, 1, 2),
            new TestResult(1, 2, 2),
            new TestResult(14, 25, 43),
            new TestResult(14, 25, 45),
            new TestResult(248, 106, 1002),
            new TestResult(248, 106, 1008),
            new TestResult(10, 11, 20),
            new TestResult(0, 11, 0),
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
