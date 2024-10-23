package Logic1.Testcases;
import Logic1.BlueTicket;

public class _BlueTicket
{
    static String[] testcaseStrings = {
        "blueTicket(9, 1, 0)",
        "blueTicket(9, 2, 0)",
        "blueTicket(6, 1, 4)",
    };

    static int[] expectedResults = {
        10,
        0,
        10,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            BlueTicket.blueTicket(9, 1, 0),
            BlueTicket.blueTicket(9, 2, 0),
            BlueTicket.blueTicket(6, 1, 4),
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
