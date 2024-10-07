package Array2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p191878

/* Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both. */

class TestCases_Either24
{
    // either24([1, 2, 2]) → true
    // either24([4, 4, 1]) → true
    // either24([4, 4, 1, 2, 2]) → false

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "either24([1, 2, 2]) → true");
        testcaseMap.put(1, "either24([4, 4, 1]) → true");
        testcaseMap.put(2, "either24([4, 4, 1, 2, 2]) → false");
    }

    static boolean[] expectedResults = { true, true, false, };
}

public class Either24
{
    public static boolean either24(int[] nums)
    {
        
    }


    public static void main(String[] args)
    {
        int[] nums0 = { 1, 2, 2 }; 
        int[] nums1 = { 4, 4, 1 }; 
        int[] nums2 = { 4, 4, 1, 2, 2 }; 

        boolean[] resultsArray = {
            either24(nums0),
            either24(nums1),
            either24(nums2),
        };


        TestCases_Either24.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_Either24.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_Either24.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_Either24.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
