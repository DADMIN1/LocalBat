package Array3.Testcases;
import Array3.MaxMirror;

public class _MaxMirror
{
    static String[] testcaseStrings = {
        "maxMirror([1, 2, 3, 8, 9, 3, 2, 1])",
        "maxMirror([1, 2, 1, 4])",
        "maxMirror([7, 1, 2, 9, 7, 2, 1])",
    };

    static int[] expectedResults = {
        3,
        3,
        2,
    };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 1, 2, 3, 8, 9, 3, 2, 1 }; 
        int[] nums1 = { 1, 2, 1, 4 }; 
        int[] nums2 = { 7, 1, 2, 9, 7, 2, 1 }; 

        int[] resultsArray = {
            MaxMirror.maxMirror(nums0),
            MaxMirror.maxMirror(nums1),
            MaxMirror.maxMirror(nums2),
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
