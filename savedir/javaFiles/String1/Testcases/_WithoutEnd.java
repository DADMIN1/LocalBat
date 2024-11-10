package String1.Testcases;
import String1.WithoutEnd;

public final class _WithoutEnd
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = WithoutEnd.withoutEnd(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "withoutEnd(\"Hello\")",
        "withoutEnd(\"java\")",
        "withoutEnd(\"coding\")",
        "withoutEnd(\"code\")",
        "withoutEnd(\"ab\")",
        "withoutEnd(\"Chocolate!\")",
        "withoutEnd(\"kitten\")",
        "withoutEnd(\"woohoo\")",
    };

    static final String[] expectedResults = {
        "ell",
        "av",
        "odin",
        "od",
        "",
        "hocolate",
        "itte",
        "ooho",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("Hello"),
            new TestResult("java"),
            new TestResult("coding"),
            new TestResult("code"),
            new TestResult("ab"),
            new TestResult("Chocolate!"),
            new TestResult("kitten"),
            new TestResult("woohoo"),
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
