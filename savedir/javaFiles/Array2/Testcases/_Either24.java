package Array2.Testcases;
import Array2.Either24;

public final class _Either24
{
    static final String[] testcaseStrings = {
        "either24([1, 2, 2])",
        "either24([4, 4, 1])",
        "either24([4, 4, 1, 2, 2])",
        "either24([1, 2, 3, 4])",
        "either24([3, 5, 9])",
        "either24([1, 2, 3, 4, 4])",
        "either24([2, 2, 3, 4])",
        "either24([1, 2, 3, 2, 2, 4])",
        "either24([1, 2, 3, 2, 2, 4, 4])",
        "either24([1, 2])",
        "either24([2, 2])",
        "either24([4, 4])",
        "either24([2])",
        "either24([])",
    };

    static final boolean[] expectedResults = {
        true,
        true,
        false,
        false,
        false,
        true,
        true,
        true,
        false,
        false,
        true,
        true,
        false,
        false,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] nums0 = { 1, 2, 2 }; 
        final int[] nums1 = { 4, 4, 1 }; 
        final int[] nums2 = { 4, 4, 1, 2, 2 }; 
        final int[] nums3 = { 1, 2, 3, 4 }; 
        final int[] nums4 = { 3, 5, 9 }; 
        final int[] nums5 = { 1, 2, 3, 4, 4 }; 
        final int[] nums6 = { 2, 2, 3, 4 }; 
        final int[] nums7 = { 1, 2, 3, 2, 2, 4 }; 
        final int[] nums8 = { 1, 2, 3, 2, 2, 4, 4 }; 
        final int[] nums9 = { 1, 2 }; 
        final int[] nums10 = { 2, 2 }; 
        final int[] nums11 = { 4, 4 }; 
        final int[] nums12 = { 2 }; 
        final int[] nums13 = {  }; 

        final boolean[] resultsArray = {
            Either24.either24(nums0),
            Either24.either24(nums1),
            Either24.either24(nums2),
            Either24.either24(nums3),
            Either24.either24(nums4),
            Either24.either24(nums5),
            Either24.either24(nums6),
            Either24.either24(nums7),
            Either24.either24(nums8),
            Either24.either24(nums9),
            Either24.either24(nums10),
            Either24.either24(nums11),
            Either24.either24(nums12),
            Either24.either24(nums13),
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
