package Array2.Testcases;
import Array2.Lucky13;

public class _Lucky13
{
    static String[] testcaseStrings = {
        "lucky13([0, 2, 4])",
        "lucky13([1, 2, 3])",
        "lucky13([1, 2, 4])",
    };

    static boolean[] expectedResults = {
        true,
        false,
        false,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 0, 2, 4 }; 
        int[] nums1 = { 1, 2, 3 }; 
        int[] nums2 = { 1, 2, 4 }; 

        boolean[] resultsArray = {
            Lucky13.lucky13(nums0),
            Lucky13.lucky13(nums1),
            Lucky13.lucky13(nums2),
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
