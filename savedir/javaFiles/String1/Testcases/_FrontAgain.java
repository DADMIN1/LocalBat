package String1.Testcases;
import String1.FrontAgain;

public final class _FrontAgain
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = FrontAgain.frontAgain(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "frontAgain(\"edited\")",
        "frontAgain(\"edit\")",
        "frontAgain(\"ed\")",
        "frontAgain(\"jj\")",
        "frontAgain(\"jjj\")",
        "frontAgain(\"jjjj\")",
        "frontAgain(\"jjjk\")",
        "frontAgain(\"x\")",
        "frontAgain(\"\")",
        "frontAgain(\"java\")",
        "frontAgain(\"javaja\")",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        true,
        true,
        true,
        true,
        false,
        false,
        false,
        false,
        true,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("edited"),
            new TestResult("edit"),
            new TestResult("ed"),
            new TestResult("jj"),
            new TestResult("jjj"),
            new TestResult("jjjj"),
            new TestResult("jjjk"),
            new TestResult("x"),
            new TestResult(""),
            new TestResult("java"),
            new TestResult("javaja"),
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
