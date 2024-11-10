package Warmup1.Testcases;
import Warmup1.MissingChar;

public final class _MissingChar
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String str, int n) {
            try { result = MissingChar.missingChar(str, n); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "missingChar(\"kitten\", 1)",
        "missingChar(\"kitten\", 0)",
        "missingChar(\"kitten\", 4)",
        "missingChar(\"Hi\", 0)",
        "missingChar(\"Hi\", 1)",
        "missingChar(\"code\", 0)",
        "missingChar(\"code\", 1)",
        "missingChar(\"code\", 2)",
        "missingChar(\"code\", 3)",
        "missingChar(\"chocolate\", 8)",
    };

    static final String[] expectedResults = {
        "ktten",
        "itten",
        "kittn",
        "i",
        "H",
        "ode",
        "cde",
        "coe",
        "cod",
        "chocolat",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("kitten", 1),
            new TestResult("kitten", 0),
            new TestResult("kitten", 4),
            new TestResult("Hi", 0),
            new TestResult("Hi", 1),
            new TestResult("code", 0),
            new TestResult("code", 1),
            new TestResult("code", 2),
            new TestResult("code", 3),
            new TestResult("chocolate", 8),
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
