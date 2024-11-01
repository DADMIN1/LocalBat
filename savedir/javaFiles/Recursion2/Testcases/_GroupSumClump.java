package Recursion2.Testcases;
import Recursion2.GroupSumClump;

public final class _GroupSumClump
{
    static final String[] testcaseStrings = {
        "groupSumClump(0, [2, 4, 8], 10)",
        "groupSumClump(0, [1, 2, 4, 8, 1], 14)",
        "groupSumClump(0, [2, 4, 4, 8], 14)",
        "groupSumClump(0, [8, 2, 2, 1], 9)",
        "groupSumClump(0, [8, 2, 2, 1], 11)",
        "groupSumClump(0, [1], 1)",
        "groupSumClump(0, [9], 1)",
    };

    static final boolean[] expectedResults = {
        true,
        true,
        false,
        true,
        false,
        true,
        false,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] nums0 = {2, 4, 8}; 
        final int[] nums1 = {1, 2, 4, 8, 1}; 
        final int[] nums2 = {2, 4, 4, 8}; 
        final int[] nums3 = {8, 2, 2, 1}; 
        final int[] nums4 = {8, 2, 2, 1}; 
        final int[] nums5 = {1}; 
        final int[] nums6 = {9}; 

        final boolean[] resultsArray = {
            GroupSumClump.groupSumClump(0, nums0, 10),
            GroupSumClump.groupSumClump(0, nums1, 14),
            GroupSumClump.groupSumClump(0, nums2, 14),
            GroupSumClump.groupSumClump(0, nums3, 9),
            GroupSumClump.groupSumClump(0, nums4, 11),
            GroupSumClump.groupSumClump(0, nums5, 1),
            GroupSumClump.groupSumClump(0, nums6, 1),
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
