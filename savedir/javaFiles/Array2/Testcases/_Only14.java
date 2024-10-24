package Array2.Testcases;
import Array2.Only14;

public class _Only14
{
    static String[] testcaseStrings = {
        "only14([1, 4, 1, 4])",
        "only14([1, 4, 2, 4])",
        "only14([1, 1])",
        "only14([4, 1])",
        "only14([2])",
        "only14([])",
        "only14([1, 4, 1, 3])",
        "only14([3, 1, 3])",
        "only14([1])",
        "only14([4])",
        "only14([3, 4])",
        "only14([1, 3, 4])",
        "only14([1, 1, 1])",
        "only14([1, 1, 1, 5])",
        "only14([4, 1, 4, 1])",
    };

    static boolean[] expectedResults = {
        true,
        false,
        true,
        true,
        false,
        true,
        false,
        false,
        true,
        true,
        false,
        false,
        true,
        false,
        true,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 1, 4, 1, 4 }; 
        int[] nums1 = { 1, 4, 2, 4 }; 
        int[] nums2 = { 1, 1 }; 
        int[] nums3 = { 4, 1 }; 
        int[] nums4 = { 2 }; 
        int[] nums5 = {  }; 
        int[] nums6 = { 1, 4, 1, 3 }; 
        int[] nums7 = { 3, 1, 3 }; 
        int[] nums8 = { 1 }; 
        int[] nums9 = { 4 }; 
        int[] nums10 = { 3, 4 }; 
        int[] nums11 = { 1, 3, 4 }; 
        int[] nums12 = { 1, 1, 1 }; 
        int[] nums13 = { 1, 1, 1, 5 }; 
        int[] nums14 = { 4, 1, 4, 1 }; 

        boolean[] resultsArray = {
            Only14.only14(nums0),
            Only14.only14(nums1),
            Only14.only14(nums2),
            Only14.only14(nums3),
            Only14.only14(nums4),
            Only14.only14(nums5),
            Only14.only14(nums6),
            Only14.only14(nums7),
            Only14.only14(nums8),
            Only14.only14(nums9),
            Only14.only14(nums10),
            Only14.only14(nums11),
            Only14.only14(nums12),
            Only14.only14(nums13),
            Only14.only14(nums14),
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
