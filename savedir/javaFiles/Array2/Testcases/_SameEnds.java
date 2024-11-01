package Array2.Testcases;
import Array2.SameEnds;

public final class _SameEnds
{
    static final String[] testcaseStrings = {
        "sameEnds([5, 6, 45, 99, 13, 5, 6], 1)",
        "sameEnds([5, 6, 45, 99, 13, 5, 6], 2)",
        "sameEnds([5, 6, 45, 99, 13, 5, 6], 3)",
        "sameEnds([1, 2, 5, 2, 1], 1)",
        "sameEnds([1, 2, 5, 2, 1], 2)",
        "sameEnds([1, 2, 5, 2, 1], 0)",
        "sameEnds([1, 2, 5, 2, 1], 5)",
        "sameEnds([1, 1, 1], 0)",
        "sameEnds([1, 1, 1], 1)",
        "sameEnds([1, 1, 1], 2)",
        "sameEnds([1, 1, 1], 3)",
        "sameEnds([1], 1)",
        "sameEnds([], 0)",
        "sameEnds([4, 2, 4, 5], 1)",
    };

    static final boolean[] expectedResults = {
        false,
        true,
        false,
        true,
        false,
        true,
        true,
        true,
        true,
        true,
        true,
        true,
        true,
        false,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] nums0 = {5, 6, 45, 99, 13, 5, 6}; 
        final int[] nums1 = {5, 6, 45, 99, 13, 5, 6}; 
        final int[] nums2 = {5, 6, 45, 99, 13, 5, 6}; 
        final int[] nums3 = {1, 2, 5, 2, 1}; 
        final int[] nums4 = {1, 2, 5, 2, 1}; 
        final int[] nums5 = {1, 2, 5, 2, 1}; 
        final int[] nums6 = {1, 2, 5, 2, 1}; 
        final int[] nums7 = {1, 1, 1}; 
        final int[] nums8 = {1, 1, 1}; 
        final int[] nums9 = {1, 1, 1}; 
        final int[] nums10 = {1, 1, 1}; 
        final int[] nums11 = {1}; 
        final int[] nums12 = {}; 
        final int[] nums13 = {4, 2, 4, 5}; 

        final boolean[] resultsArray = {
            SameEnds.sameEnds(nums0, 1),
            SameEnds.sameEnds(nums1, 2),
            SameEnds.sameEnds(nums2, 3),
            SameEnds.sameEnds(nums3, 1),
            SameEnds.sameEnds(nums4, 2),
            SameEnds.sameEnds(nums5, 0),
            SameEnds.sameEnds(nums6, 5),
            SameEnds.sameEnds(nums7, 0),
            SameEnds.sameEnds(nums8, 1),
            SameEnds.sameEnds(nums9, 2),
            SameEnds.sameEnds(nums10, 3),
            SameEnds.sameEnds(nums11, 1),
            SameEnds.sameEnds(nums12, 0),
            SameEnds.sameEnds(nums13, 1),
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
