package Array2.Testcases;
import Array2.Has12;

public final class _Has12
{
    static final String[] testcaseStrings = {
        "has12([1, 3, 2])",
        "has12([3, 1, 2])",
        "has12([3, 1, 4, 5, 2])",
        "has12([3, 1, 4, 5, 6])",
        "has12([3, 1, 4, 1, 6, 2])",
        "has12([2, 1, 4, 1, 6, 2])",
        "has12([2, 1, 4, 1, 6])",
        "has12([1])",
        "has12([2, 1, 3])",
        "has12([2, 1, 3, 2])",
        "has12([2])",
        "has12([3, 2])",
        "has12([3, 1, 3, 2])",
        "has12([3, 5, 9])",
        "has12([3, 5, 1])",
        "has12([3, 2, 1])",
        "has12([1, 2])",
    };

    static final boolean[] expectedResults = {
        true,
        true,
        true,
        false,
        true,
        true,
        false,
        false,
        false,
        true,
        false,
        false,
        true,
        false,
        false,
        false,
        true,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] nums0 = {1, 3, 2}; 
        final int[] nums1 = {3, 1, 2}; 
        final int[] nums2 = {3, 1, 4, 5, 2}; 
        final int[] nums3 = {3, 1, 4, 5, 6}; 
        final int[] nums4 = {3, 1, 4, 1, 6, 2}; 
        final int[] nums5 = {2, 1, 4, 1, 6, 2}; 
        final int[] nums6 = {2, 1, 4, 1, 6}; 
        final int[] nums7 = {1}; 
        final int[] nums8 = {2, 1, 3}; 
        final int[] nums9 = {2, 1, 3, 2}; 
        final int[] nums10 = {2}; 
        final int[] nums11 = {3, 2}; 
        final int[] nums12 = {3, 1, 3, 2}; 
        final int[] nums13 = {3, 5, 9}; 
        final int[] nums14 = {3, 5, 1}; 
        final int[] nums15 = {3, 2, 1}; 
        final int[] nums16 = {1, 2}; 

        final boolean[] resultsArray = {
            Has12.has12(nums0),
            Has12.has12(nums1),
            Has12.has12(nums2),
            Has12.has12(nums3),
            Has12.has12(nums4),
            Has12.has12(nums5),
            Has12.has12(nums6),
            Has12.has12(nums7),
            Has12.has12(nums8),
            Has12.has12(nums9),
            Has12.has12(nums10),
            Has12.has12(nums11),
            Has12.has12(nums12),
            Has12.has12(nums13),
            Has12.has12(nums14),
            Has12.has12(nums15),
            Has12.has12(nums16),
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
