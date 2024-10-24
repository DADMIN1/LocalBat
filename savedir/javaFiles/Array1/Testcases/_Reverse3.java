package Array1.Testcases;
import Array1.Reverse3;
import java.util.Arrays;

public class _Reverse3
{
    static String[] testcaseStrings = {
        "reverse3([1, 2, 3])",
        "reverse3([5, 11, 9])",
        "reverse3([7, 0, 0])",
        "reverse3([2, 1, 2])",
        "reverse3([1, 2, 1])",
        "reverse3([2, 11, 3])",
        "reverse3([0, 6, 5])",
        "reverse3([7, 2, 3])",
    };

    static int[][] expectedResults = {
        {3, 2, 1},
        {9, 11, 5},
        {0, 0, 7},
        {2, 1, 2},
        {1, 2, 1},
        {3, 11, 2},
        {5, 6, 0},
        {3, 2, 7},
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
        int[] nums1 = { 5, 11, 9 }; 
        int[] nums2 = { 7, 0, 0 }; 
        int[] nums3 = { 2, 1, 2 }; 
        int[] nums4 = { 1, 2, 1 }; 
        int[] nums5 = { 2, 11, 3 }; 
        int[] nums6 = { 0, 6, 5 }; 
        int[] nums7 = { 7, 2, 3 }; 

        int[][] resultsArray = {
            Reverse3.reverse3(nums0),
            Reverse3.reverse3(nums1),
            Reverse3.reverse3(nums2),
            Reverse3.reverse3(nums3),
            Reverse3.reverse3(nums4),
            Reverse3.reverse3(nums5),
            Reverse3.reverse3(nums6),
            Reverse3.reverse3(nums7),
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
