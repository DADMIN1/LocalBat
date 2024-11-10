package String3.Testcases;
import String3.NotReplace;

public final class _NotReplace
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = NotReplace.notReplace(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "notReplace(\"is test\")",
        "notReplace(\"is-is\")",
        "notReplace(\"This is right\")",
        "notReplace(\"This is isabell\")",
        "notReplace(\"\")",
        "notReplace(\"is\")",
        "notReplace(\"isis\")",
        "notReplace(\"Dis is bliss is\")",
        "notReplace(\"is his\")",
        "notReplace(\"xis yis\")",
        "notReplace(\"AAAis is\")",
    };

    static final String[] expectedResults = {
        "is not test",
        "is not-is not",
        "This is not right",
        "This is not isabell",
        "",
        "is not",
        "isis",
        "Dis is not bliss is not",
        "is not his",
        "xis yis",
        "AAAis is not",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("is test"),
            new TestResult("is-is"),
            new TestResult("This is right"),
            new TestResult("This is isabell"),
            new TestResult(""),
            new TestResult("is"),
            new TestResult("isis"),
            new TestResult("Dis is bliss is"),
            new TestResult("is his"),
            new TestResult("xis yis"),
            new TestResult("AAAis is"),
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
