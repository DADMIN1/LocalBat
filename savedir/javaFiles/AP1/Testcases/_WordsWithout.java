package AP1.Testcases;
import AP1.WordsWithout;
import java.util.Arrays;
import java.util.ArrayList;

public final class _WordsWithout
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String[] result;
        private RuntimeException caught = null;
        TestResult(String[] words, String target) {
            try { result = WordsWithout.wordsWithout(words, target); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "wordsWithout([\"a\", \"b\", \"c\", \"a\"], \"a\")",
        "wordsWithout([\"a\", \"b\", \"c\", \"a\"], \"b\")",
        "wordsWithout([\"a\", \"b\", \"c\", \"a\"], \"c\")",
        "wordsWithout([\"b\", \"c\", \"a\", \"a\"], \"b\")",
        "wordsWithout([\"xx\", \"yyy\", \"x\", \"yy\", \"x\"], \"x\")",
        "wordsWithout([\"xx\", \"yyy\", \"x\", \"yy\", \"x\"], \"yy\")",
        "wordsWithout([\"aa\", \"ab\", \"ac\", \"aa\"], \"aa\")",
    };

    static final String[][] expectedResults = {
        {"b", "c"},
        {"a", "c", "a"},
        {"a", "b", "a"},
        {"c", "a", "a"},
        {"xx", "yyy", "yy"},
        {"xx", "yyy", "x", "x"},
        {"ab", "ac"},
    };

    public static final String printArray(String[] array)
    {
        String result = "[";
        for (String a: array) { result += a+", "; }
        if (result.length() > 2) result = result.substring(0, result.length()-2);
        return result + "]";
    }

    public static final boolean Validate()
    {
        final String[] words0 = {"a", "b", "c", "a"}; 
        final String[] words1 = {"a", "b", "c", "a"}; 
        final String[] words2 = {"a", "b", "c", "a"}; 
        final String[] words3 = {"b", "c", "a", "a"}; 
        final String[] words4 = {"xx", "yyy", "x", "yy", "x"}; 
        final String[] words5 = {"xx", "yyy", "x", "yy", "x"}; 
        final String[] words6 = {"aa", "ab", "ac", "aa"}; 

        final TestResult[] results = {
            new TestResult(words0, "a"),
            new TestResult(words1, "b"),
            new TestResult(words2, "c"),
            new TestResult(words3, "b"),
            new TestResult(words4, "x"),
            new TestResult(words5, "yy"),
            new TestResult(words6, "aa"),
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
            if (!Arrays.equals(results[i].result, expectedResults[i])) {
                allTestsPassed = false;
                if(prevTestPassed) { System.out.println(); prevTestPassed = false; }
                System.out.print("[x] #"+(i+1)+" - ");
                System.out.println(testcaseStrings[i]+" - Failed!");
                System.out.println("    received: "+printArray(results[i].result));
                System.out.println("    expected: "+printArray(expectedResults[i]));
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
