package Recursion1.Testcases;
import Recursion1.Count8;

public final class _Count8
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int n) {
            try { result = Count8.count8(n); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "count8(8)",
        "count8(818)",
        "count8(8818)",
        "count8(8088)",
        "count8(123)",
        "count8(81238)",
        "count8(88788)",
        "count8(8234)",
        "count8(2348)",
        "count8(23884)",
        "count8(0)",
        "count8(1818188)",
        "count8(8818181)",
        "count8(1080)",
        "count8(188)",
        "count8(88888)",
        "count8(9898)",
        "count8(78)",
    };

    static final int[] expectedResults = {
        1,
        2,
        4,
        4,
        0,
        2,
        6,
        1,
        1,
        3,
        0,
        5,
        5,
        1,
        3,
        9,
        2,
        1,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(8),
            new TestResult(818),
            new TestResult(8818),
            new TestResult(8088),
            new TestResult(123),
            new TestResult(81238),
            new TestResult(88788),
            new TestResult(8234),
            new TestResult(2348),
            new TestResult(23884),
            new TestResult(0),
            new TestResult(1818188),
            new TestResult(8818181),
            new TestResult(1080),
            new TestResult(188),
            new TestResult(88888),
            new TestResult(9898),
            new TestResult(78),
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
