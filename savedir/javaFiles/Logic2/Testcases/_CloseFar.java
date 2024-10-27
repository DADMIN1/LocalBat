package Logic2.Testcases;
import Logic2.CloseFar;

public final class _CloseFar
{
    static final String[] testcaseStrings = {
        "closeFar(1, 2, 10)",
        "closeFar(1, 2, 3)",
        "closeFar(4, 1, 3)",
        "closeFar(4, 5, 3)",
        "closeFar(4, 3, 5)",
        "closeFar(-1, 10, 0)",
        "closeFar(0, -1, 10)",
        "closeFar(10, 10, 8)",
        "closeFar(10, 8, 9)",
        "closeFar(8, 9, 10)",
        "closeFar(8, 9, 7)",
        "closeFar(8, 6, 9)",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        true,
        false,
        false,
        true,
        true,
        true,
        false,
        false,
        false,
        true,
    };

    public static final void Validate(boolean printSuccess)
    {
        final boolean[] resultsArray = {
            CloseFar.closeFar(1, 2, 10),
            CloseFar.closeFar(1, 2, 3),
            CloseFar.closeFar(4, 1, 3),
            CloseFar.closeFar(4, 5, 3),
            CloseFar.closeFar(4, 3, 5),
            CloseFar.closeFar(-1, 10, 0),
            CloseFar.closeFar(0, -1, 10),
            CloseFar.closeFar(10, 10, 8),
            CloseFar.closeFar(10, 8, 9),
            CloseFar.closeFar(8, 9, 10),
            CloseFar.closeFar(8, 9, 7),
            CloseFar.closeFar(8, 6, 9),
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
