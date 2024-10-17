package Array2.Testcases;
import Array2.ZeroMax;
import java.util.Arrays;

public class _ZeroMax
{
    static String[] testcaseStrings = {
        "zeroMax([0, 5, 0, 3])",
        "zeroMax([0, 4, 0, 3])",
        "zeroMax([0, 1, 0])",
    };

    static int[][] expectedResults = { {5, 5, 3, 3}, {3, 4, 3, 3}, {1, 1, 0}, };

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

        int[][] resultsArray = {
            ZeroMax.zeroMax(nums0),
            ZeroMax.zeroMax(nums1),
            ZeroMax.zeroMax(nums2),
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
