package String3.Testcases;
import String3.CountTriple;

public final class _CountTriple
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = CountTriple.countTriple(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "countTriple(\"abcXXXabc\")",
        "countTriple(\"xxxabyyyycd\")",
        "countTriple(\"a\")",
        "countTriple(\"\")",
        "countTriple(\"XXXabc\")",
        "countTriple(\"XXXXabc\")",
        "countTriple(\"XXXXXabc\")",
        "countTriple(\"222abyyycdXXX\")",
        "countTriple(\"abYYYabXXXXXab\")",
        "countTriple(\"abYYXabXXYXXab\")",
        "countTriple(\"abYYXabXXYXXab\")",
        "countTriple(\"122abhhh2\")",
    };

    static final int[] expectedResults = {
        1,
        3,
        0,
        0,
        1,
        2,
        3,
        3,
        4,
        0,
        0,
        1,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("abcXXXabc"),
            new TestResult("xxxabyyyycd"),
            new TestResult("a"),
            new TestResult(""),
            new TestResult("XXXabc"),
            new TestResult("XXXXabc"),
            new TestResult("XXXXXabc"),
            new TestResult("222abyyycdXXX"),
            new TestResult("abYYYabXXXXXab"),
            new TestResult("abYYXabXXYXXab"),
            new TestResult("abYYXabXXYXXab"),
            new TestResult("122abhhh2"),
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
