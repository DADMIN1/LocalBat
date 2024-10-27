package Array2.Testcases;
import Array2.ModThree;

public final class _ModThree
{
    static final String[] testcaseStrings = {
        "modThree([2, 1, 3, 5])",
        "modThree([2, 1, 2, 5])",
        "modThree([2, 4, 2, 5])",
        "modThree([1, 2, 1, 2, 1])",
        "modThree([9, 9, 9])",
        "modThree([1, 2, 1])",
        "modThree([1, 2])",
        "modThree([1])",
        "modThree([])",
        "modThree([9, 7, 2, 9])",
        "modThree([9, 7, 2, 9, 2, 2])",
        "modThree([9, 7, 2, 9, 2, 2, 6])",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        true,
        false,
        true,
        false,
        false,
        false,
        false,
        false,
        false,
        true,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] nums0 = { 2, 1, 3, 5 }; 
        final int[] nums1 = { 2, 1, 2, 5 }; 
        final int[] nums2 = { 2, 4, 2, 5 }; 
        final int[] nums3 = { 1, 2, 1, 2, 1 }; 
        final int[] nums4 = { 9, 9, 9 }; 
        final int[] nums5 = { 1, 2, 1 }; 
        final int[] nums6 = { 1, 2 }; 
        final int[] nums7 = { 1 }; 
        final int[] nums8 = {  }; 
        final int[] nums9 = { 9, 7, 2, 9 }; 
        final int[] nums10 = { 9, 7, 2, 9, 2, 2 }; 
        final int[] nums11 = { 9, 7, 2, 9, 2, 2, 6 }; 

        final boolean[] resultsArray = {
            ModThree.modThree(nums0),
            ModThree.modThree(nums1),
            ModThree.modThree(nums2),
            ModThree.modThree(nums3),
            ModThree.modThree(nums4),
            ModThree.modThree(nums5),
            ModThree.modThree(nums6),
            ModThree.modThree(nums7),
            ModThree.modThree(nums8),
            ModThree.modThree(nums9),
            ModThree.modThree(nums10),
            ModThree.modThree(nums11),
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
