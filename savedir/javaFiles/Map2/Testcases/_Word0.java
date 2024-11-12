package Map2.Testcases;
import Map2.Word0;
import java.util.Map;
import java.util.HashMap;

public final class _Word0
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private Map<?,?> result;
        private RuntimeException caught = null;
        TestResult(String[] strings) {
            try { result = Word0.word0(strings); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90mword0\u001B[0;90m(\u001b[0;1m[\"a\", \"b\", \"a\", \"b\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mword0\u001B[0;90m(\u001b[0;1m[\"a\", \"b\", \"a\", \"c\", \"b\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mword0\u001B[0;90m(\u001b[0;1m[\"c\", \"b\", \"a\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mword0\u001B[0;90m(\u001b[0;1m[\"c\", \"c\", \"c\", \"c\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mword0\u001B[0;90m(\u001b[0;1m[]\u001B[0m\u001b[90m)",
    };

    static final Map<?,?>[] expectedResults = {
        Map.of("a", 0, "b", 0),
        Map.of("a", 0, "b", 0, "c", 0),
        Map.of("a", 0, "b", 0, "c", 0),
        Map.of("c", 0),
        Map.of(),
    };

    public static final boolean Validate()
    {
        final String[] strings0 = {"a", "b", "a", "b"}; 
        final String[] strings1 = {"a", "b", "a", "c", "b"}; 
        final String[] strings2 = {"c", "b", "a"}; 
        final String[] strings3 = {"c", "c", "c", "c"}; 
        final String[] strings4 = {}; 

        final TestResult[] results = {
            new TestResult(strings0),
            new TestResult(strings1),
            new TestResult(strings2),
            new TestResult(strings3),
            new TestResult(strings4),
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
