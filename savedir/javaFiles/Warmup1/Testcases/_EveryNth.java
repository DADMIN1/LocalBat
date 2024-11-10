package Warmup1.Testcases;
import Warmup1.EveryNth;

public final class _EveryNth
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String str, int n) {
            try { result = EveryNth.everyNth(str, n); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "everyNth(\"Miracle\", 2)",
        "everyNth(\"abcdefg\", 2)",
        "everyNth(\"abcdefg\", 3)",
        "everyNth(\"Chocolate\", 3)",
        "everyNth(\"Chocolates\", 3)",
        "everyNth(\"Chocolates\", 4)",
        "everyNth(\"Chocolates\", 100)",
    };

    static final String[] expectedResults = {
        "Mrce",
        "aceg",
        "adg",
        "Cca",
        "Ccas",
        "Coe",
        "C",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("Miracle", 2),
            new TestResult("abcdefg", 2),
            new TestResult("abcdefg", 3),
            new TestResult("Chocolate", 3),
            new TestResult("Chocolates", 3),
            new TestResult("Chocolates", 4),
            new TestResult("Chocolates", 100),
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
