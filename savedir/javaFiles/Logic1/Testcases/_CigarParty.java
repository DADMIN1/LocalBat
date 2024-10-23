package Logic1.Testcases;
import Logic1.CigarParty;

public class _CigarParty
{
    static String[] testcaseStrings = {
        "cigarParty(30, false)",
        "cigarParty(50, false)",
        "cigarParty(70, true)",
    };

    static boolean[] expectedResults = {
        false,
        true,
        true,
    };

    public static void Validate(boolean printSuccess)
    {
        boolean[] resultsArray = {
            CigarParty.cigarParty(30, false),
            CigarParty.cigarParty(50, false),
            CigarParty.cigarParty(70, true),
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
