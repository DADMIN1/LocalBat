package Map2.Testcases;
import Map2.WordCount;
import java.util.Map;

public class _WordCount
{
    static String[] testcaseStrings = {
        "wordCount([\"a\", \"b\", \"a\", \"c\", \"b\"])",
        "wordCount([\"c\", \"b\", \"a\"])",
        "wordCount([\"c\", \"c\", \"c\", \"c\"])",
    };

    static Map<String, Integer>[] expectedResults = {
        {"a": 2, "b": 2, "c": 1},
        {"a": 1, "b": 1, "c": 1},
        {"c": 4},
    };

    public static void Validate(boolean printSuccess)
    {
        String[] strings0 = { "a", "b", "a", "c", "b" }; 
        String[] strings1 = { "c", "b", "a" }; 
        String[] strings2 = { "c", "c", "c", "c" }; 

        Map<String, Integer>[] resultsArray = {
            WordCount.wordCount(strings0),
            WordCount.wordCount(strings1),
            WordCount.wordCount(strings2),
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
