package Warmup2.Testcases;
import Warmup2.Array667;

public class _Array667
{
    static String[] testcaseStrings = {
        "array667([6, 6, 2])",
        "array667([6, 6, 2, 6])",
        "array667([6, 7, 2, 6])",
    };

    static int[] expectedResults = {
        1,
        1,
        1,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 6, 6, 2 }; 
        int[] nums1 = { 6, 6, 2, 6 }; 
        int[] nums2 = { 6, 7, 2, 6 }; 

        int[] resultsArray = {
            Array667.array667(nums0),
            Array667.array667(nums1),
            Array667.array667(nums2),
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
