package Warmup1.Testcases;
import Warmup1.Close10;

public class _Close10
{
    static String[] testcaseStrings = {
        "close10(8, 13)",
        "close10(13, 8)",
        "close10(13, 7)",
    };

    static int[] expectedResults = { 8, 8, 0, };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            Close10.close10(8, 13),
            Close10.close10(13, 8),
            Close10.close10(13, 7),
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
