package Map1.Testcases;
import Map1.Topping3;
import java.util.Map;

public class _Topping3
{
    static String[] testcaseStrings = {
        "topping3({\"potato\": \"ketchup\"})",
        "topping3({\"potato\": \"butter\"})",
        "topping3({\"salad\": \"oil\", \"potato\": \"ketchup\"})",
    };

    static Map<String, String>[] expectedResults = {
        {"potato": "ketchup", "fries": "ketchup"},
        {"potato": "butter", "fries": "butter"},
        {"spinach": "oil", "salad": "oil", "potato": "ketchup", "fries": "ketchup"},
    };

    public static void Validate(boolean printSuccess)
    {
        Map<String, String>[] resultsArray = {
            Topping3.topping3({"potato": "ketchup"}),
            Topping3.topping3({"potato": "butter"}),
            Topping3.topping3({"salad": "oil", "potato": "ketchup"}),
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
