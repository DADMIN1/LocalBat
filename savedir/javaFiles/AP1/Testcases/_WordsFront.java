package AP1.Testcases;
import AP1.WordsFront;
import java.util.Arrays;
import java.util.ArrayList;

public final class _WordsFront
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String[] result;
        private RuntimeException caught = null;
        TestResult(String[] words, int n) {
            try { result = WordsFront.wordsFront(words, n); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "wordsFront([\"a\", \"b\", \"c\", \"d\"], 1)",
        "wordsFront([\"a\", \"b\", \"c\", \"d\"], 2)",
        "wordsFront([\"a\", \"b\", \"c\", \"d\"], 3)",
        "wordsFront([\"a\", \"b\", \"c\", \"d\"], 4)",
        "wordsFront([\"Hi\", \"There\"], 1)",
        "wordsFront([\"Hi\", \"There\"], 2)",
    };

    static final String[][] expectedResults = {
        {"a"},
        {"a", "b"},
        {"a", "b", "c"},
        {"a", "b", "c", "d"},
        {"Hi"},
        {"Hi", "There"},
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
        final String[] words0 = {"a", "b", "c", "d"}; 
        final String[] words1 = {"a", "b", "c", "d"}; 
        final String[] words2 = {"a", "b", "c", "d"}; 
        final String[] words3 = {"a", "b", "c", "d"}; 
        final String[] words4 = {"Hi", "There"}; 
        final String[] words5 = {"Hi", "There"}; 

        final TestResult[] results = {
            new TestResult(words0, 1),
            new TestResult(words1, 2),
            new TestResult(words2, 3),
            new TestResult(words3, 4),
            new TestResult(words4, 1),
            new TestResult(words5, 2),
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
