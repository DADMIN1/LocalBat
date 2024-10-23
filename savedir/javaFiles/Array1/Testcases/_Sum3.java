package Array1.Testcases;
import Array1.Sum3;

public class _Sum3
{
    static String[] testcaseStrings = {
        "sum3([1, 2, 3])",
        "sum3([5, 11, 2])",
        "sum3([7, 0, 0])",
    };

    static int[] expectedResults = {
        6,
        18,
        7,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 1, 2, 3 }; 
        int[] nums1 = { 5, 11, 2 }; 
        int[] nums2 = { 7, 0, 0 }; 

        int[] resultsArray = {
            Sum3.sum3(nums0),
            Sum3.sum3(nums1),
            Sum3.sum3(nums2),
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
