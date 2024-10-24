package Array1.Testcases;
import Array1.Sum2;

public class _Sum2
{
    static String[] testcaseStrings = {
        "sum2([1, 2, 3])",
        "sum2([1, 1])",
        "sum2([1, 1, 1, 1])",
        "sum2([1, 2])",
        "sum2([1])",
        "sum2([])",
        "sum2([4, 5, 6])",
        "sum2([4])",
    };

    static int[] expectedResults = {
        3,
        2,
        2,
        3,
        1,
        0,
        9,
        4,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 1, 2, 3 }; 
        int[] nums1 = { 1, 1 }; 
        int[] nums2 = { 1, 1, 1, 1 }; 
        int[] nums3 = { 1, 2 }; 
        int[] nums4 = { 1 }; 
        int[] nums5 = {  }; 
        int[] nums6 = { 4, 5, 6 }; 
        int[] nums7 = { 4 }; 

        int[] resultsArray = {
            Sum2.sum2(nums0),
            Sum2.sum2(nums1),
            Sum2.sum2(nums2),
            Sum2.sum2(nums3),
            Sum2.sum2(nums4),
            Sum2.sum2(nums5),
            Sum2.sum2(nums6),
            Sum2.sum2(nums7),
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
