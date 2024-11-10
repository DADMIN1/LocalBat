package String2.Testcases;
import String2.CountHi;

public final class _CountHi
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = CountHi.countHi(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "countHi(\"abc hi ho\")",
        "countHi(\"ABChi hi\")",
        "countHi(\"hihi\")",
        "countHi(\"hiHIhi\")",
        "countHi(\"\")",
        "countHi(\"h\")",
        "countHi(\"hi\")",
        "countHi(\"Hi is no HI on ahI\")",
        "countHi(\"hiho not HOHIhi\")",
    };

    static final int[] expectedResults = {
        1,
        2,
        2,
        2,
        0,
        0,
        1,
        0,
        2,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("abc hi ho"),
            new TestResult("ABChi hi"),
            new TestResult("hihi"),
            new TestResult("hiHIhi"),
            new TestResult(""),
            new TestResult("h"),
            new TestResult("hi"),
            new TestResult("Hi is no HI on ahI"),
            new TestResult("hiho not HOHIhi"),
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
