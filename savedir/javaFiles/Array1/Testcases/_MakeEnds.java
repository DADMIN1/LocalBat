package Array1.Testcases;
import Array1.MakeEnds;
import java.util.Arrays;

public class _MakeEnds
{
    static String[] testcaseStrings = {
        "makeEnds([1, 2, 3])",
        "makeEnds([1, 2, 3, 4])",
        "makeEnds([7, 4, 6, 2])",
    };

    static int[][] expectedResults = { {1, 3}, {1, 4}, {7, 2}, };

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
        int[] nums1 = { 1, 2, 3, 4 }; 
        int[] nums2 = { 7, 4, 6, 2 }; 

        int[][] resultsArray = {
            MakeEnds.makeEnds(nums0),
            MakeEnds.makeEnds(nums1),
            MakeEnds.makeEnds(nums2),
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
