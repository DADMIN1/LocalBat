package String3.Testcases;
import String3.SumDigits;

public final class _SumDigits
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = SumDigits.sumDigits(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "sumDigits(\"aa1bc2d3\")",
        "sumDigits(\"aa11b33\")",
        "sumDigits(\"Chocolate\")",
        "sumDigits(\"5hoco1a1e\")",
        "sumDigits(\"123abc123\")",
        "sumDigits(\"\")",
        "sumDigits(\"Hello\")",
        "sumDigits(\"X1z9b2\")",
        "sumDigits(\"5432a\")",
    };

    static final int[] expectedResults = {
        6,
        8,
        0,
        7,
        12,
        0,
        0,
        12,
        14,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("aa1bc2d3"),
            new TestResult("aa11b33"),
            new TestResult("Chocolate"),
            new TestResult("5hoco1a1e"),
            new TestResult("123abc123"),
            new TestResult(""),
            new TestResult("Hello"),
            new TestResult("X1z9b2"),
            new TestResult("5432a"),
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
