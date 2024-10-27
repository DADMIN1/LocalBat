package Array2.Testcases;
import Array2.Only14;

public final class _Only14
{
    static final String[] testcaseStrings = {
        "only14([1, 4, 1, 4])",
        "only14([1, 4, 2, 4])",
        "only14([1, 1])",
        "only14([4, 1])",
        "only14([2])",
        "only14([])",
        "only14([1, 4, 1, 3])",
        "only14([3, 1, 3])",
        "only14([1])",
        "only14([4])",
        "only14([3, 4])",
        "only14([1, 3, 4])",
        "only14([1, 1, 1])",
        "only14([1, 1, 1, 5])",
        "only14([4, 1, 4, 1])",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        true,
        true,
        false,
        true,
        false,
        false,
        true,
        true,
        false,
        false,
        true,
        false,
        true,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] nums0 = { 1, 4, 1, 4 }; 
        final int[] nums1 = { 1, 4, 2, 4 }; 
        final int[] nums2 = { 1, 1 }; 
        final int[] nums3 = { 4, 1 }; 
        final int[] nums4 = { 2 }; 
        final int[] nums5 = {  }; 
        final int[] nums6 = { 1, 4, 1, 3 }; 
        final int[] nums7 = { 3, 1, 3 }; 
        final int[] nums8 = { 1 }; 
        final int[] nums9 = { 4 }; 
        final int[] nums10 = { 3, 4 }; 
        final int[] nums11 = { 1, 3, 4 }; 
        final int[] nums12 = { 1, 1, 1 }; 
        final int[] nums13 = { 1, 1, 1, 5 }; 
        final int[] nums14 = { 4, 1, 4, 1 }; 

        final boolean[] resultsArray = {
            Only14.only14(nums0),
            Only14.only14(nums1),
            Only14.only14(nums2),
            Only14.only14(nums3),
            Only14.only14(nums4),
            Only14.only14(nums5),
            Only14.only14(nums6),
            Only14.only14(nums7),
            Only14.only14(nums8),
            Only14.only14(nums9),
            Only14.only14(nums10),
            Only14.only14(nums11),
            Only14.only14(nums12),
            Only14.only14(nums13),
            Only14.only14(nums14),
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
