package Warmup2.Testcases;
import Warmup2.Array123;

public class _Array123
{
    static String[] testcaseStrings = {
        "array123([1, 1, 2, 3, 1])",
        "array123([1, 1, 2, 4, 1])",
        "array123([1, 1, 2, 1, 2, 3])",
    };

    static boolean[] expectedResults = {
        true,
        false,
        true,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 1, 1, 2, 3, 1 }; 
        int[] nums1 = { 1, 1, 2, 4, 1 }; 
        int[] nums2 = { 1, 1, 2, 1, 2, 3 }; 

        boolean[] resultsArray = {
            Array123.array123(nums0),
            Array123.array123(nums1),
            Array123.array123(nums2),
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
