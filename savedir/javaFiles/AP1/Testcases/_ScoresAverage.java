package AP1.Testcases;
import AP1.ScoresAverage;

public final class _ScoresAverage
{
    static final String[] testcaseStrings = {
        "scoresAverage([2, 2, 4, 4])",
        "scoresAverage([4, 4, 4, 2, 2, 2])",
        "scoresAverage([3, 4, 5, 1, 2, 3])",
        "scoresAverage([5, 6])",
        "scoresAverage([5, 4])",
        "scoresAverage([5, 4, 5, 6, 2, 1, 2, 3])",
    };

    static final int[] expectedResults = {
        4,
        4,
        4,
        6,
        5,
        5,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] scores0 = {2, 2, 4, 4}; 
        final int[] scores1 = {4, 4, 4, 2, 2, 2}; 
        final int[] scores2 = {3, 4, 5, 1, 2, 3}; 
        final int[] scores3 = {5, 6}; 
        final int[] scores4 = {5, 4}; 
        final int[] scores5 = {5, 4, 5, 6, 2, 1, 2, 3}; 

        final int[] resultsArray = {
            ScoresAverage.scoresAverage(scores0),
            ScoresAverage.scoresAverage(scores1),
            ScoresAverage.scoresAverage(scores2),
            ScoresAverage.scoresAverage(scores3),
            ScoresAverage.scoresAverage(scores4),
            ScoresAverage.scoresAverage(scores5),
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
