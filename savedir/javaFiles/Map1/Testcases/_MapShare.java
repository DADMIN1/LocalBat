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
        "\u001b[3;30mmapShare\u001B[0;30m(\u001b[0;1m{\"a\": \"aaa\", \"b\": \"bbb\", \"c\": \"ccc\"}\u001B[0m\u001b[30m)",
        "\u001b[3;30mmapShare\u001B[0;30m(\u001b[0;1m{\"b\": \"xyz\", \"c\": \"ccc\"}\u001B[0m\u001b[30m)",
        "\u001b[3;30mmapShare\u001B[0;30m(\u001b[0;1m{\"a\": \"aaa\", \"c\": \"meh\", \"d\": \"hi\"}\u001B[0m\u001b[30m)",
        "\u001b[3;30mmapShare\u001B[0;30m(\u001b[0;1m{\"a\": \"xyz\", \"b\": \"1234\", \"c\": \"yo\", \"z\": \"zzz\"}\u001B[0m\u001b[30m)",
        "\u001b[3;30mmapShare\u001B[0;30m(\u001b[0;1m{\"a\": \"xyz\", \"b\": \"1234\", \"c\": \"yo\", \"d\": \"ddd\", \"e\": \"everything\"}\u001B[0m\u001b[30m)",
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

        int successCount = 0;
        boolean allTestsPassed = true;
        boolean prevTestPassed = false;
        for (int i = 0; i < results.length; ++i)
        {
            if (results[i].caught != null) {
                allTestsPassed = false;
                if(prevTestPassed) { System.out.println(); prevTestPassed = false; }
                System.out.print("\u001b[31;1m[!]\u001B[0m \u001b[34;4m#"+(i+1)+"\u001b[0;30m - \u001B[0m");
                System.out.println(testcaseStrings[i]+" - \u001b[3;31;1mFailed!\u001B[0;31;1m \u001b[40;7m[EXCEPTION]\u001B[0m");
                System.out.println("\u001b[31;40;1m"+results[i].caught.getClass().getName());
                System.out.println("\u001b[0;33;40m"+results[i].caught.getMessage());
                if(getStacktraces) System.out.print("\u001b[30;3m");
                if(getStacktraces) results[i].caught.printStackTrace();
                System.out.println("\u001b[0m\u001B[0m"); continue;
            }
            if (!results[i].result.equals(expectedResults[i])) {
                allTestsPassed = false;
                if(prevTestPassed) { System.out.println(); prevTestPassed = false; }
                System.out.print("\u001b[31;1m[X]\u001B[0m \u001b[34;4m#"+(i+1)+"\u001b[0;30m - \u001B[0m");
                System.out.println(testcaseStrings[i]+" - \u001b[31;1;3mFailed!\u001B[0m");
                System.out.println("    \u001b[34;3;4mreceived:\u001B[0m \u001b[1m"+results[i].result);
                System.out.println("    \u001b[36;3;4mexpected:\u001B[0m \u001b[1m"+expectedResults[i]);
                System.out.println();
            } else if (printSuccesses) {
                successCount += 1;
                prevTestPassed = true;
                System.out.println("\u001b[32;1m[✓] \u001B[0m\u001b[34;4m#"+(i+1)+"\u001b[0;30m - \u001B[0m"+testcaseStrings[i]);
            }
        }
        if (allTestsPassed) System.out.println("\n \u001b[32;1m✓✓✓\u001B[0;1m\u001b[36;40m  ~  All tests passed  ~  \u001B[0m\u001b[32;1m✓✓✓\u001B[0m");
        else System.out.println("\n\u001b[32;1;40m "+successCount+"\u001B[0;1;40m / \u001b[34m"+results.length+"\u001b[30m tests passed \u001B[0m");
        return allTestsPassed;
    }
}
