package String1.Testcases;
import String1.MinCat;

public final class _MinCat
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String a, String b) {
            try { result = MinCat.minCat(a, b); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "minCat(\"Hello\", \"Hi\")",
        "minCat(\"Hello\", \"java\")",
        "minCat(\"java\", \"Hello\")",
        "minCat(\"abc\", \"x\")",
        "minCat(\"x\", \"abc\")",
        "minCat(\"abc\", \"\")",
    };

    static final String[] expectedResults = {
        "loHi",
        "ellojava",
        "javaello",
        "cx",
        "xc",
        "",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("Hello", "Hi"),
            new TestResult("Hello", "java"),
            new TestResult("java", "Hello"),
            new TestResult("abc", "x"),
            new TestResult("x", "abc"),
            new TestResult("abc", ""),
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
