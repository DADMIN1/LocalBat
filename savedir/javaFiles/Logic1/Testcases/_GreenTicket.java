package Logic1.Testcases;
import Logic1.GreenTicket;

public class _GreenTicket
{
    static String[] testcaseStrings = {
        "greenTicket(1, 2, 3)",
        "greenTicket(2, 2, 2)",
        "greenTicket(1, 1, 2)",
    };

    static int[] expectedResults = { 0, 20, 10, };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            GreenTicket.greenTicket(1, 2, 3),
            GreenTicket.greenTicket(2, 2, 2),
            GreenTicket.greenTicket(1, 1, 2),
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
