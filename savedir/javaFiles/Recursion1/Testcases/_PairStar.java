package Recursion1.Testcases;
import Recursion1.PairStar;

public final class _PairStar
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = PairStar.pairStar(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "pairStar(\"hello\")",
        "pairStar(\"xxyy\")",
        "pairStar(\"aaaa\")",
        "pairStar(\"aaab\")",
        "pairStar(\"aa\")",
        "pairStar(\"a\")",
        "pairStar(\"\")",
        "pairStar(\"noadjacent\")",
        "pairStar(\"abba\")",
        "pairStar(\"abbba\")",
    };

    static final String[] expectedResults = {
        "hel*lo",
        "x*xy*y",
        "a*a*a*a",
        "a*a*ab",
        "a*a",
        "a",
        "",
        "noadjacent",
        "ab*ba",
        "ab*b*ba",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("hello"),
            new TestResult("xxyy"),
            new TestResult("aaaa"),
            new TestResult("aaab"),
            new TestResult("aa"),
            new TestResult("a"),
            new TestResult(""),
            new TestResult("noadjacent"),
            new TestResult("abba"),
            new TestResult("abbba"),
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
