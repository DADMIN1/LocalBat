package Array2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p186672

/* Given an array of ints, return true if every element is a 1 or a 4. */

class TestCases_Only14
{
    // only14([1, 4, 1, 4]) → true
    // only14([1, 4, 2, 4]) → false
    // only14([1, 1]) → true

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "only14([1, 4, 1, 4]) → true");
        testcaseMap.put(1, "only14([1, 4, 2, 4]) → false");
        testcaseMap.put(2, "only14([1, 1]) → true");
    }

    static boolean[] expectedResults = { true, false, true, };
}

public class Only14
{
    public static boolean only14(int[] nums)
    {
        
    }


    public static void main(String[] args)
    {
        int[] nums0 = { 1, 4, 1, 4 }; 
        int[] nums1 = { 1, 4, 2, 4 }; 
        int[] nums2 = { 1, 1 }; 

        boolean[] resultsArray = {
            only14(nums0),
            only14(nums1),
            only14(nums2),
        };


        TestCases_Only14.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_Only14.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_Only14.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_Only14.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
