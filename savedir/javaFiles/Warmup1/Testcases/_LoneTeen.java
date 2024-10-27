package Warmup1.Testcases;
import Warmup1.LoneTeen;

public final class _LoneTeen
{
    static final String[] testcaseStrings = {
        "loneTeen(13, 99)",
        "loneTeen(21, 19)",
        "loneTeen(13, 13)",
        "loneTeen(14, 20)",
        "loneTeen(20, 15)",
        "loneTeen(16, 17)",
        "loneTeen(16, 9)",
        "loneTeen(16, 18)",
        "loneTeen(13, 19)",
        "loneTeen(13, 20)",
        "loneTeen(6, 18)",
        "loneTeen(99, 13)",
        "loneTeen(99, 99)",
    };

    static final boolean[] expectedResults = {
        true,
        true,
        false,
        true,
        true,
        false,
        true,
        false,
        false,
        true,
        true,
        true,
        false,
    };

    public static final void Validate(boolean printSuccess)
    {
        final boolean[] resultsArray = {
            LoneTeen.loneTeen(13, 99),
            LoneTeen.loneTeen(21, 19),
            LoneTeen.loneTeen(13, 13),
            LoneTeen.loneTeen(14, 20),
            LoneTeen.loneTeen(20, 15),
            LoneTeen.loneTeen(16, 17),
            LoneTeen.loneTeen(16, 9),
            LoneTeen.loneTeen(16, 18),
            LoneTeen.loneTeen(13, 19),
            LoneTeen.loneTeen(13, 20),
            LoneTeen.loneTeen(6, 18),
            LoneTeen.loneTeen(99, 13),
            LoneTeen.loneTeen(99, 99),
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
