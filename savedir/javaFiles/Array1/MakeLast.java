package Array1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p137188

/* Given an int array, return a new array with double the length where its last element is the same as the original array, 
and all the other elements are 0. The original array will be length 1 or more. 
Note: by default, a new int array contains all 0's. */

class TestCases_MakeLast
{
    // makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
    // makeLast([1, 2]) → [0, 0, 0, 2]
    // makeLast([3]) → [0, 3]

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "makeLast([4, 5, 6])");
        testcaseMap.put(1, "makeLast([1, 2])");
        testcaseMap.put(2, "makeLast([3])");
    }

    static int[][] expectedResults = { {0, 0, 0, 0, 0, 6}, {0, 0, 0, 2}, {0, 3}, };
}

public class MakeLast
{
    public static int[] makeLast(int[] nums)
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
        int[] nums0 = { 4, 5, 6 }; 
        int[] nums1 = { 1, 2 }; 
        int[] nums2 = { 3 }; 

        int[][] resultsArray = {
            makeLast(nums0),
            makeLast(nums1),
            makeLast(nums2),
        };


        TestCases_MakeLast.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (!resultsArray[i].equals(TestCases_MakeLast.expectedResults[i]))
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_MakeLast.testcaseMap.get(i));
                System.out.println("    received: "+printArray(resultsArray[i]));
                System.out.println("    expected: "+printArray(TestCases_MakeLast.expectedResults[i]));
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
