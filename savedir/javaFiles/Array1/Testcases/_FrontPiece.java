package Array1.Testcases;
import Array1.FrontPiece;
import java.util.Arrays;
import java.util.ArrayList;

public final class _FrontPiece
{
    static final String[] testcaseStrings = {
        "frontPiece([1, 2, 3])",
        "frontPiece([1, 2])",
        "frontPiece([1])",
        "frontPiece([])",
        "frontPiece([6, 5, 0])",
        "frontPiece([6, 5])",
        "frontPiece([3, 1, 4, 1, 5])",
        "frontPiece([6])",
    };

    static final int[][] expectedResults = {
        {1, 2},
        {1, 2},
        {1},
        {},
        {6, 5},
        {6, 5},
        {3, 1},
        {6},
    };

    public static final String printArray(int[] array)
    {
        String result = "[";
        for (int a: array) { result += a+", "; }
        if (result.length() > 2) result = result.substring(0, result.length()-2);
        return result + "]";
    }

    public static final void Validate(boolean printSuccess)
    {
        final int[] nums0 = { 1, 2, 3 }; 
        final int[] nums1 = { 1, 2 }; 
        final int[] nums2 = { 1 }; 
        final int[] nums3 = {  }; 
        final int[] nums4 = { 6, 5, 0 }; 
        final int[] nums5 = { 6, 5 }; 
        final int[] nums6 = { 3, 1, 4, 1, 5 }; 
        final int[] nums7 = { 6 }; 

        final int[][] resultsArray = {
            FrontPiece.frontPiece(nums0),
            FrontPiece.frontPiece(nums1),
            FrontPiece.frontPiece(nums2),
            FrontPiece.frontPiece(nums3),
            FrontPiece.frontPiece(nums4),
            FrontPiece.frontPiece(nums5),
            FrontPiece.frontPiece(nums6),
            FrontPiece.frontPiece(nums7),
        };

        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (!Arrays.equals(resultsArray[i], expectedResults[i]))
            {
                allTestsPassed = false;
                System.out.println("\n[-] #"+(i+1)+" failed!");
                System.out.println(testcaseStrings[i]+";");
                System.out.println("    received: "+printArray(resultsArray[i]));
                System.out.println("    expected: "+printArray(expectedResults[i]));
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
