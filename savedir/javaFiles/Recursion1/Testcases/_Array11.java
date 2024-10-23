package Recursion1.Testcases;
import Recursion1.Array11;

public class _Array11
{
    static String[] testcaseStrings = {
        "array11([1, 2, 11], 0)",
        "array11([11, 11], 0)",
        "array11([1, 2, 3, 4], 0)",
    };

    static int[] expectedResults = {
        1,
        2,
        0,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 1, 2, 11 }; 
        int[] nums1 = { 11, 11 }; 
        int[] nums2 = { 1, 2, 3, 4 }; 

        int[] resultsArray = {
            Array11.array11(nums0, 0),
            Array11.array11(nums1, 0),
            Array11.array11(nums2, 0),
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
