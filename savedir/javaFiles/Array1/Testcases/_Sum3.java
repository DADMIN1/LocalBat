package Array1.Testcases;
import Array1.Sum3;

public final class _Sum3
{
    static final String[] testcaseStrings = {
        "sum3([1, 2, 3])",
        "sum3([5, 11, 2])",
        "sum3([7, 0, 0])",
        "sum3([1, 2, 1])",
        "sum3([1, 1, 1])",
        "sum3([2, 7, 2])",
    };

    static final int[] expectedResults = {
        6,
        18,
        7,
        4,
        3,
        11,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] nums0 = { 1, 2, 3 }; 
        final int[] nums1 = { 5, 11, 2 }; 
        final int[] nums2 = { 7, 0, 0 }; 
        final int[] nums3 = { 1, 2, 1 }; 
        final int[] nums4 = { 1, 1, 1 }; 
        final int[] nums5 = { 2, 7, 2 }; 

        final int[] resultsArray = {
            Sum3.sum3(nums0),
            Sum3.sum3(nums1),
            Sum3.sum3(nums2),
            Sum3.sum3(nums3),
            Sum3.sum3(nums4),
            Sum3.sum3(nums5),
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
