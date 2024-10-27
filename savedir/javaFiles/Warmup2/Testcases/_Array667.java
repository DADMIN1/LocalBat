package Warmup2.Testcases;
import Warmup2.Array667;

public final class _Array667
{
    static final String[] testcaseStrings = {
        "array667([6, 6, 2])",
        "array667([6, 6, 2, 6])",
        "array667([6, 7, 2, 6])",
        "array667([6, 6, 2, 6, 7])",
        "array667([1, 6, 3])",
        "array667([6, 1])",
        "array667([])",
        "array667([3, 6, 7, 6])",
        "array667([3, 6, 6, 7])",
        "array667([6, 3, 6, 6])",
        "array667([6, 7, 6, 6])",
        "array667([1, 2, 3, 5, 6])",
        "array667([1, 2, 3, 6, 6])",
    };

    static final int[] expectedResults = {
        1,
        1,
        1,
        2,
        0,
        0,
        0,
        1,
        2,
        1,
        2,
        0,
        1,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] nums0 = { 6, 6, 2 }; 
        final int[] nums1 = { 6, 6, 2, 6 }; 
        final int[] nums2 = { 6, 7, 2, 6 }; 
        final int[] nums3 = { 6, 6, 2, 6, 7 }; 
        final int[] nums4 = { 1, 6, 3 }; 
        final int[] nums5 = { 6, 1 }; 
        final int[] nums6 = {  }; 
        final int[] nums7 = { 3, 6, 7, 6 }; 
        final int[] nums8 = { 3, 6, 6, 7 }; 
        final int[] nums9 = { 6, 3, 6, 6 }; 
        final int[] nums10 = { 6, 7, 6, 6 }; 
        final int[] nums11 = { 1, 2, 3, 5, 6 }; 
        final int[] nums12 = { 1, 2, 3, 6, 6 }; 

        final int[] resultsArray = {
            Array667.array667(nums0),
            Array667.array667(nums1),
            Array667.array667(nums2),
            Array667.array667(nums3),
            Array667.array667(nums4),
            Array667.array667(nums5),
            Array667.array667(nums6),
            Array667.array667(nums7),
            Array667.array667(nums8),
            Array667.array667(nums9),
            Array667.array667(nums10),
            Array667.array667(nums11),
            Array667.array667(nums12),
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
