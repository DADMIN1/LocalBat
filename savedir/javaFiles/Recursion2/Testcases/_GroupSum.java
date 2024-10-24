package Recursion2.Testcases;
import Recursion2.GroupSum;

public class _GroupSum
{
    static String[] testcaseStrings = {
        "groupSum(0, [2, 4, 8], 10)",
        "groupSum(0, [2, 4, 8], 14)",
        "groupSum(0, [2, 4, 8], 9)",
        "groupSum(0, [2, 4, 8], 8)",
        "groupSum(1, [2, 4, 8], 8)",
        "groupSum(1, [2, 4, 8], 2)",
        "groupSum(0, [1], 1)",
        "groupSum(0, [9], 1)",
        "groupSum(1, [9], 0)",
        "groupSum(0, [], 0)",
        "groupSum(0, [10, 2, 2, 5], 17)",
        "groupSum(0, [10, 2, 2, 5], 15)",
        "groupSum(0, [10, 2, 2, 5], 9)",
    };

    static boolean[] expectedResults = {
        true,
        true,
        false,
        true,
        true,
        false,
        true,
        false,
        true,
        true,
        true,
        true,
        true,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 2, 4, 8 }; 
        int[] nums1 = { 2, 4, 8 }; 
        int[] nums2 = { 2, 4, 8 }; 
        int[] nums3 = { 2, 4, 8 }; 
        int[] nums4 = { 2, 4, 8 }; 
        int[] nums5 = { 2, 4, 8 }; 
        int[] nums6 = { 1 }; 
        int[] nums7 = { 9 }; 
        int[] nums8 = { 9 }; 
        int[] nums9 = {  }; 
        int[] nums10 = { 10, 2, 2, 5 }; 
        int[] nums11 = { 10, 2, 2, 5 }; 
        int[] nums12 = { 10, 2, 2, 5 }; 

        boolean[] resultsArray = {
            GroupSum.groupSum(0, nums0, 10),
            GroupSum.groupSum(0, nums1, 14),
            GroupSum.groupSum(0, nums2, 9),
            GroupSum.groupSum(0, nums3, 8),
            GroupSum.groupSum(1, nums4, 8),
            GroupSum.groupSum(1, nums5, 2),
            GroupSum.groupSum(0, nums6, 1),
            GroupSum.groupSum(0, nums7, 1),
            GroupSum.groupSum(1, nums8, 0),
            GroupSum.groupSum(0, nums9, 0),
            GroupSum.groupSum(0, nums10, 17),
            GroupSum.groupSum(0, nums11, 15),
            GroupSum.groupSum(0, nums12, 9),
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
