package Warmup2.Testcases;
import Warmup2.NoTriples;

public class _NoTriples
{
    static String[] testcaseStrings = {
        "noTriples([1, 1, 2, 2, 1])",
        "noTriples([1, 1, 2, 2, 2, 1])",
        "noTriples([1, 1, 1, 2, 2, 2, 1])",
    };

    static boolean[] expectedResults = { true, false, false, };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 1, 1, 2, 2, 1 }; 
        int[] nums1 = { 1, 1, 2, 2, 2, 1 }; 
        int[] nums2 = { 1, 1, 1, 2, 2, 2, 1 }; 

        boolean[] resultsArray = {
            NoTriples.noTriples(nums0),
            NoTriples.noTriples(nums1),
            NoTriples.noTriples(nums2),
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
