package Recursion1.Testcases;
import Recursion1.Count7;

public final class _Count7
{
    static final String[] testcaseStrings = {
        "count7(717)",
        "count7(7)",
        "count7(123)",
        "count7(77)",
        "count7(7123)",
        "count7(771237)",
        "count7(771737)",
        "count7(47571)",
        "count7(777777)",
        "count7(70701277)",
        "count7(777576197)",
        "count7(99999)",
        "count7(99799)",
    };

    static final int[] expectedResults = {
        2,
        1,
        0,
        2,
        1,
        3,
        4,
        2,
        6,
        4,
        5,
        0,
        1,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] resultsArray = {
            Count7.count7(717),
            Count7.count7(7),
            Count7.count7(123),
            Count7.count7(77),
            Count7.count7(7123),
            Count7.count7(771237),
            Count7.count7(771737),
            Count7.count7(47571),
            Count7.count7(777777),
            Count7.count7(70701277),
            Count7.count7(777576197),
            Count7.count7(99999),
            Count7.count7(99799),
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
