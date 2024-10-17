package Array2.Testcases;
import Array2.EvenOdd;
import java.util.Arrays;

public class _EvenOdd
{
    static String[] testcaseStrings = {
        "evenOdd([1, 0, 1, 0, 0, 1, 1])",
        "evenOdd([3, 3, 2])",
        "evenOdd([2, 2, 2])",
    };

    static int[][] expectedResults = { {0, 0, 0, 1, 1, 1, 1}, {2, 3, 3}, {2, 2, 2}, };

    public static String printArray(int[] array)
    {
        String result = "[";
        for (int a: array) { result += a+", "; }
        if (result.length() > 2) result = result.substring(0, result.length()-2);
        return result + "]";
    }

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 1, 0, 1, 0, 0, 1, 1 }; 
        int[] nums1 = { 3, 3, 2 }; 
        int[] nums2 = { 2, 2, 2 }; 

        int[][] resultsArray = {
            EvenOdd.evenOdd(nums0),
            EvenOdd.evenOdd(nums1),
            EvenOdd.evenOdd(nums2),
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
