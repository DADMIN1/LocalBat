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
        "\u001b[3;30mwordsFront\u001B[0;30m(\u001b[0;1m[\"a\", \"b\", \"c\", \"d\"], 1\u001B[0m\u001b[30m)",
        "\u001b[3;30mwordsFront\u001B[0;30m(\u001b[0;1m[\"a\", \"b\", \"c\", \"d\"], 2\u001B[0m\u001b[30m)",
        "\u001b[3;30mwordsFront\u001B[0;30m(\u001b[0;1m[\"a\", \"b\", \"c\", \"d\"], 3\u001B[0m\u001b[30m)",
        "\u001b[3;30mwordsFront\u001B[0;30m(\u001b[0;1m[\"a\", \"b\", \"c\", \"d\"], 4\u001B[0m\u001b[30m)",
        "\u001b[3;30mwordsFront\u001B[0;30m(\u001b[0;1m[\"Hi\", \"There\"], 1\u001B[0m\u001b[30m)",
        "\u001b[3;30mwordsFront\u001B[0;30m(\u001b[0;1m[\"Hi\", \"There\"], 2\u001B[0m\u001b[30m)",
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
            if (!Arrays.equals(results[i].result, expectedResults[i])) {
                allTestsPassed = false;
                if(prevTestPassed) { System.out.println(); prevTestPassed = false; }
                System.out.print("\u001b[31;1m[X]\u001B[0m \u001b[34;4m#"+(i+1)+"\u001b[0;30m - \u001B[0m");
                System.out.println(testcaseStrings[i]+" - \u001b[31;1;3mFailed!\u001B[0m");
                System.out.println("    \u001b[34;3;4mreceived:\u001B[0m \u001b[1m"+printArray(results[i].result));
                System.out.println("    \u001b[36;3;4mexpected:\u001B[0m \u001b[1m"+printArray(expectedResults[i]));
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
