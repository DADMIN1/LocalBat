package Recursion2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p138907

/* Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the given target with these additional constraints: all multiples of 5 in the array must be included in the group.
If the value immediately following a multiple of 5 is 1, it must not be chosen.
(No loops needed.) */

class TestCases_GroupSum5
{
    // groupSum5(0, [2, 5, 10, 4], 19) → true
    // groupSum5(0, [2, 5, 10, 4], 17) → true
    // groupSum5(0, [2, 5, 10, 4], 12) → false

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "groupSum5(0, [2, 5, 10, 4], 19) → true");
        testcaseMap.put(1, "groupSum5(0, [2, 5, 10, 4], 17) → true");
        testcaseMap.put(2, "groupSum5(0, [2, 5, 10, 4], 12) → false");
    }

    static boolean[] expectedResults = { true, true, false, };
}

public class GroupSum5
{
    public static boolean groupSum5(int start, int[] nums, int target)
    {
        
    }


    public static void main(String[] args)
    {
        int[] nums0 = { 2, 5, 10, 4 }; 
        int[] nums1 = { 2, 5, 10, 4 }; 
        int[] nums2 = { 2, 5, 10, 4 }; 

        boolean[] resultsArray = {
            groupSum5(0, nums0, 19),
            groupSum5(0, nums1, 17),
            groupSum5(0, nums2, 12),
        };


        TestCases_GroupSum5.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_GroupSum5.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_GroupSum5.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_GroupSum5.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
