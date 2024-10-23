package Array1.Testcases;
import Array1.Double23;

public class _Double23
{
    static String[] testcaseStrings = {
        "double23([2, 2])",
        "double23([3, 3])",
        "double23([2, 3])",
    };

    static boolean[] expectedResults = {
        true,
        true,
        false,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 2, 2 }; 
        int[] nums1 = { 3, 3 }; 
        int[] nums2 = { 2, 3 }; 

        boolean[] resultsArray = {
            Double23.double23(nums0),
            Double23.double23(nums1),
            Double23.double23(nums2),
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
