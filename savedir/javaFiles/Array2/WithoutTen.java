package Array2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p196976

/* Return a version of the given array where all the 10's have been removed. 
The remaining elements should shift left towards the start of the array as needed, 
and the empty spaces a the end of the array should be 0. 
So {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and return the given array or make a new array. */

class TestCases_WithoutTen
{
    // withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
    // withoutTen([10, 2, 10]) → [2, 0, 0]
    // withoutTen([1, 99, 10]) → [1, 99, 0]

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "withoutTen([1, 10, 10, 2])");
        testcaseMap.put(1, "withoutTen([10, 2, 10])");
        testcaseMap.put(2, "withoutTen([1, 99, 10])");
    }

    static int[][] expectedResults = { {1, 2, 0, 0}, {2, 0, 0}, {1, 99, 0}, };
}

public class WithoutTen
{
    public static int[] withoutTen(int[] nums)
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
        int[] nums0 = { 1, 10, 10, 2 }; 
        int[] nums1 = { 10, 2, 10 }; 
        int[] nums2 = { 1, 99, 10 }; 

        int[][] resultsArray = {
            withoutTen(nums0),
            withoutTen(nums1),
            withoutTen(nums2),
        };


        TestCases_WithoutTen.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (!resultsArray[i].equals(TestCases_WithoutTen.expectedResults[i]))
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_WithoutTen.testcaseMap.get(i));
                System.out.println("    received: "+printArray(resultsArray[i]));
                System.out.println("    expected: "+printArray(TestCases_WithoutTen.expectedResults[i]));
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
