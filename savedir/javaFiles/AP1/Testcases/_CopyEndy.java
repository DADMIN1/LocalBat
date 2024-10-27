package AP1.Testcases;
import AP1.CopyEndy;
import java.util.Arrays;
import java.util.ArrayList;

public class _CopyEndy
{
    static String[] testcaseStrings = {
        "copyEndy([9, 11, 90, 22, 6], 2)",
        "copyEndy([9, 11, 90, 22, 6], 3)",
        "copyEndy([12, 1, 1, 13, 0, 20], 2)",
        "copyEndy([12, 1, 1, 13, 0, 20], 3)",
        "copyEndy([0], 1)",
        "copyEndy([10, 11, 90], 2)",
        "copyEndy([90, 22, 100], 2)",
        "copyEndy([12, 11, 10, 89, 101, 4], 1)",
        "copyEndy([13, 2, 2, 0], 2)",
        "copyEndy([13, 2, 2, 0], 3)",
        "copyEndy([13, 2, 13, 2, 0, 30], 2)",
        "copyEndy([13, 2, 13, 2, 0, 30], 3)",
    };

    static int[][] expectedResults = {
        {9, 90},
        {9, 90, 6},
        {1, 1},
        {1, 1, 0},
        {0},
        {10, 90},
        {90, 100},
        {10},
        {2, 2},
        {2, 2, 0},
        {2, 2},
        {2, 2, 0},
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
        int[] nums0 = { 9, 11, 90, 22, 6 }; 
        int[] nums1 = { 9, 11, 90, 22, 6 }; 
        int[] nums2 = { 12, 1, 1, 13, 0, 20 }; 
        int[] nums3 = { 12, 1, 1, 13, 0, 20 }; 
        int[] nums4 = { 0 }; 
        int[] nums5 = { 10, 11, 90 }; 
        int[] nums6 = { 90, 22, 100 }; 
        int[] nums7 = { 12, 11, 10, 89, 101, 4 }; 
        int[] nums8 = { 13, 2, 2, 0 }; 
        int[] nums9 = { 13, 2, 2, 0 }; 
        int[] nums10 = { 13, 2, 13, 2, 0, 30 }; 
        int[] nums11 = { 13, 2, 13, 2, 0, 30 }; 

        int[][] resultsArray = {
            CopyEndy.copyEndy(nums0, 2),
            CopyEndy.copyEndy(nums1, 3),
            CopyEndy.copyEndy(nums2, 2),
            CopyEndy.copyEndy(nums3, 3),
            CopyEndy.copyEndy(nums4, 1),
            CopyEndy.copyEndy(nums5, 2),
            CopyEndy.copyEndy(nums6, 2),
            CopyEndy.copyEndy(nums7, 1),
            CopyEndy.copyEndy(nums8, 2),
            CopyEndy.copyEndy(nums9, 3),
            CopyEndy.copyEndy(nums10, 2),
            CopyEndy.copyEndy(nums11, 3),
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
