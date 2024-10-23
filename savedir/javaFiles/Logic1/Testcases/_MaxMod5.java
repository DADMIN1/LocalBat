package Logic1.Testcases;
import Logic1.MaxMod5;

public class _MaxMod5
{
    static String[] testcaseStrings = {
        "maxMod5(2, 3)",
        "maxMod5(6, 2)",
        "maxMod5(3, 2)",
    };

    static int[] expectedResults = {
        3,
        6,
        3,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            MaxMod5.maxMod5(2, 3),
            MaxMod5.maxMod5(6, 2),
            MaxMod5.maxMod5(3, 2),
        };

        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != expectedResults[i])
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
