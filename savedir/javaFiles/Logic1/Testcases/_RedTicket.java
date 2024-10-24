package Logic1.Testcases;
import Logic1.RedTicket;

public class _RedTicket
{
    static String[] testcaseStrings = {
        "redTicket(2, 2, 2)",
        "redTicket(2, 2, 1)",
        "redTicket(0, 0, 0)",
        "redTicket(2, 0, 0)",
        "redTicket(1, 1, 1)",
        "redTicket(1, 2, 1)",
        "redTicket(1, 2, 0)",
        "redTicket(0, 2, 2)",
        "redTicket(1, 2, 2)",
        "redTicket(0, 2, 0)",
        "redTicket(1, 1, 2)",
    };

    static int[] expectedResults = {
        10,
        0,
        5,
        1,
        5,
        0,
        1,
        1,
        1,
        0,
        0,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            RedTicket.redTicket(2, 2, 2),
            RedTicket.redTicket(2, 2, 1),
            RedTicket.redTicket(0, 0, 0),
            RedTicket.redTicket(2, 0, 0),
            RedTicket.redTicket(1, 1, 1),
            RedTicket.redTicket(1, 2, 1),
            RedTicket.redTicket(1, 2, 0),
            RedTicket.redTicket(0, 2, 2),
            RedTicket.redTicket(1, 2, 2),
            RedTicket.redTicket(0, 2, 0),
            RedTicket.redTicket(1, 1, 2),
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
