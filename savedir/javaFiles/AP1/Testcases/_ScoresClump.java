package AP1.Testcases;
import AP1.ScoresClump;

public class _ScoresClump
{
    static String[] testcaseStrings = {
        "scoresClump([3, 4, 5])",
        "scoresClump([3, 4, 6])",
        "scoresClump([1, 3, 5, 5])",
    };

    static boolean[] expectedResults = {
        true,
        false,
        true,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] scores0 = { 3, 4, 5 }; 
        int[] scores1 = { 3, 4, 6 }; 
        int[] scores2 = { 1, 3, 5, 5 }; 

        boolean[] resultsArray = {
            ScoresClump.scoresClump(scores0),
            ScoresClump.scoresClump(scores1),
            ScoresClump.scoresClump(scores2),
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
