package AP1.Testcases;
import AP1.WordsCount;

public final class _WordsCount
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(String[] words, int len) {
            try { result = WordsCount.wordsCount(words, len); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "wordsCount([\"a\", \"bb\", \"b\", \"ccc\"], 1)",
        "wordsCount([\"a\", \"bb\", \"b\", \"ccc\"], 3)",
        "wordsCount([\"a\", \"bb\", \"b\", \"ccc\"], 4)",
        "wordsCount([\"xx\", \"yyy\", \"x\", \"yy\", \"z\"], 1)",
        "wordsCount([\"xx\", \"yyy\", \"x\", \"yy\", \"z\"], 2)",
        "wordsCount([\"xx\", \"yyy\", \"x\", \"yy\", \"z\"], 3)",
    };

    static final int[] expectedResults = {
        2,
        1,
        0,
        2,
        2,
        1,
    };

    public static final boolean Validate()
    {
        final String[] words0 = {"a", "bb", "b", "ccc"}; 
        final String[] words1 = {"a", "bb", "b", "ccc"}; 
        final String[] words2 = {"a", "bb", "b", "ccc"}; 
        final String[] words3 = {"xx", "yyy", "x", "yy", "z"}; 
        final String[] words4 = {"xx", "yyy", "x", "yy", "z"}; 
        final String[] words5 = {"xx", "yyy", "x", "yy", "z"}; 

        final TestResult[] results = {
            new TestResult(words0, 1),
            new TestResult(words1, 3),
            new TestResult(words2, 4),
            new TestResult(words3, 1),
            new TestResult(words4, 2),
            new TestResult(words5, 3),
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
