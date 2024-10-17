package Array2.Testcases;
import Array2.Either24;

public class _Either24
{
    static String[] testcaseStrings = {
        "either24([1, 2, 2])",
        "either24([4, 4, 1])",
        "either24([4, 4, 1, 2, 2])",
    };

    static boolean[] expectedResults = { true, true, false, };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 1, 2, 2 }; 
        int[] nums1 = { 4, 4, 1 }; 
        int[] nums2 = { 4, 4, 1, 2, 2 }; 

        boolean[] resultsArray = {
            Either24.either24(nums0),
            Either24.either24(nums1),
            Either24.either24(nums2),
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
