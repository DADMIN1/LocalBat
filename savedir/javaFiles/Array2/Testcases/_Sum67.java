package Array2.Testcases;
import Array2.Sum67;

public class _Sum67
{
    static String[] testcaseStrings = {
        "sum67([1, 2, 2])",
        "sum67([1, 2, 2, 6, 99, 99, 7])",
        "sum67([1, 1, 6, 7, 2])",
    };

    static int[] expectedResults = {
        5,
        5,
        4,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 1, 2, 2 }; 
        int[] nums1 = { 1, 2, 2, 6, 99, 99, 7 }; 
        int[] nums2 = { 1, 1, 6, 7, 2 }; 

        int[] resultsArray = {
            Sum67.sum67(nums0),
            Sum67.sum67(nums1),
            Sum67.sum67(nums2),
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
