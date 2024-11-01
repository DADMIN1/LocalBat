package Array2.Testcases;
import Array2.HaveThree;

public final class _HaveThree
{
    static final String[] testcaseStrings = {
        "haveThree([3, 1, 3, 1, 3])",
        "haveThree([3, 1, 3, 3])",
        "haveThree([3, 4, 3, 3, 4])",
        "haveThree([1, 3, 1, 3, 1, 2])",
        "haveThree([1, 3, 1, 3, 1, 3])",
        "haveThree([1, 3, 3, 1, 3])",
        "haveThree([1, 3, 1, 3, 1, 3, 4, 3])",
        "haveThree([3, 4, 3, 4, 3, 4, 4])",
        "haveThree([3, 3, 3])",
        "haveThree([1, 3])",
        "haveThree([3])",
        "haveThree([1])",
    };

    static final boolean[] expectedResults = {
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
        false,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] nums0 = {3, 1, 3, 1, 3}; 
        final int[] nums1 = {3, 1, 3, 3}; 
        final int[] nums2 = {3, 4, 3, 3, 4}; 
        final int[] nums3 = {1, 3, 1, 3, 1, 2}; 
        final int[] nums4 = {1, 3, 1, 3, 1, 3}; 
        final int[] nums5 = {1, 3, 3, 1, 3}; 
        final int[] nums6 = {1, 3, 1, 3, 1, 3, 4, 3}; 
        final int[] nums7 = {3, 4, 3, 4, 3, 4, 4}; 
        final int[] nums8 = {3, 3, 3}; 
        final int[] nums9 = {1, 3}; 
        final int[] nums10 = {3}; 
        final int[] nums11 = {1}; 

        final boolean[] resultsArray = {
            HaveThree.haveThree(nums0),
            HaveThree.haveThree(nums1),
            HaveThree.haveThree(nums2),
            HaveThree.haveThree(nums3),
            HaveThree.haveThree(nums4),
            HaveThree.haveThree(nums5),
            HaveThree.haveThree(nums6),
            HaveThree.haveThree(nums7),
            HaveThree.haveThree(nums8),
            HaveThree.haveThree(nums9),
            HaveThree.haveThree(nums10),
            HaveThree.haveThree(nums11),
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
