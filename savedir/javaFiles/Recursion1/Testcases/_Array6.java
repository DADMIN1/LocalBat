package Recursion1.Testcases;
import Recursion1.Array6;

public final class _Array6
{
    static final String[] testcaseStrings = {
        "array6([1, 6, 4], 0)",
        "array6([1, 4], 0)",
        "array6([6], 0)",
        "array6([], 0)",
        "array6([6, 2, 2], 0)",
        "array6([2, 5], 0)",
        "array6([1, 9, 4, 6, 6], 0)",
        "array6([2, 5, 6], 0)",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        true,
        false,
        true,
        false,
        true,
        true,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] nums0 = { 1, 6, 4 }; 
        final int[] nums1 = { 1, 4 }; 
        final int[] nums2 = { 6 }; 
        final int[] nums3 = {  }; 
        final int[] nums4 = { 6, 2, 2 }; 
        final int[] nums5 = { 2, 5 }; 
        final int[] nums6 = { 1, 9, 4, 6, 6 }; 
        final int[] nums7 = { 2, 5, 6 }; 

        final boolean[] resultsArray = {
            Array6.array6(nums0, 0),
            Array6.array6(nums1, 0),
            Array6.array6(nums2, 0),
            Array6.array6(nums3, 0),
            Array6.array6(nums4, 0),
            Array6.array6(nums5, 0),
            Array6.array6(nums6, 0),
            Array6.array6(nums7, 0),
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
