package Logic1.Testcases;
import Logic1.Old35;

public final class _Old35
{
    static final String[] testcaseStrings = {
        "old35(3)",
        "old35(10)",
        "old35(15)",
        "old35(5)",
        "old35(9)",
        "old35(8)",
        "old35(7)",
        "old35(6)",
        "old35(17)",
        "old35(18)",
        "old35(29)",
        "old35(20)",
        "old35(21)",
        "old35(22)",
        "old35(45)",
        "old35(99)",
    };

    static final boolean[] expectedResults = {
        true,
        true,
        false,
        true,
        true,
        false,
        false,
        true,
        false,
        true,
        false,
        true,
        true,
        false,
        false,
        true,
    };

    public static final void Validate(boolean printSuccess)
    {
        final boolean[] resultsArray = {
            Old35.old35(3),
            Old35.old35(10),
            Old35.old35(15),
            Old35.old35(5),
            Old35.old35(9),
            Old35.old35(8),
            Old35.old35(7),
            Old35.old35(6),
            Old35.old35(17),
            Old35.old35(18),
            Old35.old35(29),
            Old35.old35(20),
            Old35.old35(21),
            Old35.old35(22),
            Old35.old35(45),
            Old35.old35(99),
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
