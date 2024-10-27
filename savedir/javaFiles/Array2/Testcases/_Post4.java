package Array2.Testcases;
import Array2.Post4;
import java.util.Arrays;
import java.util.ArrayList;

public final class _Post4
{
    static final String[] testcaseStrings = {
        "post4([2, 4, 1, 2])",
        "post4([4, 1, 4, 2])",
        "post4([4, 4, 1, 2, 3])",
        "post4([4, 2])",
        "post4([4, 4, 3])",
        "post4([4, 4])",
        "post4([4])",
        "post4([2, 4, 1, 4, 3, 2])",
        "post4([4, 1, 4, 2, 2, 2])",
        "post4([3, 4, 3, 2])",
    };

    static final int[][] expectedResults = {
        {1, 2},
        {2},
        {1, 2, 3},
        {2},
        {3},
        {},
        {},
        {3, 2},
        {2, 2, 2},
        {3, 2},
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
        final int[] nums0 = { 2, 4, 1, 2 }; 
        final int[] nums1 = { 4, 1, 4, 2 }; 
        final int[] nums2 = { 4, 4, 1, 2, 3 }; 
        final int[] nums3 = { 4, 2 }; 
        final int[] nums4 = { 4, 4, 3 }; 
        final int[] nums5 = { 4, 4 }; 
        final int[] nums6 = { 4 }; 
        final int[] nums7 = { 2, 4, 1, 4, 3, 2 }; 
        final int[] nums8 = { 4, 1, 4, 2, 2, 2 }; 
        final int[] nums9 = { 3, 4, 3, 2 }; 

        final int[][] resultsArray = {
            Post4.post4(nums0),
            Post4.post4(nums1),
            Post4.post4(nums2),
            Post4.post4(nums3),
            Post4.post4(nums4),
            Post4.post4(nums5),
            Post4.post4(nums6),
            Post4.post4(nums7),
            Post4.post4(nums8),
            Post4.post4(nums9),
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
