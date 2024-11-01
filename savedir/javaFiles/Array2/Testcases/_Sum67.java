package Array2.Testcases;
import Array2.Sum67;

public final class _Sum67
{
    static final String[] testcaseStrings = {
        "sum67([1, 2, 2])",
        "sum67([1, 2, 2, 6, 99, 99, 7])",
        "sum67([1, 1, 6, 7, 2])",
        "sum67([1, 6, 2, 2, 7, 1, 6, 99, 99, 7])",
        "sum67([1, 6, 2, 6, 2, 7, 1, 6, 99, 99, 7])",
        "sum67([2, 7, 6, 2, 6, 7, 2, 7])",
        "sum67([2, 7, 6, 2, 6, 2, 7])",
        "sum67([1, 6, 7, 7])",
        "sum67([6, 7, 1, 6, 7, 7])",
        "sum67([6, 8, 1, 6, 7])",
        "sum67([])",
        "sum67([6, 7, 11])",
        "sum67([11, 6, 7, 11])",
        "sum67([2, 2, 6, 7, 7])",
    };

    static final int[] expectedResults = {
        5,
        5,
        4,
        2,
        2,
        18,
        9,
        8,
        8,
        0,
        0,
        11,
        22,
        11,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] nums0 = {1, 2, 2}; 
        final int[] nums1 = {1, 2, 2, 6, 99, 99, 7}; 
        final int[] nums2 = {1, 1, 6, 7, 2}; 
        final int[] nums3 = {1, 6, 2, 2, 7, 1, 6, 99, 99, 7}; 
        final int[] nums4 = {1, 6, 2, 6, 2, 7, 1, 6, 99, 99, 7}; 
        final int[] nums5 = {2, 7, 6, 2, 6, 7, 2, 7}; 
        final int[] nums6 = {2, 7, 6, 2, 6, 2, 7}; 
        final int[] nums7 = {1, 6, 7, 7}; 
        final int[] nums8 = {6, 7, 1, 6, 7, 7}; 
        final int[] nums9 = {6, 8, 1, 6, 7}; 
        final int[] nums10 = {}; 
        final int[] nums11 = {6, 7, 11}; 
        final int[] nums12 = {11, 6, 7, 11}; 
        final int[] nums13 = {2, 2, 6, 7, 7}; 

        final int[] resultsArray = {
            Sum67.sum67(nums0),
            Sum67.sum67(nums1),
            Sum67.sum67(nums2),
            Sum67.sum67(nums3),
            Sum67.sum67(nums4),
            Sum67.sum67(nums5),
            Sum67.sum67(nums6),
            Sum67.sum67(nums7),
            Sum67.sum67(nums8),
            Sum67.sum67(nums9),
            Sum67.sum67(nums10),
            Sum67.sum67(nums11),
            Sum67.sum67(nums12),
            Sum67.sum67(nums13),
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
