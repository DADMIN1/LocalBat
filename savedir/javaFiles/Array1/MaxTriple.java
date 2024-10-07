package Array1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p185176

/* Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest.
The array length will be a least 1. */

class TestCases_MaxTriple
{
    // maxTriple([1, 2, 3]) → 3
    // maxTriple([1, 5, 3]) → 5
    // maxTriple([5, 2, 3]) → 5

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "maxTriple([1, 2, 3]) → 3");
        testcaseMap.put(1, "maxTriple([1, 5, 3]) → 5");
        testcaseMap.put(2, "maxTriple([5, 2, 3]) → 5");
    }

    static int[] expectedResults = { 3, 5, 5, };
}

public class MaxTriple
{
    public static int maxTriple(int[] nums)
    {
        
    }


    public static void main(String[] args)
    {
        int[] nums0 = { 1, 2, 3 }; 
        int[] nums1 = { 1, 5, 3 }; 
        int[] nums2 = { 5, 2, 3 }; 

        int[] resultsArray = {
            maxTriple(nums0),
            maxTriple(nums1),
            maxTriple(nums2),
        };


        TestCases_MaxTriple.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_MaxTriple.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_MaxTriple.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_MaxTriple.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
