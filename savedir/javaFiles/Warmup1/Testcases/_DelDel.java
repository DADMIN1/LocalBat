package Warmup1.Testcases;
import Warmup1.DelDel;

public final class _DelDel
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = DelDel.delDel(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "delDel(\"adelbc\")",
        "delDel(\"adelHello\")",
        "delDel(\"adedbc\")",
        "delDel(\"abcdel\")",
        "delDel(\"add\")",
        "delDel(\"ad\")",
        "delDel(\"a\")",
        "delDel(\"\")",
        "delDel(\"del\")",
        "delDel(\"adel\")",
        "delDel(\"aadelbb\")",
    };

    static final String[] expectedResults = {
        "abc",
        "aHello",
        "adedbc",
        "abcdel",
        "add",
        "ad",
        "a",
        "",
        "del",
        "a",
        "aadelbb",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("adelbc"),
            new TestResult("adelHello"),
            new TestResult("adedbc"),
            new TestResult("abcdel"),
            new TestResult("add"),
            new TestResult("ad"),
            new TestResult("a"),
            new TestResult(""),
            new TestResult("del"),
            new TestResult("adel"),
            new TestResult("aadelbb"),
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
