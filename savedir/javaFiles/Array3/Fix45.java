package Array3;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p125819

/* (This is a slightly harder version of the fix34 problem.) Return an array that contains exactly the same numbers as the given array, 
but rearranged so that every 4 is immediately followed by a 5. 
Do not move the 4's, but every other number may move. The array contains the same number of 4's and 5's, 
and every 4 has a number after it that is not a 4. In this version, 
5's may appear anywhere in the original array. */

class TestCases_Fix45
{
    // fix45([5, 4, 9, 4, 9, 5]) → [9, 4, 5, 4, 5, 9]
    // fix45([1, 4, 1, 5]) → [1, 4, 5, 1]
    // fix45([1, 4, 1, 5, 5, 4, 1]) → [1, 4, 5, 1, 1, 4, 5]

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "fix45([5, 4, 9, 4, 9, 5])");
        testcaseMap.put(1, "fix45([1, 4, 1, 5])");
        testcaseMap.put(2, "fix45([1, 4, 1, 5, 5, 4, 1])");
    }

    static int[][] expectedResults = { {9, 4, 5, 4, 5, 9}, {1, 4, 5, 1}, {1, 4, 5, 1, 1, 4, 5}, };
}

public class Fix45
{
    public static int[] fix45(int[] nums)
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
        int[] nums0 = { 5, 4, 9, 4, 9, 5 }; 
        int[] nums1 = { 1, 4, 1, 5 }; 
        int[] nums2 = { 1, 4, 1, 5, 5, 4, 1 }; 

        int[][] resultsArray = {
            fix45(nums0),
            fix45(nums1),
            fix45(nums2),
        };


        TestCases_Fix45.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (!resultsArray[i].equals(TestCases_Fix45.expectedResults[i]))
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_Fix45.testcaseMap.get(i));
                System.out.println("    received: "+printArray(resultsArray[i]));
                System.out.println("    expected: "+printArray(TestCases_Fix45.expectedResults[i]));
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
