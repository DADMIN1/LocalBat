package Map2.Testcases;
import Map2.WordMultiple;
import java.util.Map;

public class _WordMultiple
{
    static String[] testcaseStrings = {
        "wordMultiple([\"a\", \"b\", \"a\", \"c\", \"b\"])",
        "wordMultiple([\"c\", \"b\", \"a\"])",
        "wordMultiple([\"c\", \"c\", \"c\", \"c\"])",
        "wordMultiple([])",
        "wordMultiple([\"this\", \"and\", \"this\"])",
        "wordMultiple([\"d\", \"a\", \"e\", \"d\", \"a\", \"d\", \"b\", \"b\", \"z\", \"a\", \"a\", \"b\", \"z\", \"x\"])",
    };

    static Map<?,?>[] expectedResults = {
        Map.of("a", true, "b", true, "c", false),
        Map.of("a", false, "b", false, "c", false),
        Map.of("c", true),
        Map.of(),
        Map.of("and", false, "this", true),
        Map.of("a", true, "b", true, "d", true, "e", false, "x", false, "z", true),
    };

    public static void Validate(boolean printSuccess)
    {
        String[] strings0 = { "a", "b", "a", "c", "b" }; 
        String[] strings1 = { "c", "b", "a" }; 
        String[] strings2 = { "c", "c", "c", "c" }; 
        String[] strings3 = {  }; 
        String[] strings4 = { "this", "and", "this" }; 
        String[] strings5 = { "d", "a", "e", "d", "a", "d", "b", "b", "z", "a", "a", "b", "z", "x" }; 

        Map<?,?>[] resultsArray = {
            WordMultiple.wordMultiple(strings0),
            WordMultiple.wordMultiple(strings1),
            WordMultiple.wordMultiple(strings2),
            WordMultiple.wordMultiple(strings3),
            WordMultiple.wordMultiple(strings4),
            WordMultiple.wordMultiple(strings5),
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
