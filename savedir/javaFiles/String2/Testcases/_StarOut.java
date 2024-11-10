package String2.Testcases;
import String2.StarOut;

public final class _StarOut
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = StarOut.starOut(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "starOut(\"ab*cd\")",
        "starOut(\"ab**cd\")",
        "starOut(\"sm*eilly\")",
        "starOut(\"sm*eil*ly\")",
        "starOut(\"sm**eil*ly\")",
        "starOut(\"sm***eil*ly\")",
        "starOut(\"stringy*\")",
        "starOut(\"*stringy\")",
        "starOut(\"*str*in*gy\")",
        "starOut(\"abc\")",
        "starOut(\"a*bc\")",
        "starOut(\"ab\")",
        "starOut(\"a*b\")",
        "starOut(\"a\")",
        "starOut(\"a*\")",
        "starOut(\"*a\")",
        "starOut(\"*\")",
        "starOut(\"\")",
    };

    static final String[] expectedResults = {
        "ad",
        "ad",
        "silly",
        "siy",
        "siy",
        "siy",
        "string",
        "tringy",
        "ty",
        "abc",
        "c",
        "ab",
        "",
        "a",
        "",
        "",
        "",
        "",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("ab*cd"),
            new TestResult("ab**cd"),
            new TestResult("sm*eilly"),
            new TestResult("sm*eil*ly"),
            new TestResult("sm**eil*ly"),
            new TestResult("sm***eil*ly"),
            new TestResult("stringy*"),
            new TestResult("*stringy"),
            new TestResult("*str*in*gy"),
            new TestResult("abc"),
            new TestResult("a*bc"),
            new TestResult("ab"),
            new TestResult("a*b"),
            new TestResult("a"),
            new TestResult("a*"),
            new TestResult("*a"),
            new TestResult("*"),
            new TestResult(""),
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
