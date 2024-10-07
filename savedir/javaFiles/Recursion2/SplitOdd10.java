package Recursion2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p171660

/* Given an array of ints, is it possible to divide the ints into two groups, so that the sum of one group is a multiple of 10, and the sum of the other group is odd.
Every int must be in one group or the other.
Write a recursive helper method that takes whatever arguments you like, and make the initial call to your recursive helper from splitOdd10().
(No loops needed.) */

class TestCases_SplitOdd10
{
    // splitOdd10([5, 5, 5]) → true
    // splitOdd10([5, 5, 6]) → false
    // splitOdd10([5, 5, 6, 1]) → true

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "splitOdd10([5, 5, 5]) → true");
        testcaseMap.put(1, "splitOdd10([5, 5, 6]) → false");
        testcaseMap.put(2, "splitOdd10([5, 5, 6, 1]) → true");
    }

    static boolean[] expectedResults = { true, false, true, };
}

public class SplitOdd10
{
    public static boolean splitOdd10(int[] nums)
    {
        
    }


    public static void main(String[] args)
    {
        int[] nums0 = { 5, 5, 5 }; 
        int[] nums1 = { 5, 5, 6 }; 
        int[] nums2 = { 5, 5, 6, 1 }; 

        boolean[] resultsArray = {
            splitOdd10(nums0),
            splitOdd10(nums1),
            splitOdd10(nums2),
        };


        TestCases_SplitOdd10.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_SplitOdd10.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_SplitOdd10.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_SplitOdd10.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
