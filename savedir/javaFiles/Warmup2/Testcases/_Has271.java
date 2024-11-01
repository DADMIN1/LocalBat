package Warmup2.Testcases;
import Warmup2.Has271;

public final class _Has271
{
    static final String[] testcaseStrings = {
        "has271([1, 2, 7, 1])",
        "has271([1, 2, 8, 1])",
        "has271([2, 7, 1])",
        "has271([3, 8, 2])",
        "has271([2, 7, 3])",
        "has271([2, 7, 4])",
        "has271([2, 7, -1])",
        "has271([2, 7, -2])",
        "has271([4, 5, 3, 8, 0])",
        "has271([2, 7, 5, 10, 4])",
        "has271([2, 7, -2, 4, 9, 3])",
        "has271([2, 7, 5, 10, 1])",
        "has271([2, 7, -2, 4, 10, 2])",
        "has271([1, 1, 4, 9, 0])",
        "has271([1, 1, 4, 9, 4, 9, 2])",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        true,
        true,
        true,
        false,
        true,
        false,
        true,
        true,
        true,
        false,
        false,
        false,
        true,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] nums0 = {1, 2, 7, 1}; 
        final int[] nums1 = {1, 2, 8, 1}; 
        final int[] nums2 = {2, 7, 1}; 
        final int[] nums3 = {3, 8, 2}; 
        final int[] nums4 = {2, 7, 3}; 
        final int[] nums5 = {2, 7, 4}; 
        final int[] nums6 = {2, 7, -1}; 
        final int[] nums7 = {2, 7, -2}; 
        final int[] nums8 = {4, 5, 3, 8, 0}; 
        final int[] nums9 = {2, 7, 5, 10, 4}; 
        final int[] nums10 = {2, 7, -2, 4, 9, 3}; 
        final int[] nums11 = {2, 7, 5, 10, 1}; 
        final int[] nums12 = {2, 7, -2, 4, 10, 2}; 
        final int[] nums13 = {1, 1, 4, 9, 0}; 
        final int[] nums14 = {1, 1, 4, 9, 4, 9, 2}; 

        final boolean[] resultsArray = {
            Has271.has271(nums0),
            Has271.has271(nums1),
            Has271.has271(nums2),
            Has271.has271(nums3),
            Has271.has271(nums4),
            Has271.has271(nums5),
            Has271.has271(nums6),
            Has271.has271(nums7),
            Has271.has271(nums8),
            Has271.has271(nums9),
            Has271.has271(nums10),
            Has271.has271(nums11),
            Has271.has271(nums12),
            Has271.has271(nums13),
            Has271.has271(nums14),
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
