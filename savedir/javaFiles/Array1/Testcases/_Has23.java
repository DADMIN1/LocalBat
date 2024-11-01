package Array1.Testcases;
import Array1.Has23;

public final class _Has23
{
    static final String[] testcaseStrings = {
        "has23([2, 5])",
        "has23([4, 3])",
        "has23([4, 5])",
        "has23([2, 2])",
        "has23([3, 2])",
        "has23([3, 3])",
        "has23([7, 7])",
        "has23([3, 9])",
        "has23([9, 5])",
    };

    static final boolean[] expectedResults = {
        true,
        true,
        false,
        true,
        true,
        true,
        false,
        true,
        false,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] nums0 = {2, 5}; 
        final int[] nums1 = {4, 3}; 
        final int[] nums2 = {4, 5}; 
        final int[] nums3 = {2, 2}; 
        final int[] nums4 = {3, 2}; 
        final int[] nums5 = {3, 3}; 
        final int[] nums6 = {7, 7}; 
        final int[] nums7 = {3, 9}; 
        final int[] nums8 = {9, 5}; 

        final boolean[] resultsArray = {
            Has23.has23(nums0),
            Has23.has23(nums1),
            Has23.has23(nums2),
            Has23.has23(nums3),
            Has23.has23(nums4),
            Has23.has23(nums5),
            Has23.has23(nums6),
            Has23.has23(nums7),
            Has23.has23(nums8),
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
