package Map1.Testcases;
import Map1.MapAB2;
import java.util.Map;
import java.util.HashMap;

public final class _MapAB2
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private Map<?,?> result;
        private RuntimeException caught = null;
        TestResult(Map<String, String> map) {
            try { result = MapAB2.mapAB2(map); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "mapAB2({\"a\": \"aaa\", \"b\": \"aaa\", \"c\": \"cake\"})",
        "mapAB2({\"a\": \"aaa\", \"b\": \"bbb\"})",
        "mapAB2({\"a\": \"aaa\", \"b\": \"bbb\", \"c\": \"aaa\"})",
        "mapAB2({\"a\": \"aaa\"})",
        "mapAB2({\"b\": \"bbb\"})",
        "mapAB2({\"a\": \"\", \"b\": \"\", \"c\": \"ccc\"})",
        "mapAB2({})",
        "mapAB2({\"a\": \"a\", \"b\": \"b\", \"z\": \"zebra\"})",
    };

    static final Map<?,?>[] expectedResults = {
        Map.of("c", "cake"),
        Map.of("a", "aaa", "b", "bbb"),
        Map.of("a", "aaa", "b", "bbb", "c", "aaa"),
        Map.of("a", "aaa"),
        Map.of("b", "bbb"),
        Map.of("c", "ccc"),
        Map.of(),
        Map.of("a", "a", "b", "b", "z", "zebra"),
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(new HashMap<>(Map.of("a", "aaa", "b", "aaa", "c", "cake"))),
            new TestResult(new HashMap<>(Map.of("a", "aaa", "b", "bbb"))),
            new TestResult(new HashMap<>(Map.of("a", "aaa", "b", "bbb", "c", "aaa"))),
            new TestResult(new HashMap<>(Map.of("a", "aaa"))),
            new TestResult(new HashMap<>(Map.of("b", "bbb"))),
            new TestResult(new HashMap<>(Map.of("a", "", "b", "", "c", "ccc"))),
            new TestResult(new HashMap<>(Map.of())),
            new TestResult(new HashMap<>(Map.of("a", "a", "b", "b", "z", "zebra"))),
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
