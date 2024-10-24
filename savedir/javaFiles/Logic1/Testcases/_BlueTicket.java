package Logic1.Testcases;
import Logic1.BlueTicket;

public class _BlueTicket
{
    static String[] testcaseStrings = {
        "blueTicket(9, 1, 0)",
        "blueTicket(9, 2, 0)",
        "blueTicket(6, 1, 4)",
        "blueTicket(6, 1, 5)",
        "blueTicket(10, 0, 0)",
        "blueTicket(15, 0, 5)",
        "blueTicket(5, 15, 5)",
        "blueTicket(4, 11, 1)",
        "blueTicket(13, 2, 3)",
        "blueTicket(8, 4, 3)",
        "blueTicket(8, 4, 2)",
        "blueTicket(8, 4, 1)",
    };

    static int[] expectedResults = {
        10,
        0,
        10,
        0,
        10,
        5,
        10,
        5,
        5,
        0,
        10,
        0,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            BlueTicket.blueTicket(9, 1, 0),
            BlueTicket.blueTicket(9, 2, 0),
            BlueTicket.blueTicket(6, 1, 4),
            BlueTicket.blueTicket(6, 1, 5),
            BlueTicket.blueTicket(10, 0, 0),
            BlueTicket.blueTicket(15, 0, 5),
            BlueTicket.blueTicket(5, 15, 5),
            BlueTicket.blueTicket(4, 11, 1),
            BlueTicket.blueTicket(13, 2, 3),
            BlueTicket.blueTicket(8, 4, 3),
            BlueTicket.blueTicket(8, 4, 2),
            BlueTicket.blueTicket(8, 4, 1),
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
