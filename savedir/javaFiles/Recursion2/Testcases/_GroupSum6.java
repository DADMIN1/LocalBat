package Recursion2.Testcases;
import Recursion2.GroupSum6;

public class _GroupSum6
{
    static String[] testcaseStrings = {
        "groupSum6(0, [5, 6, 2], 8)",
        "groupSum6(0, [5, 6, 2], 9)",
        "groupSum6(0, [5, 6, 2], 7)",
    };

    static boolean[] expectedResults = { true, false, false, };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 5, 6, 2 }; 
        int[] nums1 = { 5, 6, 2 }; 
        int[] nums2 = { 5, 6, 2 }; 

        boolean[] resultsArray = {
            GroupSum6.groupSum6(0, nums0, 8),
            GroupSum6.groupSum6(0, nums1, 9),
            GroupSum6.groupSum6(0, nums2, 7),
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
