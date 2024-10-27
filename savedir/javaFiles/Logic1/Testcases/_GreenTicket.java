package Logic1.Testcases;
import Logic1.GreenTicket;

public final class _GreenTicket
{
    static final String[] testcaseStrings = {
        "greenTicket(1, 2, 3)",
        "greenTicket(2, 2, 2)",
        "greenTicket(1, 1, 2)",
        "greenTicket(2, 1, 1)",
        "greenTicket(1, 2, 1)",
        "greenTicket(3, 2, 1)",
        "greenTicket(0, 0, 0)",
        "greenTicket(2, 0, 0)",
        "greenTicket(0, 9, 10)",
        "greenTicket(0, 10, 0)",
        "greenTicket(9, 9, 9)",
        "greenTicket(9, 0, 9)",
    };

    static final int[] expectedResults = {
        0,
        20,
        10,
        10,
        10,
        0,
        20,
        10,
        0,
        10,
        20,
        10,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] resultsArray = {
            GreenTicket.greenTicket(1, 2, 3),
            GreenTicket.greenTicket(2, 2, 2),
            GreenTicket.greenTicket(1, 1, 2),
            GreenTicket.greenTicket(2, 1, 1),
            GreenTicket.greenTicket(1, 2, 1),
            GreenTicket.greenTicket(3, 2, 1),
            GreenTicket.greenTicket(0, 0, 0),
            GreenTicket.greenTicket(2, 0, 0),
            GreenTicket.greenTicket(0, 9, 10),
            GreenTicket.greenTicket(0, 10, 0),
            GreenTicket.greenTicket(9, 9, 9),
            GreenTicket.greenTicket(9, 0, 9),
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
