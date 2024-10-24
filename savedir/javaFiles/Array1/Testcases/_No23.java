package Array1.Testcases;
import Array1.No23;

public class _No23
{
    static String[] testcaseStrings = {
        "no23([4, 5])",
        "no23([4, 2])",
        "no23([3, 5])",
        "no23([1, 9])",
        "no23([2, 9])",
        "no23([1, 3])",
        "no23([1, 1])",
        "no23([2, 2])",
        "no23([3, 3])",
        "no23([7, 8])",
        "no23([8, 7])",
    };

    static boolean[] expectedResults = {
        true,
        false,
        false,
        true,
        false,
        false,
        true,
        false,
        false,
        true,
        true,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 4, 5 }; 
        int[] nums1 = { 4, 2 }; 
        int[] nums2 = { 3, 5 }; 
        int[] nums3 = { 1, 9 }; 
        int[] nums4 = { 2, 9 }; 
        int[] nums5 = { 1, 3 }; 
        int[] nums6 = { 1, 1 }; 
        int[] nums7 = { 2, 2 }; 
        int[] nums8 = { 3, 3 }; 
        int[] nums9 = { 7, 8 }; 
        int[] nums10 = { 8, 7 }; 

        boolean[] resultsArray = {
            No23.no23(nums0),
            No23.no23(nums1),
            No23.no23(nums2),
            No23.no23(nums3),
            No23.no23(nums4),
            No23.no23(nums5),
            No23.no23(nums6),
            No23.no23(nums7),
            No23.no23(nums8),
            No23.no23(nums9),
            No23.no23(nums10),
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
