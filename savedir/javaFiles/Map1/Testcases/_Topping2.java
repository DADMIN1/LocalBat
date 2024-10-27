package Map1.Testcases;
import Map1.Topping2;
import java.util.Map;
import java.util.HashMap;

public class _Topping2
{
    static String[] testcaseStrings = {
        "topping2({\"ice cream\": \"cherry\"})",
        "topping2({\"spinach\": \"dirt\", \"ice cream\": \"cherry\"})",
        "topping2({\"yogurt\": \"salt\"})",
        "topping2({\"yogurt\": \"salt\", \"bread\": \"butter\"})",
        "topping2({})",
        "topping2({\"ice cream\": \"air\", \"salad\": \"oil\"})",
    };

    static Map<?,?>[] expectedResults = {
        Map.of("yogurt", "cherry", "ice cream", "cherry"),
        Map.of("yogurt", "cherry", "spinach", "nuts", "ice cream", "cherry"),
        Map.of("yogurt", "salt"),
        Map.of("yogurt", "salt", "bread", "butter"),
        Map.of(),
        Map.of("yogurt", "air", "ice cream", "air", "salad", "oil"),
    };

    public static void Validate(boolean printSuccess)
    {
        Map<?,?>[] resultsArray = {
            Topping2.topping2(new HashMap<>(Map.of("ice cream", "cherry"))),
            Topping2.topping2(new HashMap<>(Map.of("spinach", "dirt", "ice cream", "cherry"))),
            Topping2.topping2(new HashMap<>(Map.of("yogurt", "salt"))),
            Topping2.topping2(new HashMap<>(Map.of("yogurt", "salt", "bread", "butter"))),
            Topping2.topping2(new HashMap<>(Map.of())),
            Topping2.topping2(new HashMap<>(Map.of("ice cream", "air", "salad", "oil"))),
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
