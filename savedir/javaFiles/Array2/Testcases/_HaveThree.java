package Array2.Testcases;
import Array2.HaveThree;

public class _HaveThree
{
    static String[] testcaseStrings = {
        "haveThree([3, 1, 3, 1, 3])",
        "haveThree([3, 1, 3, 3])",
        "haveThree([3, 4, 3, 3, 4])",
    };

    static boolean[] expectedResults = { true, false, false, };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 3, 1, 3, 1, 3 }; 
        int[] nums1 = { 3, 1, 3, 3 }; 
        int[] nums2 = { 3, 4, 3, 3, 4 }; 

        boolean[] resultsArray = {
            HaveThree.haveThree(nums0),
            HaveThree.haveThree(nums1),
            HaveThree.haveThree(nums2),
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