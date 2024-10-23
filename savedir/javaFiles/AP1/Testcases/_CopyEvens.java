package AP1.Testcases;
import AP1.CopyEvens;
import java.util.Arrays;

public class _CopyEvens
{
    static String[] testcaseStrings = {
        "copyEvens([3, 2, 4, 5, 8], 2)",
        "copyEvens([3, 2, 4, 5, 8], 3)",
        "copyEvens([6, 1, 2, 4, 5, 8], 3)",
    };

    static int[][] expectedResults = {
        {2, 4},
        {2, 4, 8},
        {6, 2, 4},
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
        int[] nums0 = { 3, 2, 4, 5, 8 }; 
        int[] nums1 = { 3, 2, 4, 5, 8 }; 
        int[] nums2 = { 6, 1, 2, 4, 5, 8 }; 

        int[][] resultsArray = {
            CopyEvens.copyEvens(nums0, 2),
            CopyEvens.copyEvens(nums1, 3),
            CopyEvens.copyEvens(nums2, 3),
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
