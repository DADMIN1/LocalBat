package Array1.Testcases;
import Array1.Double23;

public final class _Double23
{
    static final String[] testcaseStrings = {
        "double23([2, 2])",
        "double23([3, 3])",
        "double23([2, 3])",
        "double23([3, 2])",
        "double23([4, 5])",
        "double23([2])",
        "double23([3])",
        "double23([])",
        "double23([3, 4])",
    };

    static final boolean[] expectedResults = {
        true,
        true,
        false,
        false,
        false,
        false,
        false,
        false,
        false,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] nums0 = {2, 2}; 
        final int[] nums1 = {3, 3}; 
        final int[] nums2 = {2, 3}; 
        final int[] nums3 = {3, 2}; 
        final int[] nums4 = {4, 5}; 
        final int[] nums5 = {2}; 
        final int[] nums6 = {3}; 
        final int[] nums7 = {}; 
        final int[] nums8 = {3, 4}; 

        final boolean[] resultsArray = {
            Double23.double23(nums0),
            Double23.double23(nums1),
            Double23.double23(nums2),
            Double23.double23(nums3),
            Double23.double23(nums4),
            Double23.double23(nums5),
            Double23.double23(nums6),
            Double23.double23(nums7),
            Double23.double23(nums8),
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
