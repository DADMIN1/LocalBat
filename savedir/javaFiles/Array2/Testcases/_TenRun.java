package Array2.Testcases;
import Array2.TenRun;
import java.util.Arrays;

public class _TenRun
{
    static String[] testcaseStrings = {
        "tenRun([2, 10, 3, 4, 20, 5])",
        "tenRun([10, 1, 20, 2])",
        "tenRun([10, 1, 9, 20])",
    };

    static int[][] expectedResults = { {2, 10, 10, 10, 20, 20}, {10, 10, 20, 20}, {10, 10, 10, 20}, };

    public static String printArray(int[] array)
    {
        String result = "[";
        for (int a: array) { result += a+", "; }
        if (result.length() > 2) result = result.substring(0, result.length()-2);
        return result + "]";
    }

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 2, 10, 3, 4, 20, 5 }; 
        int[] nums1 = { 10, 1, 20, 2 }; 
        int[] nums2 = { 10, 1, 9, 20 }; 

        int[][] resultsArray = {
            TenRun.tenRun(nums0),
            TenRun.tenRun(nums1),
            TenRun.tenRun(nums2),
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
