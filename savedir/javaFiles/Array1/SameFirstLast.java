package Array1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p118976

/* Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal. */

class TestCases_SameFirstLast
{
    // sameFirstLast([1, 2, 3]) → false
    // sameFirstLast([1, 2, 3, 1]) → true
    // sameFirstLast([1, 2, 1]) → true

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "sameFirstLast([1, 2, 3]) → false");
        testcaseMap.put(1, "sameFirstLast([1, 2, 3, 1]) → true");
        testcaseMap.put(2, "sameFirstLast([1, 2, 1]) → true");
    }

    static boolean[] expectedResults = { false, true, true, };
}

public class SameFirstLast
{
    public static boolean sameFirstLast(int[] nums)
    {
        
    }


    public static void main(String[] args)
    {
        int[] nums0 = { 1, 2, 3 }; 
        int[] nums1 = { 1, 2, 3, 1 }; 
        int[] nums2 = { 1, 2, 1 }; 

        boolean[] resultsArray = {
            sameFirstLast(nums0),
            sameFirstLast(nums1),
            sameFirstLast(nums2),
        };


        TestCases_SameFirstLast.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_SameFirstLast.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_SameFirstLast.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_SameFirstLast.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
