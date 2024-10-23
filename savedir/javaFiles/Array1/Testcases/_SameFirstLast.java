package Array1.Testcases;
import Array1.SameFirstLast;

public class _SameFirstLast
{
    static String[] testcaseStrings = {
        "sameFirstLast([1, 2, 3])",
        "sameFirstLast([1, 2, 3, 1])",
        "sameFirstLast([1, 2, 1])",
    };

    static boolean[] expectedResults = {
        false,
        true,
        true,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 1, 2, 3 }; 
        int[] nums1 = { 1, 2, 3, 1 }; 
        int[] nums2 = { 1, 2, 1 }; 

        boolean[] resultsArray = {
            SameFirstLast.sameFirstLast(nums0),
            SameFirstLast.sameFirstLast(nums1),
            SameFirstLast.sameFirstLast(nums2),
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
