package AP1.Testcases;
import AP1.WordsWithoutList;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public final class _WordsWithoutList
{
    static final String[] testcaseStrings = {
        "wordsWithoutList([\"a\", \"bb\", \"b\", \"ccc\"], 1)",
        "wordsWithoutList([\"a\", \"bb\", \"b\", \"ccc\"], 3)",
        "wordsWithoutList([\"a\", \"bb\", \"b\", \"ccc\"], 4)",
        "wordsWithoutList([\"xx\", \"yyy\", \"x\", \"yy\", \"z\"], 1)",
        "wordsWithoutList([\"xx\", \"yyy\", \"x\", \"yy\", \"z\"], 2)",
    };

    static final List<?>[] expectedResults = {
        Arrays.asList("bb", "ccc"),
        Arrays.asList("a", "bb", "b"),
        Arrays.asList("a", "bb", "b", "ccc"),
        Arrays.asList("xx", "yyy", "yy"),
        Arrays.asList("yyy", "x", "z"),
    };

    public static final void Validate(boolean printSuccess)
    {
        final String[] words0 = { "a", "bb", "b", "ccc" }; 
        final String[] words1 = { "a", "bb", "b", "ccc" }; 
        final String[] words2 = { "a", "bb", "b", "ccc" }; 
        final String[] words3 = { "xx", "yyy", "x", "yy", "z" }; 
        final String[] words4 = { "xx", "yyy", "x", "yy", "z" }; 

        final List<?>[] resultsArray = {
            WordsWithoutList.wordsWithoutList(words0, 1),
            WordsWithoutList.wordsWithoutList(words1, 3),
            WordsWithoutList.wordsWithoutList(words2, 4),
            WordsWithoutList.wordsWithoutList(words3, 1),
            WordsWithoutList.wordsWithoutList(words4, 2),
        };

        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (!resultsArray[i].equals(expectedResults[i]))
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
