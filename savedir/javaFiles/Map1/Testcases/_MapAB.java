package Map1.Testcases;
import Map1.MapAB;
import java.util.Map;
import java.util.HashMap;

public final class _MapAB
{
    static final String[] testcaseStrings = {
        "mapAB({\"a\": \"Hi\", \"b\": \"There\"})",
        "mapAB({\"a\": \"Hi\"})",
        "mapAB({\"b\": \"There\"})",
        "mapAB({\"c\": \"meh\"})",
        "mapAB({\"a\": \"aaa\", \"ab\": \"nope\", \"b\": \"bbb\", \"c\": \"ccc\"})",
        "mapAB({\"ab\": \"nope\", \"b\": \"bbb\", \"c\": \"ccc\"})",
    };

    static final Map<?,?>[] expectedResults = {
        Map.of("a", "Hi", "ab", "HiThere", "b", "There"),
        Map.of("a", "Hi"),
        Map.of("b", "There"),
        Map.of("c", "meh"),
        Map.of("a", "aaa", "ab", "aaabbb", "b", "bbb", "c", "ccc"),
        Map.of("ab", "nope", "b", "bbb", "c", "ccc"),
    };

    public static final void Validate(boolean printSuccess)
    {
        final Map<?,?>[] resultsArray = {
            MapAB.mapAB(new HashMap<>(Map.of("a", "Hi", "b", "There"))),
            MapAB.mapAB(new HashMap<>(Map.of("a", "Hi"))),
            MapAB.mapAB(new HashMap<>(Map.of("b", "There"))),
            MapAB.mapAB(new HashMap<>(Map.of("c", "meh"))),
            MapAB.mapAB(new HashMap<>(Map.of("a", "aaa", "ab", "nope", "b", "bbb", "c", "ccc"))),
            MapAB.mapAB(new HashMap<>(Map.of("ab", "nope", "b", "bbb", "c", "ccc"))),
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
