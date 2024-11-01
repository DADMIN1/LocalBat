package Map2.Testcases;
import Map2.FirstSwap;
import java.util.Arrays;
import java.util.ArrayList;

public final class _FirstSwap
{
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

    public static final void Validate(boolean printSuccess)
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

        final String[][] resultsArray = {
            FirstSwap.firstSwap(strings0),
            FirstSwap.firstSwap(strings1),
            FirstSwap.firstSwap(strings2),
            FirstSwap.firstSwap(strings3),
            FirstSwap.firstSwap(strings4),
            FirstSwap.firstSwap(strings5),
            FirstSwap.firstSwap(strings6),
            FirstSwap.firstSwap(strings7),
            FirstSwap.firstSwap(strings8),
            FirstSwap.firstSwap(strings9),
        };

        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (!Arrays.equals(resultsArray[i], expectedResults[i]))
            {
                allTestsPassed = false;
                System.out.println("\n[-] #"+(i+1)+" failed!");
                System.out.println(testcaseStrings[i]+";");
                System.out.println("    received: "+printArray(resultsArray[i]));
                System.out.println("    expected: "+printArray(expectedResults[i]));
                System.out.println("\n");
            } else if (printSuccess) { 
                System.out.println("[✔] #"+(i+1)+" - "+testcaseStrings[i]);
            }
        }
        if (allTestsPassed) System.out.println("\n ✔✔✔  ~ All tests passed. ~  ✔✔✔");
        System.out.println();
        return;
    }
}
