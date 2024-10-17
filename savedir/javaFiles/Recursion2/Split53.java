package Recursion2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p168295

/* Given an array of ints, is it possible to divide the ints into two groups, 
so that the sum of the two groups is the same, with these constraints: 
all the values that are multiple of 5 must be in one group, 
and all the values that are a multiple of 3 (and not a multiple of 5) must be in the other. 
(No loops needed.) */

class TestCases_Split53
{
    // split53([1, 1]) → true
    // split53([1, 1, 1]) → false
    // split53([2, 4, 2]) → true

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "split53([1, 1])");
        testcaseMap.put(1, "split53([1, 1, 1])");
        testcaseMap.put(2, "split53([2, 4, 2])");
    }

    static boolean[] expectedResults = { true, false, true, };
}

public class Split53
{
    public static boolean split53(int[] nums)
    {
        
    }


    public static void main(String[] args)
    {
        int[] nums0 = { 1, 1 }; 
        int[] nums1 = { 1, 1, 1 }; 
        int[] nums2 = { 2, 4, 2 }; 

        boolean[] resultsArray = {
            split53(nums0),
            split53(nums1),
            split53(nums2),
        };


        TestCases_Split53.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_Split53.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_Split53.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_Split53.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
