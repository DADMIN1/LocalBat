package Warmup2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p136041

/* Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere. */

class TestCases_Array123
{
    // array123([1, 1, 2, 3, 1]) → true
    // array123([1, 1, 2, 4, 1]) → false
    // array123([1, 1, 2, 1, 2, 3]) → true

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "array123([1, 1, 2, 3, 1]) → true");
        testcaseMap.put(1, "array123([1, 1, 2, 4, 1]) → false");
        testcaseMap.put(2, "array123([1, 1, 2, 1, 2, 3]) → true");
    }

    static boolean[] expectedResults = { true, false, true, };
}

public class Array123
{
    public static boolean array123(int[] nums)
    {
        
    }


    public static void main(String[] args)
    {
        int[] nums0 = { 1, 1, 2, 3, 1 }; 
        int[] nums1 = { 1, 1, 2, 4, 1 }; 
        int[] nums2 = { 1, 1, 2, 1, 2, 3 }; 

        boolean[] resultsArray = {
            array123(nums0),
            array123(nums1),
            array123(nums2),
        };


        TestCases_Array123.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_Array123.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_Array123.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_Array123.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
