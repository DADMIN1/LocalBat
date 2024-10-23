package Map2.Testcases;
import Map2.WordMultiple;
import java.util.Map;

public class _WordMultiple
{
    static String[] testcaseStrings = {
        "wordMultiple([\"a\", \"b\", \"a\", \"c\", \"b\"])",
        "wordMultiple([\"c\", \"b\", \"a\"])",
        "wordMultiple([\"c\", \"c\", \"c\", \"c\"])",
    };

    static Map<String, Boolean>[] expectedResults = {
        {"a": true, "b": true, "c": false},
        {"a": false, "b": false, "c": false},
        {"c": true},
    };

    public static void Validate(boolean printSuccess)
    {
        String[] strings0 = { "a", "b", "a", "c", "b" }; 
        String[] strings1 = { "c", "b", "a" }; 
        String[] strings2 = { "c", "c", "c", "c" }; 

        Map<String, Boolean>[] resultsArray = {
            WordMultiple.wordMultiple(strings0),
            WordMultiple.wordMultiple(strings1),
            WordMultiple.wordMultiple(strings2),
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
