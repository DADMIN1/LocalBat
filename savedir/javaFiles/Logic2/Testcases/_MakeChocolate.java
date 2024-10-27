package Logic2.Testcases;
import Logic2.MakeChocolate;

public final class _MakeChocolate
{
    static final String[] testcaseStrings = {
        "makeChocolate(4, 1, 9)",
        "makeChocolate(4, 1, 10)",
        "makeChocolate(4, 1, 7)",
        "makeChocolate(6, 2, 7)",
        "makeChocolate(4, 1, 5)",
        "makeChocolate(4, 1, 4)",
        "makeChocolate(5, 4, 9)",
        "makeChocolate(9, 3, 18)",
        "makeChocolate(3, 1, 9)",
        "makeChocolate(1, 2, 7)",
        "makeChocolate(1, 2, 6)",
        "makeChocolate(1, 2, 5)",
        "makeChocolate(6, 1, 10)",
        "makeChocolate(6, 1, 11)",
        "makeChocolate(6, 1, 12)",
        "makeChocolate(6, 1, 13)",
        "makeChocolate(6, 2, 10)",
        "makeChocolate(6, 2, 11)",
        "makeChocolate(6, 2, 12)",
        "makeChocolate(60, 100, 550)",
        "makeChocolate(1000, 1000000, 5000006)",
        "makeChocolate(7, 1, 12)",
        "makeChocolate(7, 1, 13)",
        "makeChocolate(7, 2, 13)",
    };

    static final int[] expectedResults = {
        4,
        -1,
        2,
        2,
        0,
        4,
        4,
        3,
        -1,
        -1,
        1,
        0,
        5,
        6,
        -1,
        -1,
        0,
        1,
        2,
        50,
        6,
        7,
        -1,
        3,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] resultsArray = {
            MakeChocolate.makeChocolate(4, 1, 9),
            MakeChocolate.makeChocolate(4, 1, 10),
            MakeChocolate.makeChocolate(4, 1, 7),
            MakeChocolate.makeChocolate(6, 2, 7),
            MakeChocolate.makeChocolate(4, 1, 5),
            MakeChocolate.makeChocolate(4, 1, 4),
            MakeChocolate.makeChocolate(5, 4, 9),
            MakeChocolate.makeChocolate(9, 3, 18),
            MakeChocolate.makeChocolate(3, 1, 9),
            MakeChocolate.makeChocolate(1, 2, 7),
            MakeChocolate.makeChocolate(1, 2, 6),
            MakeChocolate.makeChocolate(1, 2, 5),
            MakeChocolate.makeChocolate(6, 1, 10),
            MakeChocolate.makeChocolate(6, 1, 11),
            MakeChocolate.makeChocolate(6, 1, 12),
            MakeChocolate.makeChocolate(6, 1, 13),
            MakeChocolate.makeChocolate(6, 2, 10),
            MakeChocolate.makeChocolate(6, 2, 11),
            MakeChocolate.makeChocolate(6, 2, 12),
            MakeChocolate.makeChocolate(60, 100, 550),
            MakeChocolate.makeChocolate(1000, 1000000, 5000006),
            MakeChocolate.makeChocolate(7, 1, 12),
            MakeChocolate.makeChocolate(7, 1, 13),
            MakeChocolate.makeChocolate(7, 2, 13),
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
