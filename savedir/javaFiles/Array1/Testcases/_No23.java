package Array1.Testcases;
import Array1.No23;

public class _No23
{
    static String[] testcaseStrings = {
        "no23([4, 5])",
        "no23([4, 2])",
        "no23([3, 5])",
    };

    static boolean[] expectedResults = { true, false, false, };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 4, 5 }; 
        int[] nums1 = { 4, 2 }; 
        int[] nums2 = { 3, 5 }; 

        boolean[] resultsArray = {
            No23.no23(nums0),
            No23.no23(nums1),
            No23.no23(nums2),
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
