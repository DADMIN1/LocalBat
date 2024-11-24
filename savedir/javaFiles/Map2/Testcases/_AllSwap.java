package Map2.Testcases;
import Map2.AllSwap;
import java.util.Arrays;
import java.util.ArrayList;

public final class _AllSwap
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;
    public static boolean suppressOutput = false;

    static final class TestResult {
        private String[] result;
        private RuntimeException caught = null;
        TestResult(String[] strings) {
            try { result = AllSwap.allSwap(strings); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "\u001b[3;90mallSwap\u001B[0;90m(\u001b[0;1m[\"ab\", \"ac\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mallSwap\u001B[0;90m(\u001b[0;1m[\"ax\", \"bx\", \"cx\", \"cy\", \"by\", \"ay\", \"aaa\", \"azz\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mallSwap\u001B[0;90m(\u001b[0;1m[\"ax\", \"bx\", \"ay\", \"by\", \"ai\", \"aj\", \"bx\", \"by\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mallSwap\u001B[0;90m(\u001b[0;1m[\"ax\", \"bx\", \"cx\", \"ay\", \"cy\", \"aaa\", \"abb\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mallSwap\u001B[0;90m(\u001b[0;1m[\"easy\", \"does\", \"it\", \"every\", \"ice\", \"eaten\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mallSwap\u001B[0;90m(\u001b[0;1m[\"list\", \"of\", \"words\", \"swims\", \"over\", \"lily\", \"water\", \"wait\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mallSwap\u001B[0;90m(\u001b[0;1m[\"4\", \"8\", \"15\", \"16\", \"23\", \"42\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mallSwap\u001B[0;90m(\u001b[0;1m[\"aaa\"]\u001B[0m\u001b[90m)",
        "\u001b[3;90mallSwap\u001B[0;90m(\u001b[0;1m[]\u001B[0m\u001b[90m)",
        "\u001b[3;90mallSwap\u001B[0;90m(\u001b[0;1m[\"a\", \"b\", \"c\", \"xx\", \"yy\", \"zz\"]\u001B[0m\u001b[90m)",
    };

    static final String[][] expectedResults = {
        {"ac", "ab"},
        {"ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"},
        {"ay", "by", "ax", "bx", "aj", "ai", "by", "bx"},
        {"ay", "bx", "cy", "ax", "cx", "abb", "aaa"},
        {"every", "does", "ice", "easy", "it", "eaten"},
        {"lily", "over", "water", "swims", "of", "list", "words", "wait"},
        {"42", "8", "16", "15", "23", "4"},
        {"aaa"},
        {},
        {"a", "b", "c", "xx", "yy", "zz"},
    };

    public static final String printArray(String[] array)
    {
        String result = "[";
        for (String a: array) { result += a+", "; }
        if (result.length() > 2) result = result.substring(0, result.length()-2);
        return result + "]";
    }

    public static final boolean Validate()
    {
        final String[] strings0 = {"ab", "ac"}; 
        final String[] strings1 = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"}; 
        final String[] strings2 = {"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"}; 
        final String[] strings3 = {"ax", "bx", "cx", "ay", "cy", "aaa", "abb"}; 
        final String[] strings4 = {"easy", "does", "it", "every", "ice", "eaten"}; 
        final String[] strings5 = {"list", "of", "words", "swims", "over", "lily", "water", "wait"}; 
        final String[] strings6 = {"4", "8", "15", "16", "23", "42"}; 
        final String[] strings7 = {"aaa"}; 
        final String[] strings8 = {}; 
        final String[] strings9 = {"a", "b", "c", "xx", "yy", "zz"}; 

        final TestResult[] results = {
            new TestResult(strings0),
            new TestResult(strings1),
            new TestResult(strings2),
            new TestResult(strings3),
            new TestResult(strings4),
            new TestResult(strings5),
            new TestResult(strings6),
            new TestResult(strings7),
            new TestResult(strings8),
            new TestResult(strings9),
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
            if (!Arrays.equals(results[i].result, expectedResults[i])) {
                allTestsPassed = false;
                if(suppressOutput) continue;
                if(prevTestPassed) { System.out.println(); prevTestPassed = false; }
                System.out.print("\u001b[91;1m[X]\u001B[0m \u001b[94;4m#"+(i+1)+"\u001b[0;90m - \u001B[0m");
                System.out.println(testcaseStrings[i]+" - \u001b[91;1;3mFailed!\u001B[0m");
                System.out.println("    \u001b[94;3;4mreceived:\u001B[0m \u001b[1m"+printArray(results[i].result));
                System.out.println("    \u001b[96;3;4mexpected:\u001B[0m \u001b[1m"+printArray(expectedResults[i]));
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
