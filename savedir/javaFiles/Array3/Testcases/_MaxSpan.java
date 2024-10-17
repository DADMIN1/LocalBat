package Array3.Testcases;
import Array3.MaxSpan;

public class _MaxSpan
{
    static String[] testcaseStrings = {
        "maxSpan([1, 2, 1, 1, 3])",
        "maxSpan([1, 4, 2, 1, 4, 1, 4])",
        "maxSpan([1, 4, 2, 1, 4, 4, 4])",
    };

    static int[] expectedResults = { 4, 6, 6, };

    public static void Validate(boolean printSuccess)
    {
        int[] nums0 = { 1, 2, 1, 1, 3 }; 
        int[] nums1 = { 1, 4, 2, 1, 4, 1, 4 }; 
        int[] nums2 = { 1, 4, 2, 1, 4, 4, 4 }; 

        int[] resultsArray = {
            MaxSpan.maxSpan(nums0),
            MaxSpan.maxSpan(nums1),
            MaxSpan.maxSpan(nums2),
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
