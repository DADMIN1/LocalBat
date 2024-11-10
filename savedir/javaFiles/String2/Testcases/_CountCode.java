package String2.Testcases;
import String2.CountCode;

public final class _CountCode
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = CountCode.countCode(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "countCode(\"aaacodebbb\")",
        "countCode(\"codexxcode\")",
        "countCode(\"cozexxcope\")",
        "countCode(\"cozfxxcope\")",
        "countCode(\"xxcozeyycop\")",
        "countCode(\"cozcop\")",
        "countCode(\"abcxyz\")",
        "countCode(\"code\")",
        "countCode(\"ode\")",
        "countCode(\"c\")",
        "countCode(\"\")",
        "countCode(\"AAcodeBBcoleCCccoreDD\")",
        "countCode(\"AAcodeBBcoleCCccorfDD\")",
        "countCode(\"coAcodeBcoleccoreDD\")",
    };

    static final int[] expectedResults = {
        1,
        2,
        2,
        1,
        1,
        0,
        0,
        1,
        0,
        0,
        0,
        3,
        2,
        3,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("aaacodebbb"),
            new TestResult("codexxcode"),
            new TestResult("cozexxcope"),
            new TestResult("cozfxxcope"),
            new TestResult("xxcozeyycop"),
            new TestResult("cozcop"),
            new TestResult("abcxyz"),
            new TestResult("code"),
            new TestResult("ode"),
            new TestResult("c"),
            new TestResult(""),
            new TestResult("AAcodeBBcoleCCccoreDD"),
            new TestResult("AAcodeBBcoleCCccorfDD"),
            new TestResult("coAcodeBcoleccoreDD"),
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
