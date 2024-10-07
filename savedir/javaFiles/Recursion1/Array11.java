package Recursion1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p135988

/* Given an array of ints, compute recursively the number of times that the value 11 appears in the array.
We'll use the convention of considering only the part of the array that begins at the given index.
In this way, a recursive call can pass index+1 to move down the array.
The initial call will pass in index as 0. */

class TestCases_Array11
{
    // array11([1, 2, 11], 0) → 1
    // array11([11, 11], 0) → 2
    // array11([1, 2, 3, 4], 0) → 0

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "array11([1, 2, 11], 0) → 1");
        testcaseMap.put(1, "array11([11, 11], 0) → 2");
        testcaseMap.put(2, "array11([1, 2, 3, 4], 0) → 0");
    }

    static int[] expectedResults = { 1, 2, 0, };
}

public class Array11
{
    public static int array11(int[] nums, int index)
    {
        
    }


    public static void main(String[] args)
    {
        int[] nums0 = { 1, 2, 11 }; 
        int[] nums1 = { 11, 11 }; 
        int[] nums2 = { 1, 2, 3, 4 }; 

        int[] resultsArray = {
            array11(nums0, 0),
            array11(nums1, 0),
            array11(nums2, 0),
        };


        TestCases_Array11.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_Array11.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_Array11.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_Array11.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
