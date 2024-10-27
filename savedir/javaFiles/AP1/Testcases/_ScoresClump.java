package AP1.Testcases;
import AP1.ScoresClump;

public final class _ScoresClump
{
    static final String[] testcaseStrings = {
        "scoresClump([3, 4, 5])",
        "scoresClump([3, 4, 6])",
        "scoresClump([1, 3, 5, 5])",
        "scoresClump([2, 4, 5, 6])",
        "scoresClump([2, 4, 5, 7])",
        "scoresClump([2, 4, 4, 7])",
        "scoresClump([3, 3, 6, 7, 9])",
        "scoresClump([3, 3, 7, 7, 9])",
        "scoresClump([4, 5, 8])",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        true,
        true,
        false,
        true,
        false,
        true,
        false,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] scores0 = { 3, 4, 5 }; 
        final int[] scores1 = { 3, 4, 6 }; 
        final int[] scores2 = { 1, 3, 5, 5 }; 
        final int[] scores3 = { 2, 4, 5, 6 }; 
        final int[] scores4 = { 2, 4, 5, 7 }; 
        final int[] scores5 = { 2, 4, 4, 7 }; 
        final int[] scores6 = { 3, 3, 6, 7, 9 }; 
        final int[] scores7 = { 3, 3, 7, 7, 9 }; 
        final int[] scores8 = { 4, 5, 8 }; 

        final boolean[] resultsArray = {
            ScoresClump.scoresClump(scores0),
            ScoresClump.scoresClump(scores1),
            ScoresClump.scoresClump(scores2),
            ScoresClump.scoresClump(scores3),
            ScoresClump.scoresClump(scores4),
            ScoresClump.scoresClump(scores5),
            ScoresClump.scoresClump(scores6),
            ScoresClump.scoresClump(scores7),
            ScoresClump.scoresClump(scores8),
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
