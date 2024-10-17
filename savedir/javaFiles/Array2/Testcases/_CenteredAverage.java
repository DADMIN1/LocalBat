package Array2.Testcases;
import Array2.CenteredAverage;

public class _CenteredAverage
{
    static String[] testcaseStrings = {
        "centeredAverage([1, 2, 3, 4, 100])",
        "centeredAverage([1, 1, 5, 5, 10, 8, 7])",
        "centeredAverage([-10, -4, -2, -4, -2, 0])",
    };

    static int[] expectedResults = { 3, 5, -3, };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 1, 2, 3, 4, 100 }; 
        int[] nums1 = { 1, 1, 5, 5, 10, 8, 7 }; 
        int[] nums2 = { -10, -4, -2, -4, -2, 0 }; 

        int[] resultsArray = {
            CenteredAverage.centeredAverage(nums0),
            CenteredAverage.centeredAverage(nums1),
            CenteredAverage.centeredAverage(nums2),
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
