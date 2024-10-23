package Array2.Testcases;
import Array2.SameEnds;

public class _SameEnds
{
    static String[] testcaseStrings = {
        "sameEnds([5, 6, 45, 99, 13, 5, 6], 1)",
        "sameEnds([5, 6, 45, 99, 13, 5, 6], 2)",
        "sameEnds([5, 6, 45, 99, 13, 5, 6], 3)",
    };

    static boolean[] expectedResults = {
        false,
        true,
        false,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 5, 6, 45, 99, 13, 5, 6 }; 
        int[] nums1 = { 5, 6, 45, 99, 13, 5, 6 }; 
        int[] nums2 = { 5, 6, 45, 99, 13, 5, 6 }; 

        boolean[] resultsArray = {
            SameEnds.sameEnds(nums0, 1),
            SameEnds.sameEnds(nums1, 2),
            SameEnds.sameEnds(nums2, 3),
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
