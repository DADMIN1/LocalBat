package Warmup1.Testcases;
import Warmup1.HasTeen;

public final class _HasTeen
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int a, int b, int c) {
            try { result = HasTeen.hasTeen(a, b, c); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "hasTeen(13, 20, 10)",
        "hasTeen(20, 19, 10)",
        "hasTeen(20, 10, 13)",
        "hasTeen(1, 20, 12)",
        "hasTeen(19, 20, 12)",
        "hasTeen(12, 20, 19)",
        "hasTeen(12, 9, 20)",
        "hasTeen(12, 18, 20)",
        "hasTeen(14, 2, 20)",
        "hasTeen(4, 2, 20)",
        "hasTeen(11, 22, 22)",
    };

    static final boolean[] expectedResults = {
        true,
        true,
        true,
        false,
        true,
        true,
        false,
        true,
        true,
        false,
        false,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(13, 20, 10),
            new TestResult(20, 19, 10),
            new TestResult(20, 10, 13),
            new TestResult(1, 20, 12),
            new TestResult(19, 20, 12),
            new TestResult(12, 20, 19),
            new TestResult(12, 9, 20),
            new TestResult(12, 18, 20),
            new TestResult(14, 2, 20),
            new TestResult(4, 2, 20),
            new TestResult(11, 22, 22),
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
