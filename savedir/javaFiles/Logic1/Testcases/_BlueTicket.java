package Logic1.Testcases;
import Logic1.BlueTicket;

public final class _BlueTicket
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int a, int b, int c) {
            try { result = BlueTicket.blueTicket(a, b, c); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "blueTicket(9, 1, 0)",
        "blueTicket(9, 2, 0)",
        "blueTicket(6, 1, 4)",
        "blueTicket(6, 1, 5)",
        "blueTicket(10, 0, 0)",
        "blueTicket(15, 0, 5)",
        "blueTicket(5, 15, 5)",
        "blueTicket(4, 11, 1)",
        "blueTicket(13, 2, 3)",
        "blueTicket(8, 4, 3)",
        "blueTicket(8, 4, 2)",
        "blueTicket(8, 4, 1)",
    };

    static final int[] expectedResults = {
        10,
        0,
        10,
        0,
        10,
        5,
        10,
        5,
        5,
        0,
        10,
        0,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(9, 1, 0),
            new TestResult(9, 2, 0),
            new TestResult(6, 1, 4),
            new TestResult(6, 1, 5),
            new TestResult(10, 0, 0),
            new TestResult(15, 0, 5),
            new TestResult(5, 15, 5),
            new TestResult(4, 11, 1),
            new TestResult(13, 2, 3),
            new TestResult(8, 4, 3),
            new TestResult(8, 4, 2),
            new TestResult(8, 4, 1),
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
