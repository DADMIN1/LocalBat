package AP1.Testcases;
import AP1.WordsWithout;
import java.util.Arrays;

public class _WordsWithout
{
    static String[] testcaseStrings = {
        "wordsWithout([\"a\", \"b\", \"c\", \"a\"], \"a\")",
        "wordsWithout([\"a\", \"b\", \"c\", \"a\"], \"b\")",
        "wordsWithout([\"a\", \"b\", \"c\", \"a\"], \"c\")",
    };

    static String[][] expectedResults = { {"b", "c"}, {"a", "c", "a"}, {"a", "b", "a"}, };

    public static String printArray(String[] array)
    {
        String result = "[";
        for (String a: array) { result += a+", "; }
        if (result.length() > 2) result = result.substring(0, result.length()-2);
        return result + "]";
    }

    public static void Validate(boolean printSuccess)
    {
        String[] words0 = { "a", "b", "c", "a" }; 
        String[] words1 = { "a", "b", "c", "a" }; 
        String[] words2 = { "a", "b", "c", "a" }; 

        String[][] resultsArray = {
            WordsWithout.wordsWithout(words0, "a"),
            WordsWithout.wordsWithout(words1, "b"),
            WordsWithout.wordsWithout(words2, "c"),
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
