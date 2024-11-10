package Logic1.Testcases;
import Logic1.InOrderEqual;

public final class _InOrderEqual
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int a, int b, int c, boolean equalOk) {
            try { result = InOrderEqual.inOrderEqual(a, b, c, equalOk); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "inOrderEqual(2, 5, 11, false)",
        "inOrderEqual(5, 7, 6, false)",
        "inOrderEqual(5, 5, 7, true)",
        "inOrderEqual(5, 5, 7, false)",
        "inOrderEqual(2, 5, 4, false)",
        "inOrderEqual(3, 4, 3, false)",
        "inOrderEqual(3, 4, 4, false)",
        "inOrderEqual(3, 4, 3, true)",
        "inOrderEqual(3, 4, 4, true)",
        "inOrderEqual(1, 5, 5, true)",
        "inOrderEqual(5, 5, 5, true)",
        "inOrderEqual(2, 2, 1, true)",
        "inOrderEqual(9, 2, 2, true)",
        "inOrderEqual(0, 1, 0, true)",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        true,
        false,
        false,
        false,
        false,
        false,
        true,
        true,
        true,
        false,
        false,
        false,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(2, 5, 11, false),
            new TestResult(5, 7, 6, false),
            new TestResult(5, 5, 7, true),
            new TestResult(5, 5, 7, false),
            new TestResult(2, 5, 4, false),
            new TestResult(3, 4, 3, false),
            new TestResult(3, 4, 4, false),
            new TestResult(3, 4, 3, true),
            new TestResult(3, 4, 4, true),
            new TestResult(1, 5, 5, true),
            new TestResult(5, 5, 5, true),
            new TestResult(2, 2, 1, true),
            new TestResult(9, 2, 2, true),
            new TestResult(0, 1, 0, true),
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
