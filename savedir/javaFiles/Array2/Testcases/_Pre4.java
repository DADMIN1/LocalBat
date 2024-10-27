package Array2.Testcases;
import Array2.Pre4;
import java.util.Arrays;
import java.util.ArrayList;

public final class _Pre4
{
    static final String[] testcaseStrings = {
        "pre4([1, 2, 4, 1])",
        "pre4([3, 1, 4])",
        "pre4([1, 4, 4])",
        "pre4([1, 4, 4, 2])",
        "pre4([1, 3, 4, 2, 4])",
        "pre4([4, 4])",
        "pre4([3, 3, 4])",
        "pre4([1, 2, 1, 4])",
        "pre4([2, 1, 4, 2])",
        "pre4([2, 1, 2, 1, 4, 2])",
    };

    static final int[][] expectedResults = {
        {1, 2},
        {3, 1},
        {1},
        {1},
        {1, 3},
        {},
        {3, 3},
        {1, 2, 1},
        {2, 1},
        {2, 1, 2, 1},
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
        final int[] nums0 = { 1, 2, 4, 1 }; 
        final int[] nums1 = { 3, 1, 4 }; 
        final int[] nums2 = { 1, 4, 4 }; 
        final int[] nums3 = { 1, 4, 4, 2 }; 
        final int[] nums4 = { 1, 3, 4, 2, 4 }; 
        final int[] nums5 = { 4, 4 }; 
        final int[] nums6 = { 3, 3, 4 }; 
        final int[] nums7 = { 1, 2, 1, 4 }; 
        final int[] nums8 = { 2, 1, 4, 2 }; 
        final int[] nums9 = { 2, 1, 2, 1, 4, 2 }; 

        final int[][] resultsArray = {
            Pre4.pre4(nums0),
            Pre4.pre4(nums1),
            Pre4.pre4(nums2),
            Pre4.pre4(nums3),
            Pre4.pre4(nums4),
            Pre4.pre4(nums5),
            Pre4.pre4(nums6),
            Pre4.pre4(nums7),
            Pre4.pre4(nums8),
            Pre4.pre4(nums9),
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
