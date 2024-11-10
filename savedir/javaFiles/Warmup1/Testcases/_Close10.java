package Warmup1.Testcases;
import Warmup1.Close10;

public final class _Close10
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int a, int b) {
            try { result = Close10.close10(a, b); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "close10(8, 13)",
        "close10(13, 8)",
        "close10(13, 7)",
        "close10(7, 13)",
        "close10(9, 13)",
        "close10(13, 8)",
        "close10(10, 12)",
        "close10(11, 10)",
        "close10(5, 21)",
        "close10(0, 20)",
        "close10(10, 10)",
    };

    static final int[] expectedResults = {
        8,
        8,
        0,
        0,
        9,
        8,
        10,
        10,
        5,
        0,
        0,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(8, 13),
            new TestResult(13, 8),
            new TestResult(13, 7),
            new TestResult(7, 13),
            new TestResult(9, 13),
            new TestResult(13, 8),
            new TestResult(10, 12),
            new TestResult(11, 10),
            new TestResult(5, 21),
            new TestResult(0, 20),
            new TestResult(10, 10),
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
