package Array1.Testcases;
import Array1.SwapEnds;
import java.util.Arrays;
import java.util.ArrayList;

public final class _SwapEnds
{
    static final String[] testcaseStrings = {
        "swapEnds([1, 2, 3, 4])",
        "swapEnds([1, 2, 3])",
        "swapEnds([8, 6, 7, 9, 5])",
        "swapEnds([3, 1, 4, 1, 5, 9])",
        "swapEnds([1, 2])",
        "swapEnds([1])",
    };

    static final int[][] expectedResults = {
        {4, 2, 3, 1},
        {3, 2, 1},
        {5, 6, 7, 9, 8},
        {9, 1, 4, 1, 5, 3},
        {2, 1},
        {1},
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
        final int[] nums0 = { 1, 2, 3, 4 }; 
        final int[] nums1 = { 1, 2, 3 }; 
        final int[] nums2 = { 8, 6, 7, 9, 5 }; 
        final int[] nums3 = { 3, 1, 4, 1, 5, 9 }; 
        final int[] nums4 = { 1, 2 }; 
        final int[] nums5 = { 1 }; 

        final int[][] resultsArray = {
            SwapEnds.swapEnds(nums0),
            SwapEnds.swapEnds(nums1),
            SwapEnds.swapEnds(nums2),
            SwapEnds.swapEnds(nums3),
            SwapEnds.swapEnds(nums4),
            SwapEnds.swapEnds(nums5),
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
