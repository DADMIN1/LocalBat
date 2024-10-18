package Map2.Testcases;
import Map2.WordLen;

public class _WordLen
{
    static String[] testcaseStrings = {
        "wordLen([\"a\", \"bb\", \"a\", \"bb\"])",
        "wordLen([\"this\", \"and\", \"that\", \"and\"])",
        "wordLen([\"code\", \"code\", \"code\", \"bug\"])",
    };

    static Map<String, Integer>[] expectedResults = { {"bb": 2, "a": 1}, {"that": 4, "and": 3, "this": 4}, {"code": 4, "bug": 3}, };

    public static void Validate(boolean printSuccess)
    {
        String[] strings0 = { "a", "bb", "a", "bb" }; 
        String[] strings1 = { "this", "and", "that", "and" }; 
        String[] strings2 = { "code", "code", "code", "bug" }; 

        Map<String, Integer>[] resultsArray = {
            WordLen.wordLen(strings0),
            WordLen.wordLen(strings1),
            WordLen.wordLen(strings2),
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
