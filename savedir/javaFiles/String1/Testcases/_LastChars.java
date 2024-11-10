package String1.Testcases;
import String1.LastChars;

public final class _LastChars
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String a, String b) {
            try { result = LastChars.lastChars(a, b); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "lastChars(\"last\", \"chars\")",
        "lastChars(\"yo\", \"java\")",
        "lastChars(\"hi\", \"\")",
        "lastChars(\"\", \"hello\")",
        "lastChars(\"\", \"\")",
        "lastChars(\"kitten\", \"hi\")",
        "lastChars(\"k\", \"zip\")",
        "lastChars(\"kitten\", \"\")",
        "lastChars(\"kitten\", \"zip\")",
    };

    static final String[] expectedResults = {
        "ls",
        "ya",
        "h@",
        "@o",
        "@@",
        "ki",
        "kp",
        "k@",
        "kp",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("last", "chars"),
            new TestResult("yo", "java"),
            new TestResult("hi", ""),
            new TestResult("", "hello"),
            new TestResult("", ""),
            new TestResult("kitten", "hi"),
            new TestResult("k", "zip"),
            new TestResult("kitten", ""),
            new TestResult("kitten", "zip"),
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
