package Recursion1.Testcases;
import Recursion1.CountHi;

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
        "countHi(\"xxhixx\")",
        "countHi(\"xhixhix\")",
        "countHi(\"hi\")",
        "countHi(\"hihih\")",
        "countHi(\"h\")",
        "countHi(\"\")",
        "countHi(\"ihihihihih\")",
        "countHi(\"ihihihihihi\")",
        "countHi(\"hiAAhi12hi\")",
        "countHi(\"xhixhxihihhhih\")",
        "countHi(\"ship\")",
    };

    static final int[] expectedResults = {
        1,
        2,
        1,
        2,
        0,
        0,
        4,
        5,
        3,
        3,
        1,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("xxhixx"),
            new TestResult("xhixhix"),
            new TestResult("hi"),
            new TestResult("hihih"),
            new TestResult("h"),
            new TestResult(""),
            new TestResult("ihihihihih"),
            new TestResult("ihihihihihi"),
            new TestResult("hiAAhi12hi"),
            new TestResult("xhixhxihihhhih"),
            new TestResult("ship"),
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
