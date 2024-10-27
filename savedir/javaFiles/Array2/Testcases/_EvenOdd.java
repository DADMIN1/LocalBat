package Array2.Testcases;
import Array2.EvenOdd;
import java.util.Arrays;
import java.util.ArrayList;

public final class _EvenOdd
{
    static final String[] testcaseStrings = {
        "evenOdd([1, 0, 1, 0, 0, 1, 1])",
        "evenOdd([3, 3, 2])",
        "evenOdd([2, 2, 2])",
        "evenOdd([3, 2, 2])",
        "evenOdd([1, 1, 0, 1, 0])",
        "evenOdd([1])",
        "evenOdd([1, 2])",
        "evenOdd([2, 1])",
        "evenOdd([])",
    };

    static final int[][] expectedResults = {
        {0, 0, 0, 1, 1, 1, 1},
        {2, 3, 3},
        {2, 2, 2},
        {2, 2, 3},
        {0, 0, 1, 1, 1},
        {1},
        {2, 1},
        {2, 1},
        {},
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
        final int[] nums0 = { 1, 0, 1, 0, 0, 1, 1 }; 
        final int[] nums1 = { 3, 3, 2 }; 
        final int[] nums2 = { 2, 2, 2 }; 
        final int[] nums3 = { 3, 2, 2 }; 
        final int[] nums4 = { 1, 1, 0, 1, 0 }; 
        final int[] nums5 = { 1 }; 
        final int[] nums6 = { 1, 2 }; 
        final int[] nums7 = { 2, 1 }; 
        final int[] nums8 = {  }; 

        final int[][] resultsArray = {
            EvenOdd.evenOdd(nums0),
            EvenOdd.evenOdd(nums1),
            EvenOdd.evenOdd(nums2),
            EvenOdd.evenOdd(nums3),
            EvenOdd.evenOdd(nums4),
            EvenOdd.evenOdd(nums5),
            EvenOdd.evenOdd(nums6),
            EvenOdd.evenOdd(nums7),
            EvenOdd.evenOdd(nums8),
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
