package Array1.Testcases;
import Array1.RotateLeft3;
import java.util.Arrays;
import java.util.ArrayList;

public final class _RotateLeft3
{
    static final String[] testcaseStrings = {
        "rotateLeft3([1, 2, 3])",
        "rotateLeft3([5, 11, 9])",
        "rotateLeft3([7, 0, 0])",
        "rotateLeft3([1, 2, 1])",
        "rotateLeft3([0, 0, 1])",
    };

    static final int[][] expectedResults = {
        {2, 3, 1},
        {11, 9, 5},
        {0, 0, 7},
        {2, 1, 1},
        {0, 1, 0},
    };

    public static final String printArray(int[] array)
    {
        String result = "[";
        for (int a: array) { result += a+", "; }
        if (result.length() > 2) result = result.substring(0, result.length()-2);
        return result + "]";
    }

    public static final void Validate(boolean printSuccess)
    {
        final int[] nums0 = { 1, 2, 3 }; 
        final int[] nums1 = { 5, 11, 9 }; 
        final int[] nums2 = { 7, 0, 0 }; 
        final int[] nums3 = { 1, 2, 1 }; 
        final int[] nums4 = { 0, 0, 1 }; 

        final int[][] resultsArray = {
            RotateLeft3.rotateLeft3(nums0),
            RotateLeft3.rotateLeft3(nums1),
            RotateLeft3.rotateLeft3(nums2),
            RotateLeft3.rotateLeft3(nums3),
            RotateLeft3.rotateLeft3(nums4),
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
