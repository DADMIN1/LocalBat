package Array1.Testcases;
import Array1.RotateLeft3;
import java.util.Arrays;

public class _RotateLeft3
{
    static String[] testcaseStrings = {
        "rotateLeft3([1, 2, 3])",
        "rotateLeft3([5, 11, 9])",
        "rotateLeft3([7, 0, 0])",
    };

    static int[][] expectedResults = { {2, 3, 1}, {11, 9, 5}, {0, 0, 7}, };

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
        int[] nums1 = { 5, 11, 9 }; 
        int[] nums2 = { 7, 0, 0 }; 

        int[][] resultsArray = {
            RotateLeft3.rotateLeft3(nums0),
            RotateLeft3.rotateLeft3(nums1),
            RotateLeft3.rotateLeft3(nums2),
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
