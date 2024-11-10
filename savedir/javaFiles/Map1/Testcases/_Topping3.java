package Map1.Testcases;
import Map1.Topping3;
import java.util.Map;
import java.util.HashMap;

public final class _Topping3
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private Map<?,?> result;
        private RuntimeException caught = null;
        TestResult(Map<String, String> map) {
            try { result = Topping3.topping3(map); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "topping3({\"potato\": \"ketchup\"})",
        "topping3({\"potato\": \"butter\"})",
        "topping3({\"salad\": \"oil\", \"potato\": \"ketchup\"})",
        "topping3({\"toast\": \"butter\", \"salad\": \"oil\", \"potato\": \"ketchup\"})",
        "topping3({})",
        "topping3({\"salad\": \"pepper\", \"fries\": \"salt\"})",
    };

    static final Map<?,?>[] expectedResults = {
        Map.of("potato", "ketchup", "fries", "ketchup"),
        Map.of("potato", "butter", "fries", "butter"),
        Map.of("spinach", "oil", "salad", "oil", "potato", "ketchup", "fries", "ketchup"),
        Map.of("toast", "butter", "spinach", "oil", "salad", "oil", "potato", "ketchup", "fries", "ketchup"),
        Map.of(),
        Map.of("spinach", "pepper", "salad", "pepper", "fries", "salt"),
    };

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult(new HashMap<>(Map.of("potato", "ketchup"))),
            new TestResult(new HashMap<>(Map.of("potato", "butter"))),
            new TestResult(new HashMap<>(Map.of("salad", "oil", "potato", "ketchup"))),
            new TestResult(new HashMap<>(Map.of("toast", "butter", "salad", "oil", "potato", "ketchup"))),
            new TestResult(new HashMap<>(Map.of())),
            new TestResult(new HashMap<>(Map.of("salad", "pepper", "fries", "salt"))),
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
