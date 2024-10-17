package Recursion1.Testcases;
import Recursion1.Array220;

public class _Array220
{
    static String[] testcaseStrings = {
        "array220([1, 2, 20], 0)",
        "array220([3, 30], 0)",
        "array220([3], 0)",
    };

    static boolean[] expectedResults = { true, true, false, };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 1, 2, 20 }; 
        int[] nums1 = { 3, 30 }; 
        int[] nums2 = { 3 }; 

        boolean[] resultsArray = {
            Array220.array220(nums0, 0),
            Array220.array220(nums1, 0),
            Array220.array220(nums2, 0),
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
