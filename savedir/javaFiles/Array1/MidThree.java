package Array1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p155713

/* Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array.
The array length will be at least 3. */

class TestCases_MidThree
{
    // midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
    // midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
    // midThree([1, 2, 3]) → [1, 2, 3]

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "midThree([1, 2, 3, 4, 5]) → [2, 3, 4]");
        testcaseMap.put(1, "midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]");
        testcaseMap.put(2, "midThree([1, 2, 3]) → [1, 2, 3]");
    }

    static int[][] expectedResults = { {2, 3, 4}, {7, 5, 3}, {1, 2, 3}, };
}

public class MidThree
{
    public static int[] midThree(int[] nums)
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
        int[] nums0 = { 1, 2, 3, 4, 5 }; 
        int[] nums1 = { 8, 6, 7, 5, 3, 0, 9 }; 
        int[] nums2 = { 1, 2, 3 }; 

        int[][] resultsArray = {
            midThree(nums0),
            midThree(nums1),
            midThree(nums2),
        };


        TestCases_MidThree.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_MidThree.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_MidThree.testcaseMap.get(i));
                System.out.println("    expected: "+printArray(TestCases_MidThree.expectedResults[i]));
                System.out.println("      result: "+printArray(resultsArray[i]));
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
