package Array2.Testcases;
import Array2.TwoTwo;

public class _TwoTwo
{
    static String[] testcaseStrings = {
        "twoTwo([4, 2, 2, 3])",
        "twoTwo([2, 2, 4])",
        "twoTwo([2, 2, 4, 2])",
    };

    static boolean[] expectedResults = { true, true, false, };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 4, 2, 2, 3 }; 
        int[] nums1 = { 2, 2, 4 }; 
        int[] nums2 = { 2, 2, 4, 2 }; 

        boolean[] resultsArray = {
            TwoTwo.twoTwo(nums0),
            TwoTwo.twoTwo(nums1),
            TwoTwo.twoTwo(nums2),
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
