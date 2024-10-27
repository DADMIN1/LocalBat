package Warmup1.Testcases;
import Warmup1.Close10;

public final class _Close10
{
    static final String[] testcaseStrings = {
        "close10(8, 13)",
        "close10(13, 8)",
        "close10(13, 7)",
        "close10(7, 13)",
        "close10(9, 13)",
        "close10(13, 8)",
        "close10(10, 12)",
        "close10(11, 10)",
        "close10(5, 21)",
        "close10(0, 20)",
        "close10(10, 10)",
    };

    static final int[] expectedResults = {
        8,
        8,
        0,
        0,
        9,
        8,
        10,
        10,
        5,
        0,
        0,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] resultsArray = {
            Close10.close10(8, 13),
            Close10.close10(13, 8),
            Close10.close10(13, 7),
            Close10.close10(7, 13),
            Close10.close10(9, 13),
            Close10.close10(13, 8),
            Close10.close10(10, 12),
            Close10.close10(11, 10),
            Close10.close10(5, 21),
            Close10.close10(0, 20),
            Close10.close10(10, 10),
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
