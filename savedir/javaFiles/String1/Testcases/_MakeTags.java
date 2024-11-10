package String1.Testcases;
import String1.MakeTags;

public final class _MakeTags
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String tag, String word) {
            try { result = MakeTags.makeTags(tag, word); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "makeTags(\"i\", \"Yay\")",
        "makeTags(\"i\", \"Hello\")",
        "makeTags(\"cite\", \"Yay\")",
        "makeTags(\"address\", \"here\")",
        "makeTags(\"body\", \"Heart\")",
        "makeTags(\"i\", \"i\")",
        "makeTags(\"i\", \"\")",
    };

    static final String[] expectedResults = {
        "<i>Yay</i>",
        "<i>Hello</i>",
        "<cite>Yay</cite>",
        "<address>here</address>",
        "<body>Heart</body>",
        "<i>i</i>",
        "<i></i>",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("i", "Yay"),
            new TestResult("i", "Hello"),
            new TestResult("cite", "Yay"),
            new TestResult("address", "here"),
            new TestResult("body", "Heart"),
            new TestResult("i", "i"),
            new TestResult("i", ""),
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
