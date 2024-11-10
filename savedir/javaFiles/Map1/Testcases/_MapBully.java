package Map1.Testcases;
import Map1.MapBully;
import java.util.Map;
import java.util.HashMap;

public final class _MapBully
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private Map<?,?> result;
        private RuntimeException caught = null;
        TestResult(Map<String, String> map) {
            try { result = MapBully.mapBully(map); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "mapBully({\"a\": \"candy\", \"b\": \"dirt\"})",
        "mapBully({\"a\": \"candy\"})",
        "mapBully({\"a\": \"candy\", \"b\": \"carrot\", \"c\": \"meh\"})",
        "mapBully({\"b\": \"carrot\"})",
        "mapBully({\"c\": \"meh\"})",
        "mapBully({\"a\": \"sparkle\", \"c\": \"meh\"})",
    };

    static final Map<?,?>[] expectedResults = {
        Map.of("a", "", "b", "candy"),
        Map.of("a", "", "b", "candy"),
        Map.of("a", "", "b", "candy", "c", "meh"),
        Map.of("b", "carrot"),
        Map.of("c", "meh"),
        Map.of("a", "", "b", "sparkle", "c", "meh"),
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(new HashMap<>(Map.of("a", "candy", "b", "dirt"))),
            new TestResult(new HashMap<>(Map.of("a", "candy"))),
            new TestResult(new HashMap<>(Map.of("a", "candy", "b", "carrot", "c", "meh"))),
            new TestResult(new HashMap<>(Map.of("b", "carrot"))),
            new TestResult(new HashMap<>(Map.of("c", "meh"))),
            new TestResult(new HashMap<>(Map.of("a", "sparkle", "c", "meh"))),
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
