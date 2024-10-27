package Recursion2.Testcases;
import Recursion2.GroupSum6;

public final class _GroupSum6
{
    static final String[] testcaseStrings = {
        "groupSum6(0, [5, 6, 2], 8)",
        "groupSum6(0, [5, 6, 2], 9)",
        "groupSum6(0, [5, 6, 2], 7)",
        "groupSum6(0, [1], 1)",
        "groupSum6(0, [9], 1)",
        "groupSum6(0, [], 0)",
        "groupSum6(0, [3, 2, 4, 6], 8)",
        "groupSum6(0, [6, 2, 4, 3], 8)",
        "groupSum6(0, [5, 2, 4, 6], 9)",
        "groupSum6(0, [6, 2, 4, 5], 9)",
        "groupSum6(0, [3, 2, 4, 6], 3)",
        "groupSum6(0, [1, 6, 2, 6, 4], 12)",
        "groupSum6(0, [1, 6, 2, 6, 4], 13)",
        "groupSum6(0, [1, 6, 2, 6, 4], 4)",
        "groupSum6(0, [1, 6, 2, 6, 4], 9)",
        "groupSum6(0, [1, 6, 2, 6, 5], 14)",
        "groupSum6(0, [1, 6, 2, 6, 5], 15)",
        "groupSum6(0, [1, 6, 2, 6, 5], 16)",
    };

    static final boolean[] expectedResults = {
        true,
        false,
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
        true,
        false,
        false,
        true,
        true,
        false,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] nums0 = { 5, 6, 2 }; 
        final int[] nums1 = { 5, 6, 2 }; 
        final int[] nums2 = { 5, 6, 2 }; 
        final int[] nums3 = { 1 }; 
        final int[] nums4 = { 9 }; 
        final int[] nums5 = {  }; 
        final int[] nums6 = { 3, 2, 4, 6 }; 
        final int[] nums7 = { 6, 2, 4, 3 }; 
        final int[] nums8 = { 5, 2, 4, 6 }; 
        final int[] nums9 = { 6, 2, 4, 5 }; 
        final int[] nums10 = { 3, 2, 4, 6 }; 
        final int[] nums11 = { 1, 6, 2, 6, 4 }; 
        final int[] nums12 = { 1, 6, 2, 6, 4 }; 
        final int[] nums13 = { 1, 6, 2, 6, 4 }; 
        final int[] nums14 = { 1, 6, 2, 6, 4 }; 
        final int[] nums15 = { 1, 6, 2, 6, 5 }; 
        final int[] nums16 = { 1, 6, 2, 6, 5 }; 
        final int[] nums17 = { 1, 6, 2, 6, 5 }; 

        final boolean[] resultsArray = {
            GroupSum6.groupSum6(0, nums0, 8),
            GroupSum6.groupSum6(0, nums1, 9),
            GroupSum6.groupSum6(0, nums2, 7),
            GroupSum6.groupSum6(0, nums3, 1),
            GroupSum6.groupSum6(0, nums4, 1),
            GroupSum6.groupSum6(0, nums5, 0),
            GroupSum6.groupSum6(0, nums6, 8),
            GroupSum6.groupSum6(0, nums7, 8),
            GroupSum6.groupSum6(0, nums8, 9),
            GroupSum6.groupSum6(0, nums9, 9),
            GroupSum6.groupSum6(0, nums10, 3),
            GroupSum6.groupSum6(0, nums11, 12),
            GroupSum6.groupSum6(0, nums12, 13),
            GroupSum6.groupSum6(0, nums13, 4),
            GroupSum6.groupSum6(0, nums14, 9),
            GroupSum6.groupSum6(0, nums15, 14),
            GroupSum6.groupSum6(0, nums16, 15),
            GroupSum6.groupSum6(0, nums17, 16),
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
