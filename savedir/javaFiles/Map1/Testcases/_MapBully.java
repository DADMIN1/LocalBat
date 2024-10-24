package Map1.Testcases;
import Map1.MapBully;
import java.util.Map;

public class _MapBully
{
    static String[] testcaseStrings = {
        "mapBully({\"a\": \"candy\", \"b\": \"dirt\"})",
        "mapBully({\"a\": \"candy\"})",
        "mapBully({\"a\": \"candy\", \"b\": \"carrot\", \"c\": \"meh\"})",
        "mapBully({\"b\": \"carrot\"})",
        "mapBully({\"c\": \"meh\"})",
        "mapBully({\"a\": \"sparkle\", \"c\": \"meh\"})",
    };

    static Map<?,?>[] expectedResults = {
        Map.of("a", "", "b", "candy"),
        Map.of("a", "", "b", "candy"),
        Map.of("a", "", "b", "candy", "c", "meh"),
        Map.of("b", "carrot"),
        Map.of("c", "meh"),
        Map.of("a", "", "b", "sparkle", "c", "meh"),
    };

    public static void Validate(boolean printSuccess)
    {
        Map<?,?>[] resultsArray = {
            MapBully.mapBully(Map.of("a", "candy", "b", "dirt")),
            MapBully.mapBully(Map.of("a", "candy")),
            MapBully.mapBully(Map.of("a", "candy", "b", "carrot", "c", "meh")),
            MapBully.mapBully(Map.of("b", "carrot")),
            MapBully.mapBully(Map.of("c", "meh")),
            MapBully.mapBully(Map.of("a", "sparkle", "c", "meh")),
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
