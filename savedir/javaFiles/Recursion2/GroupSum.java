package Recursion2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p145416

/* Given an array of ints, is it possible to choose a group of some of the ints, 
such that the group sums to the given target? This is a classic backtracking recursion problem. 
Once you understand the recursive backtracking strategy in this problem, 
you can use the same pattern for many problems to search a space of choices. 
Rather than looking at the whole array, 
our convention is to consider the part of the array starting at index start and continuing to the end of the array. 
The caller can specify the whole array simply by passing start as 0. 
No loops are needed -- the recursive calls progress down the array. */

class TestCases_GroupSum
{
    // groupSum(0, [2, 4, 8], 10) → true
    // groupSum(0, [2, 4, 8], 14) → true
    // groupSum(0, [2, 4, 8], 9) → false

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "groupSum(0, [2, 4, 8], 10)");
        testcaseMap.put(1, "groupSum(0, [2, 4, 8], 14)");
        testcaseMap.put(2, "groupSum(0, [2, 4, 8], 9)");
    }

    static boolean[] expectedResults = { true, true, false, };
}

public class GroupSum
{
    public static boolean groupSum(int start, int[] nums, int target)
    {
        
    }


    public static void main(String[] args)
    {
        int[] nums0 = { 2, 4, 8 }; 
        int[] nums1 = { 2, 4, 8 }; 
        int[] nums2 = { 2, 4, 8 }; 

        boolean[] resultsArray = {
            groupSum(0, nums0, 10),
            groupSum(0, nums1, 14),
            groupSum(0, nums2, 9),
        };


        TestCases_GroupSum.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_GroupSum.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_GroupSum.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_GroupSum.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
