package Logic2.Testcases;
import Logic2.EvenlySpaced;

public class _EvenlySpaced
{
    static String[] testcaseStrings = {
        "evenlySpaced(2, 4, 6)",
        "evenlySpaced(4, 6, 2)",
        "evenlySpaced(4, 6, 3)",
        "evenlySpaced(6, 2, 4)",
        "evenlySpaced(6, 2, 8)",
        "evenlySpaced(2, 2, 2)",
        "evenlySpaced(2, 2, 3)",
        "evenlySpaced(9, 10, 11)",
        "evenlySpaced(10, 9, 11)",
        "evenlySpaced(10, 9, 9)",
        "evenlySpaced(2, 4, 4)",
        "evenlySpaced(2, 2, 4)",
        "evenlySpaced(3, 6, 12)",
        "evenlySpaced(12, 3, 6)",
    };

    static boolean[] expectedResults = {
        true,
        true,
        false,
        true,
        false,
        true,
        false,
        true,
        true,
        false,
        false,
        false,
        false,
        false,
    };

    public static void Validate(boolean printSuccess)
    {
        boolean[] resultsArray = {
            EvenlySpaced.evenlySpaced(2, 4, 6),
            EvenlySpaced.evenlySpaced(4, 6, 2),
            EvenlySpaced.evenlySpaced(4, 6, 3),
            EvenlySpaced.evenlySpaced(6, 2, 4),
            EvenlySpaced.evenlySpaced(6, 2, 8),
            EvenlySpaced.evenlySpaced(2, 2, 2),
            EvenlySpaced.evenlySpaced(2, 2, 3),
            EvenlySpaced.evenlySpaced(9, 10, 11),
            EvenlySpaced.evenlySpaced(10, 9, 11),
            EvenlySpaced.evenlySpaced(10, 9, 9),
            EvenlySpaced.evenlySpaced(2, 4, 4),
            EvenlySpaced.evenlySpaced(2, 2, 4),
            EvenlySpaced.evenlySpaced(3, 6, 12),
            EvenlySpaced.evenlySpaced(12, 3, 6),
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
