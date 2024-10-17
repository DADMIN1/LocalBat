package AP1.Testcases;
import AP1.WordsWithoutList;

public class _WordsWithoutList
{
    static String[] testcaseStrings = {
        "wordsWithoutList([\"a\", \"bb\", \"b\", \"ccc\"], 1)",
        "wordsWithoutList([\"a\", \"bb\", \"b\", \"ccc\"], 3)",
        "wordsWithoutList([\"a\", \"bb\", \"b\", \"ccc\"], 4)",
    };

    static List[] expectedResults = { ["bb", "ccc"], ["a", "bb", "b"], ["a", "bb", "b", "ccc"], };

    public static void Validate(boolean printSuccess)
    {
        String[] words0 = { "a", "bb", "b", "ccc" }; 
        String[] words1 = { "a", "bb", "b", "ccc" }; 
        String[] words2 = { "a", "bb", "b", "ccc" }; 

        List[] resultsArray = {
            WordsWithoutList.wordsWithoutList(words0, 1),
            WordsWithoutList.wordsWithoutList(words1, 3),
            WordsWithoutList.wordsWithoutList(words2, 4),
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
