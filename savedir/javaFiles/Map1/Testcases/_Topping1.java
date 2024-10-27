package Map1.Testcases;
import Map1.Topping1;
import java.util.Map;
import java.util.HashMap;

public final class _Topping1
{
    static final String[] testcaseStrings = {
        "topping1({\"ice cream\": \"peanuts\"})",
        "topping1({})",
        "topping1({\"pancake\": \"syrup\"})",
        "topping1({\"bread\": \"dirt\", \"ice cream\": \"strawberries\"})",
        "topping1({\"bread\": \"jam\", \"ice cream\": \"strawberries\", \"salad\": \"oil\"})",
    };

    static final Map<?,?>[] expectedResults = {
        Map.of("bread", "butter", "ice cream", "cherry"),
        Map.of("bread", "butter"),
        Map.of("bread", "butter", "pancake", "syrup"),
        Map.of("bread", "butter", "ice cream", "cherry"),
        Map.of("bread", "butter", "ice cream", "cherry", "salad", "oil"),
    };

    public static final void Validate(boolean printSuccess)
    {
        final Map<?,?>[] resultsArray = {
            Topping1.topping1(new HashMap<>(Map.of("ice cream", "peanuts"))),
            Topping1.topping1(new HashMap<>(Map.of())),
            Topping1.topping1(new HashMap<>(Map.of("pancake", "syrup"))),
            Topping1.topping1(new HashMap<>(Map.of("bread", "dirt", "ice cream", "strawberries"))),
            Topping1.topping1(new HashMap<>(Map.of("bread", "jam", "ice cream", "strawberries", "salad", "oil"))),
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
