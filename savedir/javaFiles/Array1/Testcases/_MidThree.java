package Array1.Testcases;
import Array1.MidThree;
import java.util.Arrays;

public class _MidThree
{
    static String[] testcaseStrings = {
        "midThree([1, 2, 3, 4, 5])",
        "midThree([8, 6, 7, 5, 3, 0, 9])",
        "midThree([1, 2, 3])",
    };

    static int[][] expectedResults = { {2, 3, 4}, {7, 5, 3}, {1, 2, 3}, };

    public static String printArray(int[] array)
    {
        String result = "[";
        for (int a: array) { result += a+", "; }
        if (result.length() > 2) result = result.substring(0, result.length()-2);
        return result + "]";
    }

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 1, 2, 3, 4, 5 }; 
        int[] nums1 = { 8, 6, 7, 5, 3, 0, 9 }; 
        int[] nums2 = { 1, 2, 3 }; 

        int[][] resultsArray = {
            MidThree.midThree(nums0),
            MidThree.midThree(nums1),
            MidThree.midThree(nums2),
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
