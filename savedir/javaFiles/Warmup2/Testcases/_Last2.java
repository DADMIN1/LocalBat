package Warmup2.Testcases;
import Warmup2.Last2;

public final class _Last2
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = Last2.last2(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "last2(\"hixxhi\")",
        "last2(\"xaxxaxaxx\")",
        "last2(\"axxxaaxx\")",
        "last2(\"xxaxxaxxaxx\")",
        "last2(\"xaxaxaxx\")",
        "last2(\"xxxx\")",
        "last2(\"13121312\")",
        "last2(\"11212\")",
        "last2(\"13121311\")",
        "last2(\"1717171\")",
        "last2(\"hi\")",
        "last2(\"h\")",
        "last2(\"\")",
    };

    static final int[] expectedResults = {
        1,
        1,
        2,
        3,
        0,
        2,
        1,
        1,
        0,
        2,
        0,
        0,
        0,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("hixxhi"),
            new TestResult("xaxxaxaxx"),
            new TestResult("axxxaaxx"),
            new TestResult("xxaxxaxxaxx"),
            new TestResult("xaxaxaxx"),
            new TestResult("xxxx"),
            new TestResult("13121312"),
            new TestResult("11212"),
            new TestResult("13121311"),
            new TestResult("1717171"),
            new TestResult("hi"),
            new TestResult("h"),
            new TestResult(""),
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
