package Logic2.Testcases;
import Logic2.MakeChocolate;

public final class _MakeChocolate
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int small, int big, int goal) {
            try { result = MakeChocolate.makeChocolate(small, big, goal); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "makeChocolate(4, 1, 9)",
        "makeChocolate(4, 1, 10)",
        "makeChocolate(4, 1, 7)",
        "makeChocolate(6, 2, 7)",
        "makeChocolate(4, 1, 5)",
        "makeChocolate(4, 1, 4)",
        "makeChocolate(5, 4, 9)",
        "makeChocolate(9, 3, 18)",
        "makeChocolate(3, 1, 9)",
        "makeChocolate(1, 2, 7)",
        "makeChocolate(1, 2, 6)",
        "makeChocolate(1, 2, 5)",
        "makeChocolate(6, 1, 10)",
        "makeChocolate(6, 1, 11)",
        "makeChocolate(6, 1, 12)",
        "makeChocolate(6, 1, 13)",
        "makeChocolate(6, 2, 10)",
        "makeChocolate(6, 2, 11)",
        "makeChocolate(6, 2, 12)",
        "makeChocolate(60, 100, 550)",
        "makeChocolate(1000, 1000000, 5000006)",
        "makeChocolate(7, 1, 12)",
        "makeChocolate(7, 1, 13)",
        "makeChocolate(7, 2, 13)",
    };

    static final int[] expectedResults = {
        4,
        -1,
        2,
        2,
        0,
        4,
        4,
        3,
        -1,
        -1,
        1,
        0,
        5,
        6,
        -1,
        -1,
        0,
        1,
        2,
        50,
        6,
        7,
        -1,
        3,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(4, 1, 9),
            new TestResult(4, 1, 10),
            new TestResult(4, 1, 7),
            new TestResult(6, 2, 7),
            new TestResult(4, 1, 5),
            new TestResult(4, 1, 4),
            new TestResult(5, 4, 9),
            new TestResult(9, 3, 18),
            new TestResult(3, 1, 9),
            new TestResult(1, 2, 7),
            new TestResult(1, 2, 6),
            new TestResult(1, 2, 5),
            new TestResult(6, 1, 10),
            new TestResult(6, 1, 11),
            new TestResult(6, 1, 12),
            new TestResult(6, 1, 13),
            new TestResult(6, 2, 10),
            new TestResult(6, 2, 11),
            new TestResult(6, 2, 12),
            new TestResult(60, 100, 550),
            new TestResult(1000, 1000000, 5000006),
            new TestResult(7, 1, 12),
            new TestResult(7, 1, 13),
            new TestResult(7, 2, 13),
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
