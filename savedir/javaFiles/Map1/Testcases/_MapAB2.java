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
        "\u001b[3;90mmapAB2\u001B[0;90m(\u001b[0;1m{\"a\": \"aaa\", \"b\": \"aaa\", \"c\": \"cake\"}\u001B[0m\u001b[90m)",
        "\u001b[3;90mmapAB2\u001B[0;90m(\u001b[0;1m{\"a\": \"aaa\", \"b\": \"bbb\"}\u001B[0m\u001b[90m)",
        "\u001b[3;90mmapAB2\u001B[0;90m(\u001b[0;1m{\"a\": \"aaa\", \"b\": \"bbb\", \"c\": \"aaa\"}\u001B[0m\u001b[90m)",
        "\u001b[3;90mmapAB2\u001B[0;90m(\u001b[0;1m{\"a\": \"aaa\"}\u001B[0m\u001b[90m)",
        "\u001b[3;90mmapAB2\u001B[0;90m(\u001b[0;1m{\"b\": \"bbb\"}\u001B[0m\u001b[90m)",
        "\u001b[3;90mmapAB2\u001B[0;90m(\u001b[0;1m{\"a\": \"\", \"b\": \"\", \"c\": \"ccc\"}\u001B[0m\u001b[90m)",
        "\u001b[3;90mmapAB2\u001B[0;90m(\u001b[0;1m{}\u001B[0m\u001b[90m)",
        "\u001b[3;90mmapAB2\u001B[0;90m(\u001b[0;1m{\"a\": \"a\", \"b\": \"b\", \"z\": \"zebra\"}\u001B[0m\u001b[90m)",
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

        int successCount = 0;
        boolean allTestsPassed = true;
        boolean prevTestPassed = false;
        for (int i = 0; i < results.length; ++i)
        {
            if (results[i].caught != null) {
                allTestsPassed = false;
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
                if(prevTestPassed) { System.out.println(); prevTestPassed = false; }
                System.out.print("\u001b[91;1m[X]\u001B[0m \u001b[94;4m#"+(i+1)+"\u001b[0;90m - \u001B[0m");
                System.out.println(testcaseStrings[i]+" - \u001b[91;1;3mFailed!\u001B[0m");
                System.out.println("    \u001b[94;3;4mreceived:\u001B[0m \u001b[1m"+results[i].result);
                System.out.println("    \u001b[96;3;4mexpected:\u001B[0m \u001b[1m"+expectedResults[i]);
                System.out.println();
            } else if (printSuccesses) {
                successCount += 1;
                prevTestPassed = true;
                System.out.println("\u001b[92;1m[✓] \u001B[0m\u001b[94;4m#"+(i+1)+"\u001b[0;90m - \u001B[0m"+testcaseStrings[i]);
            }
        }
        if (allTestsPassed) System.out.println("\n \u001b[92;1m✓✓✓\u001B[0;1m\u001b[96;40m  ~  All tests passed  ~  \u001B[0m\u001b[92;1m✓✓✓\u001B[0m");
        else System.out.println("\n\u001b[92;1;40m "+successCount+"\u001B[0;1;40m / \u001b[94m"+results.length+"\u001b[90m tests passed \u001B[0m");
        return allTestsPassed;
    }
}
