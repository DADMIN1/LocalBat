package Warmup1.Testcases;
import Warmup1.HasTeen;

public class _HasTeen
{
    static String[] testcaseStrings = {
        "hasTeen(13, 20, 10)",
        "hasTeen(20, 19, 10)",
        "hasTeen(20, 10, 13)",
    };

    static boolean[] expectedResults = { true, true, true, };

    public static void Validate(boolean printSuccess)
    {
        boolean[] resultsArray = {
            HasTeen.hasTeen(13, 20, 10),
            HasTeen.hasTeen(20, 19, 10),
            HasTeen.hasTeen(20, 10, 13),
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
