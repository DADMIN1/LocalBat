package Warmup2.Testcases;
import Warmup2.Has271;

public class _Has271
{
    static String[] testcaseStrings = {
        "has271([1, 2, 7, 1])",
        "has271([1, 2, 8, 1])",
        "has271([2, 7, 1])",
    };

    static boolean[] expectedResults = { true, false, true, };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 1, 2, 7, 1 }; 
        int[] nums1 = { 1, 2, 8, 1 }; 
        int[] nums2 = { 2, 7, 1 }; 

        boolean[] resultsArray = {
            Has271.has271(nums0),
            Has271.has271(nums1),
            Has271.has271(nums2),
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
