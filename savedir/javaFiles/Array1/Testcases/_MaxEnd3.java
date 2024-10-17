package Array1.Testcases;
import Array1.MaxEnd3;
import java.util.Arrays;

public class _MaxEnd3
{
    static String[] testcaseStrings = {
        "maxEnd3([1, 2, 3])",
        "maxEnd3([11, 5, 9])",
        "maxEnd3([2, 11, 3])",
    };

    static int[][] expectedResults = { {3, 3, 3}, {11, 11, 11}, {3, 3, 3}, };

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
        int[] nums1 = { 11, 5, 9 }; 
        int[] nums2 = { 2, 11, 3 }; 

        int[][] resultsArray = {
            MaxEnd3.maxEnd3(nums0),
            MaxEnd3.maxEnd3(nums1),
            MaxEnd3.maxEnd3(nums2),
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
