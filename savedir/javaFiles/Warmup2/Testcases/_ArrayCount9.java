package Warmup2.Testcases;
import Warmup2.ArrayCount9;

public class _ArrayCount9
{
    static String[] testcaseStrings = {
        "arrayCount9([1, 2, 9])",
        "arrayCount9([1, 9, 9])",
        "arrayCount9([1, 9, 9, 3, 9])",
        "arrayCount9([1, 2, 3])",
        "arrayCount9([])",
        "arrayCount9([4, 2, 4, 3, 1])",
        "arrayCount9([9, 2, 4, 3, 1])",
    };

    static int[] expectedResults = {
        1,
        2,
        3,
        0,
        0,
        0,
        1,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 1, 2, 9 }; 
        int[] nums1 = { 1, 9, 9 }; 
        int[] nums2 = { 1, 9, 9, 3, 9 }; 
        int[] nums3 = { 1, 2, 3 }; 
        int[] nums4 = {  }; 
        int[] nums5 = { 4, 2, 4, 3, 1 }; 
        int[] nums6 = { 9, 2, 4, 3, 1 }; 

        int[] resultsArray = {
            ArrayCount9.arrayCount9(nums0),
            ArrayCount9.arrayCount9(nums1),
            ArrayCount9.arrayCount9(nums2),
            ArrayCount9.arrayCount9(nums3),
            ArrayCount9.arrayCount9(nums4),
            ArrayCount9.arrayCount9(nums5),
            ArrayCount9.arrayCount9(nums6),
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
