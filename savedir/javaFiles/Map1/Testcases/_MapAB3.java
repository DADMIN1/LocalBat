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
        "\u001b[3;90mmapAB3\u001B[0;90m(\u001b[0;1m{\"a\": \"aaa\", \"c\": \"cake\"}\u001B[0m\u001b[90m)",
        "\u001b[3;90mmapAB3\u001B[0;90m(\u001b[0;1m{\"b\": \"bbb\", \"c\": \"cake\"}\u001B[0m\u001b[90m)",
        "\u001b[3;90mmapAB3\u001B[0;90m(\u001b[0;1m{\"a\": \"aaa\", \"b\": \"bbb\", \"c\": \"cake\"}\u001B[0m\u001b[90m)",
        "\u001b[3;90mmapAB3\u001B[0;90m(\u001b[0;1m{\"ccc\": \"ccc\"}\u001B[0m\u001b[90m)",
        "\u001b[3;90mmapAB3\u001B[0;90m(\u001b[0;1m{\"c\": \"a\", \"d\": \"b\"}\u001B[0m\u001b[90m)",
        "\u001b[3;90mmapAB3\u001B[0;90m(\u001b[0;1m{}\u001B[0m\u001b[90m)",
        "\u001b[3;90mmapAB3\u001B[0;90m(\u001b[0;1m{\"a\": \"\"}\u001B[0m\u001b[90m)",
        "\u001b[3;90mmapAB3\u001B[0;90m(\u001b[0;1m{\"b\": \"\"}\u001B[0m\u001b[90m)",
        "\u001b[3;90mmapAB3\u001B[0;90m(\u001b[0;1m{\"a\": \"\", \"b\": \"\"}\u001B[0m\u001b[90m)",
        "\u001b[3;90mmapAB3\u001B[0;90m(\u001b[0;1m{\"aa\": \"aa\", \"a\": \"apple\", \"z\": \"zzz\"}\u001B[0m\u001b[90m)",
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
