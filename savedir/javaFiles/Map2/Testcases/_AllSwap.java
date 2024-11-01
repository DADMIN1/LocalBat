package Map2.Testcases;
import Map2.AllSwap;
import java.util.Arrays;
import java.util.ArrayList;

public final class _AllSwap
{
    static final String[] testcaseStrings = {
        "allSwap([\"ab\", \"ac\"])",
        "allSwap([\"ax\", \"bx\", \"cx\", \"cy\", \"by\", \"ay\", \"aaa\", \"azz\"])",
        "allSwap([\"ax\", \"bx\", \"ay\", \"by\", \"ai\", \"aj\", \"bx\", \"by\"])",
        "allSwap([\"ax\", \"bx\", \"cx\", \"ay\", \"cy\", \"aaa\", \"abb\"])",
        "allSwap([\"easy\", \"does\", \"it\", \"every\", \"ice\", \"eaten\"])",
        "allSwap([\"list\", \"of\", \"words\", \"swims\", \"over\", \"lily\", \"water\", \"wait\"])",
        "allSwap([\"4\", \"8\", \"15\", \"16\", \"23\", \"42\"])",
        "allSwap([\"aaa\"])",
        "allSwap([])",
        "allSwap([\"a\", \"b\", \"c\", \"xx\", \"yy\", \"zz\"])",
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
            AllSwap.allSwap(strings0),
            AllSwap.allSwap(strings1),
            AllSwap.allSwap(strings2),
            AllSwap.allSwap(strings3),
            AllSwap.allSwap(strings4),
            AllSwap.allSwap(strings5),
            AllSwap.allSwap(strings6),
            AllSwap.allSwap(strings7),
            AllSwap.allSwap(strings8),
            AllSwap.allSwap(strings9),
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
