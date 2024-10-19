package Map1.Testcases;
import Map1.MapAB;
import java.util.Map;

public class _MapAB
{
    static String[] testcaseStrings = {
        "mapAB({\"a\": \"Hi\", \"b\": \"There\"})",
        "mapAB({\"a\": \"Hi\"})",
        "mapAB({\"b\": \"There\"})",
    };

    static Map<String, String>[] expectedResults = { {"a": "Hi", "ab": "HiThere", "b": "There"}, {"a": "Hi"}, {"b": "There"}, };

    public static void Validate(boolean printSuccess)
    {
        Map<String, String>[] resultsArray = {
            MapAB.mapAB({"a": "Hi", "b": "There"}),
            MapAB.mapAB({"a": "Hi"}),
            MapAB.mapAB({"b": "There"}),
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
