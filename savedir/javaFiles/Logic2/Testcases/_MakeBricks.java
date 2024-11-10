package Logic2.Testcases;
import Logic2.MakeBricks;

public final class _MakeBricks
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int small, int big, int goal) {
            try { result = MakeBricks.makeBricks(small, big, goal); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "makeBricks(3, 1, 8)",
        "makeBricks(3, 1, 9)",
        "makeBricks(3, 2, 10)",
        "makeBricks(3, 2, 8)",
        "makeBricks(3, 2, 9)",
        "makeBricks(6, 1, 11)",
        "makeBricks(6, 0, 11)",
        "makeBricks(1, 4, 11)",
        "makeBricks(0, 3, 10)",
        "makeBricks(1, 4, 12)",
        "makeBricks(3, 1, 7)",
        "makeBricks(1, 1, 7)",
        "makeBricks(2, 1, 7)",
        "makeBricks(7, 1, 11)",
        "makeBricks(7, 1, 8)",
        "makeBricks(7, 1, 13)",
        "makeBricks(43, 1, 46)",
        "makeBricks(40, 1, 46)",
        "makeBricks(40, 2, 47)",
        "makeBricks(40, 2, 50)",
        "makeBricks(40, 2, 52)",
        "makeBricks(22, 2, 33)",
        "makeBricks(0, 2, 10)",
        "makeBricks(1000000, 1000, 1000100)",
        "makeBricks(2, 1000000, 100003)",
        "makeBricks(20, 0, 19)",
        "makeBricks(20, 0, 21)",
        "makeBricks(20, 4, 51)",
        "makeBricks(20, 4, 39)",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        true,
        true,
        false,
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
        false,
        true,
        false,
        true,
        true,
        false,
        false,
        true,
        true,
        false,
        true,
        false,
        false,
        true,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(3, 1, 8),
            new TestResult(3, 1, 9),
            new TestResult(3, 2, 10),
            new TestResult(3, 2, 8),
            new TestResult(3, 2, 9),
            new TestResult(6, 1, 11),
            new TestResult(6, 0, 11),
            new TestResult(1, 4, 11),
            new TestResult(0, 3, 10),
            new TestResult(1, 4, 12),
            new TestResult(3, 1, 7),
            new TestResult(1, 1, 7),
            new TestResult(2, 1, 7),
            new TestResult(7, 1, 11),
            new TestResult(7, 1, 8),
            new TestResult(7, 1, 13),
            new TestResult(43, 1, 46),
            new TestResult(40, 1, 46),
            new TestResult(40, 2, 47),
            new TestResult(40, 2, 50),
            new TestResult(40, 2, 52),
            new TestResult(22, 2, 33),
            new TestResult(0, 2, 10),
            new TestResult(1000000, 1000, 1000100),
            new TestResult(2, 1000000, 100003),
            new TestResult(20, 0, 19),
            new TestResult(20, 0, 21),
            new TestResult(20, 4, 51),
            new TestResult(20, 4, 39),
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
