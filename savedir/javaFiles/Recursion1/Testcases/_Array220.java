package Recursion1.Testcases;
import Recursion1.Array220;

public final class _Array220
{
    static final String[] testcaseStrings = {
        "array220([1, 2, 20], 0)",
        "array220([3, 30], 0)",
        "array220([3], 0)",
        "array220([], 0)",
        "array220([3, 3, 30, 4], 0)",
        "array220([2, 19, 4], 0)",
        "array220([20, 2, 21], 0)",
        "array220([20, 2, 21, 210], 0)",
        "array220([2, 200, 2000], 0)",
        "array220([0, 0], 0)",
        "array220([1, 2, 3, 4, 5, 6], 0)",
        "array220([1, 2, 3, 4, 5, 50, 6], 0)",
        "array220([1, 2, 3, 4, 5, 51, 6], 0)",
        "array220([1, 2, 3, 4, 4, 50, 500, 6], 0)",
    };

    static final boolean[] expectedResults = {
        true,
        true,
        false,
        false,
        true,
        false,
        false,
        true,
        true,
        true,
        false,
        true,
        false,
        true,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] nums0 = {1, 2, 20}; 
        final int[] nums1 = {3, 30}; 
        final int[] nums2 = {3}; 
        final int[] nums3 = {}; 
        final int[] nums4 = {3, 3, 30, 4}; 
        final int[] nums5 = {2, 19, 4}; 
        final int[] nums6 = {20, 2, 21}; 
        final int[] nums7 = {20, 2, 21, 210}; 
        final int[] nums8 = {2, 200, 2000}; 
        final int[] nums9 = {0, 0}; 
        final int[] nums10 = {1, 2, 3, 4, 5, 6}; 
        final int[] nums11 = {1, 2, 3, 4, 5, 50, 6}; 
        final int[] nums12 = {1, 2, 3, 4, 5, 51, 6}; 
        final int[] nums13 = {1, 2, 3, 4, 4, 50, 500, 6}; 

        final boolean[] resultsArray = {
            Array220.array220(nums0, 0),
            Array220.array220(nums1, 0),
            Array220.array220(nums2, 0),
            Array220.array220(nums3, 0),
            Array220.array220(nums4, 0),
            Array220.array220(nums5, 0),
            Array220.array220(nums6, 0),
            Array220.array220(nums7, 0),
            Array220.array220(nums8, 0),
            Array220.array220(nums9, 0),
            Array220.array220(nums10, 0),
            Array220.array220(nums11, 0),
            Array220.array220(nums12, 0),
            Array220.array220(nums13, 0),
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
