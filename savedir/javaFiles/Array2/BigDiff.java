package Array2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p196640

/* Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array.
Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values. */

class TestCases_BigDiff
{
    // bigDiff([10, 3, 5, 6]) → 7
    // bigDiff([7, 2, 10, 9]) → 8
    // bigDiff([2, 10, 7, 2]) → 8

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "bigDiff([10, 3, 5, 6]) → 7");
        testcaseMap.put(1, "bigDiff([7, 2, 10, 9]) → 8");
        testcaseMap.put(2, "bigDiff([2, 10, 7, 2]) → 8");
    }

    static int[] expectedResults = { 7, 8, 8, };
}

public class BigDiff
{
    public static int bigDiff(int[] nums)
    {
        
    }


    public static void main(String[] args)
    {
        int[] nums0 = { 10, 3, 5, 6 }; 
        int[] nums1 = { 7, 2, 10, 9 }; 
        int[] nums2 = { 2, 10, 7, 2 }; 

        int[] resultsArray = {
            bigDiff(nums0),
            bigDiff(nums1),
            bigDiff(nums2),
        };


        TestCases_BigDiff.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_BigDiff.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_BigDiff.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_BigDiff.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
