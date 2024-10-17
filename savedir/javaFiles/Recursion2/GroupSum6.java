package Recursion2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p199368

/* Given an array of ints, is it possible to choose a group of some of the ints, 
beginning at the start index, such that the group sums to the given target? However, 
with the additional constraint that all 6's must be chosen. 
(No loops needed.) */

class TestCases_GroupSum6
{
    // groupSum6(0, [5, 6, 2], 8) → true
    // groupSum6(0, [5, 6, 2], 9) → false
    // groupSum6(0, [5, 6, 2], 7) → false

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "groupSum6(0, [5, 6, 2], 8)");
        testcaseMap.put(1, "groupSum6(0, [5, 6, 2], 9)");
        testcaseMap.put(2, "groupSum6(0, [5, 6, 2], 7)");
    }

    static boolean[] expectedResults = { true, false, false, };
}

public class GroupSum6
{
    public static boolean groupSum6(int start, int[] nums, int target)
    {
        
    }


    public static void main(String[] args)
    {
        int[] nums0 = { 5, 6, 2 }; 
        int[] nums1 = { 5, 6, 2 }; 
        int[] nums2 = { 5, 6, 2 }; 

        boolean[] resultsArray = {
            groupSum6(0, nums0, 8),
            groupSum6(0, nums1, 9),
            groupSum6(0, nums2, 7),
        };


        TestCases_GroupSum6.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_GroupSum6.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_GroupSum6.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_GroupSum6.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
