package Map1.Testcases;
import Map1.MapAB3;
import java.util.Map;

public class _MapAB3
{
    static String[] testcaseStrings = {
        "mapAB3({\"a\": \"aaa\", \"c\": \"cake\"})",
        "mapAB3({\"b\": \"bbb\", \"c\": \"cake\"})",
        "mapAB3({\"a\": \"aaa\", \"b\": \"bbb\", \"c\": \"cake\"})",
    };

    static Map<String, String>[] expectedResults = { {"a": "aaa", "b": "aaa", "c": "cake"}, {"a": "bbb", "b": "bbb", "c": "cake"}, {"a": "aaa", "b": "bbb", "c": "cake"}, };

    public static void Validate(boolean printSuccess)
    {
        Map<String, String>[] resultsArray = {
            MapAB3.mapAB3({"a": "aaa", "c": "cake"}),
            MapAB3.mapAB3({"b": "bbb", "c": "cake"}),
            MapAB3.mapAB3({"a": "aaa", "b": "bbb", "c": "cake"}),
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
