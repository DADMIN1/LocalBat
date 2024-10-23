package Recursion2.Testcases;
import Recursion2.GroupSum;

public class _GroupSum
{
    static String[] testcaseStrings = {
        "groupSum(0, [2, 4, 8], 10)",
        "groupSum(0, [2, 4, 8], 14)",
        "groupSum(0, [2, 4, 8], 9)",
    };

    static boolean[] expectedResults = {
        true,
        true,
        false,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 2, 4, 8 }; 
        int[] nums1 = { 2, 4, 8 }; 
        int[] nums2 = { 2, 4, 8 }; 

        boolean[] resultsArray = {
            GroupSum.groupSum(0, nums0, 10),
            GroupSum.groupSum(0, nums1, 14),
            GroupSum.groupSum(0, nums2, 9),
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
