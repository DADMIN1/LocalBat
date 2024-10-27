package Map1.Testcases;
import Map1.MapAB4;
import java.util.Map;
import java.util.HashMap;

public final class _MapAB4
{
    static final String[] testcaseStrings = {
        "mapAB4({\"a\": \"aaa\", \"b\": \"bb\", \"c\": \"cake\"})",
        "mapAB4({\"a\": \"aa\", \"b\": \"bbb\", \"c\": \"cake\"})",
        "mapAB4({\"a\": \"aa\", \"b\": \"bbb\"})",
        "mapAB4({\"a\": \"aaa\"})",
        "mapAB4({\"b\": \"bbb\"})",
        "mapAB4({\"a\": \"aaa\", \"b\": \"bbb\", \"c\": \"cake\"})",
        "mapAB4({\"a\": \"a\", \"b\": \"b\", \"c\": \"cake\"})",
        "mapAB4({\"a\": \"\", \"b\": \"b\", \"c\": \"cake\"})",
        "mapAB4({\"a\": \"a\", \"b\": \"\", \"c\": \"cake\"})",
        "mapAB4({\"c\": \"cat\", \"d\": \"dog\"})",
        "mapAB4({\"ccc\": \"ccc\"})",
        "mapAB4({\"c\": \"a\", \"d\": \"b\"})",
        "mapAB4({})",
        "mapAB4({\"a\": \"\", \"z\": \"z\"})",
        "mapAB4({\"b\": \"\", \"z\": \"z\"})",
    };

    static final Map<?,?>[] expectedResults = {
        Map.of("a", "aaa", "b", "bb", "c", "aaa"),
        Map.of("a", "aa", "b", "bbb", "c", "bbb"),
        Map.of("a", "aa", "b", "bbb", "c", "bbb"),
        Map.of("a", "aaa"),
        Map.of("b", "bbb"),
        Map.of("a", "", "b", "", "c", "cake"),
        Map.of("a", "", "b", "", "c", "cake"),
        Map.of("a", "", "b", "b", "c", "b"),
        Map.of("a", "a", "b", "", "c", "a"),
        Map.of("c", "cat", "d", "dog"),
        Map.of("ccc", "ccc"),
        Map.of("c", "a", "d", "b"),
        Map.of(),
        Map.of("a", "", "z", "z"),
        Map.of("b", "", "z", "z"),
    };

    public static final void Validate(boolean printSuccess)
    {
        final Map<?,?>[] resultsArray = {
            MapAB4.mapAB4(new HashMap<>(Map.of("a", "aaa", "b", "bb", "c", "cake"))),
            MapAB4.mapAB4(new HashMap<>(Map.of("a", "aa", "b", "bbb", "c", "cake"))),
            MapAB4.mapAB4(new HashMap<>(Map.of("a", "aa", "b", "bbb"))),
            MapAB4.mapAB4(new HashMap<>(Map.of("a", "aaa"))),
            MapAB4.mapAB4(new HashMap<>(Map.of("b", "bbb"))),
            MapAB4.mapAB4(new HashMap<>(Map.of("a", "aaa", "b", "bbb", "c", "cake"))),
            MapAB4.mapAB4(new HashMap<>(Map.of("a", "a", "b", "b", "c", "cake"))),
            MapAB4.mapAB4(new HashMap<>(Map.of("a", "", "b", "b", "c", "cake"))),
            MapAB4.mapAB4(new HashMap<>(Map.of("a", "a", "b", "", "c", "cake"))),
            MapAB4.mapAB4(new HashMap<>(Map.of("c", "cat", "d", "dog"))),
            MapAB4.mapAB4(new HashMap<>(Map.of("ccc", "ccc"))),
            MapAB4.mapAB4(new HashMap<>(Map.of("c", "a", "d", "b"))),
            MapAB4.mapAB4(new HashMap<>(Map.of())),
            MapAB4.mapAB4(new HashMap<>(Map.of("a", "", "z", "z"))),
            MapAB4.mapAB4(new HashMap<>(Map.of("b", "", "z", "z"))),
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
