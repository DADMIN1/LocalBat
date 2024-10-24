package Array2.Testcases;
import Array2.TripleUp;

public class _TripleUp
{
    static String[] testcaseStrings = {
        "tripleUp([1, 4, 5, 6, 2])",
        "tripleUp([1, 2, 3])",
        "tripleUp([1, 2, 4])",
        "tripleUp([1, 2, 4, 5, 7, 6, 5, 6, 7, 6])",
        "tripleUp([1, 2, 4, 5, 7, 6, 5, 7, 7, 6])",
        "tripleUp([1, 2])",
        "tripleUp([1])",
        "tripleUp([])",
        "tripleUp([10, 9, 8, -100, -99, -98, 100])",
        "tripleUp([10, 9, 8, -100, -99, 99, 100])",
        "tripleUp([-100, -99, -99, 100, 101, 102])",
        "tripleUp([2, 3, 5, 6, 8, 9, 2, 3])",
    };

    static boolean[] expectedResults = {
        true,
        true,
        false,
        true,
        false,
        false,
        false,
        false,
        true,
        false,
        true,
        false,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 1, 4, 5, 6, 2 }; 
        int[] nums1 = { 1, 2, 3 }; 
        int[] nums2 = { 1, 2, 4 }; 
        int[] nums3 = { 1, 2, 4, 5, 7, 6, 5, 6, 7, 6 }; 
        int[] nums4 = { 1, 2, 4, 5, 7, 6, 5, 7, 7, 6 }; 
        int[] nums5 = { 1, 2 }; 
        int[] nums6 = { 1 }; 
        int[] nums7 = {  }; 
        int[] nums8 = { 10, 9, 8, -100, -99, -98, 100 }; 
        int[] nums9 = { 10, 9, 8, -100, -99, 99, 100 }; 
        int[] nums10 = { -100, -99, -99, 100, 101, 102 }; 
        int[] nums11 = { 2, 3, 5, 6, 8, 9, 2, 3 }; 

        boolean[] resultsArray = {
            TripleUp.tripleUp(nums0),
            TripleUp.tripleUp(nums1),
            TripleUp.tripleUp(nums2),
            TripleUp.tripleUp(nums3),
            TripleUp.tripleUp(nums4),
            TripleUp.tripleUp(nums5),
            TripleUp.tripleUp(nums6),
            TripleUp.tripleUp(nums7),
            TripleUp.tripleUp(nums8),
            TripleUp.tripleUp(nums9),
            TripleUp.tripleUp(nums10),
            TripleUp.tripleUp(nums11),
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
