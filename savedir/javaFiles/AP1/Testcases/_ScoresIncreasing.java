package AP1.Testcases;
import AP1.ScoresIncreasing;

public class _ScoresIncreasing
{
    static String[] testcaseStrings = {
        "scoresIncreasing([1, 3, 4])",
        "scoresIncreasing([1, 3, 2])",
        "scoresIncreasing([1, 1, 4])",
    };

    static boolean[] expectedResults = { true, false, true, };

    public static void Validate(boolean printSuccess)
    {
        int[] scores0 = { 1, 3, 4 }; 
        int[] scores1 = { 1, 3, 2 }; 
        int[] scores2 = { 1, 1, 4 }; 

        boolean[] resultsArray = {
            ScoresIncreasing.scoresIncreasing(scores0),
            ScoresIncreasing.scoresIncreasing(scores1),
            ScoresIncreasing.scoresIncreasing(scores2),
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
