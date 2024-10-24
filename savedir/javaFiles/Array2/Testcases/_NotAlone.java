package Array2.Testcases;
import Array2.NotAlone;
import java.util.Arrays;

public class _NotAlone
{
    static String[] testcaseStrings = {
        "notAlone([1, 2, 3], 2)",
        "notAlone([1, 2, 3, 2, 5, 2], 2)",
        "notAlone([3, 4], 3)",
        "notAlone([3, 3], 3)",
        "notAlone([1, 3, 1, 2], 1)",
        "notAlone([3], 3)",
        "notAlone([], 3)",
        "notAlone([7, 1, 6], 1)",
        "notAlone([1, 1, 1], 1)",
        "notAlone([1, 1, 1, 2], 1)",
    };

    static int[][] expectedResults = {
        {1, 3, 3},
        {1, 3, 3, 5, 5, 2},
        {3, 4},
        {3, 3},
        {1, 3, 3, 2},
        {3},
        {},
        {7, 7, 6},
        {1, 1, 1},
        {1, 1, 1, 2},
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
        int[] nums0 = { 1, 2, 3 }; 
        int[] nums1 = { 1, 2, 3, 2, 5, 2 }; 
        int[] nums2 = { 3, 4 }; 
        int[] nums3 = { 3, 3 }; 
        int[] nums4 = { 1, 3, 1, 2 }; 
        int[] nums5 = { 3 }; 
        int[] nums6 = {  }; 
        int[] nums7 = { 7, 1, 6 }; 
        int[] nums8 = { 1, 1, 1 }; 
        int[] nums9 = { 1, 1, 1, 2 }; 

        int[][] resultsArray = {
            NotAlone.notAlone(nums0, 2),
            NotAlone.notAlone(nums1, 2),
            NotAlone.notAlone(nums2, 3),
            NotAlone.notAlone(nums3, 3),
            NotAlone.notAlone(nums4, 1),
            NotAlone.notAlone(nums5, 3),
            NotAlone.notAlone(nums6, 3),
            NotAlone.notAlone(nums7, 1),
            NotAlone.notAlone(nums8, 1),
            NotAlone.notAlone(nums9, 1),
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
