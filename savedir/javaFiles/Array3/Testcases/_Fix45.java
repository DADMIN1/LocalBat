package Array3.Testcases;
import Array3.Fix45;
import java.util.Arrays;

public class _Fix45
{
    static String[] testcaseStrings = {
        "fix45([5, 4, 9, 4, 9, 5])",
        "fix45([1, 4, 1, 5])",
        "fix45([1, 4, 1, 5, 5, 4, 1])",
    };

    static int[][] expectedResults = { {9, 4, 5, 4, 5, 9}, {1, 4, 5, 1}, {1, 4, 5, 1, 1, 4, 5}, };

    public static String printArray(int[] array)
    {
        String result = "[";
        for (int a: array) { result += a+", "; }
        if (result.length() > 2) result = result.substring(0, result.length()-2);
        return result + "]";
    }

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 5, 4, 9, 4, 9, 5 }; 
        int[] nums1 = { 1, 4, 1, 5 }; 
        int[] nums2 = { 1, 4, 1, 5, 5, 4, 1 }; 

        int[][] resultsArray = {
            Fix45.fix45(nums0),
            Fix45.fix45(nums1),
            Fix45.fix45(nums2),
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
