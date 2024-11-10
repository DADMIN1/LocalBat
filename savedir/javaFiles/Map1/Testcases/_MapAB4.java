package Map1.Testcases;
import Map1.MapAB4;
import java.util.Map;
import java.util.HashMap;

public final class _MapAB4
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private Map<?,?> result;
        private RuntimeException caught = null;
        TestResult(Map<String, String> map) {
            try { result = MapAB4.mapAB4(map); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "mapAB4({\"a\": \"aaa\", \"b\": \"bb\", \"c\": \"cake\"})",
        "mapAB4({\"a\": \"aa\", \"b\": \"bbb\", \"c\": \"cake\"})",
        "mapAB4({\"a\": \"aa\", \"b\": \"bbb\"})",
        "mapAB4({\"a\": \"aaa\"})",
        "mapAB4({\"b\": \"bbb\"})",
        "mapAB4({\"a\": \"aaa\", \"b\": \"bbb\", \"c\": \"cake\"})",
        "mapAB4({\"a\": \"a\", \"b\": \"b\", \"c\": \"cake\"})",
        "mapAB4({\"a\": \"\", \"b\": \"b\", \"c\": \"cake\"})",
        "mapAB4({\"a\": \"a\", \"b\": \"\", \"c\": \"cake\"})",
        "mapAB4({\"c\": \"cat\", \"d\": \"dog\"})",
        "mapAB4({\"ccc\": \"ccc\"})",
        "mapAB4({\"c\": \"a\", \"d\": \"b\"})",
        "mapAB4({})",
        "mapAB4({\"a\": \"\", \"z\": \"z\"})",
        "mapAB4({\"b\": \"\", \"z\": \"z\"})",
    };

    static final Map<?,?>[] expectedResults = {
        Map.of("a", "aaa", "b", "bb", "c", "aaa"),
        Map.of("a", "aa", "b", "bbb", "c", "bbb"),
        Map.of("a", "aa", "b", "bbb", "c", "bbb"),
        Map.of("a", "aaa"),
        Map.of("b", "bbb"),
        Map.of("a", "", "b", "", "c", "cake"),
        Map.of("a", "", "b", "", "c", "cake"),
        Map.of("a", "", "b", "b", "c", "b"),
        Map.of("a", "a", "b", "", "c", "a"),
        Map.of("c", "cat", "d", "dog"),
        Map.of("ccc", "ccc"),
        Map.of("c", "a", "d", "b"),
        Map.of(),
        Map.of("a", "", "z", "z"),
        Map.of("b", "", "z", "z"),
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(new HashMap<>(Map.of("a", "aaa", "b", "bb", "c", "cake"))),
            new TestResult(new HashMap<>(Map.of("a", "aa", "b", "bbb", "c", "cake"))),
            new TestResult(new HashMap<>(Map.of("a", "aa", "b", "bbb"))),
            new TestResult(new HashMap<>(Map.of("a", "aaa"))),
            new TestResult(new HashMap<>(Map.of("b", "bbb"))),
            new TestResult(new HashMap<>(Map.of("a", "aaa", "b", "bbb", "c", "cake"))),
            new TestResult(new HashMap<>(Map.of("a", "a", "b", "b", "c", "cake"))),
            new TestResult(new HashMap<>(Map.of("a", "", "b", "b", "c", "cake"))),
            new TestResult(new HashMap<>(Map.of("a", "a", "b", "", "c", "cake"))),
            new TestResult(new HashMap<>(Map.of("c", "cat", "d", "dog"))),
            new TestResult(new HashMap<>(Map.of("ccc", "ccc"))),
            new TestResult(new HashMap<>(Map.of("c", "a", "d", "b"))),
            new TestResult(new HashMap<>(Map.of())),
            new TestResult(new HashMap<>(Map.of("a", "", "z", "z"))),
            new TestResult(new HashMap<>(Map.of("b", "", "z", "z"))),
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
