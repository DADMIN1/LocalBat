package Warmup2.Testcases;
import Warmup2.FrontTimes;

public final class _FrontTimes
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String str, int n) {
            try { result = FrontTimes.frontTimes(str, n); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "frontTimes(\"Chocolate\", 2)",
        "frontTimes(\"Chocolate\", 3)",
        "frontTimes(\"Abc\", 3)",
        "frontTimes(\"Ab\", 4)",
        "frontTimes(\"A\", 4)",
        "frontTimes(\"\", 4)",
        "frontTimes(\"Abc\", 0)",
    };

    static final String[] expectedResults = {
        "ChoCho",
        "ChoChoCho",
        "AbcAbcAbc",
        "AbAbAbAb",
        "AAAA",
        "",
        "",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("Chocolate", 2),
            new TestResult("Chocolate", 3),
            new TestResult("Abc", 3),
            new TestResult("Ab", 4),
            new TestResult("A", 4),
            new TestResult("", 4),
            new TestResult("Abc", 0),
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
