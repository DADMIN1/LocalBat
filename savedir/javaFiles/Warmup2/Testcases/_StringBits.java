package Warmup2.Testcases;
import Warmup2.StringBits;

public final class _StringBits
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = StringBits.stringBits(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "stringBits(\"Hello\")",
        "stringBits(\"Hi\")",
        "stringBits(\"Heeololeo\")",
        "stringBits(\"HiHiHi\")",
        "stringBits(\"\")",
        "stringBits(\"Greetings\")",
        "stringBits(\"Chocoate\")",
        "stringBits(\"pi\")",
        "stringBits(\"Hello Kitten\")",
        "stringBits(\"hxaxpxpxy\")",
    };

    static final String[] expectedResults = {
        "Hlo",
        "H",
        "Hello",
        "HHH",
        "",
        "Getns",
        "Coot",
        "p",
        "HloKte",
        "happy",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("Hello"),
            new TestResult("Hi"),
            new TestResult("Heeololeo"),
            new TestResult("HiHiHi"),
            new TestResult(""),
            new TestResult("Greetings"),
            new TestResult("Chocoate"),
            new TestResult("pi"),
            new TestResult("Hello Kitten"),
            new TestResult("hxaxpxpxy"),
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
