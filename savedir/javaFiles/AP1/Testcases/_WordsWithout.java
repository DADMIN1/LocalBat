package AP1.Testcases;
import AP1.WordsWithout;
import java.util.Arrays;
import java.util.ArrayList;

public final class _WordsWithout
{
    static final String[] testcaseStrings = {
        "wordsWithout([\"a\", \"b\", \"c\", \"a\"], \"a\")",
        "wordsWithout([\"a\", \"b\", \"c\", \"a\"], \"b\")",
        "wordsWithout([\"a\", \"b\", \"c\", \"a\"], \"c\")",
        "wordsWithout([\"b\", \"c\", \"a\", \"a\"], \"b\")",
        "wordsWithout([\"xx\", \"yyy\", \"x\", \"yy\", \"x\"], \"x\")",
        "wordsWithout([\"xx\", \"yyy\", \"x\", \"yy\", \"x\"], \"yy\")",
        "wordsWithout([\"aa\", \"ab\", \"ac\", \"aa\"], \"aa\")",
    };

    static final String[][] expectedResults = {
        {"b", "c"},
        {"a", "c", "a"},
        {"a", "b", "a"},
        {"c", "a", "a"},
        {"xx", "yyy", "yy"},
        {"xx", "yyy", "x", "x"},
        {"ab", "ac"},
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
        final String[] words0 = {"a", "b", "c", "a"}; 
        final String[] words1 = {"a", "b", "c", "a"}; 
        final String[] words2 = {"a", "b", "c", "a"}; 
        final String[] words3 = {"b", "c", "a", "a"}; 
        final String[] words4 = {"xx", "yyy", "x", "yy", "x"}; 
        final String[] words5 = {"xx", "yyy", "x", "yy", "x"}; 
        final String[] words6 = {"aa", "ab", "ac", "aa"}; 

        final String[][] resultsArray = {
            WordsWithout.wordsWithout(words0, "a"),
            WordsWithout.wordsWithout(words1, "b"),
            WordsWithout.wordsWithout(words2, "c"),
            WordsWithout.wordsWithout(words3, "b"),
            WordsWithout.wordsWithout(words4, "x"),
            WordsWithout.wordsWithout(words5, "yy"),
            WordsWithout.wordsWithout(words6, "aa"),
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
