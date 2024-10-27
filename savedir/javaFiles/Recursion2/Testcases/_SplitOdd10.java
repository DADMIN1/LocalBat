package Recursion2.Testcases;
import Recursion2.SplitOdd10;

public final class _SplitOdd10
{
    static final String[] testcaseStrings = {
        "splitOdd10([5, 5, 5])",
        "splitOdd10([5, 5, 6])",
        "splitOdd10([5, 5, 6, 1])",
        "splitOdd10([6, 5, 5, 1])",
        "splitOdd10([6, 5, 5, 1, 10])",
        "splitOdd10([6, 5, 5, 5, 1])",
        "splitOdd10([1])",
        "splitOdd10([])",
        "splitOdd10([10, 7, 5, 5])",
        "splitOdd10([10, 0, 5, 5])",
        "splitOdd10([10, 7, 5, 5, 2])",
        "splitOdd10([10, 7, 5, 5, 1])",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        true,
        true,
        true,
        false,
        true,
        false,
        true,
        false,
        true,
        false,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] nums0 = { 5, 5, 5 }; 
        final int[] nums1 = { 5, 5, 6 }; 
        final int[] nums2 = { 5, 5, 6, 1 }; 
        final int[] nums3 = { 6, 5, 5, 1 }; 
        final int[] nums4 = { 6, 5, 5, 1, 10 }; 
        final int[] nums5 = { 6, 5, 5, 5, 1 }; 
        final int[] nums6 = { 1 }; 
        final int[] nums7 = {  }; 
        final int[] nums8 = { 10, 7, 5, 5 }; 
        final int[] nums9 = { 10, 0, 5, 5 }; 
        final int[] nums10 = { 10, 7, 5, 5, 2 }; 
        final int[] nums11 = { 10, 7, 5, 5, 1 }; 

        final boolean[] resultsArray = {
            SplitOdd10.splitOdd10(nums0),
            SplitOdd10.splitOdd10(nums1),
            SplitOdd10.splitOdd10(nums2),
            SplitOdd10.splitOdd10(nums3),
            SplitOdd10.splitOdd10(nums4),
            SplitOdd10.splitOdd10(nums5),
            SplitOdd10.splitOdd10(nums6),
            SplitOdd10.splitOdd10(nums7),
            SplitOdd10.splitOdd10(nums8),
            SplitOdd10.splitOdd10(nums9),
            SplitOdd10.splitOdd10(nums10),
            SplitOdd10.splitOdd10(nums11),
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
