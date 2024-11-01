package Recursion1.Testcases;
import Recursion1.Array11;

public final class _Array11
{
    static final String[] testcaseStrings = {
        "array11([1, 2, 11], 0)",
        "array11([11, 11], 0)",
        "array11([1, 2, 3, 4], 0)",
        "array11([1, 11, 3, 11, 11], 0)",
        "array11([11], 0)",
        "array11([1], 0)",
        "array11([], 0)",
        "array11([11, 2, 3, 4, 11, 5], 0)",
        "array11([11, 5, 11], 0)",
    };

    static final int[] expectedResults = {
        1,
        2,
        0,
        3,
        1,
        0,
        0,
        2,
        2,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] nums0 = {1, 2, 11}; 
        final int[] nums1 = {11, 11}; 
        final int[] nums2 = {1, 2, 3, 4}; 
        final int[] nums3 = {1, 11, 3, 11, 11}; 
        final int[] nums4 = {11}; 
        final int[] nums5 = {1}; 
        final int[] nums6 = {}; 
        final int[] nums7 = {11, 2, 3, 4, 11, 5}; 
        final int[] nums8 = {11, 5, 11}; 

        final int[] resultsArray = {
            Array11.array11(nums0, 0),
            Array11.array11(nums1, 0),
            Array11.array11(nums2, 0),
            Array11.array11(nums3, 0),
            Array11.array11(nums4, 0),
            Array11.array11(nums5, 0),
            Array11.array11(nums6, 0),
            Array11.array11(nums7, 0),
            Array11.array11(nums8, 0),
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
