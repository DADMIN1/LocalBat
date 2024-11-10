package Recursion1.Testcases;
import Recursion1.CountAbc;

public final class _CountAbc
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = CountAbc.countAbc(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "countAbc(\"abc\")",
        "countAbc(\"abcxxabc\")",
        "countAbc(\"abaxxaba\")",
        "countAbc(\"ababc\")",
        "countAbc(\"abxbc\")",
        "countAbc(\"aaabc\")",
        "countAbc(\"hello\")",
        "countAbc(\"\")",
        "countAbc(\"ab\")",
        "countAbc(\"aba\")",
        "countAbc(\"aca\")",
        "countAbc(\"aaa\")",
    };

    static final int[] expectedResults = {
        1,
        2,
        2,
        2,
        0,
        1,
        0,
        0,
        0,
        1,
        0,
        0,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("abc"),
            new TestResult("abcxxabc"),
            new TestResult("abaxxaba"),
            new TestResult("ababc"),
            new TestResult("abxbc"),
            new TestResult("aaabc"),
            new TestResult("hello"),
            new TestResult(""),
            new TestResult("ab"),
            new TestResult("aba"),
            new TestResult("aca"),
            new TestResult("aaa"),
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
