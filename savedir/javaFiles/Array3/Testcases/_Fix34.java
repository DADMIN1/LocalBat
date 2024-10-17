package Array3.Testcases;
import Array3.Fix34;
import java.util.Arrays;

public class _Fix34
{
    static String[] testcaseStrings = {
        "fix34([1, 3, 1, 4])",
        "fix34([1, 3, 1, 4, 4, 3, 1])",
        "fix34([3, 2, 2, 4])",
    };

    static int[][] expectedResults = { {1, 3, 4, 1}, {1, 3, 4, 1, 1, 3, 4}, {3, 4, 2, 2}, };

    public static String printArray(int[] array)
    {
        String result = "[";
        for (int a: array) { result += a+", "; }
        if (result.length() > 2) result = result.substring(0, result.length()-2);
        return result + "]";
    }

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 1, 3, 1, 4 }; 
        int[] nums1 = { 1, 3, 1, 4, 4, 3, 1 }; 
        int[] nums2 = { 3, 2, 2, 4 }; 

        int[][] resultsArray = {
            Fix34.fix34(nums0),
            Fix34.fix34(nums1),
            Fix34.fix34(nums2),
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
