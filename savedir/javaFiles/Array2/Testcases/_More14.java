package Array2.Testcases;
import Array2.More14;

public final class _More14
{
    static final String[] testcaseStrings = {
        "more14([1, 4, 1])",
        "more14([1, 4, 1, 4])",
        "more14([1, 1])",
        "more14([1, 6, 6])",
        "more14([1])",
        "more14([1, 4])",
        "more14([6, 1, 1])",
        "more14([1, 6, 4])",
        "more14([1, 1, 4, 4, 1])",
        "more14([1, 1, 6, 4, 4, 1])",
        "more14([])",
        "more14([4, 1, 4, 6])",
        "more14([4, 1, 4, 6, 1])",
        "more14([1, 4, 1, 4, 1, 6])",
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
        true,
        false,
        false,
        false,
        true,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] nums0 = {1, 4, 1}; 
        final int[] nums1 = {1, 4, 1, 4}; 
        final int[] nums2 = {1, 1}; 
        final int[] nums3 = {1, 6, 6}; 
        final int[] nums4 = {1}; 
        final int[] nums5 = {1, 4}; 
        final int[] nums6 = {6, 1, 1}; 
        final int[] nums7 = {1, 6, 4}; 
        final int[] nums8 = {1, 1, 4, 4, 1}; 
        final int[] nums9 = {1, 1, 6, 4, 4, 1}; 
        final int[] nums10 = {}; 
        final int[] nums11 = {4, 1, 4, 6}; 
        final int[] nums12 = {4, 1, 4, 6, 1}; 
        final int[] nums13 = {1, 4, 1, 4, 1, 6}; 

        final boolean[] resultsArray = {
            More14.more14(nums0),
            More14.more14(nums1),
            More14.more14(nums2),
            More14.more14(nums3),
            More14.more14(nums4),
            More14.more14(nums5),
            More14.more14(nums6),
            More14.more14(nums7),
            More14.more14(nums8),
            More14.more14(nums9),
            More14.more14(nums10),
            More14.more14(nums11),
            More14.more14(nums12),
            More14.more14(nums13),
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
