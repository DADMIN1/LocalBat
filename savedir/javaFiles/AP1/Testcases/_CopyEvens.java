package AP1.Testcases;
import AP1.CopyEvens;
import java.util.Arrays;
import java.util.ArrayList;

public class _CopyEvens
{
    static String[] testcaseStrings = {
        "copyEvens([3, 2, 4, 5, 8], 2)",
        "copyEvens([3, 2, 4, 5, 8], 3)",
        "copyEvens([6, 1, 2, 4, 5, 8], 3)",
        "copyEvens([6, 1, 2, 4, 5, 8], 4)",
        "copyEvens([3, 1, 4, 1, 5], 1)",
        "copyEvens([2], 1)",
        "copyEvens([6, 2, 4, 8], 2)",
        "copyEvens([6, 2, 4, 8], 3)",
        "copyEvens([6, 2, 4, 8], 4)",
        "copyEvens([1, 8, 4], 1)",
        "copyEvens([1, 8, 4], 2)",
        "copyEvens([2, 8, 4], 2)",
    };

    static int[][] expectedResults = {
        {2, 4},
        {2, 4, 8},
        {6, 2, 4},
        {6, 2, 4, 8},
        {4},
        {2},
        {6, 2},
        {6, 2, 4},
        {6, 2, 4, 8},
        {8},
        {8, 4},
        {2, 8},
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
        int[] nums0 = { 3, 2, 4, 5, 8 }; 
        int[] nums1 = { 3, 2, 4, 5, 8 }; 
        int[] nums2 = { 6, 1, 2, 4, 5, 8 }; 
        int[] nums3 = { 6, 1, 2, 4, 5, 8 }; 
        int[] nums4 = { 3, 1, 4, 1, 5 }; 
        int[] nums5 = { 2 }; 
        int[] nums6 = { 6, 2, 4, 8 }; 
        int[] nums7 = { 6, 2, 4, 8 }; 
        int[] nums8 = { 6, 2, 4, 8 }; 
        int[] nums9 = { 1, 8, 4 }; 
        int[] nums10 = { 1, 8, 4 }; 
        int[] nums11 = { 2, 8, 4 }; 

        int[][] resultsArray = {
            CopyEvens.copyEvens(nums0, 2),
            CopyEvens.copyEvens(nums1, 3),
            CopyEvens.copyEvens(nums2, 3),
            CopyEvens.copyEvens(nums3, 4),
            CopyEvens.copyEvens(nums4, 1),
            CopyEvens.copyEvens(nums5, 1),
            CopyEvens.copyEvens(nums6, 2),
            CopyEvens.copyEvens(nums7, 3),
            CopyEvens.copyEvens(nums8, 4),
            CopyEvens.copyEvens(nums9, 1),
            CopyEvens.copyEvens(nums10, 2),
            CopyEvens.copyEvens(nums11, 2),
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
