package String2.Testcases;
import String2.OneTwo;

public final class _OneTwo
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = OneTwo.oneTwo(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "oneTwo(\"abc\")",
        "oneTwo(\"tca\")",
        "oneTwo(\"tcagdo\")",
        "oneTwo(\"chocolate\")",
        "oneTwo(\"1234567890\")",
        "oneTwo(\"xabxabxabxabxabxabxab\")",
        "oneTwo(\"abcdefx\")",
        "oneTwo(\"abcdefxy\")",
        "oneTwo(\"abcdefxyz\")",
        "oneTwo(\"\")",
        "oneTwo(\"x\")",
        "oneTwo(\"xy\")",
        "oneTwo(\"xyz\")",
        "oneTwo(\"abcdefghijklkmnopqrstuvwxyz1234567890\")",
        "oneTwo(\"abcdefghijklkmnopqrstuvwxyz123456789\")",
        "oneTwo(\"abcdefghijklkmnopqrstuvwxyz12345678\")",
    };

    static final String[] expectedResults = {
        "bca",
        "cat",
        "catdog",
        "hocolctea",
        "231564897",
        "abxabxabxabxabxabxabx",
        "bcaefd",
        "bcaefd",
        "bcaefdyzx",
        "",
        "",
        "",
        "yzx",
        "bcaefdhigkljmnkpqostrvwuyzx231564897",
        "bcaefdhigkljmnkpqostrvwuyzx231564897",
        "bcaefdhigkljmnkpqostrvwuyzx231564",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("abc"),
            new TestResult("tca"),
            new TestResult("tcagdo"),
            new TestResult("chocolate"),
            new TestResult("1234567890"),
            new TestResult("xabxabxabxabxabxabxab"),
            new TestResult("abcdefx"),
            new TestResult("abcdefxy"),
            new TestResult("abcdefxyz"),
            new TestResult(""),
            new TestResult("x"),
            new TestResult("xy"),
            new TestResult("xyz"),
            new TestResult("abcdefghijklkmnopqrstuvwxyz1234567890"),
            new TestResult("abcdefghijklkmnopqrstuvwxyz123456789"),
            new TestResult("abcdefghijklkmnopqrstuvwxyz12345678"),
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
