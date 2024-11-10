package String3.Testcases;
import String3.EqualIsNot;

public final class _EqualIsNot
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = EqualIsNot.equalIsNot(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "equalIsNot(\"This is not\")",
        "equalIsNot(\"This is notnot\")",
        "equalIsNot(\"noisxxnotyynotxisi\")",
        "equalIsNot(\"noisxxnotyynotxsi\")",
        "equalIsNot(\"xxxyyyzzzintint\")",
        "equalIsNot(\"\")",
        "equalIsNot(\"isisnotnot\")",
        "equalIsNot(\"isisnotno7Not\")",
        "equalIsNot(\"isnotis\")",
        "equalIsNot(\"mis3notpotbotis\")",
    };

    static final boolean[] expectedResults = {
        false,
        true,
        true,
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
            new TestResult("This is not"),
            new TestResult("This is notnot"),
            new TestResult("noisxxnotyynotxisi"),
            new TestResult("noisxxnotyynotxsi"),
            new TestResult("xxxyyyzzzintint"),
            new TestResult(""),
            new TestResult("isisnotnot"),
            new TestResult("isisnotno7Not"),
            new TestResult("isnotis"),
            new TestResult("mis3notpotbotis"),
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
