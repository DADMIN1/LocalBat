package Logic1.Testcases;
import Logic1.WithoutDoubles;

public final class _WithoutDoubles
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(int die1, int die2, boolean noDoubles) {
            try { result = WithoutDoubles.withoutDoubles(die1, die2, noDoubles); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "withoutDoubles(2, 3, true)",
        "withoutDoubles(3, 3, true)",
        "withoutDoubles(3, 3, false)",
        "withoutDoubles(2, 3, false)",
        "withoutDoubles(5, 4, true)",
        "withoutDoubles(5, 4, false)",
        "withoutDoubles(5, 5, true)",
        "withoutDoubles(5, 5, false)",
        "withoutDoubles(6, 6, true)",
        "withoutDoubles(6, 6, false)",
        "withoutDoubles(1, 6, true)",
        "withoutDoubles(6, 1, false)",
    };

    static final int[] expectedResults = {
        5,
        7,
        6,
        5,
        9,
        9,
        11,
        10,
        7,
        12,
        7,
        7,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(2, 3, true),
            new TestResult(3, 3, true),
            new TestResult(3, 3, false),
            new TestResult(2, 3, false),
            new TestResult(5, 4, true),
            new TestResult(5, 4, false),
            new TestResult(5, 5, true),
            new TestResult(5, 5, false),
            new TestResult(6, 6, true),
            new TestResult(6, 6, false),
            new TestResult(1, 6, true),
            new TestResult(6, 1, false),
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
