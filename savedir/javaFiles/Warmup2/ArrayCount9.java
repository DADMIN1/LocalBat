package Warmup2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p184031

/* Given an array of ints, return the number of 9's in the array. */

class TestCases_ArrayCount9
{
    // arrayCount9([1, 2, 9]) → 1
    // arrayCount9([1, 9, 9]) → 2
    // arrayCount9([1, 9, 9, 3, 9]) → 3

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "arrayCount9([1, 2, 9]) → 1");
        testcaseMap.put(1, "arrayCount9([1, 9, 9]) → 2");
        testcaseMap.put(2, "arrayCount9([1, 9, 9, 3, 9]) → 3");
    }

    static int[] expectedResults = { 1, 2, 3, };
}

public class ArrayCount9
{
    public static int arrayCount9(int[] nums)
    {
        
    }


    public static void main(String[] args)
    {
        int[] nums0 = { 1, 2, 9 }; 
        int[] nums1 = { 1, 9, 9 }; 
        int[] nums2 = { 1, 9, 9, 3, 9 }; 

        int[] resultsArray = {
            arrayCount9(nums0),
            arrayCount9(nums1),
            arrayCount9(nums2),
        };


        TestCases_ArrayCount9.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_ArrayCount9.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_ArrayCount9.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_ArrayCount9.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
