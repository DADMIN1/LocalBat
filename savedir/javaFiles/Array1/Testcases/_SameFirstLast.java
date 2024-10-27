package Array1.Testcases;
import Array1.SameFirstLast;

public final class _SameFirstLast
{
    static final String[] testcaseStrings = {
        "sameFirstLast([1, 2, 3])",
        "sameFirstLast([1, 2, 3, 1])",
        "sameFirstLast([1, 2, 1])",
        "sameFirstLast([7])",
        "sameFirstLast([])",
        "sameFirstLast([1, 2, 3, 4, 5, 1])",
        "sameFirstLast([1, 2, 3, 4, 5, 13])",
        "sameFirstLast([13, 2, 3, 4, 5, 13])",
        "sameFirstLast([7, 7])",
    };

    static final boolean[] expectedResults = {
        false,
        true,
        true,
        true,
        false,
        true,
        false,
        true,
        true,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] nums0 = { 1, 2, 3 }; 
        final int[] nums1 = { 1, 2, 3, 1 }; 
        final int[] nums2 = { 1, 2, 1 }; 
        final int[] nums3 = { 7 }; 
        final int[] nums4 = {  }; 
        final int[] nums5 = { 1, 2, 3, 4, 5, 1 }; 
        final int[] nums6 = { 1, 2, 3, 4, 5, 13 }; 
        final int[] nums7 = { 13, 2, 3, 4, 5, 13 }; 
        final int[] nums8 = { 7, 7 }; 

        final boolean[] resultsArray = {
            SameFirstLast.sameFirstLast(nums0),
            SameFirstLast.sameFirstLast(nums1),
            SameFirstLast.sameFirstLast(nums2),
            SameFirstLast.sameFirstLast(nums3),
            SameFirstLast.sameFirstLast(nums4),
            SameFirstLast.sameFirstLast(nums5),
            SameFirstLast.sameFirstLast(nums6),
            SameFirstLast.sameFirstLast(nums7),
            SameFirstLast.sameFirstLast(nums8),
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
