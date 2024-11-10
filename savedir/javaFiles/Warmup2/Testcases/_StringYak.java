package Warmup2.Testcases;
import Warmup2.StringYak;

public final class _StringYak
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = StringYak.stringYak(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "stringYak(\"yakpak\")",
        "stringYak(\"pakyak\")",
        "stringYak(\"yak123ya\")",
        "stringYak(\"yak\")",
        "stringYak(\"yakxxxyak\")",
        "stringYak(\"HiyakHi\")",
        "stringYak(\"xxxyakyyyakzzz\")",
    };

    static final String[] expectedResults = {
        "pak",
        "pak",
        "123ya",
        "",
        "xxx",
        "HiHi",
        "xxxyyzzz",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("yakpak"),
            new TestResult("pakyak"),
            new TestResult("yak123ya"),
            new TestResult("yak"),
            new TestResult("yakxxxyak"),
            new TestResult("HiyakHi"),
            new TestResult("xxxyakyyyakzzz"),
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
