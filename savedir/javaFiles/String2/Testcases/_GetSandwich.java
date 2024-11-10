package String2.Testcases;
import String2.GetSandwich;

public final class _GetSandwich
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = GetSandwich.getSandwich(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "getSandwich(\"breadjambread\")",
        "getSandwich(\"xxbreadjambreadyy\")",
        "getSandwich(\"xxbreadyy\")",
        "getSandwich(\"xxbreadbreadjambreadyy\")",
        "getSandwich(\"breadAbread\")",
        "getSandwich(\"breadbread\")",
        "getSandwich(\"abcbreaz\")",
        "getSandwich(\"xyz\")",
        "getSandwich(\"\")",
        "getSandwich(\"breadbreaxbread\")",
        "getSandwich(\"breaxbreadybread\")",
        "getSandwich(\"breadbreadbreadbread\")",
    };

    static final String[] expectedResults = {
        "jam",
        "jam",
        "",
        "breadjam",
        "A",
        "",
        "",
        "",
        "",
        "breax",
        "y",
        "breadbread",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("breadjambread"),
            new TestResult("xxbreadjambreadyy"),
            new TestResult("xxbreadyy"),
            new TestResult("xxbreadbreadjambreadyy"),
            new TestResult("breadAbread"),
            new TestResult("breadbread"),
            new TestResult("abcbreaz"),
            new TestResult("xyz"),
            new TestResult(""),
            new TestResult("breadbreaxbread"),
            new TestResult("breaxbreadybread"),
            new TestResult("breadbreadbreadbread"),
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
