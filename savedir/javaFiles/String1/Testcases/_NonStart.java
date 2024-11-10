package String1.Testcases;
import String1.NonStart;

public final class _NonStart
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String a, String b) {
            try { result = NonStart.nonStart(a, b); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "nonStart(\"Hello\", \"There\")",
        "nonStart(\"java\", \"code\")",
        "nonStart(\"shotl\", \"java\")",
        "nonStart(\"ab\", \"xy\")",
        "nonStart(\"ab\", \"x\")",
        "nonStart(\"x\", \"ac\")",
        "nonStart(\"a\", \"x\")",
        "nonStart(\"kit\", \"kat\")",
        "nonStart(\"mart\", \"dart\")",
    };

    static final String[] expectedResults = {
        "ellohere",
        "avaode",
        "hotlava",
        "by",
        "b",
        "c",
        "",
        "itat",
        "artart",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("Hello", "There"),
            new TestResult("java", "code"),
            new TestResult("shotl", "java"),
            new TestResult("ab", "xy"),
            new TestResult("ab", "x"),
            new TestResult("x", "ac"),
            new TestResult("a", "x"),
            new TestResult("kit", "kat"),
            new TestResult("mart", "dart"),
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
