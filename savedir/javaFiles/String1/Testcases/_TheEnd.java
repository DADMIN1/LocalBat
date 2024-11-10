package String1.Testcases;
import String1.TheEnd;

public final class _TheEnd
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String str, boolean front) {
            try { result = TheEnd.theEnd(str, front); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "theEnd(\"Hello\", true)",
        "theEnd(\"Hello\", false)",
        "theEnd(\"oh\", true)",
        "theEnd(\"oh\", false)",
        "theEnd(\"x\", true)",
        "theEnd(\"x\", false)",
        "theEnd(\"java\", true)",
        "theEnd(\"chocolate\", false)",
        "theEnd(\"1234\", true)",
        "theEnd(\"code\", false)",
    };

    static final String[] expectedResults = {
        "H",
        "o",
        "o",
        "h",
        "x",
        "x",
        "j",
        "e",
        "1",
        "e",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("Hello", true),
            new TestResult("Hello", false),
            new TestResult("oh", true),
            new TestResult("oh", false),
            new TestResult("x", true),
            new TestResult("x", false),
            new TestResult("java", true),
            new TestResult("chocolate", false),
            new TestResult("1234", true),
            new TestResult("code", false),
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
            if (!results[i].result.equals(expectedResults[i])) {
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
