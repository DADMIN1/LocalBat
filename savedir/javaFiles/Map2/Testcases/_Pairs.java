package Map2.Testcases;
import Map2.Pairs;
import java.util.Map;

public class _Pairs
{
    static String[] testcaseStrings = {
        "pairs([\"code\", \"bug\"])",
        "pairs([\"man\", \"moon\", \"main\"])",
        "pairs([\"man\", \"moon\", \"good\", \"night\"])",
        "pairs([])",
        "pairs([\"a\", \"b\"])",
        "pairs([\"are\", \"codes\", \"and\", \"cods\"])",
        "pairs([\"apple\", \"banana\", \"tea\", \"coffee\"])",
    };

    static Map<?,?>[] expectedResults = {
        Map.of("b", "g", "c", "e"),
        Map.of("m", "n"),
        Map.of("g", "d", "m", "n", "n", "t"),
        Map.of(),
        Map.of("a", "a", "b", "b"),
        Map.of("a", "d", "c", "s"),
        Map.of("a", "e", "b", "a", "c", "e", "t", "a"),
    };

    public static void Validate(boolean printSuccess)
    {
        String[] strings0 = { "code", "bug" }; 
        String[] strings1 = { "man", "moon", "main" }; 
        String[] strings2 = { "man", "moon", "good", "night" }; 
        String[] strings3 = {  }; 
        String[] strings4 = { "a", "b" }; 
        String[] strings5 = { "are", "codes", "and", "cods" }; 
        String[] strings6 = { "apple", "banana", "tea", "coffee" }; 

        Map<?,?>[] resultsArray = {
            Pairs.pairs(strings0),
            Pairs.pairs(strings1),
            Pairs.pairs(strings2),
            Pairs.pairs(strings3),
            Pairs.pairs(strings4),
            Pairs.pairs(strings5),
            Pairs.pairs(strings6),
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
