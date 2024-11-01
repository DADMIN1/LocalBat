package Array1.Testcases;
import Array1.No23;

public final class _No23
{
    static final String[] testcaseStrings = {
        "no23([4, 5])",
        "no23([4, 2])",
        "no23([3, 5])",
        "no23([1, 9])",
        "no23([2, 9])",
        "no23([1, 3])",
        "no23([1, 1])",
        "no23([2, 2])",
        "no23([3, 3])",
        "no23([7, 8])",
        "no23([8, 7])",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        false,
        true,
        false,
        false,
        true,
        false,
        false,
        true,
        true,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] nums0 = {4, 5}; 
        final int[] nums1 = {4, 2}; 
        final int[] nums2 = {3, 5}; 
        final int[] nums3 = {1, 9}; 
        final int[] nums4 = {2, 9}; 
        final int[] nums5 = {1, 3}; 
        final int[] nums6 = {1, 1}; 
        final int[] nums7 = {2, 2}; 
        final int[] nums8 = {3, 3}; 
        final int[] nums9 = {7, 8}; 
        final int[] nums10 = {8, 7}; 

        final boolean[] resultsArray = {
            No23.no23(nums0),
            No23.no23(nums1),
            No23.no23(nums2),
            No23.no23(nums3),
            No23.no23(nums4),
            No23.no23(nums5),
            No23.no23(nums6),
            No23.no23(nums7),
            No23.no23(nums8),
            No23.no23(nums9),
            No23.no23(nums10),
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
