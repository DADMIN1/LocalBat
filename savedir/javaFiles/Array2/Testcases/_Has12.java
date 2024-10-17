package Array2.Testcases;
import Array2.Has12;

public class _Has12
{
    static String[] testcaseStrings = {
        "has12([1, 3, 2])",
        "has12([3, 1, 2])",
        "has12([3, 1, 4, 5, 2])",
    };

    static boolean[] expectedResults = { true, true, true, };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 1, 3, 2 }; 
        int[] nums1 = { 3, 1, 2 }; 
        int[] nums2 = { 3, 1, 4, 5, 2 }; 

        boolean[] resultsArray = {
            Has12.has12(nums0),
            Has12.has12(nums1),
            Has12.has12(nums2),
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
