package Map1.Testcases;
import Map1.MapShare;
import java.util.Map;
import java.util.HashMap;

public final class _MapShare
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private Map<?,?> result;
        private RuntimeException caught = null;
        TestResult(Map<String, String> map) {
            try { result = MapShare.mapShare(map); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "mapShare({\"a\": \"aaa\", \"b\": \"bbb\", \"c\": \"ccc\"})",
        "mapShare({\"b\": \"xyz\", \"c\": \"ccc\"})",
        "mapShare({\"a\": \"aaa\", \"c\": \"meh\", \"d\": \"hi\"})",
        "mapShare({\"a\": \"xyz\", \"b\": \"1234\", \"c\": \"yo\", \"z\": \"zzz\"})",
        "mapShare({\"a\": \"xyz\", \"b\": \"1234\", \"c\": \"yo\", \"d\": \"ddd\", \"e\": \"everything\"})",
    };

    static final Map<?,?>[] expectedResults = {
        Map.of("a", "aaa", "b", "aaa"),
        Map.of("b", "xyz"),
        Map.of("a", "aaa", "b", "aaa", "d", "hi"),
        Map.of("a", "xyz", "b", "xyz", "z", "zzz"),
        Map.of("a", "xyz", "b", "xyz", "d", "ddd", "e", "everything"),
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(new HashMap<>(Map.of("a", "aaa", "b", "bbb", "c", "ccc"))),
            new TestResult(new HashMap<>(Map.of("b", "xyz", "c", "ccc"))),
            new TestResult(new HashMap<>(Map.of("a", "aaa", "c", "meh", "d", "hi"))),
            new TestResult(new HashMap<>(Map.of("a", "xyz", "b", "1234", "c", "yo", "z", "zzz"))),
            new TestResult(new HashMap<>(Map.of("a", "xyz", "b", "1234", "c", "yo", "d", "ddd", "e", "everything"))),
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
