package String1.Testcases;
import String1.NTwice;

public final class _NTwice
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String str, int n) {
            try { result = NTwice.nTwice(str, n); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "nTwice(\"Hello\", 2)",
        "nTwice(\"Chocolate\", 3)",
        "nTwice(\"Chocolate\", 1)",
        "nTwice(\"Chocolate\", 0)",
        "nTwice(\"Hello\", 4)",
        "nTwice(\"Code\", 4)",
        "nTwice(\"Code\", 2)",
    };

    static final String[] expectedResults = {
        "Helo",
        "Choate",
        "Ce",
        "",
        "Hellello",
        "CodeCode",
        "Code",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("Hello", 2),
            new TestResult("Chocolate", 3),
            new TestResult("Chocolate", 1),
            new TestResult("Chocolate", 0),
            new TestResult("Hello", 4),
            new TestResult("Code", 4),
            new TestResult("Code", 2),
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
