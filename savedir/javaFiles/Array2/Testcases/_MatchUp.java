package Array2.Testcases;
import Array2.MatchUp;

public class _MatchUp
{
    static String[] testcaseStrings = {
        "matchUp([1, 2, 3], [2, 3, 10])",
        "matchUp([1, 2, 3], [2, 3, 5])",
        "matchUp([1, 2, 3], [2, 3, 3])",
    };

    static int[] expectedResults = { 2, 3, 2, };

    public static void Validate(boolean printSuccess)
    {
        int[] nums10 = { 1, 2, 3 }; int[] nums20 = { 2, 3, 10 }; 
        int[] nums11 = { 1, 2, 3 }; int[] nums21 = { 2, 3, 5 }; 
        int[] nums12 = { 1, 2, 3 }; int[] nums22 = { 2, 3, 3 }; 

        int[] resultsArray = {
            MatchUp.matchUp(nums10, nums20),
            MatchUp.matchUp(nums11, nums21),
            MatchUp.matchUp(nums12, nums22),
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
