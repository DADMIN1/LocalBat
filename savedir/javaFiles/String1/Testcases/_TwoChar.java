package String1.Testcases;
import String1.TwoChar;

public final class _TwoChar
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String str, int index) {
            try { result = TwoChar.twoChar(str, index); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "twoChar(\"java\", 0)",
        "twoChar(\"java\", 2)",
        "twoChar(\"java\", 3)",
        "twoChar(\"java\", 4)",
        "twoChar(\"java\", -1)",
        "twoChar(\"Hello\", 0)",
        "twoChar(\"Hello\", 1)",
        "twoChar(\"Hello\", 99)",
        "twoChar(\"Hello\", 3)",
        "twoChar(\"Hello\", 4)",
        "twoChar(\"Hello\", 5)",
        "twoChar(\"Hello\", -7)",
        "twoChar(\"Hello\", 6)",
        "twoChar(\"Hello\", -1)",
        "twoChar(\"yay\", 0)",
    };

    static final String[] expectedResults = {
        "ja",
        "va",
        "ja",
        "ja",
        "ja",
        "He",
        "el",
        "He",
        "lo",
        "He",
        "He",
        "He",
        "He",
        "He",
        "ya",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("java", 0),
            new TestResult("java", 2),
            new TestResult("java", 3),
            new TestResult("java", 4),
            new TestResult("java", -1),
            new TestResult("Hello", 0),
            new TestResult("Hello", 1),
            new TestResult("Hello", 99),
            new TestResult("Hello", 3),
            new TestResult("Hello", 4),
            new TestResult("Hello", 5),
            new TestResult("Hello", -7),
            new TestResult("Hello", 6),
            new TestResult("Hello", -1),
            new TestResult("yay", 0),
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
