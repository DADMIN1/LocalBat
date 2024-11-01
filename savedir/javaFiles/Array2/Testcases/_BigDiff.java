package Array2.Testcases;
import Array2.BigDiff;

public final class _BigDiff
{
    static final String[] testcaseStrings = {
        "bigDiff([10, 3, 5, 6])",
        "bigDiff([7, 2, 10, 9])",
        "bigDiff([2, 10, 7, 2])",
        "bigDiff([2, 10])",
        "bigDiff([10, 2])",
        "bigDiff([10, 0])",
        "bigDiff([2, 3])",
        "bigDiff([2, 2])",
        "bigDiff([2])",
        "bigDiff([5, 1, 6, 1, 9, 9])",
        "bigDiff([7, 6, 8, 5])",
        "bigDiff([7, 7, 6, 8, 5, 5, 6])",
    };

    static final int[] expectedResults = {
        7,
        8,
        8,
        8,
        8,
        10,
        1,
        0,
        0,
        8,
        3,
        3,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] nums0 = {10, 3, 5, 6}; 
        final int[] nums1 = {7, 2, 10, 9}; 
        final int[] nums2 = {2, 10, 7, 2}; 
        final int[] nums3 = {2, 10}; 
        final int[] nums4 = {10, 2}; 
        final int[] nums5 = {10, 0}; 
        final int[] nums6 = {2, 3}; 
        final int[] nums7 = {2, 2}; 
        final int[] nums8 = {2}; 
        final int[] nums9 = {5, 1, 6, 1, 9, 9}; 
        final int[] nums10 = {7, 6, 8, 5}; 
        final int[] nums11 = {7, 7, 6, 8, 5, 5, 6}; 

        final int[] resultsArray = {
            BigDiff.bigDiff(nums0),
            BigDiff.bigDiff(nums1),
            BigDiff.bigDiff(nums2),
            BigDiff.bigDiff(nums3),
            BigDiff.bigDiff(nums4),
            BigDiff.bigDiff(nums5),
            BigDiff.bigDiff(nums6),
            BigDiff.bigDiff(nums7),
            BigDiff.bigDiff(nums8),
            BigDiff.bigDiff(nums9),
            BigDiff.bigDiff(nums10),
            BigDiff.bigDiff(nums11),
        };

        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("\n[-] #"+(i+1)+" failed!");
                System.out.println(testcaseStrings[i]+";");
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+expectedResults[i]);
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
