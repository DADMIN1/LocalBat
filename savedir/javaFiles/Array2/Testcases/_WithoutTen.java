package Array2.Testcases;
import Array2.WithoutTen;
import java.util.Arrays;

public class _WithoutTen
{
    static String[] testcaseStrings = {
        "withoutTen([1, 10, 10, 2])",
        "withoutTen([10, 2, 10])",
        "withoutTen([1, 99, 10])",
    };

    static int[][] expectedResults = { {1, 2, 0, 0}, {2, 0, 0}, {1, 99, 0}, };

    public static String printArray(int[] array)
    {
        String result = "[";
        for (int a: array) { result += a+", "; }
        if (result.length() > 2) result = result.substring(0, result.length()-2);
        return result + "]";
    }

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 1, 10, 10, 2 }; 
        int[] nums1 = { 10, 2, 10 }; 
        int[] nums2 = { 1, 99, 10 }; 

        int[][] resultsArray = {
            WithoutTen.withoutTen(nums0),
            WithoutTen.withoutTen(nums1),
            WithoutTen.withoutTen(nums2),
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
