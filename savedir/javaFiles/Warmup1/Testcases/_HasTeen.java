package Warmup1.Testcases;
import Warmup1.HasTeen;

public final class _HasTeen
{
    static final String[] testcaseStrings = {
        "hasTeen(13, 20, 10)",
        "hasTeen(20, 19, 10)",
        "hasTeen(20, 10, 13)",
        "hasTeen(1, 20, 12)",
        "hasTeen(19, 20, 12)",
        "hasTeen(12, 20, 19)",
        "hasTeen(12, 9, 20)",
        "hasTeen(12, 18, 20)",
        "hasTeen(14, 2, 20)",
        "hasTeen(4, 2, 20)",
        "hasTeen(11, 22, 22)",
    };

    static final boolean[] expectedResults = {
        true,
        true,
        true,
        false,
        true,
        true,
        false,
        true,
        true,
        false,
        false,
    };

    public static final void Validate(boolean printSuccess)
    {
        final boolean[] resultsArray = {
            HasTeen.hasTeen(13, 20, 10),
            HasTeen.hasTeen(20, 19, 10),
            HasTeen.hasTeen(20, 10, 13),
            HasTeen.hasTeen(1, 20, 12),
            HasTeen.hasTeen(19, 20, 12),
            HasTeen.hasTeen(12, 20, 19),
            HasTeen.hasTeen(12, 9, 20),
            HasTeen.hasTeen(12, 18, 20),
            HasTeen.hasTeen(14, 2, 20),
            HasTeen.hasTeen(4, 2, 20),
            HasTeen.hasTeen(11, 22, 22),
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
