package Warmup2.Testcases;
import Warmup2.StringSplosion;

public final class _StringSplosion
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = StringSplosion.stringSplosion(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "stringSplosion(\"Code\")",
        "stringSplosion(\"abc\")",
        "stringSplosion(\"ab\")",
        "stringSplosion(\"x\")",
        "stringSplosion(\"fade\")",
        "stringSplosion(\"There\")",
        "stringSplosion(\"Kitten\")",
        "stringSplosion(\"Bye\")",
        "stringSplosion(\"Good\")",
        "stringSplosion(\"Bad\")",
    };

    static final String[] expectedResults = {
        "CCoCodCode",
        "aababc",
        "aab",
        "x",
        "ffafadfade",
        "TThTheTherThere",
        "KKiKitKittKitteKitten",
        "BByBye",
        "GGoGooGood",
        "BBaBad",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("Code"),
            new TestResult("abc"),
            new TestResult("ab"),
            new TestResult("x"),
            new TestResult("fade"),
            new TestResult("There"),
            new TestResult("Kitten"),
            new TestResult("Bye"),
            new TestResult("Good"),
            new TestResult("Bad"),
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
