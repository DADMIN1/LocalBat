package Map1.Testcases;
import Map1.MapAB3;
import java.util.Map;
import java.util.HashMap;

public final class _MapAB3
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private Map<?,?> result;
        private RuntimeException caught = null;
        TestResult(Map<String, String> map) {
            try { result = MapAB3.mapAB3(map); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "mapAB3({\"a\": \"aaa\", \"c\": \"cake\"})",
        "mapAB3({\"b\": \"bbb\", \"c\": \"cake\"})",
        "mapAB3({\"a\": \"aaa\", \"b\": \"bbb\", \"c\": \"cake\"})",
        "mapAB3({\"ccc\": \"ccc\"})",
        "mapAB3({\"c\": \"a\", \"d\": \"b\"})",
        "mapAB3({})",
        "mapAB3({\"a\": \"\"})",
        "mapAB3({\"b\": \"\"})",
        "mapAB3({\"a\": \"\", \"b\": \"\"})",
        "mapAB3({\"aa\": \"aa\", \"a\": \"apple\", \"z\": \"zzz\"})",
    };

    static final Map<?,?>[] expectedResults = {
        Map.of("a", "aaa", "b", "aaa", "c", "cake"),
        Map.of("a", "bbb", "b", "bbb", "c", "cake"),
        Map.of("a", "aaa", "b", "bbb", "c", "cake"),
        Map.of("ccc", "ccc"),
        Map.of("c", "a", "d", "b"),
        Map.of(),
        Map.of("a", "", "b", ""),
        Map.of("a", "", "b", ""),
        Map.of("a", "", "b", ""),
        Map.of("aa", "aa", "a", "apple", "b", "apple", "z", "zzz"),
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(new HashMap<>(Map.of("a", "aaa", "c", "cake"))),
            new TestResult(new HashMap<>(Map.of("b", "bbb", "c", "cake"))),
            new TestResult(new HashMap<>(Map.of("a", "aaa", "b", "bbb", "c", "cake"))),
            new TestResult(new HashMap<>(Map.of("ccc", "ccc"))),
            new TestResult(new HashMap<>(Map.of("c", "a", "d", "b"))),
            new TestResult(new HashMap<>(Map.of())),
            new TestResult(new HashMap<>(Map.of("a", ""))),
            new TestResult(new HashMap<>(Map.of("b", ""))),
            new TestResult(new HashMap<>(Map.of("a", "", "b", ""))),
            new TestResult(new HashMap<>(Map.of("aa", "aa", "a", "apple", "z", "zzz"))),
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
