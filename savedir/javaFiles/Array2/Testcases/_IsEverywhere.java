package Array2.Testcases;
import Array2.IsEverywhere;

public class _IsEverywhere
{
    static String[] testcaseStrings = {
        "isEverywhere([1, 2, 1, 3], 1)",
        "isEverywhere([1, 2, 1, 3], 2)",
        "isEverywhere([1, 2, 1, 3, 4], 1)",
    };

    static boolean[] expectedResults = { true, false, false, };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 1, 2, 1, 3 }; 
        int[] nums1 = { 1, 2, 1, 3 }; 
        int[] nums2 = { 1, 2, 1, 3, 4 }; 

        boolean[] resultsArray = {
            IsEverywhere.isEverywhere(nums0, 1),
            IsEverywhere.isEverywhere(nums1, 2),
            IsEverywhere.isEverywhere(nums2, 1),
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
