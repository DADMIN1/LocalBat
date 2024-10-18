package Map2.Testcases;
import Map2.Pairs;

public class _Pairs
{
    static String[] testcaseStrings = {
        "pairs([\"code\", \"bug\"])",
        "pairs([\"man\", \"moon\", \"main\"])",
        "pairs([\"man\", \"moon\", \"good\", \"night\"])",
    };

    static Map<String, String>[] expectedResults = { {"b": "g", "c": "e"}, {"m": "n"}, {"g": "d", "m": "n", "n": "t"}, };

    public static void Validate(boolean printSuccess)
    {
        String[] strings0 = { "code", "bug" }; 
        String[] strings1 = { "man", "moon", "main" }; 
        String[] strings2 = { "man", "moon", "good", "night" }; 

        Map<String, String>[] resultsArray = {
            Pairs.pairs(strings0),
            Pairs.pairs(strings1),
            Pairs.pairs(strings2),
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
