package Logic1.Testcases;
import Logic1.GreenTicket;

public final class _GreenTicket
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int a, int b, int c) {
            try { result = GreenTicket.greenTicket(a, b, c); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "greenTicket(1, 2, 3)",
        "greenTicket(2, 2, 2)",
        "greenTicket(1, 1, 2)",
        "greenTicket(2, 1, 1)",
        "greenTicket(1, 2, 1)",
        "greenTicket(3, 2, 1)",
        "greenTicket(0, 0, 0)",
        "greenTicket(2, 0, 0)",
        "greenTicket(0, 9, 10)",
        "greenTicket(0, 10, 0)",
        "greenTicket(9, 9, 9)",
        "greenTicket(9, 0, 9)",
    };

    static final int[] expectedResults = {
        0,
        20,
        10,
        10,
        10,
        0,
        20,
        10,
        0,
        10,
        20,
        10,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(1, 2, 3),
            new TestResult(2, 2, 2),
            new TestResult(1, 1, 2),
            new TestResult(2, 1, 1),
            new TestResult(1, 2, 1),
            new TestResult(3, 2, 1),
            new TestResult(0, 0, 0),
            new TestResult(2, 0, 0),
            new TestResult(0, 9, 10),
            new TestResult(0, 10, 0),
            new TestResult(9, 9, 9),
            new TestResult(9, 0, 9),
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
