package Recursion2.Testcases;
import Recursion2.GroupSumClump;

public class _GroupSumClump
{
    static String[] testcaseStrings = {
        "groupSumClump(0, [2, 4, 8], 10)",
        "groupSumClump(0, [1, 2, 4, 8, 1], 14)",
        "groupSumClump(0, [2, 4, 4, 8], 14)",
    };

    static boolean[] expectedResults = { true, true, false, };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 2, 4, 8 }; 
        int[] nums1 = { 1, 2, 4, 8, 1 }; 
        int[] nums2 = { 2, 4, 4, 8 }; 

        boolean[] resultsArray = {
            GroupSumClump.groupSumClump(0, nums0, 10),
            GroupSumClump.groupSumClump(0, nums1, 14),
            GroupSumClump.groupSumClump(0, nums2, 14),
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
