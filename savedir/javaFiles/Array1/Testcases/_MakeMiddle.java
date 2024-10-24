package Array1.Testcases;
import Array1.MakeMiddle;
import java.util.Arrays;

public class _MakeMiddle
{
    static String[] testcaseStrings = {
        "makeMiddle([1, 2, 3, 4])",
        "makeMiddle([7, 1, 2, 3, 4, 9])",
        "makeMiddle([1, 2])",
        "makeMiddle([5, 2, 4, 7])",
        "makeMiddle([9, 0, 4, 3, 9, 1])",
    };

    static int[][] expectedResults = {
        {2, 3},
        {2, 3},
        {1, 2},
        {2, 4},
        {4, 3},
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
        int[] nums0 = { 1, 2, 3, 4 }; 
        int[] nums1 = { 7, 1, 2, 3, 4, 9 }; 
        int[] nums2 = { 1, 2 }; 
        int[] nums3 = { 5, 2, 4, 7 }; 
        int[] nums4 = { 9, 0, 4, 3, 9, 1 }; 

        int[][] resultsArray = {
            MakeMiddle.makeMiddle(nums0),
            MakeMiddle.makeMiddle(nums1),
            MakeMiddle.makeMiddle(nums2),
            MakeMiddle.makeMiddle(nums3),
            MakeMiddle.makeMiddle(nums4),
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
