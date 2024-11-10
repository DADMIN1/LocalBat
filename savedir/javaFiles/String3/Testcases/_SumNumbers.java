package String3.Testcases;
import String3.SumNumbers;

public final class _SumNumbers
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = SumNumbers.sumNumbers(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "sumNumbers(\"abc123xyz\")",
        "sumNumbers(\"aa11b33\")",
        "sumNumbers(\"7 11\")",
        "sumNumbers(\"Chocolate\")",
        "sumNumbers(\"5hoco1a1e\")",
        "sumNumbers(\"5$$1;;1!!\")",
        "sumNumbers(\"a1234bb11\")",
        "sumNumbers(\"\")",
        "sumNumbers(\"a22bbb3\")",
    };

    static final int[] expectedResults = {
        123,
        44,
        18,
        0,
        7,
        7,
        1245,
        0,
        25,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("abc123xyz"),
            new TestResult("aa11b33"),
            new TestResult("7 11"),
            new TestResult("Chocolate"),
            new TestResult("5hoco1a1e"),
            new TestResult("5$$1;;1!!"),
            new TestResult("a1234bb11"),
            new TestResult(""),
            new TestResult("a22bbb3"),
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
