package AP1.Testcases;
import AP1.WordsCount;

public final class _WordsCount
{
    static final String[] testcaseStrings = {
        "wordsCount([\"a\", \"bb\", \"b\", \"ccc\"], 1)",
        "wordsCount([\"a\", \"bb\", \"b\", \"ccc\"], 3)",
        "wordsCount([\"a\", \"bb\", \"b\", \"ccc\"], 4)",
        "wordsCount([\"xx\", \"yyy\", \"x\", \"yy\", \"z\"], 1)",
        "wordsCount([\"xx\", \"yyy\", \"x\", \"yy\", \"z\"], 2)",
        "wordsCount([\"xx\", \"yyy\", \"x\", \"yy\", \"z\"], 3)",
    };

    static final int[] expectedResults = {
        2,
        1,
        0,
        2,
        2,
        1,
    };

    public static final void Validate(boolean printSuccess)
    {
        final String[] words0 = {"a", "bb", "b", "ccc"}; 
        final String[] words1 = {"a", "bb", "b", "ccc"}; 
        final String[] words2 = {"a", "bb", "b", "ccc"}; 
        final String[] words3 = {"xx", "yyy", "x", "yy", "z"}; 
        final String[] words4 = {"xx", "yyy", "x", "yy", "z"}; 
        final String[] words5 = {"xx", "yyy", "x", "yy", "z"}; 

        final int[] resultsArray = {
            WordsCount.wordsCount(words0, 1),
            WordsCount.wordsCount(words1, 3),
            WordsCount.wordsCount(words2, 4),
            WordsCount.wordsCount(words3, 1),
            WordsCount.wordsCount(words4, 2),
            WordsCount.wordsCount(words5, 3),
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
