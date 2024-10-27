package Recursion2.Testcases;
import Recursion2.GroupSum5;

public final class _GroupSum5
{
    static final String[] testcaseStrings = {
        "groupSum5(0, [2, 5, 10, 4], 19)",
        "groupSum5(0, [2, 5, 10, 4], 17)",
        "groupSum5(0, [2, 5, 10, 4], 12)",
        "groupSum5(0, [2, 5, 4, 10], 12)",
        "groupSum5(0, [3, 5, 1], 4)",
        "groupSum5(0, [3, 5, 1], 5)",
        "groupSum5(0, [1, 3, 5], 5)",
        "groupSum5(0, [3, 5, 1], 9)",
        "groupSum5(0, [2, 5, 10, 4], 7)",
        "groupSum5(0, [2, 5, 10, 4], 15)",
        "groupSum5(0, [2, 5, 10, 4], 11)",
        "groupSum5(0, [1], 1)",
        "groupSum5(0, [9], 1)",
        "groupSum5(0, [9], 0)",
        "groupSum5(0, [], 0)",
    };

    static final boolean[] expectedResults = {
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
        false,
        true,
        false,
        true,
        true,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] nums0 = { 2, 5, 10, 4 }; 
        final int[] nums1 = { 2, 5, 10, 4 }; 
        final int[] nums2 = { 2, 5, 10, 4 }; 
        final int[] nums3 = { 2, 5, 4, 10 }; 
        final int[] nums4 = { 3, 5, 1 }; 
        final int[] nums5 = { 3, 5, 1 }; 
        final int[] nums6 = { 1, 3, 5 }; 
        final int[] nums7 = { 3, 5, 1 }; 
        final int[] nums8 = { 2, 5, 10, 4 }; 
        final int[] nums9 = { 2, 5, 10, 4 }; 
        final int[] nums10 = { 2, 5, 10, 4 }; 
        final int[] nums11 = { 1 }; 
        final int[] nums12 = { 9 }; 
        final int[] nums13 = { 9 }; 
        final int[] nums14 = {  }; 

        final boolean[] resultsArray = {
            GroupSum5.groupSum5(0, nums0, 19),
            GroupSum5.groupSum5(0, nums1, 17),
            GroupSum5.groupSum5(0, nums2, 12),
            GroupSum5.groupSum5(0, nums3, 12),
            GroupSum5.groupSum5(0, nums4, 4),
            GroupSum5.groupSum5(0, nums5, 5),
            GroupSum5.groupSum5(0, nums6, 5),
            GroupSum5.groupSum5(0, nums7, 9),
            GroupSum5.groupSum5(0, nums8, 7),
            GroupSum5.groupSum5(0, nums9, 15),
            GroupSum5.groupSum5(0, nums10, 11),
            GroupSum5.groupSum5(0, nums11, 1),
            GroupSum5.groupSum5(0, nums12, 1),
            GroupSum5.groupSum5(0, nums13, 0),
            GroupSum5.groupSum5(0, nums14, 0),
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
