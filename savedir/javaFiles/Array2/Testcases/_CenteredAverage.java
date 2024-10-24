package Array2.Testcases;
import Array2.CenteredAverage;

public class _CenteredAverage
{
    static String[] testcaseStrings = {
        "centeredAverage([1, 2, 3, 4, 100])",
        "centeredAverage([1, 1, 5, 5, 10, 8, 7])",
        "centeredAverage([-10, -4, -2, -4, -2, 0])",
        "centeredAverage([5, 3, 4, 6, 2])",
        "centeredAverage([5, 3, 4, 0, 100])",
        "centeredAverage([100, 0, 5, 3, 4])",
        "centeredAverage([4, 0, 100])",
        "centeredAverage([0, 2, 3, 4, 100])",
        "centeredAverage([1, 1, 100])",
        "centeredAverage([7, 7, 7])",
        "centeredAverage([1, 7, 8])",
        "centeredAverage([1, 1, 99, 99])",
        "centeredAverage([1000, 0, 1, 99])",
        "centeredAverage([4, 4, 4, 4, 5])",
        "centeredAverage([4, 4, 4, 1, 5])",
        "centeredAverage([6, 4, 8, 12, 3])",
    };

    static int[] expectedResults = {
        3,
        5,
        -3,
        4,
        4,
        4,
        4,
        3,
        1,
        7,
        7,
        50,
        50,
        4,
        4,
        6,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 1, 2, 3, 4, 100 }; 
        int[] nums1 = { 1, 1, 5, 5, 10, 8, 7 }; 
        int[] nums2 = { -10, -4, -2, -4, -2, 0 }; 
        int[] nums3 = { 5, 3, 4, 6, 2 }; 
        int[] nums4 = { 5, 3, 4, 0, 100 }; 
        int[] nums5 = { 100, 0, 5, 3, 4 }; 
        int[] nums6 = { 4, 0, 100 }; 
        int[] nums7 = { 0, 2, 3, 4, 100 }; 
        int[] nums8 = { 1, 1, 100 }; 
        int[] nums9 = { 7, 7, 7 }; 
        int[] nums10 = { 1, 7, 8 }; 
        int[] nums11 = { 1, 1, 99, 99 }; 
        int[] nums12 = { 1000, 0, 1, 99 }; 
        int[] nums13 = { 4, 4, 4, 4, 5 }; 
        int[] nums14 = { 4, 4, 4, 1, 5 }; 
        int[] nums15 = { 6, 4, 8, 12, 3 }; 

        int[] resultsArray = {
            CenteredAverage.centeredAverage(nums0),
            CenteredAverage.centeredAverage(nums1),
            CenteredAverage.centeredAverage(nums2),
            CenteredAverage.centeredAverage(nums3),
            CenteredAverage.centeredAverage(nums4),
            CenteredAverage.centeredAverage(nums5),
            CenteredAverage.centeredAverage(nums6),
            CenteredAverage.centeredAverage(nums7),
            CenteredAverage.centeredAverage(nums8),
            CenteredAverage.centeredAverage(nums9),
            CenteredAverage.centeredAverage(nums10),
            CenteredAverage.centeredAverage(nums11),
            CenteredAverage.centeredAverage(nums12),
            CenteredAverage.centeredAverage(nums13),
            CenteredAverage.centeredAverage(nums14),
            CenteredAverage.centeredAverage(nums15),
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
