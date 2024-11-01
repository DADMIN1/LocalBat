package AP1.Testcases;
import AP1.ScoresIncreasing;

public final class _ScoresIncreasing
{
    static final String[] testcaseStrings = {
        "scoresIncreasing([1, 3, 4])",
        "scoresIncreasing([1, 3, 2])",
        "scoresIncreasing([1, 1, 4])",
        "scoresIncreasing([1, 1, 2, 4, 4, 7])",
        "scoresIncreasing([1, 1, 2, 4, 3, 7])",
        "scoresIncreasing([-5, 4, 11])",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        true,
        true,
        false,
        true,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] scores0 = {1, 3, 4}; 
        final int[] scores1 = {1, 3, 2}; 
        final int[] scores2 = {1, 1, 4}; 
        final int[] scores3 = {1, 1, 2, 4, 4, 7}; 
        final int[] scores4 = {1, 1, 2, 4, 3, 7}; 
        final int[] scores5 = {-5, 4, 11}; 

        final boolean[] resultsArray = {
            ScoresIncreasing.scoresIncreasing(scores0),
            ScoresIncreasing.scoresIncreasing(scores1),
            ScoresIncreasing.scoresIncreasing(scores2),
            ScoresIncreasing.scoresIncreasing(scores3),
            ScoresIncreasing.scoresIncreasing(scores4),
            ScoresIncreasing.scoresIncreasing(scores5),
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
