package Array2.Testcases;
import Array2.BigDiff;

public class _BigDiff
{
    static String[] testcaseStrings = {
        "bigDiff([10, 3, 5, 6])",
        "bigDiff([7, 2, 10, 9])",
        "bigDiff([2, 10, 7, 2])",
    };

    static int[] expectedResults = { 7, 8, 8, };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 10, 3, 5, 6 }; 
        int[] nums1 = { 7, 2, 10, 9 }; 
        int[] nums2 = { 2, 10, 7, 2 }; 

        int[] resultsArray = {
            BigDiff.bigDiff(nums0),
            BigDiff.bigDiff(nums1),
            BigDiff.bigDiff(nums2),
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
