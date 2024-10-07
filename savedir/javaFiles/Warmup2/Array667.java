package Warmup2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p110019

/* Given an array of ints, return the number of times that two 6's are next to each other in the array.
Also count instances where the second "6" is actually a 7. */

class TestCases_Array667
{
    // array667([6, 6, 2]) → 1
    // array667([6, 6, 2, 6]) → 1
    // array667([6, 7, 2, 6]) → 1

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "array667([6, 6, 2]) → 1");
        testcaseMap.put(1, "array667([6, 6, 2, 6]) → 1");
        testcaseMap.put(2, "array667([6, 7, 2, 6]) → 1");
    }

    static int[] expectedResults = { 1, 1, 1, };
}

public class Array667
{
    public static int array667(int[] nums)
    {
        
    }


    public static void main(String[] args)
    {
        int[] nums0 = { 6, 6, 2 }; 
        int[] nums1 = { 6, 6, 2, 6 }; 
        int[] nums2 = { 6, 7, 2, 6 }; 

        int[] resultsArray = {
            array667(nums0),
            array667(nums1),
            array667(nums2),
        };


        TestCases_Array667.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_Array667.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_Array667.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_Array667.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
