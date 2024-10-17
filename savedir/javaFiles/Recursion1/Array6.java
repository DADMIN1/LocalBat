package Recursion1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p108997

/* Given an array of ints, compute recursively if the array contains a 6. 
We'll use the convention of considering only the part of the array that begins at the given index. 
In this way, a recursive call can pass index+1 to move down the array. 
The initial call will pass in index as 0. */

class TestCases_Array6
{
    // array6([1, 6, 4], 0) → true
    // array6([1, 4], 0) → false
    // array6([6], 0) → true

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "array6([1, 6, 4], 0)");
        testcaseMap.put(1, "array6([1, 4], 0)");
        testcaseMap.put(2, "array6([6], 0)");
    }

    static boolean[] expectedResults = { true, false, true, };
}

public class Array6
{
    public static boolean array6(int[] nums, int index)
    {
        
    }


    public static void main(String[] args)
    {
        int[] nums0 = { 1, 6, 4 }; 
        int[] nums1 = { 1, 4 }; 
        int[] nums2 = { 6 }; 

        boolean[] resultsArray = {
            array6(nums0, 0),
            array6(nums1, 0),
            array6(nums2, 0),
        };


        TestCases_Array6.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_Array6.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_Array6.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_Array6.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
