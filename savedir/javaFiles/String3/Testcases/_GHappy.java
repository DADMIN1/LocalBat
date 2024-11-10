package String3.Testcases;
import String3.GHappy;

public final class _GHappy
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private boolean result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = GHappy.gHappy(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "gHappy(\"xxggxx\")",
        "gHappy(\"xxgxx\")",
        "gHappy(\"xxggyygxx\")",
        "gHappy(\"g\")",
        "gHappy(\"gg\")",
        "gHappy(\"\")",
        "gHappy(\"xxgggxyz\")",
        "gHappy(\"xxgggxyg\")",
        "gHappy(\"xxgggxygg\")",
        "gHappy(\"mgm\")",
        "gHappy(\"mggm\")",
        "gHappy(\"yyygggxyy\")",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        false,
        false,
        true,
        true,
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
            new TestResult("xxggxx"),
            new TestResult("xxgxx"),
            new TestResult("xxggyygxx"),
            new TestResult("g"),
            new TestResult("gg"),
            new TestResult(""),
            new TestResult("xxgggxyz"),
            new TestResult("xxgggxyg"),
            new TestResult("xxgggxygg"),
            new TestResult("mgm"),
            new TestResult("mggm"),
            new TestResult("yyygggxyy"),
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
