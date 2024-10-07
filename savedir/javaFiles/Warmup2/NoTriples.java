package Warmup2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p170221

/* Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array.
Return true if the array does not contain any triples. */

class TestCases_NoTriples
{
    // noTriples([1, 1, 2, 2, 1]) → true
    // noTriples([1, 1, 2, 2, 2, 1]) → false
    // noTriples([1, 1, 1, 2, 2, 2, 1]) → false

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "noTriples([1, 1, 2, 2, 1]) → true");
        testcaseMap.put(1, "noTriples([1, 1, 2, 2, 2, 1]) → false");
        testcaseMap.put(2, "noTriples([1, 1, 1, 2, 2, 2, 1]) → false");
    }

    static boolean[] expectedResults = { true, false, false, };
}

public class NoTriples
{
    public static boolean noTriples(int[] nums)
    {
        
    }


    public static void main(String[] args)
    {
        int[] nums0 = { 1, 1, 2, 2, 1 }; 
        int[] nums1 = { 1, 1, 2, 2, 2, 1 }; 
        int[] nums2 = { 1, 1, 1, 2, 2, 2, 1 }; 

        boolean[] resultsArray = {
            noTriples(nums0),
            noTriples(nums1),
            noTriples(nums2),
        };


        TestCases_NoTriples.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_NoTriples.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_NoTriples.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_NoTriples.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
