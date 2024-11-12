package Map2.Testcases;
import Map2.Pairs;
import java.util.Map;
import java.util.HashMap;

public final class _Pairs
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private Map<?,?> result;
        private RuntimeException caught = null;
        TestResult(String[] strings) {
            try { result = Pairs.pairs(strings); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;30mpairs\u001B[0;30m(\u001b[0;1m[\"code\", \"bug\"]\u001B[0m\u001b[30m)",
        "\u001b[3;30mpairs\u001B[0;30m(\u001b[0;1m[\"man\", \"moon\", \"main\"]\u001B[0m\u001b[30m)",
        "\u001b[3;30mpairs\u001B[0;30m(\u001b[0;1m[\"man\", \"moon\", \"good\", \"night\"]\u001B[0m\u001b[30m)",
        "\u001b[3;30mpairs\u001B[0;30m(\u001b[0;1m[]\u001B[0m\u001b[30m)",
        "\u001b[3;30mpairs\u001B[0;30m(\u001b[0;1m[\"a\", \"b\"]\u001B[0m\u001b[30m)",
        "\u001b[3;30mpairs\u001B[0;30m(\u001b[0;1m[\"are\", \"codes\", \"and\", \"cods\"]\u001B[0m\u001b[30m)",
        "\u001b[3;30mpairs\u001B[0;30m(\u001b[0;1m[\"apple\", \"banana\", \"tea\", \"coffee\"]\u001B[0m\u001b[30m)",
    };

    static final Map<?,?>[] expectedResults = {
        Map.of("b", "g", "c", "e"),
        Map.of("m", "n"),
        Map.of("g", "d", "m", "n", "n", "t"),
        Map.of(),
        Map.of("a", "a", "b", "b"),
        Map.of("a", "d", "c", "s"),
        Map.of("a", "e", "b", "a", "c", "e", "t", "a"),
    };

    public static final boolean Validate()
    {
        final String[] strings0 = {"code", "bug"}; 
        final String[] strings1 = {"man", "moon", "main"}; 
        final String[] strings2 = {"man", "moon", "good", "night"}; 
        final String[] strings3 = {}; 
        final String[] strings4 = {"a", "b"}; 
        final String[] strings5 = {"are", "codes", "and", "cods"}; 
        final String[] strings6 = {"apple", "banana", "tea", "coffee"}; 

        final TestResult[] results = {
            new TestResult(strings0),
            new TestResult(strings1),
            new TestResult(strings2),
            new TestResult(strings3),
            new TestResult(strings4),
            new TestResult(strings5),
            new TestResult(strings6),
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
