package Array2.Testcases;
import Array2.Has77;

public class _Has77
{
    static String[] testcaseStrings = {
        "has77([1, 7, 7])",
        "has77([1, 7, 1, 7])",
        "has77([1, 7, 1, 1, 7])",
    };

    static boolean[] expectedResults = {
        true,
        true,
        false,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 1, 7, 7 }; 
        int[] nums1 = { 1, 7, 1, 7 }; 
        int[] nums2 = { 1, 7, 1, 1, 7 }; 

        boolean[] resultsArray = {
            Has77.has77(nums0),
            Has77.has77(nums1),
            Has77.has77(nums2),
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
