package Array2.Testcases;
import Array2.No14;

public class _No14
{
    static String[] testcaseStrings = {
        "no14([1, 2, 3])",
        "no14([1, 2, 3, 4])",
        "no14([2, 3, 4])",
    };

    static boolean[] expectedResults = { true, false, true, };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 1, 2, 3 }; 
        int[] nums1 = { 1, 2, 3, 4 }; 
        int[] nums2 = { 2, 3, 4 }; 

        boolean[] resultsArray = {
            No14.no14(nums0),
            No14.no14(nums1),
            No14.no14(nums2),
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
