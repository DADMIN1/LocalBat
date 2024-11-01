package Array1.Testcases;
import Array1.MakeLast;
import java.util.Arrays;
import java.util.ArrayList;

public final class _MakeLast
{
    static final String[] testcaseStrings = {
        "makeLast([4, 5, 6])",
        "makeLast([1, 2])",
        "makeLast([3])",
        "makeLast([0])",
        "makeLast([7, 7, 7])",
        "makeLast([3, 1, 4])",
        "makeLast([1, 2, 3, 4])",
        "makeLast([1, 2, 3, 0])",
        "makeLast([2, 4])",
    };

    static final int[][] expectedResults = {
        {0, 0, 0, 0, 0, 6},
        {0, 0, 0, 2},
        {0, 3},
        {0, 0},
        {0, 0, 0, 0, 0, 7},
        {0, 0, 0, 0, 0, 4},
        {0, 0, 0, 0, 0, 0, 0, 4},
        {0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 4},
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
        final int[] nums0 = {4, 5, 6}; 
        final int[] nums1 = {1, 2}; 
        final int[] nums2 = {3}; 
        final int[] nums3 = {0}; 
        final int[] nums4 = {7, 7, 7}; 
        final int[] nums5 = {3, 1, 4}; 
        final int[] nums6 = {1, 2, 3, 4}; 
        final int[] nums7 = {1, 2, 3, 0}; 
        final int[] nums8 = {2, 4}; 

        final int[][] resultsArray = {
            MakeLast.makeLast(nums0),
            MakeLast.makeLast(nums1),
            MakeLast.makeLast(nums2),
            MakeLast.makeLast(nums3),
            MakeLast.makeLast(nums4),
            MakeLast.makeLast(nums5),
            MakeLast.makeLast(nums6),
            MakeLast.makeLast(nums7),
            MakeLast.makeLast(nums8),
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
