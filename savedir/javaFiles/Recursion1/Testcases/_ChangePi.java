package Recursion1.Testcases;
import Recursion1.ChangePi;

public final class _ChangePi
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = ChangePi.changePi(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "changePi(\"xpix\")",
        "changePi(\"pipi\")",
        "changePi(\"pip\")",
        "changePi(\"pi\")",
        "changePi(\"hip\")",
        "changePi(\"p\")",
        "changePi(\"x\")",
        "changePi(\"\")",
        "changePi(\"pixx\")",
        "changePi(\"xyzzy\")",
    };

    static final String[] expectedResults = {
        "x3.14x",
        "3.143.14",
        "3.14p",
        "3.14",
        "hip",
        "p",
        "x",
        "",
        "3.14xx",
        "xyzzy",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("xpix"),
            new TestResult("pipi"),
            new TestResult("pip"),
            new TestResult("pi"),
            new TestResult("hip"),
            new TestResult("p"),
            new TestResult("x"),
            new TestResult(""),
            new TestResult("pixx"),
            new TestResult("xyzzy"),
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
