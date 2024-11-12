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
        "\u001b[3;30mwordsCount\u001B[0;30m(\u001b[0;1m[\"a\", \"bb\", \"b\", \"ccc\"], 1\u001B[0m\u001b[30m)",
        "\u001b[3;30mwordsCount\u001B[0;30m(\u001b[0;1m[\"a\", \"bb\", \"b\", \"ccc\"], 3\u001B[0m\u001b[30m)",
        "\u001b[3;30mwordsCount\u001B[0;30m(\u001b[0;1m[\"a\", \"bb\", \"b\", \"ccc\"], 4\u001B[0m\u001b[30m)",
        "\u001b[3;30mwordsCount\u001B[0;30m(\u001b[0;1m[\"xx\", \"yyy\", \"x\", \"yy\", \"z\"], 1\u001B[0m\u001b[30m)",
        "\u001b[3;30mwordsCount\u001B[0;30m(\u001b[0;1m[\"xx\", \"yyy\", \"x\", \"yy\", \"z\"], 2\u001B[0m\u001b[30m)",
        "\u001b[3;30mwordsCount\u001B[0;30m(\u001b[0;1m[\"xx\", \"yyy\", \"x\", \"yy\", \"z\"], 3\u001B[0m\u001b[30m)",
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

        int successCount = 0;
        boolean allTestsPassed = true;
        boolean prevTestPassed = false;
        for (int i = 0; i < results.length; ++i)
        {
            if (results[i].caught != null) {
                allTestsPassed = false;
                if(prevTestPassed) { System.out.println(); prevTestPassed = false; }
                System.out.print("\u001b[31;1m[!]\u001B[0m \u001b[34;4m#"+(i+1)+"\u001b[0;30m - \u001B[0m");
                System.out.println(testcaseStrings[i]+" - \u001b[3;31;1mFailed!\u001B[0;31;1m \u001b[40;7m[EXCEPTION]\u001B[0m");
                System.out.println("\u001b[31;40;1m"+results[i].caught.getClass().getName());
                System.out.println("\u001b[0;33;40m"+results[i].caught.getMessage());
                if(getStacktraces) System.out.print("\u001b[30;3m");
                if(getStacktraces) results[i].caught.printStackTrace();
                System.out.println("\u001b[0m\u001B[0m"); continue;
            }
            if (results[i].result != expectedResults[i]) {
                allTestsPassed = false;
                if(prevTestPassed) { System.out.println(); prevTestPassed = false; }
                System.out.print("\u001b[31;1m[X]\u001B[0m \u001b[34;4m#"+(i+1)+"\u001b[0;30m - \u001B[0m");
                System.out.println(testcaseStrings[i]+" - \u001b[31;1;3mFailed!\u001B[0m");
                System.out.println("    \u001b[34;3;4mreceived:\u001B[0m \u001b[1m"+results[i].result);
                System.out.println("    \u001b[36;3;4mexpected:\u001B[0m \u001b[1m"+expectedResults[i]);
                System.out.println();
            } else if (printSuccesses) {
                successCount += 1;
                prevTestPassed = true;
                System.out.println("\u001b[32;1m[✓] \u001B[0m\u001b[34;4m#"+(i+1)+"\u001b[0;30m - \u001B[0m"+testcaseStrings[i]);
            }
        }
        if (allTestsPassed) System.out.println("\n \u001b[32;1m✓✓✓\u001B[0;1m\u001b[36;40m  ~  All tests passed  ~  \u001B[0m\u001b[32;1m✓✓✓\u001B[0m");
        else System.out.println("\n\u001b[32;1;40m "+successCount+"\u001B[0;1;40m / \u001b[34m"+results.length+"\u001b[30m tests passed \u001B[0m");
        return allTestsPassed;
    }
}
