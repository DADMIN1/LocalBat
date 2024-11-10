package Recursion1.Testcases;
import Recursion1.StrCopies;

public final class _StrCopies
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(String str, String sub, int n) {
            try { result = StrCopies.strCopies(str, sub, n); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "strCopies(\"catcowcat\", \"cat\", 2)",
        "strCopies(\"catcowcat\", \"cow\", 2)",
        "strCopies(\"catcowcat\", \"cow\", 1)",
        "strCopies(\"iiijjj\", \"i\", 3)",
        "strCopies(\"iiijjj\", \"i\", 4)",
        "strCopies(\"iiijjj\", \"ii\", 2)",
        "strCopies(\"iiijjj\", \"ii\", 3)",
        "strCopies(\"iiijjj\", \"x\", 3)",
        "strCopies(\"iiijjj\", \"x\", 0)",
        "strCopies(\"iiiiij\", \"iii\", 3)",
        "strCopies(\"iiiiij\", \"iii\", 4)",
        "strCopies(\"ijiiiiij\", \"iiii\", 2)",
        "strCopies(\"ijiiiiij\", \"iiii\", 3)",
        "strCopies(\"dogcatdogcat\", \"dog\", 2)",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        true,
        true,
        false,
        true,
        false,
        false,
        true,
        true,
        false,
        true,
        false,
        true,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("catcowcat", "cat", 2),
            new TestResult("catcowcat", "cow", 2),
            new TestResult("catcowcat", "cow", 1),
            new TestResult("iiijjj", "i", 3),
            new TestResult("iiijjj", "i", 4),
            new TestResult("iiijjj", "ii", 2),
            new TestResult("iiijjj", "ii", 3),
            new TestResult("iiijjj", "x", 3),
            new TestResult("iiijjj", "x", 0),
            new TestResult("iiiiij", "iii", 3),
            new TestResult("iiiiij", "iii", 4),
            new TestResult("ijiiiiij", "iiii", 2),
            new TestResult("ijiiiiij", "iiii", 3),
            new TestResult("dogcatdogcat", "dog", 2),
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
