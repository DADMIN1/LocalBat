package Array1.Testcases;
import Array1.MakeEnds;
import java.util.Arrays;
import java.util.ArrayList;

public final class _MakeEnds
{
    static final String[] testcaseStrings = {
        "makeEnds([1, 2, 3])",
        "makeEnds([1, 2, 3, 4])",
        "makeEnds([7, 4, 6, 2])",
        "makeEnds([1, 2, 2, 2, 2, 2, 2, 3])",
        "makeEnds([7, 4])",
        "makeEnds([7])",
        "makeEnds([5, 2, 9])",
        "makeEnds([2, 3, 4, 1])",
    };

    static final int[][] expectedResults = {
        {1, 3},
        {1, 4},
        {7, 2},
        {1, 3},
        {7, 4},
        {7, 7},
        {5, 9},
        {2, 1},
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
        final int[] nums0 = {1, 2, 3}; 
        final int[] nums1 = {1, 2, 3, 4}; 
        final int[] nums2 = {7, 4, 6, 2}; 
        final int[] nums3 = {1, 2, 2, 2, 2, 2, 2, 3}; 
        final int[] nums4 = {7, 4}; 
        final int[] nums5 = {7}; 
        final int[] nums6 = {5, 2, 9}; 
        final int[] nums7 = {2, 3, 4, 1}; 

        final int[][] resultsArray = {
            MakeEnds.makeEnds(nums0),
            MakeEnds.makeEnds(nums1),
            MakeEnds.makeEnds(nums2),
            MakeEnds.makeEnds(nums3),
            MakeEnds.makeEnds(nums4),
            MakeEnds.makeEnds(nums5),
            MakeEnds.makeEnds(nums6),
            MakeEnds.makeEnds(nums7),
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
