package Array3.Testcases;
import Array3.CountClumps;

public class _CountClumps
{
    static String[] testcaseStrings = {
        "countClumps([1, 2, 2, 3, 4, 4])",
        "countClumps([1, 1, 2, 1, 1])",
        "countClumps([1, 1, 1, 1, 1])",
        "countClumps([1, 2, 3])",
        "countClumps([2, 2, 1, 1, 1, 2, 1, 1, 2, 2])",
        "countClumps([0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2])",
        "countClumps([0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2])",
        "countClumps([0, 0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2])",
        "countClumps([])",
    };

    static int[] expectedResults = {
        2,
        2,
        1,
        0,
        4,
        4,
        5,
        5,
        0,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 1, 2, 2, 3, 4, 4 }; 
        int[] nums1 = { 1, 1, 2, 1, 1 }; 
        int[] nums2 = { 1, 1, 1, 1, 1 }; 
        int[] nums3 = { 1, 2, 3 }; 
        int[] nums4 = { 2, 2, 1, 1, 1, 2, 1, 1, 2, 2 }; 
        int[] nums5 = { 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2 }; 
        int[] nums6 = { 0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2 }; 
        int[] nums7 = { 0, 0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2 }; 
        int[] nums8 = {  }; 

        int[] resultsArray = {
            CountClumps.countClumps(nums0),
            CountClumps.countClumps(nums1),
            CountClumps.countClumps(nums2),
            CountClumps.countClumps(nums3),
            CountClumps.countClumps(nums4),
            CountClumps.countClumps(nums5),
            CountClumps.countClumps(nums6),
            CountClumps.countClumps(nums7),
            CountClumps.countClumps(nums8),
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
