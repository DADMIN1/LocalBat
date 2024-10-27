package Array3.Testcases;
import Array3.MaxSpan;

public final class _MaxSpan
{
    static final String[] testcaseStrings = {
        "maxSpan([1, 2, 1, 1, 3])",
        "maxSpan([1, 4, 2, 1, 4, 1, 4])",
        "maxSpan([1, 4, 2, 1, 4, 4, 4])",
        "maxSpan([3, 3, 3])",
        "maxSpan([3, 9, 3])",
        "maxSpan([3, 9, 9])",
        "maxSpan([3, 9])",
        "maxSpan([3, 3])",
        "maxSpan([])",
        "maxSpan([1])",
    };

    static final int[] expectedResults = {
        4,
        6,
        6,
        3,
        3,
        2,
        1,
        2,
        0,
        1,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] nums0 = { 1, 2, 1, 1, 3 }; 
        final int[] nums1 = { 1, 4, 2, 1, 4, 1, 4 }; 
        final int[] nums2 = { 1, 4, 2, 1, 4, 4, 4 }; 
        final int[] nums3 = { 3, 3, 3 }; 
        final int[] nums4 = { 3, 9, 3 }; 
        final int[] nums5 = { 3, 9, 9 }; 
        final int[] nums6 = { 3, 9 }; 
        final int[] nums7 = { 3, 3 }; 
        final int[] nums8 = {  }; 
        final int[] nums9 = { 1 }; 

        final int[] resultsArray = {
            MaxSpan.maxSpan(nums0),
            MaxSpan.maxSpan(nums1),
            MaxSpan.maxSpan(nums2),
            MaxSpan.maxSpan(nums3),
            MaxSpan.maxSpan(nums4),
            MaxSpan.maxSpan(nums5),
            MaxSpan.maxSpan(nums6),
            MaxSpan.maxSpan(nums7),
            MaxSpan.maxSpan(nums8),
            MaxSpan.maxSpan(nums9),
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
