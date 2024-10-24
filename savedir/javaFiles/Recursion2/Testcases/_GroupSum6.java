package Recursion2.Testcases;
import Recursion2.GroupSum6;

public class _GroupSum6
{
    static String[] testcaseStrings = {
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

    static boolean[] expectedResults = {
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

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 5, 6, 2 }; 
        int[] nums1 = { 5, 6, 2 }; 
        int[] nums2 = { 5, 6, 2 }; 
        int[] nums3 = { 1 }; 
        int[] nums4 = { 9 }; 
        int[] nums5 = {  }; 
        int[] nums6 = { 3, 2, 4, 6 }; 
        int[] nums7 = { 6, 2, 4, 3 }; 
        int[] nums8 = { 5, 2, 4, 6 }; 
        int[] nums9 = { 6, 2, 4, 5 }; 
        int[] nums10 = { 3, 2, 4, 6 }; 
        int[] nums11 = { 1, 6, 2, 6, 4 }; 
        int[] nums12 = { 1, 6, 2, 6, 4 }; 
        int[] nums13 = { 1, 6, 2, 6, 4 }; 
        int[] nums14 = { 1, 6, 2, 6, 4 }; 
        int[] nums15 = { 1, 6, 2, 6, 5 }; 
        int[] nums16 = { 1, 6, 2, 6, 5 }; 
        int[] nums17 = { 1, 6, 2, 6, 5 }; 

        boolean[] resultsArray = {
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
