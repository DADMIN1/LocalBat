package Logic1.Testcases;
import Logic1.CigarParty;

public final class _CigarParty
{
    static final String[] testcaseStrings = {
        "cigarParty(30, false)",
        "cigarParty(50, false)",
        "cigarParty(70, true)",
        "cigarParty(30, true)",
        "cigarParty(50, true)",
        "cigarParty(60, false)",
        "cigarParty(61, false)",
        "cigarParty(40, false)",
        "cigarParty(39, false)",
        "cigarParty(40, true)",
        "cigarParty(39, true)",
    };

    static final boolean[] expectedResults = {
        false,
        true,
        true,
        false,
        true,
        true,
        false,
        true,
        false,
        true,
        false,
    };

    public static final void Validate(boolean printSuccess)
    {
        final boolean[] resultsArray = {
            CigarParty.cigarParty(30, false),
            CigarParty.cigarParty(50, false),
            CigarParty.cigarParty(70, true),
            CigarParty.cigarParty(30, true),
            CigarParty.cigarParty(50, true),
            CigarParty.cigarParty(60, false),
            CigarParty.cigarParty(61, false),
            CigarParty.cigarParty(40, false),
            CigarParty.cigarParty(39, false),
            CigarParty.cigarParty(40, true),
            CigarParty.cigarParty(39, true),
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
