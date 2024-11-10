package String1.Testcases;
import String1.MiddleThree;

public final class _MiddleThree
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String str) {
            try { result = MiddleThree.middleThree(str); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "middleThree(\"Candy\")",
        "middleThree(\"and\")",
        "middleThree(\"solving\")",
        "middleThree(\"Hi yet Hi\")",
        "middleThree(\"java yet java\")",
        "middleThree(\"Chocolate\")",
        "middleThree(\"XabcxyzabcX\")",
    };

    static final String[] expectedResults = {
        "and",
        "and",
        "lvi",
        "yet",
        "yet",
        "col",
        "xyz",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("Candy"),
            new TestResult("and"),
            new TestResult("solving"),
            new TestResult("Hi yet Hi"),
            new TestResult("java yet java"),
            new TestResult("Chocolate"),
            new TestResult("XabcxyzabcX"),
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
