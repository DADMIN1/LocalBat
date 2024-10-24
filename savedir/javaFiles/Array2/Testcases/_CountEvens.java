package Array2.Testcases;
import Array2.CountEvens;

public class _CountEvens
{
    static String[] testcaseStrings = {
        "countEvens([2, 1, 2, 3, 4])",
        "countEvens([2, 2, 0])",
        "countEvens([1, 3, 5])",
        "countEvens([])",
        "countEvens([11, 9, 0, 1])",
        "countEvens([2, 11, 9, 0])",
        "countEvens([2])",
        "countEvens([2, 5, 12])",
    };

    static int[] expectedResults = {
        3,
        3,
        0,
        0,
        1,
        2,
        1,
        2,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 2, 1, 2, 3, 4 }; 
        int[] nums1 = { 2, 2, 0 }; 
        int[] nums2 = { 1, 3, 5 }; 
        int[] nums3 = {  }; 
        int[] nums4 = { 11, 9, 0, 1 }; 
        int[] nums5 = { 2, 11, 9, 0 }; 
        int[] nums6 = { 2 }; 
        int[] nums7 = { 2, 5, 12 }; 

        int[] resultsArray = {
            CountEvens.countEvens(nums0),
            CountEvens.countEvens(nums1),
            CountEvens.countEvens(nums2),
            CountEvens.countEvens(nums3),
            CountEvens.countEvens(nums4),
            CountEvens.countEvens(nums5),
            CountEvens.countEvens(nums6),
            CountEvens.countEvens(nums7),
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
