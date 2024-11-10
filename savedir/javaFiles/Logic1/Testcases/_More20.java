package Logic1.Testcases;
import Logic1.More20;

public final class _More20
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(int n) {
            try { result = More20.more20(n); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "more20(20)",
        "more20(21)",
        "more20(22)",
        "more20(23)",
        "more20(25)",
        "more20(30)",
        "more20(31)",
        "more20(59)",
        "more20(60)",
        "more20(61)",
        "more20(62)",
        "more20(1020)",
        "more20(1021)",
        "more20(1000)",
        "more20(1001)",
        "more20(50)",
        "more20(55)",
        "more20(40)",
        "more20(41)",
        "more20(39)",
        "more20(42)",
    };

    static final boolean[] expectedResults = {
        false,
        true,
        true,
        false,
        false,
        false,
        false,
        false,
        false,
        true,
        true,
        false,
        true,
        false,
        true,
        false,
        false,
        false,
        true,
        false,
        true,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(20),
            new TestResult(21),
            new TestResult(22),
            new TestResult(23),
            new TestResult(25),
            new TestResult(30),
            new TestResult(31),
            new TestResult(59),
            new TestResult(60),
            new TestResult(61),
            new TestResult(62),
            new TestResult(1020),
            new TestResult(1021),
            new TestResult(1000),
            new TestResult(1001),
            new TestResult(50),
            new TestResult(55),
            new TestResult(40),
            new TestResult(41),
            new TestResult(39),
            new TestResult(42),
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
