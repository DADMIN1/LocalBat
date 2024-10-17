package AP1.Testcases;
import AP1.CopyEndy;
import java.util.Arrays;

public class _CopyEndy
{
    static String[] testcaseStrings = {
        "copyEndy([9, 11, 90, 22, 6], 2)",
        "copyEndy([9, 11, 90, 22, 6], 3)",
        "copyEndy([12, 1, 1, 13, 0, 20], 2)",
    };

    static int[][] expectedResults = { {9, 90}, {9, 90, 6}, {1, 1}, };

    public static String printArray(int[] array)
    {
        String result = "[";
        for (int a: array) { result += a+", "; }
        if (result.length() > 2) result = result.substring(0, result.length()-2);
        return result + "]";
    }

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 9, 11, 90, 22, 6 }; 
        int[] nums1 = { 9, 11, 90, 22, 6 }; 
        int[] nums2 = { 12, 1, 1, 13, 0, 20 }; 

        int[][] resultsArray = {
            CopyEndy.copyEndy(nums0, 2),
            CopyEndy.copyEndy(nums1, 3),
            CopyEndy.copyEndy(nums2, 2),
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
