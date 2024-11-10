package String2.Testcases;
import String2.SameStarChar;

public final class _SameStarChar
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = SameStarChar.sameStarChar(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "sameStarChar(\"xy*yzz\")",
        "sameStarChar(\"xy*zzz\")",
        "sameStarChar(\"*xa*az\")",
        "sameStarChar(\"*xa*bz\")",
        "sameStarChar(\"*xa*a*\")",
        "sameStarChar(\"\")",
        "sameStarChar(\"*xa*a*a\")",
        "sameStarChar(\"*xa*a*b\")",
        "sameStarChar(\"*12*2*2\")",
        "sameStarChar(\"12*2*3*\")",
        "sameStarChar(\"abcDEF\")",
        "sameStarChar(\"XY*YYYY*Z*\")",
        "sameStarChar(\"XY*YYYY*Y*\")",
        "sameStarChar(\"12*2*3*\")",
        "sameStarChar(\"*\")",
        "sameStarChar(\"**\")",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        true,
        false,
        true,
        true,
        true,
        false,
        true,
        false,
        true,
        false,
        true,
        false,
        true,
        true,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("xy*yzz"),
            new TestResult("xy*zzz"),
            new TestResult("*xa*az"),
            new TestResult("*xa*bz"),
            new TestResult("*xa*a*"),
            new TestResult(""),
            new TestResult("*xa*a*a"),
            new TestResult("*xa*a*b"),
            new TestResult("*12*2*2"),
            new TestResult("12*2*3*"),
            new TestResult("abcDEF"),
            new TestResult("XY*YYYY*Z*"),
            new TestResult("XY*YYYY*Y*"),
            new TestResult("12*2*3*"),
            new TestResult("*"),
            new TestResult("**"),
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
