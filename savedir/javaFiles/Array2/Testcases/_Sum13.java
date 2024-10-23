package Array2.Testcases;
import Array2.Sum13;

public class _Sum13
{
    static String[] testcaseStrings = {
        "sum13([1, 2, 2, 1])",
        "sum13([1, 1])",
        "sum13([1, 2, 2, 1, 13])",
    };

    static int[] expectedResults = {
        6,
        2,
        6,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 1, 2, 2, 1 }; 
        int[] nums1 = { 1, 1 }; 
        int[] nums2 = { 1, 2, 2, 1, 13 }; 

        int[] resultsArray = {
            Sum13.sum13(nums0),
            Sum13.sum13(nums1),
            Sum13.sum13(nums2),
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
