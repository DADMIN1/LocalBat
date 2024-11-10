package Recursion1.Testcases;
import Recursion1.AllStar;

public final class _AllStar
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = AllStar.allStar(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "allStar(\"hello\")",
        "allStar(\"abc\")",
        "allStar(\"ab\")",
        "allStar(\"a\")",
        "allStar(\"\")",
        "allStar(\"3.14\")",
        "allStar(\"Chocolate\")",
        "allStar(\"1234\")",
    };

    static final String[] expectedResults = {
        "h*e*l*l*o",
        "a*b*c",
        "a*b",
        "a",
        "",
        "3*.*1*4",
        "C*h*o*c*o*l*a*t*e",
        "1*2*3*4",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("hello"),
            new TestResult("abc"),
            new TestResult("ab"),
            new TestResult("a"),
            new TestResult(""),
            new TestResult("3.14"),
            new TestResult("Chocolate"),
            new TestResult("1234"),
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
