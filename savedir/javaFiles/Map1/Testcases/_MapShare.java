package Map1.Testcases;
import Map1.MapShare;
import java.util.Map;

public class _MapShare
{
    static String[] testcaseStrings = {
        "mapShare({\"a\": \"aaa\", \"b\": \"bbb\", \"c\": \"ccc\"})",
        "mapShare({\"b\": \"xyz\", \"c\": \"ccc\"})",
        "mapShare({\"a\": \"aaa\", \"c\": \"meh\", \"d\": \"hi\"})",
    };

    static Map<String, String>[] expectedResults = {
        {"a": "aaa", "b": "aaa"},
        {"b": "xyz"},
        {"a": "aaa", "b": "aaa", "d": "hi"},
    };

    public static void Validate(boolean printSuccess)
    {
        Map<String, String>[] resultsArray = {
            MapShare.mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}),
            MapShare.mapShare({"b": "xyz", "c": "ccc"}),
            MapShare.mapShare({"a": "aaa", "c": "meh", "d": "hi"}),
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
