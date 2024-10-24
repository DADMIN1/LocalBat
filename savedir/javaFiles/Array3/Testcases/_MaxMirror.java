package Array3.Testcases;
import Array3.MaxMirror;

public class _MaxMirror
{
    static String[] testcaseStrings = {
        "maxMirror([1, 2, 3, 8, 9, 3, 2, 1])",
        "maxMirror([1, 2, 1, 4])",
        "maxMirror([7, 1, 2, 9, 7, 2, 1])",
        "maxMirror([21, 22, 9, 8, 7, 6, 23, 24, 6, 7, 8, 9, 25, 7, 8, 9])",
        "maxMirror([1, 2, 1, 20, 21, 1, 2, 1, 2, 23, 24, 2, 1, 2, 1, 25])",
        "maxMirror([1, 2, 3, 2, 1])",
        "maxMirror([1, 2, 3, 3, 8])",
        "maxMirror([1, 2, 7, 8, 1, 7, 2])",
        "maxMirror([1, 1, 1])",
        "maxMirror([1])",
        "maxMirror([])",
        "maxMirror([9, 1, 1, 4, 2, 1, 1, 1])",
        "maxMirror([5, 9, 9, 4, 5, 4, 9, 9, 2])",
        "maxMirror([5, 9, 9, 6, 5, 4, 9, 9, 2])",
        "maxMirror([5, 9, 1, 6, 5, 4, 1, 9, 5])",
    };

    static int[] expectedResults = {
        3,
        3,
        2,
        4,
        4,
        5,
        2,
        2,
        3,
        1,
        0,
        3,
        7,
        2,
        3,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 1, 2, 3, 8, 9, 3, 2, 1 }; 
        int[] nums1 = { 1, 2, 1, 4 }; 
        int[] nums2 = { 7, 1, 2, 9, 7, 2, 1 }; 
        int[] nums3 = { 21, 22, 9, 8, 7, 6, 23, 24, 6, 7, 8, 9, 25, 7, 8, 9 }; 
        int[] nums4 = { 1, 2, 1, 20, 21, 1, 2, 1, 2, 23, 24, 2, 1, 2, 1, 25 }; 
        int[] nums5 = { 1, 2, 3, 2, 1 }; 
        int[] nums6 = { 1, 2, 3, 3, 8 }; 
        int[] nums7 = { 1, 2, 7, 8, 1, 7, 2 }; 
        int[] nums8 = { 1, 1, 1 }; 
        int[] nums9 = { 1 }; 
        int[] nums10 = {  }; 
        int[] nums11 = { 9, 1, 1, 4, 2, 1, 1, 1 }; 
        int[] nums12 = { 5, 9, 9, 4, 5, 4, 9, 9, 2 }; 
        int[] nums13 = { 5, 9, 9, 6, 5, 4, 9, 9, 2 }; 
        int[] nums14 = { 5, 9, 1, 6, 5, 4, 1, 9, 5 }; 

        int[] resultsArray = {
            MaxMirror.maxMirror(nums0),
            MaxMirror.maxMirror(nums1),
            MaxMirror.maxMirror(nums2),
            MaxMirror.maxMirror(nums3),
            MaxMirror.maxMirror(nums4),
            MaxMirror.maxMirror(nums5),
            MaxMirror.maxMirror(nums6),
            MaxMirror.maxMirror(nums7),
            MaxMirror.maxMirror(nums8),
            MaxMirror.maxMirror(nums9),
            MaxMirror.maxMirror(nums10),
            MaxMirror.maxMirror(nums11),
            MaxMirror.maxMirror(nums12),
            MaxMirror.maxMirror(nums13),
            MaxMirror.maxMirror(nums14),
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
