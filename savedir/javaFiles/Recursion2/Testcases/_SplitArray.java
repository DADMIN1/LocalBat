package Recursion2.Testcases;
import Recursion2.SplitArray;

public class _SplitArray
{
    static String[] testcaseStrings = {
        "splitArray([2, 2])",
        "splitArray([2, 3])",
        "splitArray([5, 2, 3])",
    };

    static boolean[] expectedResults = { true, false, true, };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 2, 2 }; 
        int[] nums1 = { 2, 3 }; 
        int[] nums2 = { 5, 2, 3 }; 

        boolean[] resultsArray = {
            SplitArray.splitArray(nums0),
            SplitArray.splitArray(nums1),
            SplitArray.splitArray(nums2),
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
