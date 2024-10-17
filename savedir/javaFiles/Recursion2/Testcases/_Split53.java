package Recursion2.Testcases;
import Recursion2.Split53;

public class _Split53
{
    static String[] testcaseStrings = {
        "split53([1, 1])",
        "split53([1, 1, 1])",
        "split53([2, 4, 2])",
    };

    static boolean[] expectedResults = { true, false, true, };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 1, 1 }; 
        int[] nums1 = { 1, 1, 1 }; 
        int[] nums2 = { 2, 4, 2 }; 

        boolean[] resultsArray = {
            Split53.split53(nums0),
            Split53.split53(nums1),
            Split53.split53(nums2),
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
