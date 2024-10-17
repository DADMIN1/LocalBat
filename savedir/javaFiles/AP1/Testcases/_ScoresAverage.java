package AP1.Testcases;
import AP1.ScoresAverage;

public class _ScoresAverage
{
    static String[] testcaseStrings = {
        "scoresAverage([2, 2, 4, 4])",
        "scoresAverage([4, 4, 4, 2, 2, 2])",
        "scoresAverage([3, 4, 5, 1, 2, 3])",
    };

    static int[] expectedResults = { 4, 4, 4, };

    public static void Validate(boolean printSuccess)
    {
        int[] scores0 = { 2, 2, 4, 4 }; 
        int[] scores1 = { 4, 4, 4, 2, 2, 2 }; 
        int[] scores2 = { 3, 4, 5, 1, 2, 3 }; 

        int[] resultsArray = {
            ScoresAverage.scoresAverage(scores0),
            ScoresAverage.scoresAverage(scores1),
            ScoresAverage.scoresAverage(scores2),
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
