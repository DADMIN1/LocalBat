package Array1.Testcases;
import Array1.Has23;

public class _Has23
{
    static String[] testcaseStrings = {
        "has23([2, 5])",
        "has23([4, 3])",
        "has23([4, 5])",
    };

    static boolean[] expectedResults = { true, true, false, };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 2, 5 }; 
        int[] nums1 = { 4, 3 }; 
        int[] nums2 = { 4, 5 }; 

        boolean[] resultsArray = {
            Has23.has23(nums0),
            Has23.has23(nums1),
            Has23.has23(nums2),
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
