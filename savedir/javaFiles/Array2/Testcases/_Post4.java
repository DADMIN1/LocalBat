package Array2.Testcases;
import Array2.Post4;
import java.util.Arrays;

public class _Post4
{
    static String[] testcaseStrings = {
        "post4([2, 4, 1, 2])",
        "post4([4, 1, 4, 2])",
        "post4([4, 4, 1, 2, 3])",
    };

    static int[][] expectedResults = { {1, 2}, {2}, {1, 2, 3}, };

    public static String printArray(int[] array)
    {
        String result = "[";
        for (int a: array) { result += a+", "; }
        if (result.length() > 2) result = result.substring(0, result.length()-2);
        return result + "]";
    }

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 2, 4, 1, 2 }; 
        int[] nums1 = { 4, 1, 4, 2 }; 
        int[] nums2 = { 4, 4, 1, 2, 3 }; 

        int[][] resultsArray = {
            Post4.post4(nums0),
            Post4.post4(nums1),
            Post4.post4(nums2),
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
