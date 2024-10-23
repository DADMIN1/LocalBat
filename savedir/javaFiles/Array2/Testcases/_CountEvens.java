package Array2.Testcases;
import Array2.CountEvens;

public class _CountEvens
{
    static String[] testcaseStrings = {
        "countEvens([2, 1, 2, 3, 4])",
        "countEvens([2, 2, 0])",
        "countEvens([1, 3, 5])",
    };

    static int[] expectedResults = {
        3,
        3,
        0,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 2, 1, 2, 3, 4 }; 
        int[] nums1 = { 2, 2, 0 }; 
        int[] nums2 = { 1, 3, 5 }; 

        int[] resultsArray = {
            CountEvens.countEvens(nums0),
            CountEvens.countEvens(nums1),
            CountEvens.countEvens(nums2),
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
