package String1.Testcases;
import String1.DeFront;

public final class _DeFront
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = DeFront.deFront(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "deFront(\"Hello\")",
        "deFront(\"java\")",
        "deFront(\"away\")",
        "deFront(\"axy\")",
        "deFront(\"abc\")",
        "deFront(\"xby\")",
        "deFront(\"ab\")",
        "deFront(\"ax\")",
        "deFront(\"axb\")",
        "deFront(\"aaa\")",
        "deFront(\"xbc\")",
        "deFront(\"bbb\")",
        "deFront(\"bazz\")",
        "deFront(\"ba\")",
        "deFront(\"abxyz\")",
        "deFront(\"hi\")",
        "deFront(\"his\")",
        "deFront(\"xz\")",
        "deFront(\"zzz\")",
    };

    static final String[] expectedResults = {
        "llo",
        "va",
        "aay",
        "ay",
        "abc",
        "by",
        "ab",
        "a",
        "ab",
        "aa",
        "bc",
        "bb",
        "zz",
        "",
        "abxyz",
        "",
        "s",
        "",
        "z",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("Hello"),
            new TestResult("java"),
            new TestResult("away"),
            new TestResult("axy"),
            new TestResult("abc"),
            new TestResult("xby"),
            new TestResult("ab"),
            new TestResult("ax"),
            new TestResult("axb"),
            new TestResult("aaa"),
            new TestResult("xbc"),
            new TestResult("bbb"),
            new TestResult("bazz"),
            new TestResult("ba"),
            new TestResult("abxyz"),
            new TestResult("hi"),
            new TestResult("his"),
            new TestResult("xz"),
            new TestResult("zzz"),
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
