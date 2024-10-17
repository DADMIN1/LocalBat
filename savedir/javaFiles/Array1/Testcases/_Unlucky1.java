package Array1.Testcases;
import Array1.Unlucky1;

public class _Unlucky1
{
    static String[] testcaseStrings = {
        "unlucky1([1, 3, 4, 5])",
        "unlucky1([2, 1, 3, 4, 5])",
        "unlucky1([1, 1, 1])",
    };

    static boolean[] expectedResults = { true, true, false, };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 1, 3, 4, 5 }; 
        int[] nums1 = { 2, 1, 3, 4, 5 }; 
        int[] nums2 = { 1, 1, 1 }; 

        boolean[] resultsArray = {
            Unlucky1.unlucky1(nums0),
            Unlucky1.unlucky1(nums1),
            Unlucky1.unlucky1(nums2),
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
