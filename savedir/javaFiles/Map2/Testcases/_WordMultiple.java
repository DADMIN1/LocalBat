package Map2.Testcases;
import Map2.WordMultiple;
import java.util.Map;
import java.util.HashMap;

public final class _WordMultiple
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private Map<?,?> result;
        private RuntimeException caught = null;
        TestResult(String[] strings) {
            try { result = WordMultiple.wordMultiple(strings); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "wordMultiple([\"a\", \"b\", \"a\", \"c\", \"b\"])",
        "wordMultiple([\"c\", \"b\", \"a\"])",
        "wordMultiple([\"c\", \"c\", \"c\", \"c\"])",
        "wordMultiple([])",
        "wordMultiple([\"this\", \"and\", \"this\"])",
        "wordMultiple([\"d\", \"a\", \"e\", \"d\", \"a\", \"d\", \"b\", \"b\", \"z\", \"a\", \"a\", \"b\", \"z\", \"x\"])",
    };

    static final Map<?,?>[] expectedResults = {
        Map.of("a", true, "b", true, "c", false),
        Map.of("a", false, "b", false, "c", false),
        Map.of("c", true),
        Map.of(),
        Map.of("and", false, "this", true),
        Map.of("a", true, "b", true, "d", true, "e", false, "x", false, "z", true),
    };

    public static final boolean Validate()
    {
        final String[] strings0 = {"a", "b", "a", "c", "b"}; 
        final String[] strings1 = {"c", "b", "a"}; 
        final String[] strings2 = {"c", "c", "c", "c"}; 
        final String[] strings3 = {}; 
        final String[] strings4 = {"this", "and", "this"}; 
        final String[] strings5 = {"d", "a", "e", "d", "a", "d", "b", "b", "z", "a", "a", "b", "z", "x"}; 

        final TestResult[] results = {
            new TestResult(strings0),
            new TestResult(strings1),
            new TestResult(strings2),
            new TestResult(strings3),
            new TestResult(strings4),
            new TestResult(strings5),
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
