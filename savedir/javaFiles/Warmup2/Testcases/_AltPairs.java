package Warmup2.Testcases;
import Warmup2.AltPairs;

public class _AltPairs
{
    static String[] testcaseStrings = {
        "altPairs(\"kitten\")",
        "altPairs(\"Chocolate\")",
        "altPairs(\"CodingHorror\")",
    };

    static String[] expectedResults = { "kien", "Chole", "Congrr", };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            AltPairs.altPairs("kitten"),
            AltPairs.altPairs("Chocolate"),
            AltPairs.altPairs("CodingHorror"),
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
