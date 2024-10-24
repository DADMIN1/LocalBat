package Array1.Testcases;
import Array1.Fix23;
import java.util.Arrays;

public class _Fix23
{
    static String[] testcaseStrings = {
        "fix23([1, 2, 3])",
        "fix23([2, 3, 5])",
        "fix23([1, 2, 1])",
        "fix23([3, 2, 1])",
        "fix23([2, 2, 3])",
        "fix23([2, 3, 3])",
    };

    static int[][] expectedResults = {
        {1, 2, 0},
        {2, 0, 5},
        {1, 2, 1},
        {3, 2, 1},
        {2, 2, 0},
        {2, 0, 3},
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
        int[] nums1 = { 2, 3, 5 }; 
        int[] nums2 = { 1, 2, 1 }; 
        int[] nums3 = { 3, 2, 1 }; 
        int[] nums4 = { 2, 2, 3 }; 
        int[] nums5 = { 2, 3, 3 }; 

        int[][] resultsArray = {
            Fix23.fix23(nums0),
            Fix23.fix23(nums1),
            Fix23.fix23(nums2),
            Fix23.fix23(nums3),
            Fix23.fix23(nums4),
            Fix23.fix23(nums5),
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
