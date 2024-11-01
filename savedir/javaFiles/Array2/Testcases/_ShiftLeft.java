package Array2.Testcases;
import Array2.ShiftLeft;
import java.util.Arrays;
import java.util.ArrayList;

public final class _ShiftLeft
{
    static final String[] testcaseStrings = {
        "shiftLeft([6, 2, 5, 3])",
        "shiftLeft([1, 2])",
        "shiftLeft([1])",
        "shiftLeft([])",
        "shiftLeft([1, 1, 2, 2, 4])",
        "shiftLeft([1, 1, 1])",
        "shiftLeft([1, 2, 3])",
    };

    static final int[][] expectedResults = {
        {2, 5, 3, 6},
        {2, 1},
        {1},
        {},
        {1, 2, 2, 4, 1},
        {1, 1, 1},
        {2, 3, 1},
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
        final int[] nums0 = {6, 2, 5, 3}; 
        final int[] nums1 = {1, 2}; 
        final int[] nums2 = {1}; 
        final int[] nums3 = {}; 
        final int[] nums4 = {1, 1, 2, 2, 4}; 
        final int[] nums5 = {1, 1, 1}; 
        final int[] nums6 = {1, 2, 3}; 

        final int[][] resultsArray = {
            ShiftLeft.shiftLeft(nums0),
            ShiftLeft.shiftLeft(nums1),
            ShiftLeft.shiftLeft(nums2),
            ShiftLeft.shiftLeft(nums3),
            ShiftLeft.shiftLeft(nums4),
            ShiftLeft.shiftLeft(nums5),
            ShiftLeft.shiftLeft(nums6),
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
