package Recursion1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p173469

/* Given an array of ints, compute recursively if the array contains somewhere a value followed in the array by that value times 10.
We'll use the convention of considering only the part of the array that begins at the given index.
In this way, a recursive call can pass index+1 to move down the array.
The initial call will pass in index as 0. */

class TestCases_Array220
{
    // array220([1, 2, 20], 0) → true
    // array220([3, 30], 0) → true
    // array220([3], 0) → false

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "array220([1, 2, 20], 0) → true");
        testcaseMap.put(1, "array220([3, 30], 0) → true");
        testcaseMap.put(2, "array220([3], 0) → false");
    }

    static boolean[] expectedResults = { true, true, false, };
}

public class Array220
{
    public static boolean array220(int[] nums, int index)
    {
        
    }


    public static void main(String[] args)
    {
        int[] nums0 = { 1, 2, 20 }; 
        int[] nums1 = { 3, 30 }; 
        int[] nums2 = { 3 }; 

        boolean[] resultsArray = {
            array220(nums0, 0),
            array220(nums1, 0),
            array220(nums2, 0),
        };


        TestCases_Array220.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_Array220.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_Array220.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_Array220.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
