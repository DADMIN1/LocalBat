package Map2.Testcases;
import Map2.FirstSwap;
import java.util.Arrays;
import java.util.ArrayList;

public final class _FirstSwap
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String[] result;
        private RuntimeException caught = null;
        TestResult(String[] strings) {
            try { result = FirstSwap.firstSwap(strings); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "firstSwap([\"ab\", \"ac\"])",
        "firstSwap([\"ax\", \"bx\", \"cx\", \"cy\", \"by\", \"ay\", \"aaa\", \"azz\"])",
        "firstSwap([\"ax\", \"bx\", \"ay\", \"by\", \"ai\", \"aj\", \"bx\", \"by\"])",
        "firstSwap([\"ax\", \"bx\", \"cx\", \"ay\", \"cy\", \"aaa\", \"abb\"])",
        "firstSwap([\"easy\", \"does\", \"it\", \"every\", \"ice\", \"eaten\"])",
        "firstSwap([\"list\", \"of\", \"words\", \"swims\", \"over\", \"lily\", \"water\", \"wait\"])",
        "firstSwap([\"4\", \"8\", \"15\", \"16\", \"23\", \"42\"])",
        "firstSwap([\"aaa\"])",
        "firstSwap([])",
        "firstSwap([\"a\", \"b\", \"c\", \"xx\", \"yy\", \"zz\"])",
    };

    static final String[][] expectedResults = {
        {"ac", "ab"},
        {"ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"},
        {"ay", "by", "ax", "bx", "ai", "aj", "bx", "by"},
        {"ay", "bx", "cy", "ax", "cx", "aaa", "abb"},
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
            if (!Arrays.equals(results[i].result, expectedResults[i])) {
                allTestsPassed = false;
                if(prevTestPassed) { System.out.println(); prevTestPassed = false; }
                System.out.print("[x] #"+(i+1)+" - ");
                System.out.println(testcaseStrings[i]+" - Failed!");
                System.out.println("    received: "+printArray(results[i].result));
                System.out.println("    expected: "+printArray(expectedResults[i]));
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
