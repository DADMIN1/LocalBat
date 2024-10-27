package Warmup2.Testcases;
import Warmup2.NoTriples;

public final class _NoTriples
{
    static final String[] testcaseStrings = {
        "noTriples([1, 1, 2, 2, 1])",
        "noTriples([1, 1, 2, 2, 2, 1])",
        "noTriples([1, 1, 1, 2, 2, 2, 1])",
        "noTriples([1, 1, 2, 2, 1, 2, 1])",
        "noTriples([1, 2, 1])",
        "noTriples([1, 1, 1])",
        "noTriples([1, 1])",
        "noTriples([1])",
        "noTriples([])",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        false,
        true,
        true,
        false,
        true,
        true,
        true,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] nums0 = { 1, 1, 2, 2, 1 }; 
        final int[] nums1 = { 1, 1, 2, 2, 2, 1 }; 
        final int[] nums2 = { 1, 1, 1, 2, 2, 2, 1 }; 
        final int[] nums3 = { 1, 1, 2, 2, 1, 2, 1 }; 
        final int[] nums4 = { 1, 2, 1 }; 
        final int[] nums5 = { 1, 1, 1 }; 
        final int[] nums6 = { 1, 1 }; 
        final int[] nums7 = { 1 }; 
        final int[] nums8 = {  }; 

        final boolean[] resultsArray = {
            NoTriples.noTriples(nums0),
            NoTriples.noTriples(nums1),
            NoTriples.noTriples(nums2),
            NoTriples.noTriples(nums3),
            NoTriples.noTriples(nums4),
            NoTriples.noTriples(nums5),
            NoTriples.noTriples(nums6),
            NoTriples.noTriples(nums7),
            NoTriples.noTriples(nums8),
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
