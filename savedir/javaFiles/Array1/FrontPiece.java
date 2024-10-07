package Array1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p142455

/* Given an int array of any length, return a new array of its first 2 elements.
If the array is smaller than length 2, use whatever elements are present. */

class TestCases_FrontPiece
{
    // frontPiece([1, 2, 3]) → [1, 2]
    // frontPiece([1, 2]) → [1, 2]
    // frontPiece([1]) → [1]

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "frontPiece([1, 2, 3]) → [1, 2]");
        testcaseMap.put(1, "frontPiece([1, 2]) → [1, 2]");
        testcaseMap.put(2, "frontPiece([1]) → [1]");
    }

    static int[][] expectedResults = { {1, 2}, {1, 2}, {1}, };
}

public class FrontPiece
{
    public static int[] frontPiece(int[] nums)
    {
        
    }


    public static String printArray(int[] array)
    {
        String result = "[";
        for (int a: array) { result += a+", "; }
        if (result.length() > 2) result = result.substring(0, result.length()-2);
        return result + "]";
    }

    public static void main(String[] args)
    {
        int[] nums0 = { 1, 2, 3 }; 
        int[] nums1 = { 1, 2 }; 
        int[] nums2 = { 1 }; 

        int[][] resultsArray = {
            frontPiece(nums0),
            frontPiece(nums1),
            frontPiece(nums2),
        };


        TestCases_FrontPiece.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_FrontPiece.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_FrontPiece.testcaseMap.get(i));
                System.out.println("    expected: "+printArray(TestCases_FrontPiece.expectedResults[i]));
                System.out.println("      result: "+printArray(resultsArray[i]));
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
