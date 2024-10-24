package Array2.Testcases;
import Array2.ZeroMax;
import java.util.Arrays;

public class _ZeroMax
{
    static String[] testcaseStrings = {
        "zeroMax([0, 5, 0, 3])",
        "zeroMax([0, 4, 0, 3])",
        "zeroMax([0, 1, 0])",
        "zeroMax([0, 1, 5])",
        "zeroMax([0, 2, 0])",
        "zeroMax([1])",
        "zeroMax([0])",
        "zeroMax([])",
        "zeroMax([7, 0, 4, 3, 0, 2])",
        "zeroMax([7, 0, 4, 3, 0, 1])",
        "zeroMax([7, 0, 4, 3, 0, 0])",
        "zeroMax([7, 0, 1, 0, 0, 7])",
    };

    static int[][] expectedResults = {
        {5, 5, 3, 3},
        {3, 4, 3, 3},
        {1, 1, 0},
        {5, 1, 5},
        {0, 2, 0},
        {1},
        {0},
        {},
        {7, 3, 4, 3, 0, 2},
        {7, 3, 4, 3, 1, 1},
        {7, 3, 4, 3, 0, 0},
        {7, 7, 1, 7, 7, 7},
    };

    public static String printArray(int[] array)
    {
        String result = "[";
        for (int a: array) { result += a+", "; }
        if (result.length() > 2) result = result.substring(0, result.length()-2);
        return result + "]";
    }

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 0, 5, 0, 3 }; 
        int[] nums1 = { 0, 4, 0, 3 }; 
        int[] nums2 = { 0, 1, 0 }; 
        int[] nums3 = { 0, 1, 5 }; 
        int[] nums4 = { 0, 2, 0 }; 
        int[] nums5 = { 1 }; 
        int[] nums6 = { 0 }; 
        int[] nums7 = {  }; 
        int[] nums8 = { 7, 0, 4, 3, 0, 2 }; 
        int[] nums9 = { 7, 0, 4, 3, 0, 1 }; 
        int[] nums10 = { 7, 0, 4, 3, 0, 0 }; 
        int[] nums11 = { 7, 0, 1, 0, 0, 7 }; 

        int[][] resultsArray = {
            ZeroMax.zeroMax(nums0),
            ZeroMax.zeroMax(nums1),
            ZeroMax.zeroMax(nums2),
            ZeroMax.zeroMax(nums3),
            ZeroMax.zeroMax(nums4),
            ZeroMax.zeroMax(nums5),
            ZeroMax.zeroMax(nums6),
            ZeroMax.zeroMax(nums7),
            ZeroMax.zeroMax(nums8),
            ZeroMax.zeroMax(nums9),
            ZeroMax.zeroMax(nums10),
            ZeroMax.zeroMax(nums11),
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
