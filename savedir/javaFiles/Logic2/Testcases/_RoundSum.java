package Logic2.Testcases;
import Logic2.RoundSum;

public final class _RoundSum
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int a, int b, int c) {
            try { result = RoundSum.roundSum(a, b, c); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "roundSum(16, 17, 18)",
        "roundSum(12, 13, 14)",
        "roundSum(6, 4, 4)",
        "roundSum(4, 6, 5)",
        "roundSum(4, 4, 6)",
        "roundSum(9, 4, 4)",
        "roundSum(0, 0, 1)",
        "roundSum(0, 9, 0)",
        "roundSum(10, 10, 19)",
        "roundSum(20, 30, 40)",
        "roundSum(45, 21, 30)",
        "roundSum(23, 11, 26)",
        "roundSum(23, 24, 25)",
        "roundSum(25, 24, 25)",
        "roundSum(23, 24, 29)",
        "roundSum(11, 24, 36)",
        "roundSum(24, 36, 32)",
        "roundSum(14, 12, 26)",
        "roundSum(12, 10, 24)",
    };

    static final int[] expectedResults = {
        60,
        30,
        10,
        20,
        10,
        10,
        0,
        10,
        40,
        90,
        100,
        60,
        70,
        80,
        70,
        70,
        90,
        50,
        40,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(16, 17, 18),
            new TestResult(12, 13, 14),
            new TestResult(6, 4, 4),
            new TestResult(4, 6, 5),
            new TestResult(4, 4, 6),
            new TestResult(9, 4, 4),
            new TestResult(0, 0, 1),
            new TestResult(0, 9, 0),
            new TestResult(10, 10, 19),
            new TestResult(20, 30, 40),
            new TestResult(45, 21, 30),
            new TestResult(23, 11, 26),
            new TestResult(23, 24, 25),
            new TestResult(25, 24, 25),
            new TestResult(23, 24, 29),
            new TestResult(11, 24, 36),
            new TestResult(24, 36, 32),
            new TestResult(14, 12, 26),
            new TestResult(12, 10, 24),
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
