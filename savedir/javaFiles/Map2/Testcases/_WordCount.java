package Map2.Testcases;
import Map2.WordCount;
import java.util.Map;
import java.util.HashMap;

public final class _WordCount
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private Map<?,?> result;
        private RuntimeException caught = null;
        TestResult(String[] strings) {
            try { result = WordCount.wordCount(strings); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "wordCount([\"a\", \"b\", \"a\", \"c\", \"b\"])",
        "wordCount([\"c\", \"b\", \"a\"])",
        "wordCount([\"c\", \"c\", \"c\", \"c\"])",
        "wordCount([])",
        "wordCount([\"this\", \"and\", \"this\", \"\"])",
        "wordCount([\"x\", \"y\", \"x\", \"Y\", \"X\"])",
        "wordCount([\"123\", \"0\", \"123\", \"1\"])",
        "wordCount([\"d\", \"a\", \"e\", \"d\", \"a\", \"d\", \"b\", \"b\", \"z\", \"a\", \"a\", \"b\", \"z\", \"x\", \"b\", \"f\", \"x\", \"two\", \"b\", \"one\", \"two\"])",
        "wordCount([\"apple\", \"banana\", \"apple\", \"apple\", \"tea\", \"coffee\", \"banana\"])",
    };

    static final Map<?,?>[] expectedResults = {
        Map.of("a", 2, "b", 2, "c", 1),
        Map.of("a", 1, "b", 1, "c", 1),
        Map.of("c", 4),
        Map.of(),
        Map.of("", 1, "and", 1, "this", 2),
        Map.of("x", 2, "X", 1, "y", 1, "Y", 1),
        Map.of("0", 1, "1", 1, "123", 2),
        Map.of("a", 4, "b", 5, "d", 3, "e", 1, "f", 1, "one", 1, "x", 2, "z", 2, "two", 2),
        Map.of("banana", 2, "apple", 3, "tea", 1, "coffee", 1),
    };

    public static final boolean Validate()
    {
        final String[] strings0 = {"a", "b", "a", "c", "b"}; 
        final String[] strings1 = {"c", "b", "a"}; 
        final String[] strings2 = {"c", "c", "c", "c"}; 
        final String[] strings3 = {}; 
        final String[] strings4 = {"this", "and", "this", ""}; 
        final String[] strings5 = {"x", "y", "x", "Y", "X"}; 
        final String[] strings6 = {"123", "0", "123", "1"}; 
        final String[] strings7 = {"d", "a", "e", "d", "a", "d", "b", "b", "z", "a", "a", "b", "z", "x", "b", "f", "x", "two", "b", "one", "two"}; 
        final String[] strings8 = {"apple", "banana", "apple", "apple", "tea", "coffee", "banana"}; 

        final TestResult[] results = {
            new TestResult(strings0),
            new TestResult(strings1),
            new TestResult(strings2),
            new TestResult(strings3),
            new TestResult(strings4),
            new TestResult(strings5),
            new TestResult(strings6),
            new TestResult(strings7),
            new TestResult(strings8),
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
