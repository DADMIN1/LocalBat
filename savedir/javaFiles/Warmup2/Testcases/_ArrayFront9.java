package Warmup2.Testcases;
import Warmup2.ArrayFront9;

public class _ArrayFront9
{
    static String[] testcaseStrings = {
        "arrayFront9([1, 2, 9, 3, 4])",
        "arrayFront9([1, 2, 3, 4, 9])",
        "arrayFront9([1, 2, 3, 4, 5])",
    };

    static boolean[] expectedResults = {
        true,
        false,
        false,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 1, 2, 9, 3, 4 }; 
        int[] nums1 = { 1, 2, 3, 4, 9 }; 
        int[] nums2 = { 1, 2, 3, 4, 5 }; 

        boolean[] resultsArray = {
            ArrayFront9.arrayFront9(nums0),
            ArrayFront9.arrayFront9(nums1),
            ArrayFront9.arrayFront9(nums2),
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
