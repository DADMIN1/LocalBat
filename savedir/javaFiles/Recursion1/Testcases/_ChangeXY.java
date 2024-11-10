package Recursion1.Testcases;
import Recursion1.ChangeXY;

public final class _ChangeXY
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = ChangeXY.changeXY(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "changeXY(\"codex\")",
        "changeXY(\"xxhixx\")",
        "changeXY(\"xhixhix\")",
        "changeXY(\"hiy\")",
        "changeXY(\"h\")",
        "changeXY(\"x\")",
        "changeXY(\"\")",
        "changeXY(\"xxx\")",
        "changeXY(\"yyhxyi\")",
        "changeXY(\"hihi\")",
    };

    static final String[] expectedResults = {
        "codey",
        "yyhiyy",
        "yhiyhiy",
        "hiy",
        "h",
        "y",
        "",
        "yyy",
        "yyhyyi",
        "hihi",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("codex"),
            new TestResult("xxhixx"),
            new TestResult("xhixhix"),
            new TestResult("hiy"),
            new TestResult("h"),
            new TestResult("x"),
            new TestResult(""),
            new TestResult("xxx"),
            new TestResult("yyhxyi"),
            new TestResult("hihi"),
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
