package Warmup2.Testcases;
import Warmup2.CountXX;

public final class _CountXX
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = CountXX.countXX(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "countXX(\"abcxx\")",
        "countXX(\"xxx\")",
        "countXX(\"xxxx\")",
        "countXX(\"abc\")",
        "countXX(\"Hello there\")",
        "countXX(\"Hexxo thxxe\")",
        "countXX(\"\")",
        "countXX(\"Kittens\")",
        "countXX(\"Kittensxxx\")",
    };

    static final int[] expectedResults = {
        1,
        2,
        3,
        0,
        0,
        2,
        0,
        0,
        2,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("abcxx"),
            new TestResult("xxx"),
            new TestResult("xxxx"),
            new TestResult("abc"),
            new TestResult("Hello there"),
            new TestResult("Hexxo thxxe"),
            new TestResult(""),
            new TestResult("Kittens"),
            new TestResult("Kittensxxx"),
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
