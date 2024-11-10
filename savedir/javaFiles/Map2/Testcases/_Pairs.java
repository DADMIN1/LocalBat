package Map2.Testcases;
import Map2.Pairs;
import java.util.Map;
import java.util.HashMap;

public final class _Pairs
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private Map<?,?> result;
        private RuntimeException caught = null;
        TestResult(String[] strings) {
            try { result = Pairs.pairs(strings); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "pairs([\"code\", \"bug\"])",
        "pairs([\"man\", \"moon\", \"main\"])",
        "pairs([\"man\", \"moon\", \"good\", \"night\"])",
        "pairs([])",
        "pairs([\"a\", \"b\"])",
        "pairs([\"are\", \"codes\", \"and\", \"cods\"])",
        "pairs([\"apple\", \"banana\", \"tea\", \"coffee\"])",
    };

    static final Map<?,?>[] expectedResults = {
        Map.of("b", "g", "c", "e"),
        Map.of("m", "n"),
        Map.of("g", "d", "m", "n", "n", "t"),
        Map.of(),
        Map.of("a", "a", "b", "b"),
        Map.of("a", "d", "c", "s"),
        Map.of("a", "e", "b", "a", "c", "e", "t", "a"),
    };

    public static final boolean Validate()
    {
        final String[] strings0 = {"code", "bug"}; 
        final String[] strings1 = {"man", "moon", "main"}; 
        final String[] strings2 = {"man", "moon", "good", "night"}; 
        final String[] strings3 = {}; 
        final String[] strings4 = {"a", "b"}; 
        final String[] strings5 = {"are", "codes", "and", "cods"}; 
        final String[] strings6 = {"apple", "banana", "tea", "coffee"}; 

        final TestResult[] results = {
            new TestResult(strings0),
            new TestResult(strings1),
            new TestResult(strings2),
            new TestResult(strings3),
            new TestResult(strings4),
            new TestResult(strings5),
            new TestResult(strings6),
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
