package Warmup1.Testcases;
import Warmup1.IntMax;

public final class _IntMax
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int a, int b, int c) {
            try { result = IntMax.intMax(a, b, c); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "intMax(1, 2, 3)",
        "intMax(1, 3, 2)",
        "intMax(3, 2, 1)",
        "intMax(9, 3, 3)",
        "intMax(3, 9, 3)",
        "intMax(3, 3, 9)",
        "intMax(8, 2, 3)",
        "intMax(-3, -1, -2)",
        "intMax(6, 2, 5)",
        "intMax(5, 6, 2)",
        "intMax(5, 2, 6)",
    };

    static final int[] expectedResults = {
        3,
        3,
        3,
        9,
        9,
        9,
        8,
        -1,
        6,
        6,
        6,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(1, 2, 3),
            new TestResult(1, 3, 2),
            new TestResult(3, 2, 1),
            new TestResult(9, 3, 3),
            new TestResult(3, 9, 3),
            new TestResult(3, 3, 9),
            new TestResult(8, 2, 3),
            new TestResult(-3, -1, -2),
            new TestResult(6, 2, 5),
            new TestResult(5, 6, 2),
            new TestResult(5, 2, 6),
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
