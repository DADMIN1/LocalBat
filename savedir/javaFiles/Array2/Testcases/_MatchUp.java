package Array2.Testcases;
import Array2.MatchUp;

public final class _MatchUp
{
    static final String[] testcaseStrings = {
        "matchUp([1, 2, 3], [2, 3, 10])",
        "matchUp([1, 2, 3], [2, 3, 5])",
        "matchUp([1, 2, 3], [2, 3, 3])",
        "matchUp([5, 3], [5, 5])",
        "matchUp([5, 3], [4, 4])",
        "matchUp([5, 3], [3, 3])",
        "matchUp([5, 3], [2, 2])",
        "matchUp([5, 3], [1, 1])",
        "matchUp([5, 3], [0, 0])",
        "matchUp([4], [4])",
        "matchUp([4], [5])",
    };

    static final int[] expectedResults = {
        2,
        3,
        2,
        1,
        2,
        1,
        1,
        1,
        0,
        0,
        1,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] nums10 = { 1, 2, 3 }; final int[] nums20 = { 2, 3, 10 }; 
        final int[] nums11 = { 1, 2, 3 }; final int[] nums21 = { 2, 3, 5 }; 
        final int[] nums12 = { 1, 2, 3 }; final int[] nums22 = { 2, 3, 3 }; 
        final int[] nums13 = { 5, 3 }; final int[] nums23 = { 5, 5 }; 
        final int[] nums14 = { 5, 3 }; final int[] nums24 = { 4, 4 }; 
        final int[] nums15 = { 5, 3 }; final int[] nums25 = { 3, 3 }; 
        final int[] nums16 = { 5, 3 }; final int[] nums26 = { 2, 2 }; 
        final int[] nums17 = { 5, 3 }; final int[] nums27 = { 1, 1 }; 
        final int[] nums18 = { 5, 3 }; final int[] nums28 = { 0, 0 }; 
        final int[] nums19 = { 4 }; final int[] nums29 = { 4 }; 
        final int[] nums110 = { 4 }; final int[] nums210 = { 5 }; 

        final int[] resultsArray = {
            MatchUp.matchUp(nums10, nums20),
            MatchUp.matchUp(nums11, nums21),
            MatchUp.matchUp(nums12, nums22),
            MatchUp.matchUp(nums13, nums23),
            MatchUp.matchUp(nums14, nums24),
            MatchUp.matchUp(nums15, nums25),
            MatchUp.matchUp(nums16, nums26),
            MatchUp.matchUp(nums17, nums27),
            MatchUp.matchUp(nums18, nums28),
            MatchUp.matchUp(nums19, nums29),
            MatchUp.matchUp(nums110, nums210),
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
