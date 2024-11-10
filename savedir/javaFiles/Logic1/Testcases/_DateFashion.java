package Logic1.Testcases;
import Logic1.DateFashion;

public final class _DateFashion
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int you, int date) {
            try { result = DateFashion.dateFashion(you, date); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "dateFashion(5, 10)",
        "dateFashion(5, 2)",
        "dateFashion(5, 5)",
        "dateFashion(3, 3)",
        "dateFashion(10, 2)",
        "dateFashion(2, 9)",
        "dateFashion(9, 9)",
        "dateFashion(10, 5)",
        "dateFashion(2, 2)",
        "dateFashion(3, 7)",
        "dateFashion(2, 7)",
        "dateFashion(6, 2)",
    };

    static final int[] expectedResults = {
        2,
        0,
        1,
        1,
        0,
        0,
        2,
        2,
        0,
        1,
        0,
        0,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(5, 10),
            new TestResult(5, 2),
            new TestResult(5, 5),
            new TestResult(3, 3),
            new TestResult(10, 2),
            new TestResult(2, 9),
            new TestResult(9, 9),
            new TestResult(10, 5),
            new TestResult(2, 2),
            new TestResult(3, 7),
            new TestResult(2, 7),
            new TestResult(6, 2),
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
