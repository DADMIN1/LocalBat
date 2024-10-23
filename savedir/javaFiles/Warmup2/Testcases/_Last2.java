package Warmup2.Testcases;
import Warmup2.Last2;

public class _Last2
{
    static String[] testcaseStrings = {
        "last2(\"hixxhi\")",
        "last2(\"xaxxaxaxx\")",
        "last2(\"axxxaaxx\")",
    };

    static int[] expectedResults = {
        1,
        1,
        2,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] resultsArray = {
            Last2.last2("hixxhi"),
            Last2.last2("xaxxaxaxx"),
            Last2.last2("axxxaaxx"),
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
