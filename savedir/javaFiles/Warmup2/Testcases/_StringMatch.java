package Warmup2.Testcases;
import Warmup2.StringMatch;

public final class _StringMatch
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(String a, String b) {
            try { result = StringMatch.stringMatch(a, b); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "stringMatch(\"xxcaazz\", \"xxbaaz\")",
        "stringMatch(\"abc\", \"abc\")",
        "stringMatch(\"abc\", \"axc\")",
        "stringMatch(\"hello\", \"he\")",
        "stringMatch(\"he\", \"hello\")",
        "stringMatch(\"h\", \"hello\")",
        "stringMatch(\"\", \"hello\")",
        "stringMatch(\"aabbccdd\", \"abbbxxd\")",
        "stringMatch(\"aaxxaaxx\", \"iaxxai\")",
        "stringMatch(\"iaxxai\", \"aaxxaaxx\")",
    };

    static final int[] expectedResults = {
        3,
        2,
        0,
        1,
        1,
        0,
        0,
        1,
        3,
        3,
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("xxcaazz", "xxbaaz"),
            new TestResult("abc", "abc"),
            new TestResult("abc", "axc"),
            new TestResult("hello", "he"),
            new TestResult("he", "hello"),
            new TestResult("h", "hello"),
            new TestResult("", "hello"),
            new TestResult("aabbccdd", "abbbxxd"),
            new TestResult("aaxxaaxx", "iaxxai"),
            new TestResult("iaxxai", "aaxxaaxx"),
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
