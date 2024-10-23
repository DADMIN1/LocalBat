package Map1.Testcases;
import Map1.MapAB2;
import java.util.Map;

public class _MapAB2
{
    static String[] testcaseStrings = {
        "mapAB2({\"a\": \"aaa\", \"b\": \"aaa\", \"c\": \"cake\"})",
        "mapAB2({\"a\": \"aaa\", \"b\": \"bbb\"})",
        "mapAB2({\"a\": \"aaa\", \"b\": \"bbb\", \"c\": \"aaa\"})",
    };

    static Map<String, String>[] expectedResults = {
        {"c": "cake"},
        {"a": "aaa", "b": "bbb"},
        {"a": "aaa", "b": "bbb", "c": "aaa"},
    };

    public static void Validate(boolean printSuccess)
    {
        Map<String, String>[] resultsArray = {
            MapAB2.mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}),
            MapAB2.mapAB2({"a": "aaa", "b": "bbb"}),
            MapAB2.mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}),
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
