package Map1.Testcases;
import Map1.MapBully;
import java.util.Map;
import java.util.HashMap;

public final class _MapBully
{
    static final String[] testcaseStrings = {
        "mapBully({\"a\": \"candy\", \"b\": \"dirt\"})",
        "mapBully({\"a\": \"candy\"})",
        "mapBully({\"a\": \"candy\", \"b\": \"carrot\", \"c\": \"meh\"})",
        "mapBully({\"b\": \"carrot\"})",
        "mapBully({\"c\": \"meh\"})",
        "mapBully({\"a\": \"sparkle\", \"c\": \"meh\"})",
    };

    static final Map<?,?>[] expectedResults = {
        Map.of("a", "", "b", "candy"),
        Map.of("a", "", "b", "candy"),
        Map.of("a", "", "b", "candy", "c", "meh"),
        Map.of("b", "carrot"),
        Map.of("c", "meh"),
        Map.of("a", "", "b", "sparkle", "c", "meh"),
    };

    public static final void Validate(boolean printSuccess)
    {
        final Map<?,?>[] resultsArray = {
            MapBully.mapBully(new HashMap<>(Map.of("a", "candy", "b", "dirt"))),
            MapBully.mapBully(new HashMap<>(Map.of("a", "candy"))),
            MapBully.mapBully(new HashMap<>(Map.of("a", "candy", "b", "carrot", "c", "meh"))),
            MapBully.mapBully(new HashMap<>(Map.of("b", "carrot"))),
            MapBully.mapBully(new HashMap<>(Map.of("c", "meh"))),
            MapBully.mapBully(new HashMap<>(Map.of("a", "sparkle", "c", "meh"))),
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
