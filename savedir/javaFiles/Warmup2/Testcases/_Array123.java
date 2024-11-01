package Warmup2.Testcases;
import Warmup2.Array123;

public final class _Array123
{
    static final String[] testcaseStrings = {
        "array123([1, 1, 2, 3, 1])",
        "array123([1, 1, 2, 4, 1])",
        "array123([1, 1, 2, 1, 2, 3])",
        "array123([1, 1, 2, 1, 2, 1])",
        "array123([1, 2, 3, 1, 2, 3])",
        "array123([1, 2, 3])",
        "array123([1, 1, 1])",
        "array123([1, 2])",
        "array123([1])",
        "array123([])",
    };

    static final boolean[] expectedResults = {
        true,
        false,
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
        final int[] nums0 = {1, 1, 2, 3, 1}; 
        final int[] nums1 = {1, 1, 2, 4, 1}; 
        final int[] nums2 = {1, 1, 2, 1, 2, 3}; 
        final int[] nums3 = {1, 1, 2, 1, 2, 1}; 
        final int[] nums4 = {1, 2, 3, 1, 2, 3}; 
        final int[] nums5 = {1, 2, 3}; 
        final int[] nums6 = {1, 1, 1}; 
        final int[] nums7 = {1, 2}; 
        final int[] nums8 = {1}; 
        final int[] nums9 = {}; 

        final boolean[] resultsArray = {
            Array123.array123(nums0),
            Array123.array123(nums1),
            Array123.array123(nums2),
            Array123.array123(nums3),
            Array123.array123(nums4),
            Array123.array123(nums5),
            Array123.array123(nums6),
            Array123.array123(nums7),
            Array123.array123(nums8),
            Array123.array123(nums9),
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
