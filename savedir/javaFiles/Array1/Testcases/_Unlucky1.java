package Array1.Testcases;
import Array1.Unlucky1;

public class _Unlucky1
{
    static String[] testcaseStrings = {
        "unlucky1([1, 3, 4, 5])",
        "unlucky1([2, 1, 3, 4, 5])",
        "unlucky1([1, 1, 1])",
        "unlucky1([1, 3, 1])",
        "unlucky1([1, 1, 3])",
        "unlucky1([1, 2, 3])",
        "unlucky1([3, 3, 3])",
        "unlucky1([1, 3])",
        "unlucky1([1, 4])",
        "unlucky1([1])",
        "unlucky1([])",
        "unlucky1([1, 1, 1, 3, 1])",
        "unlucky1([1, 1, 3, 1, 1])",
        "unlucky1([1, 1, 1, 1, 3])",
        "unlucky1([1, 4, 1, 5])",
        "unlucky1([1, 1, 2, 3])",
        "unlucky1([2, 3, 2, 1])",
        "unlucky1([2, 3, 1, 3])",
        "unlucky1([1, 2, 3, 4, 1, 3])",
    };

    static boolean[] expectedResults = {
        true,
        true,
        false,
        true,
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
        false,
        false,
        true,
        true,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 1, 3, 4, 5 }; 
        int[] nums1 = { 2, 1, 3, 4, 5 }; 
        int[] nums2 = { 1, 1, 1 }; 
        int[] nums3 = { 1, 3, 1 }; 
        int[] nums4 = { 1, 1, 3 }; 
        int[] nums5 = { 1, 2, 3 }; 
        int[] nums6 = { 3, 3, 3 }; 
        int[] nums7 = { 1, 3 }; 
        int[] nums8 = { 1, 4 }; 
        int[] nums9 = { 1 }; 
        int[] nums10 = {  }; 
        int[] nums11 = { 1, 1, 1, 3, 1 }; 
        int[] nums12 = { 1, 1, 3, 1, 1 }; 
        int[] nums13 = { 1, 1, 1, 1, 3 }; 
        int[] nums14 = { 1, 4, 1, 5 }; 
        int[] nums15 = { 1, 1, 2, 3 }; 
        int[] nums16 = { 2, 3, 2, 1 }; 
        int[] nums17 = { 2, 3, 1, 3 }; 
        int[] nums18 = { 1, 2, 3, 4, 1, 3 }; 

        boolean[] resultsArray = {
            Unlucky1.unlucky1(nums0),
            Unlucky1.unlucky1(nums1),
            Unlucky1.unlucky1(nums2),
            Unlucky1.unlucky1(nums3),
            Unlucky1.unlucky1(nums4),
            Unlucky1.unlucky1(nums5),
            Unlucky1.unlucky1(nums6),
            Unlucky1.unlucky1(nums7),
            Unlucky1.unlucky1(nums8),
            Unlucky1.unlucky1(nums9),
            Unlucky1.unlucky1(nums10),
            Unlucky1.unlucky1(nums11),
            Unlucky1.unlucky1(nums12),
            Unlucky1.unlucky1(nums13),
            Unlucky1.unlucky1(nums14),
            Unlucky1.unlucky1(nums15),
            Unlucky1.unlucky1(nums16),
            Unlucky1.unlucky1(nums17),
            Unlucky1.unlucky1(nums18),
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
