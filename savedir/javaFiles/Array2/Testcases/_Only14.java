package Array2.Testcases;
import Array2.Only14;

public class _Only14
{
    static String[] testcaseStrings = {
        "only14([1, 4, 1, 4])",
        "only14([1, 4, 2, 4])",
        "only14([1, 1])",
    };

    static boolean[] expectedResults = {
        true,
        false,
        true,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 1, 4, 1, 4 }; 
        int[] nums1 = { 1, 4, 2, 4 }; 
        int[] nums2 = { 1, 1 }; 

        boolean[] resultsArray = {
            Only14.only14(nums0),
            Only14.only14(nums1),
            Only14.only14(nums2),
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
