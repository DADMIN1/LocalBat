package Array2.Testcases;
import Array2.ModThree;

public class _ModThree
{
    static String[] testcaseStrings = {
        "modThree([2, 1, 3, 5])",
        "modThree([2, 1, 2, 5])",
        "modThree([2, 4, 2, 5])",
    };

    static boolean[] expectedResults = { true, false, true, };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 2, 1, 3, 5 }; 
        int[] nums1 = { 2, 1, 2, 5 }; 
        int[] nums2 = { 2, 4, 2, 5 }; 

        boolean[] resultsArray = {
            ModThree.modThree(nums0),
            ModThree.modThree(nums1),
            ModThree.modThree(nums2),
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
