package String2.Testcases;
import String2.PrefixAgain;

public final class _PrefixAgain
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(String str, int n) {
            try { result = PrefixAgain.prefixAgain(str, n); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "prefixAgain(\"abXYabc\", 1)",
        "prefixAgain(\"abXYabc\", 2)",
        "prefixAgain(\"abXYabc\", 3)",
        "prefixAgain(\"xyzxyxyxy\", 2)",
        "prefixAgain(\"xyzxyxyxy\", 3)",
        "prefixAgain(\"Hi12345Hi6789Hi10\", 1)",
        "prefixAgain(\"Hi12345Hi6789Hi10\", 2)",
        "prefixAgain(\"Hi12345Hi6789Hi10\", 3)",
        "prefixAgain(\"Hi12345Hi6789Hi10\", 4)",
        "prefixAgain(\"a\", 1)",
        "prefixAgain(\"aa\", 1)",
        "prefixAgain(\"ab\", 1)",
    };

    static final boolean[] expectedResults = {
        true,
        true,
        false,
        true,
        false,
        true,
        true,
        true,
        false,
        false,
        true,
        false,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("abXYabc", 1),
            new TestResult("abXYabc", 2),
            new TestResult("abXYabc", 3),
            new TestResult("xyzxyxyxy", 2),
            new TestResult("xyzxyxyxy", 3),
            new TestResult("Hi12345Hi6789Hi10", 1),
            new TestResult("Hi12345Hi6789Hi10", 2),
            new TestResult("Hi12345Hi6789Hi10", 3),
            new TestResult("Hi12345Hi6789Hi10", 4),
            new TestResult("a", 1),
            new TestResult("aa", 1),
            new TestResult("ab", 1),
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
