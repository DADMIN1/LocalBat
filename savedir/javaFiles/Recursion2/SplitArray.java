package Recursion2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p185204

/* Given an array of ints, is it possible to divide the ints into two groups, so that the sums of the two groups are the same.
Every int must be in one group or the other.
Write a recursive helper method that takes whatever arguments you like, and make the initial call to your recursive helper from splitArray().
(No loops needed.) */

class TestCases_SplitArray
{
    // splitArray([2, 2]) → true
    // splitArray([2, 3]) → false
    // splitArray([5, 2, 3]) → true

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "splitArray([2, 2]) → true");
        testcaseMap.put(1, "splitArray([2, 3]) → false");
        testcaseMap.put(2, "splitArray([5, 2, 3]) → true");
    }

    static boolean[] expectedResults = { true, false, true, };
}

public class SplitArray
{
    public static boolean splitArray(int[] nums)
    {
        
    }


    public static void main(String[] args)
    {
        int[] nums0 = { 2, 2 }; 
        int[] nums1 = { 2, 3 }; 
        int[] nums2 = { 5, 2, 3 }; 

        boolean[] resultsArray = {
            splitArray(nums0),
            splitArray(nums1),
            splitArray(nums2),
        };


        TestCases_SplitArray.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_SplitArray.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_SplitArray.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_SplitArray.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
