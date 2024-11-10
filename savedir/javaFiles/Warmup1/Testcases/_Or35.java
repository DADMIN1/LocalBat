package Warmup1.Testcases;
import Warmup1.Or35;

public final class _Or35
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int n) {
            try { result = Or35.or35(n); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "or35(3)",
        "or35(10)",
        "or35(8)",
        "or35(15)",
        "or35(5)",
        "or35(9)",
        "or35(4)",
        "or35(7)",
        "or35(6)",
        "or35(17)",
        "or35(18)",
        "or35(29)",
        "or35(20)",
        "or35(21)",
        "or35(22)",
        "or35(45)",
        "or35(99)",
        "or35(100)",
        "or35(101)",
        "or35(121)",
        "or35(122)",
        "or35(123)",
    };

    static final boolean[] expectedResults = {
        true,
        true,
        false,
        true,
        true,
        true,
        false,
        false,
        true,
        false,
        true,
        false,
        true,
        true,
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
            new TestResult(3),
            new TestResult(10),
            new TestResult(8),
            new TestResult(15),
            new TestResult(5),
            new TestResult(9),
            new TestResult(4),
            new TestResult(7),
            new TestResult(6),
            new TestResult(17),
            new TestResult(18),
            new TestResult(29),
            new TestResult(20),
            new TestResult(21),
            new TestResult(22),
            new TestResult(45),
            new TestResult(99),
            new TestResult(100),
            new TestResult(101),
            new TestResult(121),
            new TestResult(122),
            new TestResult(123),
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
