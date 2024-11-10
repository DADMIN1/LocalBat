package Logic1.Testcases;
import Logic1.RedTicket;

public final class _RedTicket
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int a, int b, int c) {
            try { result = RedTicket.redTicket(a, b, c); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "redTicket(2, 2, 2)",
        "redTicket(2, 2, 1)",
        "redTicket(0, 0, 0)",
        "redTicket(2, 0, 0)",
        "redTicket(1, 1, 1)",
        "redTicket(1, 2, 1)",
        "redTicket(1, 2, 0)",
        "redTicket(0, 2, 2)",
        "redTicket(1, 2, 2)",
        "redTicket(0, 2, 0)",
        "redTicket(1, 1, 2)",
    };

    static final int[] expectedResults = {
        10,
        0,
        5,
        1,
        5,
        0,
        1,
        1,
        1,
        0,
        0,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(2, 2, 2),
            new TestResult(2, 2, 1),
            new TestResult(0, 0, 0),
            new TestResult(2, 0, 0),
            new TestResult(1, 1, 1),
            new TestResult(1, 2, 1),
            new TestResult(1, 2, 0),
            new TestResult(0, 2, 2),
            new TestResult(1, 2, 2),
            new TestResult(0, 2, 0),
            new TestResult(1, 1, 2),
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
