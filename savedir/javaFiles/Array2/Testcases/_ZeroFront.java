package Array2.Testcases;
import Array2.ZeroFront;
import java.util.Arrays;
import java.util.ArrayList;

public final class _ZeroFront
{
    static final String[] testcaseStrings = {
        "zeroFront([1, 0, 0, 1])",
        "zeroFront([0, 1, 1, 0, 1])",
        "zeroFront([1, 0])",
        "zeroFront([0, 1])",
        "zeroFront([1, 1, 1, 0])",
        "zeroFront([2, 2, 2, 2])",
        "zeroFront([0, 0, 1, 0])",
        "zeroFront([-1, 0, 0, -1, 0])",
        "zeroFront([0, -3, 0, -3])",
        "zeroFront([])",
        "zeroFront([9, 9, 0, 9, 0, 9])",
    };

    static final int[][] expectedResults = {
        {0, 0, 1, 1},
        {0, 0, 1, 1, 1},
        {0, 1},
        {0, 1},
        {0, 1, 1, 1},
        {2, 2, 2, 2},
        {0, 0, 0, 1},
        {0, 0, 0, -1, -1},
        {0, 0, -3, -3},
        {},
        {0, 0, 9, 9, 9, 9},
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
        final int[] nums0 = {1, 0, 0, 1}; 
        final int[] nums1 = {0, 1, 1, 0, 1}; 
        final int[] nums2 = {1, 0}; 
        final int[] nums3 = {0, 1}; 
        final int[] nums4 = {1, 1, 1, 0}; 
        final int[] nums5 = {2, 2, 2, 2}; 
        final int[] nums6 = {0, 0, 1, 0}; 
        final int[] nums7 = {-1, 0, 0, -1, 0}; 
        final int[] nums8 = {0, -3, 0, -3}; 
        final int[] nums9 = {}; 
        final int[] nums10 = {9, 9, 0, 9, 0, 9}; 

        final int[][] resultsArray = {
            ZeroFront.zeroFront(nums0),
            ZeroFront.zeroFront(nums1),
            ZeroFront.zeroFront(nums2),
            ZeroFront.zeroFront(nums3),
            ZeroFront.zeroFront(nums4),
            ZeroFront.zeroFront(nums5),
            ZeroFront.zeroFront(nums6),
            ZeroFront.zeroFront(nums7),
            ZeroFront.zeroFront(nums8),
            ZeroFront.zeroFront(nums9),
            ZeroFront.zeroFront(nums10),
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
