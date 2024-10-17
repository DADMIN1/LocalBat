package Warmup2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p167430

/* Given an array of ints, return true if it contains a 2, 
7, 1 pattern: a value, followed by the value plus 5, followed by the value minus 1. 
Additionally the 271 counts even if the "1" differs by 2 or less from the correct value. */

class TestCases_Has271
{
    // has271([1, 2, 7, 1]) → true
    // has271([1, 2, 8, 1]) → false
    // has271([2, 7, 1]) → true

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "has271([1, 2, 7, 1])");
        testcaseMap.put(1, "has271([1, 2, 8, 1])");
        testcaseMap.put(2, "has271([2, 7, 1])");
    }

    static boolean[] expectedResults = { true, false, true, };
}

public class Has271
{
    public static boolean has271(int[] nums)
    {
        
    }


    public static void main(String[] args)
    {
        int[] nums0 = { 1, 2, 7, 1 }; 
        int[] nums1 = { 1, 2, 8, 1 }; 
        int[] nums2 = { 2, 7, 1 }; 

        boolean[] resultsArray = {
            has271(nums0),
            has271(nums1),
            has271(nums2),
        };


        TestCases_Has271.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_Has271.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_Has271.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_Has271.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
