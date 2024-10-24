package Warmup2.Testcases;
import Warmup2.ArrayFront9;

public class _ArrayFront9
{
    static String[] testcaseStrings = {
        "arrayFront9([1, 2, 9, 3, 4])",
        "arrayFront9([1, 2, 3, 4, 9])",
        "arrayFront9([1, 2, 3, 4, 5])",
        "arrayFront9([9, 2, 3])",
        "arrayFront9([1, 9, 9])",
        "arrayFront9([1, 2, 3])",
        "arrayFront9([1, 9])",
        "arrayFront9([5, 5])",
        "arrayFront9([2])",
        "arrayFront9([9])",
        "arrayFront9([])",
        "arrayFront9([3, 9, 2, 3, 3])",
    };

    static boolean[] expectedResults = {
        true,
        false,
        false,
        true,
        true,
        false,
        true,
        false,
        false,
        true,
        false,
        true,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 1, 2, 9, 3, 4 }; 
        int[] nums1 = { 1, 2, 3, 4, 9 }; 
        int[] nums2 = { 1, 2, 3, 4, 5 }; 
        int[] nums3 = { 9, 2, 3 }; 
        int[] nums4 = { 1, 9, 9 }; 
        int[] nums5 = { 1, 2, 3 }; 
        int[] nums6 = { 1, 9 }; 
        int[] nums7 = { 5, 5 }; 
        int[] nums8 = { 2 }; 
        int[] nums9 = { 9 }; 
        int[] nums10 = {  }; 
        int[] nums11 = { 3, 9, 2, 3, 3 }; 

        boolean[] resultsArray = {
            ArrayFront9.arrayFront9(nums0),
            ArrayFront9.arrayFront9(nums1),
            ArrayFront9.arrayFront9(nums2),
            ArrayFront9.arrayFront9(nums3),
            ArrayFront9.arrayFront9(nums4),
            ArrayFront9.arrayFront9(nums5),
            ArrayFront9.arrayFront9(nums6),
            ArrayFront9.arrayFront9(nums7),
            ArrayFront9.arrayFront9(nums8),
            ArrayFront9.arrayFront9(nums9),
            ArrayFront9.arrayFront9(nums10),
            ArrayFront9.arrayFront9(nums11),
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
