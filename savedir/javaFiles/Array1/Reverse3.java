package Array1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p112409

/* Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}. */

class TestCases_Reverse3
{
    // reverse3([1, 2, 3]) → [3, 2, 1]
    // reverse3([5, 11, 9]) → [9, 11, 5]
    // reverse3([7, 0, 0]) → [0, 0, 7]

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "reverse3([1, 2, 3]) → [3, 2, 1]");
        testcaseMap.put(1, "reverse3([5, 11, 9]) → [9, 11, 5]");
        testcaseMap.put(2, "reverse3([7, 0, 0]) → [0, 0, 7]");
    }

    static int[][] expectedResults = { {3, 2, 1}, {9, 11, 5}, {0, 0, 7}, };
}

public class Reverse3
{
    public static int[] reverse3(int[] nums)
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
        int[] nums1 = { 5, 11, 9 }; 
        int[] nums2 = { 7, 0, 0 }; 

        int[][] resultsArray = {
            reverse3(nums0),
            reverse3(nums1),
            reverse3(nums2),
        };


        TestCases_Reverse3.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_Reverse3.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_Reverse3.testcaseMap.get(i));
                System.out.println("    expected: "+printArray(TestCases_Reverse3.expectedResults[i]));
                System.out.println("      result: "+printArray(resultsArray[i]));
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
