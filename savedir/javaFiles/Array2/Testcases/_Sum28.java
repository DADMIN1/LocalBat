package Array2.Testcases;
import Array2.Sum28;

public class _Sum28
{
    static String[] testcaseStrings = {
        "sum28([2, 3, 2, 2, 4, 2])",
        "sum28([2, 3, 2, 2, 4, 2, 2])",
        "sum28([1, 2, 3, 4])",
    };

    static boolean[] expectedResults = {
        true,
        false,
        false,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 2, 3, 2, 2, 4, 2 }; 
        int[] nums1 = { 2, 3, 2, 2, 4, 2, 2 }; 
        int[] nums2 = { 1, 2, 3, 4 }; 

        boolean[] resultsArray = {
            Sum28.sum28(nums0),
            Sum28.sum28(nums1),
            Sum28.sum28(nums2),
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
