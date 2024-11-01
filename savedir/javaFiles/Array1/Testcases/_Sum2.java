package Array1.Testcases;
import Array1.Sum2;

public final class _Sum2
{
    static final String[] testcaseStrings = {
        "sum2([1, 2, 3])",
        "sum2([1, 1])",
        "sum2([1, 1, 1, 1])",
        "sum2([1, 2])",
        "sum2([1])",
        "sum2([])",
        "sum2([4, 5, 6])",
        "sum2([4])",
    };

    static final int[] expectedResults = {
        3,
        2,
        2,
        3,
        1,
        0,
        9,
        4,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] nums0 = {1, 2, 3}; 
        final int[] nums1 = {1, 1}; 
        final int[] nums2 = {1, 1, 1, 1}; 
        final int[] nums3 = {1, 2}; 
        final int[] nums4 = {1}; 
        final int[] nums5 = {}; 
        final int[] nums6 = {4, 5, 6}; 
        final int[] nums7 = {4}; 

        final int[] resultsArray = {
            Sum2.sum2(nums0),
            Sum2.sum2(nums1),
            Sum2.sum2(nums2),
            Sum2.sum2(nums3),
            Sum2.sum2(nums4),
            Sum2.sum2(nums5),
            Sum2.sum2(nums6),
            Sum2.sum2(nums7),
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
