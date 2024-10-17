package Recursion2.Testcases;
import Recursion2.GroupSum5;

public class _GroupSum5
{
    static String[] testcaseStrings = {
        "groupSum5(0, [2, 5, 10, 4], 19)",
        "groupSum5(0, [2, 5, 10, 4], 17)",
        "groupSum5(0, [2, 5, 10, 4], 12)",
    };

    static boolean[] expectedResults = { true, true, false, };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 2, 5, 10, 4 }; 
        int[] nums1 = { 2, 5, 10, 4 }; 
        int[] nums2 = { 2, 5, 10, 4 }; 

        boolean[] resultsArray = {
            GroupSum5.groupSum5(0, nums0, 19),
            GroupSum5.groupSum5(0, nums1, 17),
            GroupSum5.groupSum5(0, nums2, 12),
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
