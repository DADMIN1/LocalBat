package Map1.Testcases;
import Map1.MapAB3;
import java.util.Map;

public class _MapAB3
{
    static String[] testcaseStrings = {
        "mapAB3({\"a\": \"aaa\", \"c\": \"cake\"})",
        "mapAB3({\"b\": \"bbb\", \"c\": \"cake\"})",
        "mapAB3({\"a\": \"aaa\", \"b\": \"bbb\", \"c\": \"cake\"})",
        "mapAB3({\"ccc\": \"ccc\"})",
        "mapAB3({\"c\": \"a\", \"d\": \"b\"})",
        "mapAB3({})",
        "mapAB3({\"a\": \"\"})",
        "mapAB3({\"b\": \"\"})",
        "mapAB3({\"a\": \"\", \"b\": \"\"})",
        "mapAB3({\"aa\": \"aa\", \"a\": \"apple\", \"z\": \"zzz\"})",
    };

    static Map<?,?>[] expectedResults = {
        Map.of("a", "aaa", "b", "aaa", "c", "cake"),
        Map.of("a", "bbb", "b", "bbb", "c", "cake"),
        Map.of("a", "aaa", "b", "bbb", "c", "cake"),
        Map.of("ccc", "ccc"),
        Map.of("c", "a", "d", "b"),
        Map.of(),
        Map.of("a", "", "b", ""),
        Map.of("a", "", "b", ""),
        Map.of("a", "", "b", ""),
        Map.of("aa", "aa", "a", "apple", "b", "apple", "z", "zzz"),
    };

    public static void Validate(boolean printSuccess)
    {
        Map<?,?>[] resultsArray = {
            MapAB3.mapAB3(Map.of("a", "aaa", "c", "cake")),
            MapAB3.mapAB3(Map.of("b", "bbb", "c", "cake")),
            MapAB3.mapAB3(Map.of("a", "aaa", "b", "bbb", "c", "cake")),
            MapAB3.mapAB3(Map.of("ccc", "ccc")),
            MapAB3.mapAB3(Map.of("c", "a", "d", "b")),
            MapAB3.mapAB3(Map.of()),
            MapAB3.mapAB3(Map.of("a", "")),
            MapAB3.mapAB3(Map.of("b", "")),
            MapAB3.mapAB3(Map.of("a", "", "b", "")),
            MapAB3.mapAB3(Map.of("aa", "aa", "a", "apple", "z", "zzz")),
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
