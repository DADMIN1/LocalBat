package Recursion2.Testcases;
import Recursion2.GroupNoAdj;

public class _GroupNoAdj
{
    static String[] testcaseStrings = {
        "groupNoAdj(0, [2, 5, 10, 4], 12)",
        "groupNoAdj(0, [2, 5, 10, 4], 14)",
        "groupNoAdj(0, [2, 5, 10, 4], 7)",
    };

    static boolean[] expectedResults = {
        true,
        false,
        false,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 2, 5, 10, 4 }; 
        int[] nums1 = { 2, 5, 10, 4 }; 
        int[] nums2 = { 2, 5, 10, 4 }; 

        boolean[] resultsArray = {
            GroupNoAdj.groupNoAdj(0, nums0, 12),
            GroupNoAdj.groupNoAdj(0, nums1, 14),
            GroupNoAdj.groupNoAdj(0, nums2, 7),
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
