package Array1.Testcases;
import Array1.Sum2;

public class _Sum2
{
    static String[] testcaseStrings = {
        "sum2([1, 2, 3])",
        "sum2([1, 1])",
        "sum2([1, 1, 1, 1])",
    };

    static int[] expectedResults = { 3, 2, 2, };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 1, 2, 3 }; 
        int[] nums1 = { 1, 1 }; 
        int[] nums2 = { 1, 1, 1, 1 }; 

        int[] resultsArray = {
            Sum2.sum2(nums0),
            Sum2.sum2(nums1),
            Sum2.sum2(nums2),
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
