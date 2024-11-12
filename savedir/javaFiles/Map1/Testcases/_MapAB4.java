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
        "\u001b[3;90mmapAB4\u001B[0;90m(\u001b[0;1m{\"a\": \"aaa\", \"b\": \"bb\", \"c\": \"cake\"}\u001B[0m\u001b[90m)",
        "\u001b[3;90mmapAB4\u001B[0;90m(\u001b[0;1m{\"a\": \"aa\", \"b\": \"bbb\", \"c\": \"cake\"}\u001B[0m\u001b[90m)",
        "\u001b[3;90mmapAB4\u001B[0;90m(\u001b[0;1m{\"a\": \"aa\", \"b\": \"bbb\"}\u001B[0m\u001b[90m)",
        "\u001b[3;90mmapAB4\u001B[0;90m(\u001b[0;1m{\"a\": \"aaa\"}\u001B[0m\u001b[90m)",
        "\u001b[3;90mmapAB4\u001B[0;90m(\u001b[0;1m{\"b\": \"bbb\"}\u001B[0m\u001b[90m)",
        "\u001b[3;90mmapAB4\u001B[0;90m(\u001b[0;1m{\"a\": \"aaa\", \"b\": \"bbb\", \"c\": \"cake\"}\u001B[0m\u001b[90m)",
        "\u001b[3;90mmapAB4\u001B[0;90m(\u001b[0;1m{\"a\": \"a\", \"b\": \"b\", \"c\": \"cake\"}\u001B[0m\u001b[90m)",
        "\u001b[3;90mmapAB4\u001B[0;90m(\u001b[0;1m{\"a\": \"\", \"b\": \"b\", \"c\": \"cake\"}\u001B[0m\u001b[90m)",
        "\u001b[3;90mmapAB4\u001B[0;90m(\u001b[0;1m{\"a\": \"a\", \"b\": \"\", \"c\": \"cake\"}\u001B[0m\u001b[90m)",
        "\u001b[3;90mmapAB4\u001B[0;90m(\u001b[0;1m{\"c\": \"cat\", \"d\": \"dog\"}\u001B[0m\u001b[90m)",
        "\u001b[3;90mmapAB4\u001B[0;90m(\u001b[0;1m{\"ccc\": \"ccc\"}\u001B[0m\u001b[90m)",
        "\u001b[3;90mmapAB4\u001B[0;90m(\u001b[0;1m{\"c\": \"a\", \"d\": \"b\"}\u001B[0m\u001b[90m)",
        "\u001b[3;90mmapAB4\u001B[0;90m(\u001b[0;1m{}\u001B[0m\u001b[90m)",
        "\u001b[3;90mmapAB4\u001B[0;90m(\u001b[0;1m{\"a\": \"\", \"z\": \"z\"}\u001B[0m\u001b[90m)",
        "\u001b[3;90mmapAB4\u001B[0;90m(\u001b[0;1m{\"b\": \"\", \"z\": \"z\"}\u001B[0m\u001b[90m)",
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
