package Map1.Testcases;
import Map1.Topping1;
import java.util.Map;
import java.util.HashMap;

public final class _Topping1
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private Map<?,?> result;
        private RuntimeException caught = null;
        TestResult(Map<String, String> map) {
            try { result = Topping1.topping1(map); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "topping1({\"ice cream\": \"peanuts\"})",
        "topping1({})",
        "topping1({\"pancake\": \"syrup\"})",
        "topping1({\"bread\": \"dirt\", \"ice cream\": \"strawberries\"})",
        "topping1({\"bread\": \"jam\", \"ice cream\": \"strawberries\", \"salad\": \"oil\"})",
    };

    static final Map<?,?>[] expectedResults = {
        Map.of("bread", "butter", "ice cream", "cherry"),
        Map.of("bread", "butter"),
        Map.of("bread", "butter", "pancake", "syrup"),
        Map.of("bread", "butter", "ice cream", "cherry"),
        Map.of("bread", "butter", "ice cream", "cherry", "salad", "oil"),
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(new HashMap<>(Map.of("ice cream", "peanuts"))),
            new TestResult(new HashMap<>(Map.of())),
            new TestResult(new HashMap<>(Map.of("pancake", "syrup"))),
            new TestResult(new HashMap<>(Map.of("bread", "dirt", "ice cream", "strawberries"))),
            new TestResult(new HashMap<>(Map.of("bread", "jam", "ice cream", "strawberries", "salad", "oil"))),
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
