package String2.Testcases;
import String2.RepeatEnd;

public final class _RepeatEnd
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String str, int n) {
            try { result = RepeatEnd.repeatEnd(str, n); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "repeatEnd(\"Hello\", 3)",
        "repeatEnd(\"Hello\", 2)",
        "repeatEnd(\"Hello\", 1)",
        "repeatEnd(\"Hello\", 0)",
        "repeatEnd(\"abc\", 3)",
        "repeatEnd(\"1234\", 2)",
        "repeatEnd(\"1234\", 3)",
        "repeatEnd(\"\", 0)",
    };

    static final String[] expectedResults = {
        "llollollo",
        "lolo",
        "o",
        "",
        "abcabcabc",
        "3434",
        "234234234",
        "",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("Hello", 3),
            new TestResult("Hello", 2),
            new TestResult("Hello", 1),
            new TestResult("Hello", 0),
            new TestResult("abc", 3),
            new TestResult("1234", 2),
            new TestResult("1234", 3),
            new TestResult("", 0),
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
