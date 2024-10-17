package Array1.Testcases;
import Array1.FirstLast6;

public class _FirstLast6
{
    static String[] testcaseStrings = {
        "firstLast6([1, 2, 6])",
        "firstLast6([6, 1, 2, 3])",
        "firstLast6([13, 6, 1, 2, 3])",
    };

    static boolean[] expectedResults = { true, true, false, };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 1, 2, 6 }; 
        int[] nums1 = { 6, 1, 2, 3 }; 
        int[] nums2 = { 13, 6, 1, 2, 3 }; 

        boolean[] resultsArray = {
            FirstLast6.firstLast6(nums0),
            FirstLast6.firstLast6(nums1),
            FirstLast6.firstLast6(nums2),
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
