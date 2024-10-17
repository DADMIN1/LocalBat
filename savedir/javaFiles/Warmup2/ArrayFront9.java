package Warmup2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p186031

/* Given an array of ints, return true if one of the first 4 elements in the array is a 9. 
The array length may be less than 4. */

class TestCases_ArrayFront9
{
    // arrayFront9([1, 2, 9, 3, 4]) → true
    // arrayFront9([1, 2, 3, 4, 9]) → false
    // arrayFront9([1, 2, 3, 4, 5]) → false

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "arrayFront9([1, 2, 9, 3, 4])");
        testcaseMap.put(1, "arrayFront9([1, 2, 3, 4, 9])");
        testcaseMap.put(2, "arrayFront9([1, 2, 3, 4, 5])");
    }

    static boolean[] expectedResults = { true, false, false, };
}

public class ArrayFront9
{
    public static boolean arrayFront9(int[] nums)
    {
        
    }


    public static void main(String[] args)
    {
        int[] nums0 = { 1, 2, 9, 3, 4 }; 
        int[] nums1 = { 1, 2, 3, 4, 9 }; 
        int[] nums2 = { 1, 2, 3, 4, 5 }; 

        boolean[] resultsArray = {
            arrayFront9(nums0),
            arrayFront9(nums1),
            arrayFront9(nums2),
        };


        TestCases_ArrayFront9.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_ArrayFront9.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_ArrayFront9.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_ArrayFront9.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
