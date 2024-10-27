package Array2.Testcases;
import Array2.Has22;

public final class _Has22
{
    static final String[] testcaseStrings = {
        "has22([1, 2, 2])",
        "has22([1, 2, 1, 2])",
        "has22([2, 1, 2])",
        "has22([2, 2, 1, 2])",
        "has22([1, 3, 2])",
        "has22([1, 3, 2, 2])",
        "has22([2, 3, 2, 2])",
        "has22([4, 2, 4, 2, 2, 5])",
        "has22([1, 2])",
        "has22([2, 2])",
        "has22([2])",
        "has22([])",
        "has22([3, 3, 2, 2])",
        "has22([5, 2, 5, 2])",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        false,
        true,
        false,
        true,
        true,
        true,
        false,
        true,
        false,
        false,
        true,
        false,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] nums0 = { 1, 2, 2 }; 
        final int[] nums1 = { 1, 2, 1, 2 }; 
        final int[] nums2 = { 2, 1, 2 }; 
        final int[] nums3 = { 2, 2, 1, 2 }; 
        final int[] nums4 = { 1, 3, 2 }; 
        final int[] nums5 = { 1, 3, 2, 2 }; 
        final int[] nums6 = { 2, 3, 2, 2 }; 
        final int[] nums7 = { 4, 2, 4, 2, 2, 5 }; 
        final int[] nums8 = { 1, 2 }; 
        final int[] nums9 = { 2, 2 }; 
        final int[] nums10 = { 2 }; 
        final int[] nums11 = {  }; 
        final int[] nums12 = { 3, 3, 2, 2 }; 
        final int[] nums13 = { 5, 2, 5, 2 }; 

        final boolean[] resultsArray = {
            Has22.has22(nums0),
            Has22.has22(nums1),
            Has22.has22(nums2),
            Has22.has22(nums3),
            Has22.has22(nums4),
            Has22.has22(nums5),
            Has22.has22(nums6),
            Has22.has22(nums7),
            Has22.has22(nums8),
            Has22.has22(nums9),
            Has22.has22(nums10),
            Has22.has22(nums11),
            Has22.has22(nums12),
            Has22.has22(nums13),
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
