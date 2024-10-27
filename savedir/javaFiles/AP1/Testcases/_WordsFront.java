package AP1.Testcases;
import AP1.WordsFront;
import java.util.Arrays;
import java.util.ArrayList;

public final class _WordsFront
{
    static final String[] testcaseStrings = {
        "wordsFront([\"a\", \"b\", \"c\", \"d\"], 1)",
        "wordsFront([\"a\", \"b\", \"c\", \"d\"], 2)",
        "wordsFront([\"a\", \"b\", \"c\", \"d\"], 3)",
        "wordsFront([\"a\", \"b\", \"c\", \"d\"], 4)",
        "wordsFront([\"Hi\", \"There\"], 1)",
        "wordsFront([\"Hi\", \"There\"], 2)",
    };

    static final String[][] expectedResults = {
        {"a"},
        {"a", "b"},
        {"a", "b", "c"},
        {"a", "b", "c", "d"},
        {"Hi"},
        {"Hi", "There"},
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
        final String[] words0 = { "a", "b", "c", "d" }; 
        final String[] words1 = { "a", "b", "c", "d" }; 
        final String[] words2 = { "a", "b", "c", "d" }; 
        final String[] words3 = { "a", "b", "c", "d" }; 
        final String[] words4 = { "Hi", "There" }; 
        final String[] words5 = { "Hi", "There" }; 

        final String[][] resultsArray = {
            WordsFront.wordsFront(words0, 1),
            WordsFront.wordsFront(words1, 2),
            WordsFront.wordsFront(words2, 3),
            WordsFront.wordsFront(words3, 4),
            WordsFront.wordsFront(words4, 1),
            WordsFront.wordsFront(words5, 2),
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
