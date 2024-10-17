package Array3.Testcases;
import Array3.CanBalance;

public class _CanBalance
{
    static String[] testcaseStrings = {
        "canBalance([1, 1, 1, 2, 1])",
        "canBalance([2, 1, 1, 2, 1])",
        "canBalance([10, 10])",
    };

    static boolean[] expectedResults = { true, false, true, };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 1, 1, 1, 2, 1 }; 
        int[] nums1 = { 2, 1, 1, 2, 1 }; 
        int[] nums2 = { 10, 10 }; 

        boolean[] resultsArray = {
            CanBalance.canBalance(nums0),
            CanBalance.canBalance(nums1),
            CanBalance.canBalance(nums2),
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
