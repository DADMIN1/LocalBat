package Recursion2.Testcases;
import Recursion2.SplitArray;

public class _SplitArray
{
    static String[] testcaseStrings = {
        "splitArray([2, 2])",
        "splitArray([2, 3])",
        "splitArray([5, 2, 3])",
        "splitArray([5, 2, 2])",
        "splitArray([1, 1, 1, 1, 1, 1])",
        "splitArray([1, 1, 1, 1, 1])",
        "splitArray([])",
        "splitArray([1])",
        "splitArray([3, 5])",
        "splitArray([5, 3, 2])",
        "splitArray([2, 2, 10, 10, 1, 1])",
        "splitArray([1, 2, 2, 10, 10, 1, 1])",
        "splitArray([1, 2, 3, 10, 10, 1, 1])",
    };

    static boolean[] expectedResults = {
        true,
        false,
        true,
        false,
        true,
        false,
        true,
        false,
        false,
        true,
        true,
        false,
        true,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 2, 2 }; 
        int[] nums1 = { 2, 3 }; 
        int[] nums2 = { 5, 2, 3 }; 
        int[] nums3 = { 5, 2, 2 }; 
        int[] nums4 = { 1, 1, 1, 1, 1, 1 }; 
        int[] nums5 = { 1, 1, 1, 1, 1 }; 
        int[] nums6 = {  }; 
        int[] nums7 = { 1 }; 
        int[] nums8 = { 3, 5 }; 
        int[] nums9 = { 5, 3, 2 }; 
        int[] nums10 = { 2, 2, 10, 10, 1, 1 }; 
        int[] nums11 = { 1, 2, 2, 10, 10, 1, 1 }; 
        int[] nums12 = { 1, 2, 3, 10, 10, 1, 1 }; 

        boolean[] resultsArray = {
            SplitArray.splitArray(nums0),
            SplitArray.splitArray(nums1),
            SplitArray.splitArray(nums2),
            SplitArray.splitArray(nums3),
            SplitArray.splitArray(nums4),
            SplitArray.splitArray(nums5),
            SplitArray.splitArray(nums6),
            SplitArray.splitArray(nums7),
            SplitArray.splitArray(nums8),
            SplitArray.splitArray(nums9),
            SplitArray.splitArray(nums10),
            SplitArray.splitArray(nums11),
            SplitArray.splitArray(nums12),
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
