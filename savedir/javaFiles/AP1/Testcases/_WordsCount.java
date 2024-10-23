package AP1.Testcases;
import AP1.WordsCount;

public class _WordsCount
{
    static String[] testcaseStrings = {
        "wordsCount([\"a\", \"bb\", \"b\", \"ccc\"], 1)",
        "wordsCount([\"a\", \"bb\", \"b\", \"ccc\"], 3)",
        "wordsCount([\"a\", \"bb\", \"b\", \"ccc\"], 4)",
    };

    static int[] expectedResults = {
        2,
        1,
        0,
    };

    public static void Validate(boolean printSuccess)
    {
        String[] words0 = { "a", "bb", "b", "ccc" }; 
        String[] words1 = { "a", "bb", "b", "ccc" }; 
        String[] words2 = { "a", "bb", "b", "ccc" }; 

        int[] resultsArray = {
            WordsCount.wordsCount(words0, 1),
            WordsCount.wordsCount(words1, 3),
            WordsCount.wordsCount(words2, 4),
        };

        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("\n[-] #"+(i+1)+" failed!");
                System.out.println(testcaseStrings[i]+";");
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+expectedResults[i]);
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
