package Map1.Testcases;
import Map1.Topping3;
import java.util.Map;
import java.util.HashMap;

public class _Topping3
{
    static String[] testcaseStrings = {
        "topping3({\"potato\": \"ketchup\"})",
        "topping3({\"potato\": \"butter\"})",
        "topping3({\"salad\": \"oil\", \"potato\": \"ketchup\"})",
        "topping3({\"toast\": \"butter\", \"salad\": \"oil\", \"potato\": \"ketchup\"})",
        "topping3({})",
        "topping3({\"salad\": \"pepper\", \"fries\": \"salt\"})",
    };

    static Map<?,?>[] expectedResults = {
        Map.of("potato", "ketchup", "fries", "ketchup"),
        Map.of("potato", "butter", "fries", "butter"),
        Map.of("spinach", "oil", "salad", "oil", "potato", "ketchup", "fries", "ketchup"),
        Map.of("toast", "butter", "spinach", "oil", "salad", "oil", "potato", "ketchup", "fries", "ketchup"),
        Map.of(),
        Map.of("spinach", "pepper", "salad", "pepper", "fries", "salt"),
    };

    public static void Validate(boolean printSuccess)
    {
        Map<?,?>[] resultsArray = {
            Topping3.topping3(new HashMap<>(Map.of("potato", "ketchup"))),
            Topping3.topping3(new HashMap<>(Map.of("potato", "butter"))),
            Topping3.topping3(new HashMap<>(Map.of("salad", "oil", "potato", "ketchup"))),
            Topping3.topping3(new HashMap<>(Map.of("toast", "butter", "salad", "oil", "potato", "ketchup"))),
            Topping3.topping3(new HashMap<>(Map.of())),
            Topping3.topping3(new HashMap<>(Map.of("salad", "pepper", "fries", "salt"))),
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
