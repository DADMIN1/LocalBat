package Array2.Testcases;
import Array2.WithoutTen;
import java.util.Arrays;
import java.util.ArrayList;

public class _WithoutTen
{
    static String[] testcaseStrings = {
        "withoutTen([1, 10, 10, 2])",
        "withoutTen([10, 2, 10])",
        "withoutTen([1, 99, 10])",
        "withoutTen([10, 13, 10, 14])",
        "withoutTen([10, 13, 10, 14, 10])",
        "withoutTen([10, 10, 3])",
        "withoutTen([1])",
        "withoutTen([13, 1])",
        "withoutTen([10])",
        "withoutTen([])",
    };

    static int[][] expectedResults = {
        {1, 2, 0, 0},
        {2, 0, 0},
        {1, 99, 0},
        {13, 14, 0, 0},
        {13, 14, 0, 0, 0},
        {3, 0, 0},
        {1},
        {13, 1},
        {0},
        {},
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
        int[] nums0 = { 1, 10, 10, 2 }; 
        int[] nums1 = { 10, 2, 10 }; 
        int[] nums2 = { 1, 99, 10 }; 
        int[] nums3 = { 10, 13, 10, 14 }; 
        int[] nums4 = { 10, 13, 10, 14, 10 }; 
        int[] nums5 = { 10, 10, 3 }; 
        int[] nums6 = { 1 }; 
        int[] nums7 = { 13, 1 }; 
        int[] nums8 = { 10 }; 
        int[] nums9 = {  }; 

        int[][] resultsArray = {
            WithoutTen.withoutTen(nums0),
            WithoutTen.withoutTen(nums1),
            WithoutTen.withoutTen(nums2),
            WithoutTen.withoutTen(nums3),
            WithoutTen.withoutTen(nums4),
            WithoutTen.withoutTen(nums5),
            WithoutTen.withoutTen(nums6),
            WithoutTen.withoutTen(nums7),
            WithoutTen.withoutTen(nums8),
            WithoutTen.withoutTen(nums9),
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
