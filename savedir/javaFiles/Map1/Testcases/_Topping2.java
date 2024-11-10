package Map1.Testcases;
import Map1.Topping2;
import java.util.Map;
import java.util.HashMap;

public final class _Topping2
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private Map<?,?> result;
        private RuntimeException caught = null;
        TestResult(Map<String, String> map) {
            try { result = Topping2.topping2(map); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "topping2({\"ice cream\": \"cherry\"})",
        "topping2({\"spinach\": \"dirt\", \"ice cream\": \"cherry\"})",
        "topping2({\"yogurt\": \"salt\"})",
        "topping2({\"yogurt\": \"salt\", \"bread\": \"butter\"})",
        "topping2({})",
        "topping2({\"ice cream\": \"air\", \"salad\": \"oil\"})",
    };

    static final Map<?,?>[] expectedResults = {
        Map.of("yogurt", "cherry", "ice cream", "cherry"),
        Map.of("yogurt", "cherry", "spinach", "nuts", "ice cream", "cherry"),
        Map.of("yogurt", "salt"),
        Map.of("yogurt", "salt", "bread", "butter"),
        Map.of(),
        Map.of("yogurt", "air", "ice cream", "air", "salad", "oil"),
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(new HashMap<>(Map.of("ice cream", "cherry"))),
            new TestResult(new HashMap<>(Map.of("spinach", "dirt", "ice cream", "cherry"))),
            new TestResult(new HashMap<>(Map.of("yogurt", "salt"))),
            new TestResult(new HashMap<>(Map.of("yogurt", "salt", "bread", "butter"))),
            new TestResult(new HashMap<>(Map.of())),
            new TestResult(new HashMap<>(Map.of("ice cream", "air", "salad", "oil"))),
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
