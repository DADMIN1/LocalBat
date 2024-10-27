package Array3.Testcases;
import Array3.Fix45;
import java.util.Arrays;
import java.util.ArrayList;

public final class _Fix45
{
    static final String[] testcaseStrings = {
        "fix45([5, 4, 9, 4, 9, 5])",
        "fix45([1, 4, 1, 5])",
        "fix45([1, 4, 1, 5, 5, 4, 1])",
        "fix45([4, 9, 4, 9, 5, 5, 4, 9, 5])",
        "fix45([5, 5, 4, 1, 4, 1])",
        "fix45([4, 2, 2, 5])",
        "fix45([4, 2, 4, 2, 5, 5])",
        "fix45([4, 2, 4, 5, 5])",
        "fix45([1, 1, 1])",
        "fix45([4, 5])",
        "fix45([5, 4, 1])",
        "fix45([])",
        "fix45([5, 4, 5, 4, 1])",
        "fix45([4, 5, 4, 1, 5])",
        "fix45([3, 4, 5])",
        "fix45([4, 1, 5])",
        "fix45([5, 4, 1])",
        "fix45([2, 4, 2, 5])",
    };

    static final int[][] expectedResults = {
        {9, 4, 5, 4, 5, 9},
        {1, 4, 5, 1},
        {1, 4, 5, 1, 1, 4, 5},
        {4, 5, 4, 5, 9, 9, 4, 5, 9},
        {1, 1, 4, 5, 4, 5},
        {4, 5, 2, 2},
        {4, 5, 4, 5, 2, 2},
        {4, 5, 4, 5, 2},
        {1, 1, 1},
        {4, 5},
        {1, 4, 5},
        {},
        {1, 4, 5, 4, 5},
        {4, 5, 4, 5, 1},
        {3, 4, 5},
        {4, 5, 1},
        {1, 4, 5},
        {2, 4, 5, 2},
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
        final int[] nums0 = { 5, 4, 9, 4, 9, 5 }; 
        final int[] nums1 = { 1, 4, 1, 5 }; 
        final int[] nums2 = { 1, 4, 1, 5, 5, 4, 1 }; 
        final int[] nums3 = { 4, 9, 4, 9, 5, 5, 4, 9, 5 }; 
        final int[] nums4 = { 5, 5, 4, 1, 4, 1 }; 
        final int[] nums5 = { 4, 2, 2, 5 }; 
        final int[] nums6 = { 4, 2, 4, 2, 5, 5 }; 
        final int[] nums7 = { 4, 2, 4, 5, 5 }; 
        final int[] nums8 = { 1, 1, 1 }; 
        final int[] nums9 = { 4, 5 }; 
        final int[] nums10 = { 5, 4, 1 }; 
        final int[] nums11 = {  }; 
        final int[] nums12 = { 5, 4, 5, 4, 1 }; 
        final int[] nums13 = { 4, 5, 4, 1, 5 }; 
        final int[] nums14 = { 3, 4, 5 }; 
        final int[] nums15 = { 4, 1, 5 }; 
        final int[] nums16 = { 5, 4, 1 }; 
        final int[] nums17 = { 2, 4, 2, 5 }; 

        final int[][] resultsArray = {
            Fix45.fix45(nums0),
            Fix45.fix45(nums1),
            Fix45.fix45(nums2),
            Fix45.fix45(nums3),
            Fix45.fix45(nums4),
            Fix45.fix45(nums5),
            Fix45.fix45(nums6),
            Fix45.fix45(nums7),
            Fix45.fix45(nums8),
            Fix45.fix45(nums9),
            Fix45.fix45(nums10),
            Fix45.fix45(nums11),
            Fix45.fix45(nums12),
            Fix45.fix45(nums13),
            Fix45.fix45(nums14),
            Fix45.fix45(nums15),
            Fix45.fix45(nums16),
            Fix45.fix45(nums17),
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
