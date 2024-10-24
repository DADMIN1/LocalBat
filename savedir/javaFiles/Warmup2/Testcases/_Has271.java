package Warmup2.Testcases;
import Warmup2.Has271;

public class _Has271
{
    static String[] testcaseStrings = {
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

    static boolean[] expectedResults = {
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

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 1, 2, 7, 1 }; 
        int[] nums1 = { 1, 2, 8, 1 }; 
        int[] nums2 = { 2, 7, 1 }; 
        int[] nums3 = { 3, 8, 2 }; 
        int[] nums4 = { 2, 7, 3 }; 
        int[] nums5 = { 2, 7, 4 }; 
        int[] nums6 = { 2, 7, -1 }; 
        int[] nums7 = { 2, 7, -2 }; 
        int[] nums8 = { 4, 5, 3, 8, 0 }; 
        int[] nums9 = { 2, 7, 5, 10, 4 }; 
        int[] nums10 = { 2, 7, -2, 4, 9, 3 }; 
        int[] nums11 = { 2, 7, 5, 10, 1 }; 
        int[] nums12 = { 2, 7, -2, 4, 10, 2 }; 
        int[] nums13 = { 1, 1, 4, 9, 0 }; 
        int[] nums14 = { 1, 1, 4, 9, 4, 9, 2 }; 

        boolean[] resultsArray = {
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
