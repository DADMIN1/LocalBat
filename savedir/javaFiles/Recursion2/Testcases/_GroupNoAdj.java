package Recursion2.Testcases;
import Recursion2.GroupNoAdj;

public final class _GroupNoAdj
{
    static final String[] testcaseStrings = {
        "groupNoAdj(0, [2, 5, 10, 4], 12)",
        "groupNoAdj(0, [2, 5, 10, 4], 14)",
        "groupNoAdj(0, [2, 5, 10, 4], 7)",
        "groupNoAdj(0, [2, 5, 10, 4, 2], 7)",
        "groupNoAdj(0, [2, 5, 10, 4], 9)",
        "groupNoAdj(0, [10, 2, 2, 3, 3], 15)",
        "groupNoAdj(0, [10, 2, 2, 3, 3], 7)",
        "groupNoAdj(0, [], 0)",
        "groupNoAdj(0, [1], 1)",
        "groupNoAdj(0, [9], 1)",
        "groupNoAdj(0, [9], 0)",
        "groupNoAdj(0, [5, 10, 4, 1], 11)",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        false,
        true,
        true,
        true,
        false,
        true,
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
        final int[] nums3 = { 2, 5, 10, 4, 2 }; 
        final int[] nums4 = { 2, 5, 10, 4 }; 
        final int[] nums5 = { 10, 2, 2, 3, 3 }; 
        final int[] nums6 = { 10, 2, 2, 3, 3 }; 
        final int[] nums7 = {  }; 
        final int[] nums8 = { 1 }; 
        final int[] nums9 = { 9 }; 
        final int[] nums10 = { 9 }; 
        final int[] nums11 = { 5, 10, 4, 1 }; 

        final boolean[] resultsArray = {
            GroupNoAdj.groupNoAdj(0, nums0, 12),
            GroupNoAdj.groupNoAdj(0, nums1, 14),
            GroupNoAdj.groupNoAdj(0, nums2, 7),
            GroupNoAdj.groupNoAdj(0, nums3, 7),
            GroupNoAdj.groupNoAdj(0, nums4, 9),
            GroupNoAdj.groupNoAdj(0, nums5, 15),
            GroupNoAdj.groupNoAdj(0, nums6, 7),
            GroupNoAdj.groupNoAdj(0, nums7, 0),
            GroupNoAdj.groupNoAdj(0, nums8, 1),
            GroupNoAdj.groupNoAdj(0, nums9, 1),
            GroupNoAdj.groupNoAdj(0, nums10, 0),
            GroupNoAdj.groupNoAdj(0, nums11, 11),
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
