package Recursion2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p105136

/* Given an array of ints, is it possible to choose a group of some of the ints, 
such that the group sums to the given target, with this additional constraint: 
if there are numbers in the array that are adjacent and the identical value, 
they must either all be chosen, or none of them chosen. 
For example, with the array {1, 2, 2, 2, 5, 2}, either all three 2's in the middle must be chosen or not, 
all as a group. (one loop can be used to find the extent of the identical values). */

class TestCases_GroupSumClump
{
    // groupSumClump(0, [2, 4, 8], 10) → true
    // groupSumClump(0, [1, 2, 4, 8, 1], 14) → true
    // groupSumClump(0, [2, 4, 4, 8], 14) → false

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "groupSumClump(0, [2, 4, 8], 10)");
        testcaseMap.put(1, "groupSumClump(0, [1, 2, 4, 8, 1], 14)");
        testcaseMap.put(2, "groupSumClump(0, [2, 4, 4, 8], 14)");
    }

    static boolean[] expectedResults = { true, true, false, };
}

public class GroupSumClump
{
    public static boolean groupSumClump(int start, int[] nums, int target)
    {
        
    }


    public static void main(String[] args)
    {
        int[] nums0 = { 2, 4, 8 }; 
        int[] nums1 = { 1, 2, 4, 8, 1 }; 
        int[] nums2 = { 2, 4, 4, 8 }; 

        boolean[] resultsArray = {
            groupSumClump(0, nums0, 10),
            groupSumClump(0, nums1, 14),
            groupSumClump(0, nums2, 14),
        };


        TestCases_GroupSumClump.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_GroupSumClump.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_GroupSumClump.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_GroupSumClump.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
