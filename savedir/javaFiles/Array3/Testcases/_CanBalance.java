package Array3.Testcases;
import Array3.CanBalance;

public class _CanBalance
{
    static String[] testcaseStrings = {
        "canBalance([1, 1, 1, 2, 1])",
        "canBalance([2, 1, 1, 2, 1])",
        "canBalance([10, 10])",
        "canBalance([10, 0, 1, -1, 10])",
        "canBalance([1, 1, 1, 1, 4])",
        "canBalance([2, 1, 1, 1, 4])",
        "canBalance([2, 3, 4, 1, 2])",
        "canBalance([1, 2, 3, 1, 0, 2, 3])",
        "canBalance([1, 2, 3, 1, 0, 1, 3])",
        "canBalance([1])",
        "canBalance([1, 1, 1, 2, 1])",
    };

    static boolean[] expectedResults = {
        true,
        false,
        true,
        true,
        true,
        false,
        false,
        true,
        false,
        false,
        true,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 1, 1, 1, 2, 1 }; 
        int[] nums1 = { 2, 1, 1, 2, 1 }; 
        int[] nums2 = { 10, 10 }; 
        int[] nums3 = { 10, 0, 1, -1, 10 }; 
        int[] nums4 = { 1, 1, 1, 1, 4 }; 
        int[] nums5 = { 2, 1, 1, 1, 4 }; 
        int[] nums6 = { 2, 3, 4, 1, 2 }; 
        int[] nums7 = { 1, 2, 3, 1, 0, 2, 3 }; 
        int[] nums8 = { 1, 2, 3, 1, 0, 1, 3 }; 
        int[] nums9 = { 1 }; 
        int[] nums10 = { 1, 1, 1, 2, 1 }; 

        boolean[] resultsArray = {
            CanBalance.canBalance(nums0),
            CanBalance.canBalance(nums1),
            CanBalance.canBalance(nums2),
            CanBalance.canBalance(nums3),
            CanBalance.canBalance(nums4),
            CanBalance.canBalance(nums5),
            CanBalance.canBalance(nums6),
            CanBalance.canBalance(nums7),
            CanBalance.canBalance(nums8),
            CanBalance.canBalance(nums9),
            CanBalance.canBalance(nums10),
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
