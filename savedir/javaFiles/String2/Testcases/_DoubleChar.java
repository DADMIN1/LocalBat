package String2.Testcases;
import String2.DoubleChar;

public final class _DoubleChar
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = DoubleChar.doubleChar(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "doubleChar(\"The\")",
        "doubleChar(\"AAbb\")",
        "doubleChar(\"Hi-There\")",
        "doubleChar(\"Word!\")",
        "doubleChar(\"!!\")",
        "doubleChar(\"\")",
        "doubleChar(\"a\")",
        "doubleChar(\".\")",
        "doubleChar(\"aa\")",
    };

    static final String[] expectedResults = {
        "TThhee",
        "AAAAbbbb",
        "HHii--TThheerree",
        "WWoorrdd!!",
        "!!!!",
        "",
        "aa",
        "..",
        "aaaa",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("The"),
            new TestResult("AAbb"),
            new TestResult("Hi-There"),
            new TestResult("Word!"),
            new TestResult("!!"),
            new TestResult(""),
            new TestResult("a"),
            new TestResult("."),
            new TestResult("aa"),
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
