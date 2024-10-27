package Map1.Testcases;
import Map1.MapAB2;
import java.util.Map;
import java.util.HashMap;

public class _MapAB2
{
    static String[] testcaseStrings = {
        "mapAB2({\"a\": \"aaa\", \"b\": \"aaa\", \"c\": \"cake\"})",
        "mapAB2({\"a\": \"aaa\", \"b\": \"bbb\"})",
        "mapAB2({\"a\": \"aaa\", \"b\": \"bbb\", \"c\": \"aaa\"})",
        "mapAB2({\"a\": \"aaa\"})",
        "mapAB2({\"b\": \"bbb\"})",
        "mapAB2({\"a\": \"\", \"b\": \"\", \"c\": \"ccc\"})",
        "mapAB2({})",
        "mapAB2({\"a\": \"a\", \"b\": \"b\", \"z\": \"zebra\"})",
    };

    static Map<?,?>[] expectedResults = {
        Map.of("c", "cake"),
        Map.of("a", "aaa", "b", "bbb"),
        Map.of("a", "aaa", "b", "bbb", "c", "aaa"),
        Map.of("a", "aaa"),
        Map.of("b", "bbb"),
        Map.of("c", "ccc"),
        Map.of(),
        Map.of("a", "a", "b", "b", "z", "zebra"),
    };

    public static void Validate(boolean printSuccess)
    {
        Map<?,?>[] resultsArray = {
            MapAB2.mapAB2(new HashMap<>(Map.of("a", "aaa", "b", "aaa", "c", "cake"))),
            MapAB2.mapAB2(new HashMap<>(Map.of("a", "aaa", "b", "bbb"))),
            MapAB2.mapAB2(new HashMap<>(Map.of("a", "aaa", "b", "bbb", "c", "aaa"))),
            MapAB2.mapAB2(new HashMap<>(Map.of("a", "aaa"))),
            MapAB2.mapAB2(new HashMap<>(Map.of("b", "bbb"))),
            MapAB2.mapAB2(new HashMap<>(Map.of("a", "", "b", "", "c", "ccc"))),
            MapAB2.mapAB2(new HashMap<>(Map.of())),
            MapAB2.mapAB2(new HashMap<>(Map.of("a", "a", "b", "b", "z", "zebra"))),
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
