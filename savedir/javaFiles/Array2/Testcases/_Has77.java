package Array2.Testcases;
import Array2.Has77;

public final class _Has77
{
    static final String[] testcaseStrings = {
        "has77([1, 7, 7])",
        "has77([1, 7, 1, 7])",
        "has77([1, 7, 1, 1, 7])",
        "has77([7, 7, 1, 1, 7])",
        "has77([2, 7, 2, 2, 7, 2])",
        "has77([2, 7, 2, 2, 7, 7])",
        "has77([7, 2, 7, 2, 2, 7])",
        "has77([7, 2, 6, 2, 2, 7])",
        "has77([7, 7, 7])",
        "has77([7, 1, 7])",
        "has77([7, 1, 1])",
        "has77([1, 2])",
        "has77([1, 7])",
        "has77([7])",
    };

    static final boolean[] expectedResults = {
        true,
        true,
        false,
        true,
        false,
        true,
        true,
        false,
        true,
        true,
        false,
        false,
        false,
        false,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] nums0 = {1, 7, 7}; 
        final int[] nums1 = {1, 7, 1, 7}; 
        final int[] nums2 = {1, 7, 1, 1, 7}; 
        final int[] nums3 = {7, 7, 1, 1, 7}; 
        final int[] nums4 = {2, 7, 2, 2, 7, 2}; 
        final int[] nums5 = {2, 7, 2, 2, 7, 7}; 
        final int[] nums6 = {7, 2, 7, 2, 2, 7}; 
        final int[] nums7 = {7, 2, 6, 2, 2, 7}; 
        final int[] nums8 = {7, 7, 7}; 
        final int[] nums9 = {7, 1, 7}; 
        final int[] nums10 = {7, 1, 1}; 
        final int[] nums11 = {1, 2}; 
        final int[] nums12 = {1, 7}; 
        final int[] nums13 = {7}; 

        final boolean[] resultsArray = {
            Has77.has77(nums0),
            Has77.has77(nums1),
            Has77.has77(nums2),
            Has77.has77(nums3),
            Has77.has77(nums4),
            Has77.has77(nums5),
            Has77.has77(nums6),
            Has77.has77(nums7),
            Has77.has77(nums8),
            Has77.has77(nums9),
            Has77.has77(nums10),
            Has77.has77(nums11),
            Has77.has77(nums12),
            Has77.has77(nums13),
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
