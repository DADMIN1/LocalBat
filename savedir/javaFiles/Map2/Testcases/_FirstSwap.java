package Map2.Testcases;
import Map2.FirstSwap;
import java.util.Arrays;

public class _FirstSwap
{
    static String[] testcaseStrings = {
        "firstSwap([\"ab\", \"ac\"])",
        "firstSwap([\"ax\", \"bx\", \"cx\", \"cy\", \"by\", \"ay\", \"aaa\", \"azz\"])",
        "firstSwap([\"ax\", \"bx\", \"ay\", \"by\", \"ai\", \"aj\", \"bx\", \"by\"])",
    };

    static String[][] expectedResults = { {"ac", "ab"}, {"ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"}, {"ay", "by", "ax", "bx", "ai", "aj", "bx", "by"}, };

    public static String printArray(String[] array)
    {
        String result = "[";
        for (String a: array) { result += a+", "; }
        if (result.length() > 2) result = result.substring(0, result.length()-2);
        return result + "]";
    }

    public static void Validate(boolean printSuccess)
    {
        String[] strings0 = { "ab", "ac" }; 
        String[] strings1 = { "ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz" }; 
        String[] strings2 = { "ax", "bx", "ay", "by", "ai", "aj", "bx", "by" }; 

        String[][] resultsArray = {
            FirstSwap.firstSwap(strings0),
            FirstSwap.firstSwap(strings1),
            FirstSwap.firstSwap(strings2),
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
