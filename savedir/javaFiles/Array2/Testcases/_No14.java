package Array2.Testcases;
import Array2.No14;

public class _No14
{
    static String[] testcaseStrings = {
        "no14([1, 2, 3])",
        "no14([1, 2, 3, 4])",
        "no14([2, 3, 4])",
        "no14([1, 1, 4, 4])",
        "no14([2, 2, 4, 4])",
        "no14([2, 3, 4, 1])",
        "no14([2, 1, 1])",
        "no14([1, 4])",
        "no14([2])",
        "no14([2, 1])",
        "no14([1])",
        "no14([4])",
        "no14([])",
        "no14([1, 1, 1, 1])",
        "no14([9, 4, 4, 1])",
        "no14([4, 2, 3, 1])",
        "no14([4, 2, 3, 5])",
        "no14([4, 4, 2])",
        "no14([1, 4, 4])",
    };

    static boolean[] expectedResults = {
        true,
        false,
        true,
        false,
        true,
        false,
        true,
        false,
        true,
        true,
        true,
        true,
        true,
        true,
        false,
        false,
        true,
        true,
        false,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 1, 2, 3 }; 
        int[] nums1 = { 1, 2, 3, 4 }; 
        int[] nums2 = { 2, 3, 4 }; 
        int[] nums3 = { 1, 1, 4, 4 }; 
        int[] nums4 = { 2, 2, 4, 4 }; 
        int[] nums5 = { 2, 3, 4, 1 }; 
        int[] nums6 = { 2, 1, 1 }; 
        int[] nums7 = { 1, 4 }; 
        int[] nums8 = { 2 }; 
        int[] nums9 = { 2, 1 }; 
        int[] nums10 = { 1 }; 
        int[] nums11 = { 4 }; 
        int[] nums12 = {  }; 
        int[] nums13 = { 1, 1, 1, 1 }; 
        int[] nums14 = { 9, 4, 4, 1 }; 
        int[] nums15 = { 4, 2, 3, 1 }; 
        int[] nums16 = { 4, 2, 3, 5 }; 
        int[] nums17 = { 4, 4, 2 }; 
        int[] nums18 = { 1, 4, 4 }; 

        boolean[] resultsArray = {
            No14.no14(nums0),
            No14.no14(nums1),
            No14.no14(nums2),
            No14.no14(nums3),
            No14.no14(nums4),
            No14.no14(nums5),
            No14.no14(nums6),
            No14.no14(nums7),
            No14.no14(nums8),
            No14.no14(nums9),
            No14.no14(nums10),
            No14.no14(nums11),
            No14.no14(nums12),
            No14.no14(nums13),
            No14.no14(nums14),
            No14.no14(nums15),
            No14.no14(nums16),
            No14.no14(nums17),
            No14.no14(nums18),
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
