package String1.Testcases;
import String1.StartWord;

public final class _StartWord
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String str, String word) {
            try { result = StartWord.startWord(str, word); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "startWord(\"hippo\", \"hi\")",
        "startWord(\"hippo\", \"xip\")",
        "startWord(\"hippo\", \"i\")",
        "startWord(\"hippo\", \"ix\")",
        "startWord(\"h\", \"ix\")",
        "startWord(\"\", \"i\")",
        "startWord(\"hip\", \"zi\")",
        "startWord(\"hip\", \"zip\")",
        "startWord(\"hip\", \"zig\")",
        "startWord(\"h\", \"z\")",
        "startWord(\"hippo\", \"xippo\")",
        "startWord(\"hippo\", \"xyz\")",
        "startWord(\"hippo\", \"hip\")",
        "startWord(\"kitten\", \"cit\")",
        "startWord(\"kit\", \"cit\")",
    };

    static final String[] expectedResults = {
        "hi",
        "hip",
        "h",
        "",
        "",
        "",
        "hi",
        "hip",
        "",
        "h",
        "hippo",
        "",
        "hip",
        "kit",
        "kit",
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("hippo", "hi"),
            new TestResult("hippo", "xip"),
            new TestResult("hippo", "i"),
            new TestResult("hippo", "ix"),
            new TestResult("h", "ix"),
            new TestResult("", "i"),
            new TestResult("hip", "zi"),
            new TestResult("hip", "zip"),
            new TestResult("hip", "zig"),
            new TestResult("h", "z"),
            new TestResult("hippo", "xippo"),
            new TestResult("hippo", "xyz"),
            new TestResult("hippo", "hip"),
            new TestResult("kitten", "cit"),
            new TestResult("kit", "cit"),
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
