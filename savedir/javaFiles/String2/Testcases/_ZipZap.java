package String2.Testcases;
import String2.ZipZap;

public final class _ZipZap
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = ZipZap.zipZap(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "zipZap(\"zipXzap\")",
        "zipZap(\"zopzop\")",
        "zipZap(\"zzzopzop\")",
        "zipZap(\"zibzap\")",
        "zipZap(\"zip\")",
        "zipZap(\"zi\")",
        "zipZap(\"z\")",
        "zipZap(\"\")",
        "zipZap(\"zzp\")",
        "zipZap(\"abcppp\")",
        "zipZap(\"azbcppp\")",
        "zipZap(\"azbcpzpp\")",
    };

    static final String[] expectedResults = {
        "zpXzp",
        "zpzp",
        "zzzpzp",
        "zibzp",
        "zp",
        "zi",
        "z",
        "",
        "zp",
        "abcppp",
        "azbcppp",
        "azbcpzp",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("zipXzap"),
            new TestResult("zopzop"),
            new TestResult("zzzopzop"),
            new TestResult("zibzap"),
            new TestResult("zip"),
            new TestResult("zi"),
            new TestResult("z"),
            new TestResult(""),
            new TestResult("zzp"),
            new TestResult("abcppp"),
            new TestResult("azbcppp"),
            new TestResult("azbcpzpp"),
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
