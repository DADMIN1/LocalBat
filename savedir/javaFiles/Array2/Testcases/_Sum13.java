package Array2.Testcases;
import Array2.Sum13;

public final class _Sum13
{
    static final String[] testcaseStrings = {
        "sum13([1, 2, 2, 1])",
        "sum13([1, 1])",
        "sum13([1, 2, 2, 1, 13])",
        "sum13([1, 2, 13, 2, 1, 13])",
        "sum13([13, 1, 2, 13, 2, 1, 13])",
        "sum13([])",
        "sum13([13])",
        "sum13([13, 13])",
        "sum13([13, 0, 13])",
        "sum13([13, 1, 13])",
        "sum13([5, 7, 2])",
        "sum13([5, 13, 2])",
        "sum13([0])",
        "sum13([13, 0])",
    };

    static final int[] expectedResults = {
        6,
        2,
        6,
        4,
        3,
        0,
        0,
        0,
        0,
        0,
        14,
        5,
        0,
        0,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] nums0 = {1, 2, 2, 1}; 
        final int[] nums1 = {1, 1}; 
        final int[] nums2 = {1, 2, 2, 1, 13}; 
        final int[] nums3 = {1, 2, 13, 2, 1, 13}; 
        final int[] nums4 = {13, 1, 2, 13, 2, 1, 13}; 
        final int[] nums5 = {}; 
        final int[] nums6 = {13}; 
        final int[] nums7 = {13, 13}; 
        final int[] nums8 = {13, 0, 13}; 
        final int[] nums9 = {13, 1, 13}; 
        final int[] nums10 = {5, 7, 2}; 
        final int[] nums11 = {5, 13, 2}; 
        final int[] nums12 = {0}; 
        final int[] nums13 = {13, 0}; 

        final int[] resultsArray = {
            Sum13.sum13(nums0),
            Sum13.sum13(nums1),
            Sum13.sum13(nums2),
            Sum13.sum13(nums3),
            Sum13.sum13(nums4),
            Sum13.sum13(nums5),
            Sum13.sum13(nums6),
            Sum13.sum13(nums7),
            Sum13.sum13(nums8),
            Sum13.sum13(nums9),
            Sum13.sum13(nums10),
            Sum13.sum13(nums11),
            Sum13.sum13(nums12),
            Sum13.sum13(nums13),
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
