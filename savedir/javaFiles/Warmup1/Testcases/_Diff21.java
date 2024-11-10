package Warmup1.Testcases;
import Warmup1.Diff21;

public final class _Diff21
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int n) {
            try { result = Diff21.diff21(n); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "diff21(19)",
        "diff21(10)",
        "diff21(21)",
        "diff21(22)",
        "diff21(25)",
        "diff21(30)",
        "diff21(0)",
        "diff21(1)",
        "diff21(2)",
        "diff21(-1)",
        "diff21(-2)",
        "diff21(50)",
    };

    static final int[] expectedResults = {
        2,
        11,
        0,
        2,
        8,
        18,
        21,
        20,
        19,
        22,
        23,
        58,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(19),
            new TestResult(10),
            new TestResult(21),
            new TestResult(22),
            new TestResult(25),
            new TestResult(30),
            new TestResult(0),
            new TestResult(1),
            new TestResult(2),
            new TestResult(-1),
            new TestResult(-2),
            new TestResult(50),
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
