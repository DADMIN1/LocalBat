package Array2.Testcases;
import Array2.Sum28;

public final class _Sum28
{
    static final String[] testcaseStrings = {
        "sum28([2, 3, 2, 2, 4, 2])",
        "sum28([2, 3, 2, 2, 4, 2, 2])",
        "sum28([1, 2, 3, 4])",
        "sum28([2, 2, 2, 2])",
        "sum28([1, 2, 2, 2, 2, 4])",
        "sum28([])",
        "sum28([2])",
        "sum28([8])",
        "sum28([2, 2, 2])",
        "sum28([2, 2, 2, 2, 2])",
        "sum28([1, 2, 2, 1, 2, 2])",
        "sum28([5, 2, 2, 2, 4, 2])",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        false,
        true,
        true,
        false,
        false,
        false,
        false,
        false,
        true,
        true,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] nums0 = {2, 3, 2, 2, 4, 2}; 
        final int[] nums1 = {2, 3, 2, 2, 4, 2, 2}; 
        final int[] nums2 = {1, 2, 3, 4}; 
        final int[] nums3 = {2, 2, 2, 2}; 
        final int[] nums4 = {1, 2, 2, 2, 2, 4}; 
        final int[] nums5 = {}; 
        final int[] nums6 = {2}; 
        final int[] nums7 = {8}; 
        final int[] nums8 = {2, 2, 2}; 
        final int[] nums9 = {2, 2, 2, 2, 2}; 
        final int[] nums10 = {1, 2, 2, 1, 2, 2}; 
        final int[] nums11 = {5, 2, 2, 2, 4, 2}; 

        final boolean[] resultsArray = {
            Sum28.sum28(nums0),
            Sum28.sum28(nums1),
            Sum28.sum28(nums2),
            Sum28.sum28(nums3),
            Sum28.sum28(nums4),
            Sum28.sum28(nums5),
            Sum28.sum28(nums6),
            Sum28.sum28(nums7),
            Sum28.sum28(nums8),
            Sum28.sum28(nums9),
            Sum28.sum28(nums10),
            Sum28.sum28(nums11),
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
