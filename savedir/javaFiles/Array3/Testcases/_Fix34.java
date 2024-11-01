package Array3.Testcases;
import Array3.Fix34;
import java.util.Arrays;
import java.util.ArrayList;

public final class _Fix34
{
    static final String[] testcaseStrings = {
        "fix34([1, 3, 1, 4])",
        "fix34([1, 3, 1, 4, 4, 3, 1])",
        "fix34([3, 2, 2, 4])",
        "fix34([3, 2, 3, 2, 4, 4])",
        "fix34([2, 3, 2, 3, 2, 4, 4])",
        "fix34([5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3, 5])",
        "fix34([3, 1, 4])",
        "fix34([3, 4, 1])",
        "fix34([1, 1, 1])",
        "fix34([1])",
        "fix34([])",
        "fix34([7, 3, 7, 7, 4])",
        "fix34([3, 1, 4, 3, 1, 4])",
        "fix34([3, 1, 1, 3, 4, 4])",
    };

    static final int[][] expectedResults = {
        {1, 3, 4, 1},
        {1, 3, 4, 1, 1, 3, 4},
        {3, 4, 2, 2},
        {3, 4, 3, 4, 2, 2},
        {2, 3, 4, 3, 4, 2, 2},
        {5, 3, 4, 5, 5, 5, 5, 5, 3, 4, 3, 4},
        {3, 4, 1},
        {3, 4, 1},
        {1, 1, 1},
        {1},
        {},
        {7, 3, 4, 7, 7},
        {3, 4, 1, 3, 4, 1},
        {3, 4, 1, 3, 4, 1},
    };

    public static final String printArray(int[] array)
    {
        String result = "[";
        for (int a: array) { result += a+", "; }
        if (result.length() > 2) result = result.substring(0, result.length()-2);
        return result + "]";
    }

    public static final void Validate(boolean printSuccess)
    {
        final int[] nums0 = {1, 3, 1, 4}; 
        final int[] nums1 = {1, 3, 1, 4, 4, 3, 1}; 
        final int[] nums2 = {3, 2, 2, 4}; 
        final int[] nums3 = {3, 2, 3, 2, 4, 4}; 
        final int[] nums4 = {2, 3, 2, 3, 2, 4, 4}; 
        final int[] nums5 = {5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3, 5}; 
        final int[] nums6 = {3, 1, 4}; 
        final int[] nums7 = {3, 4, 1}; 
        final int[] nums8 = {1, 1, 1}; 
        final int[] nums9 = {1}; 
        final int[] nums10 = {}; 
        final int[] nums11 = {7, 3, 7, 7, 4}; 
        final int[] nums12 = {3, 1, 4, 3, 1, 4}; 
        final int[] nums13 = {3, 1, 1, 3, 4, 4}; 

        final int[][] resultsArray = {
            Fix34.fix34(nums0),
            Fix34.fix34(nums1),
            Fix34.fix34(nums2),
            Fix34.fix34(nums3),
            Fix34.fix34(nums4),
            Fix34.fix34(nums5),
            Fix34.fix34(nums6),
            Fix34.fix34(nums7),
            Fix34.fix34(nums8),
            Fix34.fix34(nums9),
            Fix34.fix34(nums10),
            Fix34.fix34(nums11),
            Fix34.fix34(nums12),
            Fix34.fix34(nums13),
        };

        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (!Arrays.equals(resultsArray[i], expectedResults[i]))
            {
                allTestsPassed = false;
                System.out.println("\n[-] #"+(i+1)+" failed!");
                System.out.println(testcaseStrings[i]+";");
                System.out.println("    received: "+printArray(resultsArray[i]));
                System.out.println("    expected: "+printArray(expectedResults[i]));
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
