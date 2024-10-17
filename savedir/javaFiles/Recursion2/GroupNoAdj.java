package Recursion2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p169605

/* Given an array of ints, is it possible to choose a group of some of the ints, 
such that the group sums to the given target with this additional constraint: 
If a value in the array is chosen to be in the group, the value immediately following it in the array must not be chosen. 
(No loops needed.) */

class TestCases_GroupNoAdj
{
    // groupNoAdj(0, [2, 5, 10, 4], 12) → true
    // groupNoAdj(0, [2, 5, 10, 4], 14) → false
    // groupNoAdj(0, [2, 5, 10, 4], 7) → false

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "groupNoAdj(0, [2, 5, 10, 4], 12)");
        testcaseMap.put(1, "groupNoAdj(0, [2, 5, 10, 4], 14)");
        testcaseMap.put(2, "groupNoAdj(0, [2, 5, 10, 4], 7)");
    }

    static boolean[] expectedResults = { true, false, false, };
}

public class GroupNoAdj
{
    public static boolean groupNoAdj(int start, int[] nums, int target)
    {
        
    }


    public static void main(String[] args)
    {
        int[] nums0 = { 2, 5, 10, 4 }; 
        int[] nums1 = { 2, 5, 10, 4 }; 
        int[] nums2 = { 2, 5, 10, 4 }; 

        boolean[] resultsArray = {
            groupNoAdj(0, nums0, 12),
            groupNoAdj(0, nums1, 14),
            groupNoAdj(0, nums2, 7),
        };


        TestCases_GroupNoAdj.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_GroupNoAdj.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_GroupNoAdj.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_GroupNoAdj.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
