package Warmup1.Testcases;
import Warmup1.LoneTeen;

public class _LoneTeen
{
    static String[] testcaseStrings = {
        "loneTeen(13, 99)",
        "loneTeen(21, 19)",
        "loneTeen(13, 13)",
    };

    static boolean[] expectedResults = {
        true,
        true,
        false,
    };

    public static void Validate(boolean printSuccess)
    {
        boolean[] resultsArray = {
            LoneTeen.loneTeen(13, 99),
            LoneTeen.loneTeen(21, 19),
            LoneTeen.loneTeen(13, 13),
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
