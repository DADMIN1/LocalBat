package Logic1.Testcases;
import Logic1.InOrder;

public final class _InOrder
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int a, int b, int c, boolean bOk) {
            try { result = InOrder.inOrder(a, b, c, bOk); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "inOrder(1, 2, 4, false)",
        "inOrder(1, 2, 1, false)",
        "inOrder(1, 1, 2, true)",
        "inOrder(3, 2, 4, false)",
        "inOrder(2, 3, 4, false)",
        "inOrder(3, 2, 4, true)",
        "inOrder(4, 2, 2, true)",
        "inOrder(4, 5, 2, true)",
        "inOrder(2, 4, 6, true)",
        "inOrder(7, 9, 10, false)",
        "inOrder(7, 5, 6, true)",
        "inOrder(7, 5, 4, true)",
    };

    static final boolean[] expectedResults = {
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
        true,
        false,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(1, 2, 4, false),
            new TestResult(1, 2, 1, false),
            new TestResult(1, 1, 2, true),
            new TestResult(3, 2, 4, false),
            new TestResult(2, 3, 4, false),
            new TestResult(3, 2, 4, true),
            new TestResult(4, 2, 2, true),
            new TestResult(4, 5, 2, true),
            new TestResult(2, 4, 6, true),
            new TestResult(7, 9, 10, false),
            new TestResult(7, 5, 6, true),
            new TestResult(7, 5, 4, true),
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
