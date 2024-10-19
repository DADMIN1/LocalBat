package Map1.Testcases;
import Map1.Topping1;
import java.util.Map;

public class _Topping1
{
    static String[] testcaseStrings = {
        "topping1({\"ice cream\": \"peanuts\"})",
        "topping1({})",
        "topping1({\"pancake\": \"syrup\"})",
    };

    static Map<String, String>[] expectedResults = { {"bread": "butter", "ice cream": "cherry"}, {"bread": "butter"}, {"bread": "butter", "pancake": "syrup"}, };

    public static void Validate(boolean printSuccess)
    {
        Map<String, String>[] resultsArray = {
            Topping1.topping1({"ice cream": "peanuts"}),
            Topping1.topping1({}),
            Topping1.topping1({"pancake": "syrup"}),
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
