package Map1.Testcases;
import Map1.Topping2;
import java.util.Map;

public class _Topping2
{
    static String[] testcaseStrings = {
        "topping2({\"ice cream\": \"cherry\"})",
        "topping2({\"spinach\": \"dirt\", \"ice cream\": \"cherry\"})",
        "topping2({\"yogurt\": \"salt\"})",
    };

    static Map<?,?>[] expectedResults = {
        Map.of("yogurt", "cherry", "ice cream", "cherry"),
        Map.of("yogurt", "cherry", "spinach", "nuts", "ice cream", "cherry"),
        Map.of("yogurt", "salt"),
    };

    public static void Validate(boolean printSuccess)
    {
        Map<?,?>[] resultsArray = {
            Topping2.topping2(Map.of("ice cream", "cherry")),
            Topping2.topping2(Map.of("spinach", "dirt", "ice cream", "cherry")),
            Topping2.topping2(Map.of("yogurt", "salt")),
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
