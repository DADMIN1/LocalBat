package String1.Testcases;
import String1.Without2;

public final class _Without2
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = Without2.without2(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "without2(\"HelloHe\")",
        "without2(\"HelloHi\")",
        "without2(\"Hi\")",
        "without2(\"Chocolate\")",
        "without2(\"xxx\")",
        "without2(\"xx\")",
        "without2(\"x\")",
        "without2(\"\")",
        "without2(\"Fruits\")",
    };

    static final String[] expectedResults = {
        "lloHe",
        "HelloHi",
        "",
        "Chocolate",
        "x",
        "",
        "x",
        "",
        "Fruits",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("HelloHe"),
            new TestResult("HelloHi"),
            new TestResult("Hi"),
            new TestResult("Chocolate"),
            new TestResult("xxx"),
            new TestResult("xx"),
            new TestResult("x"),
            new TestResult(""),
            new TestResult("Fruits"),
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
