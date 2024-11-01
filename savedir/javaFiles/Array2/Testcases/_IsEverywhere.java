package Array2.Testcases;
import Array2.IsEverywhere;

public final class _IsEverywhere
{
    static final String[] testcaseStrings = {
        "isEverywhere([1, 2, 1, 3], 1)",
        "isEverywhere([1, 2, 1, 3], 2)",
        "isEverywhere([1, 2, 1, 3, 4], 1)",
        "isEverywhere([2, 1, 2, 1], 1)",
        "isEverywhere([2, 1, 2, 1], 2)",
        "isEverywhere([2, 1, 2, 3, 1], 2)",
        "isEverywhere([3, 1], 3)",
        "isEverywhere([3, 1], 2)",
        "isEverywhere([3], 1)",
        "isEverywhere([], 1)",
        "isEverywhere([1, 2, 1, 2, 3, 2, 5], 2)",
        "isEverywhere([1, 2, 1, 1, 1, 2], 2)",
        "isEverywhere([2, 1, 2, 1, 1, 2], 2)",
        "isEverywhere([2, 1, 2, 2, 2, 1, 1, 2], 2)",
        "isEverywhere([2, 1, 2, 2, 2, 1, 2, 1], 2)",
        "isEverywhere([2, 1, 2, 1, 2], 2)",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        false,
        true,
        true,
        false,
        true,
        false,
        true,
        true,
        true,
        false,
        false,
        false,
        true,
        true,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] nums0 = {1, 2, 1, 3}; 
        final int[] nums1 = {1, 2, 1, 3}; 
        final int[] nums2 = {1, 2, 1, 3, 4}; 
        final int[] nums3 = {2, 1, 2, 1}; 
        final int[] nums4 = {2, 1, 2, 1}; 
        final int[] nums5 = {2, 1, 2, 3, 1}; 
        final int[] nums6 = {3, 1}; 
        final int[] nums7 = {3, 1}; 
        final int[] nums8 = {3}; 
        final int[] nums9 = {}; 
        final int[] nums10 = {1, 2, 1, 2, 3, 2, 5}; 
        final int[] nums11 = {1, 2, 1, 1, 1, 2}; 
        final int[] nums12 = {2, 1, 2, 1, 1, 2}; 
        final int[] nums13 = {2, 1, 2, 2, 2, 1, 1, 2}; 
        final int[] nums14 = {2, 1, 2, 2, 2, 1, 2, 1}; 
        final int[] nums15 = {2, 1, 2, 1, 2}; 

        final boolean[] resultsArray = {
            IsEverywhere.isEverywhere(nums0, 1),
            IsEverywhere.isEverywhere(nums1, 2),
            IsEverywhere.isEverywhere(nums2, 1),
            IsEverywhere.isEverywhere(nums3, 1),
            IsEverywhere.isEverywhere(nums4, 2),
            IsEverywhere.isEverywhere(nums5, 2),
            IsEverywhere.isEverywhere(nums6, 3),
            IsEverywhere.isEverywhere(nums7, 2),
            IsEverywhere.isEverywhere(nums8, 1),
            IsEverywhere.isEverywhere(nums9, 1),
            IsEverywhere.isEverywhere(nums10, 2),
            IsEverywhere.isEverywhere(nums11, 2),
            IsEverywhere.isEverywhere(nums12, 2),
            IsEverywhere.isEverywhere(nums13, 2),
            IsEverywhere.isEverywhere(nums14, 2),
            IsEverywhere.isEverywhere(nums15, 2),
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
