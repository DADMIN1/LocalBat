package Map1.Testcases;
import Map1.Topping2;
import java.util.Map;
import java.util.HashMap;

public final class _Topping2
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;
    public static boolean suppressOutput = false;

    static final class TestResult {
        private Map<?,?> result;
        private RuntimeException caught = null;
        TestResult(Map<String, String> map) {
            try { result = Topping2.topping2(map); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90mtopping2\u001B[0;90m(\u001b[0;1m{\"ice cream\": \"cherry\"}\u001B[0m\u001b[90m)",
        "\u001b[3;90mtopping2\u001B[0;90m(\u001b[0;1m{\"spinach\": \"dirt\", \"ice cream\": \"cherry\"}\u001B[0m\u001b[90m)",
        "\u001b[3;90mtopping2\u001B[0;90m(\u001b[0;1m{\"yogurt\": \"salt\"}\u001B[0m\u001b[90m)",
        "\u001b[3;90mtopping2\u001B[0;90m(\u001b[0;1m{\"yogurt\": \"salt\", \"bread\": \"butter\"}\u001B[0m\u001b[90m)",
        "\u001b[3;90mtopping2\u001B[0;90m(\u001b[0;1m{}\u001B[0m\u001b[90m)",
        "\u001b[3;90mtopping2\u001B[0;90m(\u001b[0;1m{\"ice cream\": \"air\", \"salad\": \"oil\"}\u001B[0m\u001b[90m)",
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

        int successCount = 0;
        boolean allTestsPassed = true;
        boolean prevTestPassed = false;
        for (int i = 0; i < results.length; ++i)
        {
            if (results[i].caught != null) {
                allTestsPassed = false;
                if(suppressOutput) continue;
                if(prevTestPassed) { System.out.println(); prevTestPassed = false; }
                System.out.print("\u001b[91;1m[!]\u001B[0m \u001b[94;4m#"+(i+1)+"\u001b[0;90m - \u001B[0m");
                System.out.println(testcaseStrings[i]+" - \u001b[3;91;1mFailed!\u001B[0;91;1m \u001b[40;7m[EXCEPTION]\u001B[0m");
                System.out.println("\u001b[91;40;1m    "+results[i].caught.getClass().getName());
                System.out.println("\u001b[0;93;40m    "+results[i].caught.getMessage());
                if(getStacktraces) System.out.print("\u001b[90;3m    ");
                if(getStacktraces) results[i].caught.printStackTrace();
                System.out.println("\u001b[0m\u001B[0m"); continue;
            }
            if (!results[i].result.equals(expectedResults[i])) {
                allTestsPassed = false;
                if(suppressOutput) continue;
                if(prevTestPassed) { System.out.println(); prevTestPassed = false; }
                System.out.print("\u001b[91;1m[X]\u001B[0m \u001b[94;4m#"+(i+1)+"\u001b[0;90m - \u001B[0m");
                System.out.println(testcaseStrings[i]+" - \u001b[91;1;3mFailed!\u001B[0m");
                System.out.println("    \u001b[94;3;4mreceived:\u001B[0m \u001b[1m"+results[i].result);
                System.out.println("    \u001b[96;3;4mexpected:\u001B[0m \u001b[1m"+expectedResults[i]);
                System.out.println();
            } else if (printSuccesses && !suppressOutput) {
                successCount += 1;
                prevTestPassed = true;
                System.out.println("\u001b[92;1m[✓] \u001B[0m\u001b[94;4m#"+(i+1)+"\u001b[0;90m - \u001B[0m"+testcaseStrings[i]);
            }
        }
        if (suppressOutput) return allTestsPassed;
        if (allTestsPassed) System.out.println("\n \u001b[92;1m✓✓✓\u001B[0;1m\u001b[96;40m  ~  All tests passed  ~  \u001B[0m\u001b[92;1m✓✓✓\u001B[0m");
        else System.out.println("\n\u001b[92;1;40m "+successCount+"\u001B[0;1;40m / \u001b[94m"+results.length+"\u001b[90m tests passed \u001B[0m");
        return allTestsPassed;
    }
}
