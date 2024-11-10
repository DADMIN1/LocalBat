package Recursion1.Testcases;
import Recursion1.CountHi2;

public final class _CountHi2
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = CountHi2.countHi2(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "countHi2(\"ahixhi\")",
        "countHi2(\"ahibhi\")",
        "countHi2(\"xhixhi\")",
        "countHi2(\"hixhi\")",
        "countHi2(\"hixhhi\")",
        "countHi2(\"hihihi\")",
        "countHi2(\"hihihix\")",
        "countHi2(\"xhihihix\")",
        "countHi2(\"xxhi\")",
        "countHi2(\"hixxhi\")",
        "countHi2(\"hi\")",
        "countHi2(\"xxxx\")",
        "countHi2(\"h\")",
        "countHi2(\"x\")",
        "countHi2(\"\")",
        "countHi2(\"Hellohi\")",
    };

    static final int[] expectedResults = {
        1,
        2,
        0,
        1,
        2,
        3,
        3,
        2,
        0,
        1,
        1,
        0,
        0,
        0,
        0,
        1,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("ahixhi"),
            new TestResult("ahibhi"),
            new TestResult("xhixhi"),
            new TestResult("hixhi"),
            new TestResult("hixhhi"),
            new TestResult("hihihi"),
            new TestResult("hihihix"),
            new TestResult("xhihihix"),
            new TestResult("xxhi"),
            new TestResult("hixxhi"),
            new TestResult("hi"),
            new TestResult("xxxx"),
            new TestResult("h"),
            new TestResult("x"),
            new TestResult(""),
            new TestResult("Hellohi"),
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
