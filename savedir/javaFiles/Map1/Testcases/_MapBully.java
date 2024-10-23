package Map1.Testcases;
import Map1.MapBully;
import java.util.Map;

public class _MapBully
{
    static String[] testcaseStrings = {
        "mapBully({\"a\": \"candy\", \"b\": \"dirt\"})",
        "mapBully({\"a\": \"candy\"})",
        "mapBully({\"a\": \"candy\", \"b\": \"carrot\", \"c\": \"meh\"})",
    };

    static Map<String, String>[] expectedResults = {
        {"a": "", "b": "candy"},
        {"a": "", "b": "candy"},
        {"a": "", "b": "candy", "c": "meh"},
    };

    public static void Validate(boolean printSuccess)
    {
        Map<String, String>[] resultsArray = {
            MapBully.mapBully({"a": "candy", "b": "dirt"}),
            MapBully.mapBully({"a": "candy"}),
            MapBully.mapBully({"a": "candy", "b": "carrot", "c": "meh"}),
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
