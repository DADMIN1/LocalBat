package Recursion2.Testcases;
import Recursion2.SplitOdd10;

public class _SplitOdd10
{
    static String[] testcaseStrings = {
        "splitOdd10([5, 5, 5])",
        "splitOdd10([5, 5, 6])",
        "splitOdd10([5, 5, 6, 1])",
    };

    static boolean[] expectedResults = {
        true,
        false,
        true,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 5, 5, 5 }; 
        int[] nums1 = { 5, 5, 6 }; 
        int[] nums2 = { 5, 5, 6, 1 }; 

        boolean[] resultsArray = {
            SplitOdd10.splitOdd10(nums0),
            SplitOdd10.splitOdd10(nums1),
            SplitOdd10.splitOdd10(nums2),
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
