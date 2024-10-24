package Logic1.Testcases;
import Logic1.TeaParty;

public class _TeaParty
{
    static String[] testcaseStrings = {
        "teaParty(6, 8)",
        "teaParty(3, 8)",
        "teaParty(20, 6)",
        "teaParty(12, 6)",
        "teaParty(11, 6)",
        "teaParty(11, 4)",
        "teaParty(4, 5)",
        "teaParty(5, 5)",
        "teaParty(6, 6)",
        "teaParty(5, 10)",
        "teaParty(5, 9)",
        "teaParty(10, 4)",
        "teaParty(10, 20)",
    };

    static int[] expectedResults = {
        1,
        0,
        2,
        2,
        1,
        0,
        0,
        1,
        1,
        2,
        1,
        0,
        2,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            TeaParty.teaParty(6, 8),
            TeaParty.teaParty(3, 8),
            TeaParty.teaParty(20, 6),
            TeaParty.teaParty(12, 6),
            TeaParty.teaParty(11, 6),
            TeaParty.teaParty(11, 4),
            TeaParty.teaParty(4, 5),
            TeaParty.teaParty(5, 5),
            TeaParty.teaParty(6, 6),
            TeaParty.teaParty(5, 10),
            TeaParty.teaParty(5, 9),
            TeaParty.teaParty(10, 4),
            TeaParty.teaParty(10, 20),
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
