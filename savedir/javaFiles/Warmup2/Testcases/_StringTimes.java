package Warmup2.Testcases;
import Warmup2.StringTimes;

public final class _StringTimes
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String str, int n) {
            try { result = StringTimes.stringTimes(str, n); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "stringTimes(\"Hi\", 2)",
        "stringTimes(\"Hi\", 3)",
        "stringTimes(\"Hi\", 1)",
        "stringTimes(\"Hi\", 0)",
        "stringTimes(\"Hi\", 5)",
        "stringTimes(\"Oh Boy!\", 2)",
        "stringTimes(\"x\", 4)",
        "stringTimes(\"\", 4)",
        "stringTimes(\"code\", 2)",
        "stringTimes(\"code\", 3)",
    };

    static final String[] expectedResults = {
        "HiHi",
        "HiHiHi",
        "Hi",
        "",
        "HiHiHiHiHi",
        "Oh Boy!Oh Boy!",
        "xxxx",
        "",
        "codecode",
        "codecodecode",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("Hi", 2),
            new TestResult("Hi", 3),
            new TestResult("Hi", 1),
            new TestResult("Hi", 0),
            new TestResult("Hi", 5),
            new TestResult("Oh Boy!", 2),
            new TestResult("x", 4),
            new TestResult("", 4),
            new TestResult("code", 2),
            new TestResult("code", 3),
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
