package Map1.Testcases;
import Map1.MapAB4;
import java.util.Map;

public class _MapAB4
{
    static String[] testcaseStrings = {
        "mapAB4({\"a\": \"aaa\", \"b\": \"bb\", \"c\": \"cake\"})",
        "mapAB4({\"a\": \"aa\", \"b\": \"bbb\", \"c\": \"cake\"})",
        "mapAB4({\"a\": \"aa\", \"b\": \"bbb\"})",
    };

    static Map<?,?>[] expectedResults = {
        Map.of("a", "aaa", "b", "bb", "c", "aaa"),
        Map.of("a", "aa", "b", "bbb", "c", "bbb"),
        Map.of("a", "aa", "b", "bbb", "c", "bbb"),
    };

    public static void Validate(boolean printSuccess)
    {
        Map<?,?>[] resultsArray = {
            MapAB4.mapAB4(Map.of("a", "aaa", "b", "bb", "c", "cake")),
            MapAB4.mapAB4(Map.of("a", "aa", "b", "bbb", "c", "cake")),
            MapAB4.mapAB4(Map.of("a", "aa", "b", "bbb")),
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
