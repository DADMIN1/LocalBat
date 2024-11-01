package Array1.Testcases;
import Array1.MaxTriple;

public final class _MaxTriple
{
    static final String[] testcaseStrings = {
        "maxTriple([1, 2, 3])",
        "maxTriple([1, 5, 3])",
        "maxTriple([5, 2, 3])",
        "maxTriple([1, 2, 3, 1, 1])",
        "maxTriple([1, 7, 3, 1, 5])",
        "maxTriple([5, 1, 3, 7, 1])",
        "maxTriple([5, 1, 7, 3, 7, 8, 1])",
        "maxTriple([5, 1, 7, 9, 7, 8, 1])",
        "maxTriple([5, 1, 7, 3, 7, 8, 9])",
        "maxTriple([2, 2, 5, 1, 1])",
    };

    static final int[] expectedResults = {
        3,
        5,
        5,
        3,
        5,
        5,
        5,
        9,
        9,
        5,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] nums0 = {1, 2, 3}; 
        final int[] nums1 = {1, 5, 3}; 
        final int[] nums2 = {5, 2, 3}; 
        final int[] nums3 = {1, 2, 3, 1, 1}; 
        final int[] nums4 = {1, 7, 3, 1, 5}; 
        final int[] nums5 = {5, 1, 3, 7, 1}; 
        final int[] nums6 = {5, 1, 7, 3, 7, 8, 1}; 
        final int[] nums7 = {5, 1, 7, 9, 7, 8, 1}; 
        final int[] nums8 = {5, 1, 7, 3, 7, 8, 9}; 
        final int[] nums9 = {2, 2, 5, 1, 1}; 

        final int[] resultsArray = {
            MaxTriple.maxTriple(nums0),
            MaxTriple.maxTriple(nums1),
            MaxTriple.maxTriple(nums2),
            MaxTriple.maxTriple(nums3),
            MaxTriple.maxTriple(nums4),
            MaxTriple.maxTriple(nums5),
            MaxTriple.maxTriple(nums6),
            MaxTriple.maxTriple(nums7),
            MaxTriple.maxTriple(nums8),
            MaxTriple.maxTriple(nums9),
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
