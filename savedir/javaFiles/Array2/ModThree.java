package Array2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p159979

/* Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other. */

class TestCases_ModThree
{
    // modThree([2, 1, 3, 5]) → true
    // modThree([2, 1, 2, 5]) → false
    // modThree([2, 4, 2, 5]) → true

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "modThree([2, 1, 3, 5]) → true");
        testcaseMap.put(1, "modThree([2, 1, 2, 5]) → false");
        testcaseMap.put(2, "modThree([2, 4, 2, 5]) → true");
    }

    static boolean[] expectedResults = { true, false, true, };
}

public class ModThree
{
    public static boolean modThree(int[] nums)
    {
        
    }


    public static void main(String[] args)
    {
        int[] nums0 = { 2, 1, 3, 5 }; 
        int[] nums1 = { 2, 1, 2, 5 }; 
        int[] nums2 = { 2, 4, 2, 5 }; 

        boolean[] resultsArray = {
            modThree(nums0),
            modThree(nums1),
            modThree(nums2),
        };


        TestCases_ModThree.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_ModThree.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_ModThree.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_ModThree.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
