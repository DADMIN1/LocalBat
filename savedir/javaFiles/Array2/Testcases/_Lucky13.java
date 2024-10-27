package Array2.Testcases;
import Array2.Lucky13;

public final class _Lucky13
{
    static final String[] testcaseStrings = {
        "lucky13([0, 2, 4])",
        "lucky13([1, 2, 3])",
        "lucky13([1, 2, 4])",
        "lucky13([2, 7, 2, 8])",
        "lucky13([2, 7, 1, 8])",
        "lucky13([3, 7, 2, 8])",
        "lucky13([2, 7, 2, 1])",
        "lucky13([1, 2])",
        "lucky13([2, 2])",
        "lucky13([2])",
        "lucky13([3])",
        "lucky13([])",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        false,
        true,
        false,
        false,
        false,
        false,
        true,
        true,
        false,
        true,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] nums0 = { 0, 2, 4 }; 
        final int[] nums1 = { 1, 2, 3 }; 
        final int[] nums2 = { 1, 2, 4 }; 
        final int[] nums3 = { 2, 7, 2, 8 }; 
        final int[] nums4 = { 2, 7, 1, 8 }; 
        final int[] nums5 = { 3, 7, 2, 8 }; 
        final int[] nums6 = { 2, 7, 2, 1 }; 
        final int[] nums7 = { 1, 2 }; 
        final int[] nums8 = { 2, 2 }; 
        final int[] nums9 = { 2 }; 
        final int[] nums10 = { 3 }; 
        final int[] nums11 = {  }; 

        final boolean[] resultsArray = {
            Lucky13.lucky13(nums0),
            Lucky13.lucky13(nums1),
            Lucky13.lucky13(nums2),
            Lucky13.lucky13(nums3),
            Lucky13.lucky13(nums4),
            Lucky13.lucky13(nums5),
            Lucky13.lucky13(nums6),
            Lucky13.lucky13(nums7),
            Lucky13.lucky13(nums8),
            Lucky13.lucky13(nums9),
            Lucky13.lucky13(nums10),
            Lucky13.lucky13(nums11),
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
