package AP1.Testcases;
import AP1.WordsFront;
import java.util.Arrays;

public class _WordsFront
{
    static String[] testcaseStrings = {
        "wordsFront([\"a\", \"b\", \"c\", \"d\"], 1)",
        "wordsFront([\"a\", \"b\", \"c\", \"d\"], 2)",
        "wordsFront([\"a\", \"b\", \"c\", \"d\"], 3)",
    };

    static String[][] expectedResults = { {"a"}, {"a", "b"}, {"a", "b", "c"}, };

    public static String printArray(String[] array)
    {
        String result = "[";
        for (String a: array) { result += a+", "; }
        if (result.length() > 2) result = result.substring(0, result.length()-2);
        return result + "]";
    }

    public static void Validate(boolean printSuccess)
    {
        String[] words0 = { "a", "b", "c", "d" }; 
        String[] words1 = { "a", "b", "c", "d" }; 
        String[] words2 = { "a", "b", "c", "d" }; 

        String[][] resultsArray = {
            WordsFront.wordsFront(words0, 1),
            WordsFront.wordsFront(words1, 2),
            WordsFront.wordsFront(words2, 3),
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
