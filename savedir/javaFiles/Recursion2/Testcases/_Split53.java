package Recursion2.Testcases;
import Recursion2.Split53;

public final class _Split53
{
    static final String[] testcaseStrings = {
        "split53([1, 1])",
        "split53([1, 1, 1])",
        "split53([2, 4, 2])",
        "split53([2, 2, 2, 1])",
        "split53([3, 3, 5, 1])",
        "split53([3, 5, 8])",
        "split53([2, 4, 6])",
        "split53([3, 5, 6, 10, 3, 3])",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        true,
        false,
        true,
        false,
        true,
        true,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] nums0 = {1, 1}; 
        final int[] nums1 = {1, 1, 1}; 
        final int[] nums2 = {2, 4, 2}; 
        final int[] nums3 = {2, 2, 2, 1}; 
        final int[] nums4 = {3, 3, 5, 1}; 
        final int[] nums5 = {3, 5, 8}; 
        final int[] nums6 = {2, 4, 6}; 
        final int[] nums7 = {3, 5, 6, 10, 3, 3}; 

        final boolean[] resultsArray = {
            Split53.split53(nums0),
            Split53.split53(nums1),
            Split53.split53(nums2),
            Split53.split53(nums3),
            Split53.split53(nums4),
            Split53.split53(nums5),
            Split53.split53(nums6),
            Split53.split53(nums7),
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
