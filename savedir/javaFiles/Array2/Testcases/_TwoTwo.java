package Array2.Testcases;
import Array2.TwoTwo;

public class _TwoTwo
{
    static String[] testcaseStrings = {
        "twoTwo([4, 2, 2, 3])",
        "twoTwo([2, 2, 4])",
        "twoTwo([2, 2, 4, 2])",
        "twoTwo([1, 3, 4])",
        "twoTwo([1, 2, 2, 3, 4])",
        "twoTwo([1, 2, 3, 4])",
        "twoTwo([2, 2])",
        "twoTwo([2, 2, 7])",
        "twoTwo([2, 2, 7, 2, 1])",
        "twoTwo([4, 2, 2, 2])",
        "twoTwo([2, 2, 2])",
        "twoTwo([1, 2])",
        "twoTwo([2])",
        "twoTwo([1])",
        "twoTwo([])",
        "twoTwo([5, 2, 2, 3])",
        "twoTwo([2, 2, 5, 2])",
    };

    static boolean[] expectedResults = {
        true,
        true,
        false,
        true,
        true,
        false,
        true,
        true,
        false,
        true,
        true,
        false,
        false,
        true,
        true,
        true,
        false,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 4, 2, 2, 3 }; 
        int[] nums1 = { 2, 2, 4 }; 
        int[] nums2 = { 2, 2, 4, 2 }; 
        int[] nums3 = { 1, 3, 4 }; 
        int[] nums4 = { 1, 2, 2, 3, 4 }; 
        int[] nums5 = { 1, 2, 3, 4 }; 
        int[] nums6 = { 2, 2 }; 
        int[] nums7 = { 2, 2, 7 }; 
        int[] nums8 = { 2, 2, 7, 2, 1 }; 
        int[] nums9 = { 4, 2, 2, 2 }; 
        int[] nums10 = { 2, 2, 2 }; 
        int[] nums11 = { 1, 2 }; 
        int[] nums12 = { 2 }; 
        int[] nums13 = { 1 }; 
        int[] nums14 = {  }; 
        int[] nums15 = { 5, 2, 2, 3 }; 
        int[] nums16 = { 2, 2, 5, 2 }; 

        boolean[] resultsArray = {
            TwoTwo.twoTwo(nums0),
            TwoTwo.twoTwo(nums1),
            TwoTwo.twoTwo(nums2),
            TwoTwo.twoTwo(nums3),
            TwoTwo.twoTwo(nums4),
            TwoTwo.twoTwo(nums5),
            TwoTwo.twoTwo(nums6),
            TwoTwo.twoTwo(nums7),
            TwoTwo.twoTwo(nums8),
            TwoTwo.twoTwo(nums9),
            TwoTwo.twoTwo(nums10),
            TwoTwo.twoTwo(nums11),
            TwoTwo.twoTwo(nums12),
            TwoTwo.twoTwo(nums13),
            TwoTwo.twoTwo(nums14),
            TwoTwo.twoTwo(nums15),
            TwoTwo.twoTwo(nums16),
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
