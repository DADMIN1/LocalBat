package Array1.Testcases;
import Array1.FirstLast6;

public final class _FirstLast6
{
    static final String[] testcaseStrings = {
        "firstLast6([1, 2, 6])",
        "firstLast6([6, 1, 2, 3])",
        "firstLast6([13, 6, 1, 2, 3])",
        "firstLast6([13, 6, 1, 2, 6])",
        "firstLast6([3, 2, 1])",
        "firstLast6([3, 6, 1])",
        "firstLast6([3, 6])",
        "firstLast6([6])",
        "firstLast6([3])",
        "firstLast6([5, 6])",
        "firstLast6([5, 5])",
        "firstLast6([1, 2, 3, 4, 6])",
        "firstLast6([1, 2, 3, 4])",
    };

    static final boolean[] expectedResults = {
        true,
        true,
        false,
        true,
        false,
        false,
        true,
        true,
        false,
        true,
        false,
        true,
        false,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] nums0 = { 1, 2, 6 }; 
        final int[] nums1 = { 6, 1, 2, 3 }; 
        final int[] nums2 = { 13, 6, 1, 2, 3 }; 
        final int[] nums3 = { 13, 6, 1, 2, 6 }; 
        final int[] nums4 = { 3, 2, 1 }; 
        final int[] nums5 = { 3, 6, 1 }; 
        final int[] nums6 = { 3, 6 }; 
        final int[] nums7 = { 6 }; 
        final int[] nums8 = { 3 }; 
        final int[] nums9 = { 5, 6 }; 
        final int[] nums10 = { 5, 5 }; 
        final int[] nums11 = { 1, 2, 3, 4, 6 }; 
        final int[] nums12 = { 1, 2, 3, 4 }; 

        final boolean[] resultsArray = {
            FirstLast6.firstLast6(nums0),
            FirstLast6.firstLast6(nums1),
            FirstLast6.firstLast6(nums2),
            FirstLast6.firstLast6(nums3),
            FirstLast6.firstLast6(nums4),
            FirstLast6.firstLast6(nums5),
            FirstLast6.firstLast6(nums6),
            FirstLast6.firstLast6(nums7),
            FirstLast6.firstLast6(nums8),
            FirstLast6.firstLast6(nums9),
            FirstLast6.firstLast6(nums10),
            FirstLast6.firstLast6(nums11),
            FirstLast6.firstLast6(nums12),
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
