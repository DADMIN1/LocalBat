package Map1.Testcases;
import Map1.MapAB;
import java.util.Map;
import java.util.HashMap;

public final class _MapAB
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private Map<?,?> result;
        private RuntimeException caught = null;
        TestResult(Map<String, String> map) {
            try { result = MapAB.mapAB(map); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "mapAB({\"a\": \"Hi\", \"b\": \"There\"})",
        "mapAB({\"a\": \"Hi\"})",
        "mapAB({\"b\": \"There\"})",
        "mapAB({\"c\": \"meh\"})",
        "mapAB({\"a\": \"aaa\", \"ab\": \"nope\", \"b\": \"bbb\", \"c\": \"ccc\"})",
        "mapAB({\"ab\": \"nope\", \"b\": \"bbb\", \"c\": \"ccc\"})",
    };

    static final Map<?,?>[] expectedResults = {
        Map.of("a", "Hi", "ab", "HiThere", "b", "There"),
        Map.of("a", "Hi"),
        Map.of("b", "There"),
        Map.of("c", "meh"),
        Map.of("a", "aaa", "ab", "aaabbb", "b", "bbb", "c", "ccc"),
        Map.of("ab", "nope", "b", "bbb", "c", "ccc"),
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(new HashMap<>(Map.of("a", "Hi", "b", "There"))),
            new TestResult(new HashMap<>(Map.of("a", "Hi"))),
            new TestResult(new HashMap<>(Map.of("b", "There"))),
            new TestResult(new HashMap<>(Map.of("c", "meh"))),
            new TestResult(new HashMap<>(Map.of("a", "aaa", "ab", "nope", "b", "bbb", "c", "ccc"))),
            new TestResult(new HashMap<>(Map.of("ab", "nope", "b", "bbb", "c", "ccc"))),
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
