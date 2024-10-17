package Array2.Testcases;
import Array2.NotAlone;
import java.util.Arrays;

public class _NotAlone
{
    static String[] testcaseStrings = {
        "notAlone([1, 2, 3], 2)",
        "notAlone([1, 2, 3, 2, 5, 2], 2)",
        "notAlone([3, 4], 3)",
    };

    static int[][] expectedResults = { {1, 3, 3}, {1, 3, 3, 5, 5, 2}, {3, 4}, };

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
        int[] nums1 = { 1, 2, 3, 2, 5, 2 }; 
        int[] nums2 = { 3, 4 }; 

        int[][] resultsArray = {
            NotAlone.notAlone(nums0, 2),
            NotAlone.notAlone(nums1, 2),
            NotAlone.notAlone(nums2, 3),
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
