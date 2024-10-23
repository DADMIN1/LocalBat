package Array2.Testcases;
import Array2.TripleUp;

public class _TripleUp
{
    static String[] testcaseStrings = {
        "tripleUp([1, 4, 5, 6, 2])",
        "tripleUp([1, 2, 3])",
        "tripleUp([1, 2, 4])",
    };

    static boolean[] expectedResults = {
        true,
        true,
        false,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 1, 4, 5, 6, 2 }; 
        int[] nums1 = { 1, 2, 3 }; 
        int[] nums2 = { 1, 2, 4 }; 

        boolean[] resultsArray = {
            TripleUp.tripleUp(nums0),
            TripleUp.tripleUp(nums1),
            TripleUp.tripleUp(nums2),
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
