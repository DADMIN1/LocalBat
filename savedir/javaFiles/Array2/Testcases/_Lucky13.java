package Array2.Testcases;
import Array2.Lucky13;

public class _Lucky13
{
    static String[] testcaseStrings = {
        "lucky13([0, 2, 4])",
        "lucky13([1, 2, 3])",
        "lucky13([1, 2, 4])",
        "lucky13([2, 7, 2, 8])",
        "lucky13([2, 7, 1, 8])",
        "lucky13([3, 7, 2, 8])",
        "lucky13([2, 7, 2, 1])",
        "lucky13([1, 2])",
        "lucky13([2, 2])",
        "lucky13([2])",
        "lucky13([3])",
        "lucky13([])",
    };

    static boolean[] expectedResults = {
        true,
        false,
        false,
        true,
        false,
        false,
        false,
        false,
        true,
        true,
        false,
        true,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 0, 2, 4 }; 
        int[] nums1 = { 1, 2, 3 }; 
        int[] nums2 = { 1, 2, 4 }; 
        int[] nums3 = { 2, 7, 2, 8 }; 
        int[] nums4 = { 2, 7, 1, 8 }; 
        int[] nums5 = { 3, 7, 2, 8 }; 
        int[] nums6 = { 2, 7, 2, 1 }; 
        int[] nums7 = { 1, 2 }; 
        int[] nums8 = { 2, 2 }; 
        int[] nums9 = { 2 }; 
        int[] nums10 = { 3 }; 
        int[] nums11 = {  }; 

        boolean[] resultsArray = {
            Lucky13.lucky13(nums0),
            Lucky13.lucky13(nums1),
            Lucky13.lucky13(nums2),
            Lucky13.lucky13(nums3),
            Lucky13.lucky13(nums4),
            Lucky13.lucky13(nums5),
            Lucky13.lucky13(nums6),
            Lucky13.lucky13(nums7),
            Lucky13.lucky13(nums8),
            Lucky13.lucky13(nums9),
            Lucky13.lucky13(nums10),
            Lucky13.lucky13(nums11),
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
