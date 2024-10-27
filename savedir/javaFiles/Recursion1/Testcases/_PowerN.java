package Recursion1.Testcases;
import Recursion1.PowerN;

public final class _PowerN
{
    static final String[] testcaseStrings = {
        "powerN(3, 1)",
        "powerN(3, 2)",
        "powerN(3, 3)",
        "powerN(2, 1)",
        "powerN(2, 2)",
        "powerN(2, 3)",
        "powerN(2, 4)",
        "powerN(2, 5)",
        "powerN(10, 1)",
        "powerN(10, 2)",
        "powerN(10, 3)",
    };

    static final int[] expectedResults = {
        3,
        9,
        27,
        2,
        4,
        8,
        16,
        32,
        10,
        100,
        1000,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] resultsArray = {
            PowerN.powerN(3, 1),
            PowerN.powerN(3, 2),
            PowerN.powerN(3, 3),
            PowerN.powerN(2, 1),
            PowerN.powerN(2, 2),
            PowerN.powerN(2, 3),
            PowerN.powerN(2, 4),
            PowerN.powerN(2, 5),
            PowerN.powerN(10, 1),
            PowerN.powerN(10, 2),
            PowerN.powerN(10, 3),
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
