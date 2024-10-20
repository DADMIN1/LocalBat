package Array2.Testcases;
import Array2.ShiftLeft;
import java.util.Arrays;

public class _ShiftLeft
{
    static String[] testcaseStrings = {
        "shiftLeft([6, 2, 5, 3])",
        "shiftLeft([1, 2])",
        "shiftLeft([1])",
    };

    static int[][] expectedResults = { {2, 5, 3, 6}, {2, 1}, {1}, };

    public static String printArray(int[] array)
    {
        String result = "[";
        for (int a: array) { result += a+", "; }
        if (result.length() > 2) result = result.substring(0, result.length()-2);
        return result + "]";
    }

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 6, 2, 5, 3 }; 
        int[] nums1 = { 1, 2 }; 
        int[] nums2 = { 1 }; 

        int[][] resultsArray = {
            ShiftLeft.shiftLeft(nums0),
            ShiftLeft.shiftLeft(nums1),
            ShiftLeft.shiftLeft(nums2),
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
