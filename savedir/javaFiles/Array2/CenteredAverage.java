package Array2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p136585

/* Return the "centered" average of an array of ints, which we'll say is the mean average of the values, 
except ignoring the largest and smallest values in the array. 
If there are multiple copies of the smallest value, ignore just one copy, 
and likewise for the largest value. Use int division to produce the final average. 
You may assume that the array is length 3 or more. */

class TestCases_CenteredAverage
{
    // centeredAverage([1, 2, 3, 4, 100]) → 3
    // centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
    // centeredAverage([-10, -4, -2, -4, -2, 0]) → -3

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "centeredAverage([1, 2, 3, 4, 100])");
        testcaseMap.put(1, "centeredAverage([1, 1, 5, 5, 10, 8, 7])");
        testcaseMap.put(2, "centeredAverage([-10, -4, -2, -4, -2, 0])");
    }

    static int[] expectedResults = { 3, 5, -3, };
}

public class CenteredAverage
{
    public static int centeredAverage(int[] nums)
    {
        
    }


    public static void main(String[] args)
    {
        int[] nums0 = { 1, 2, 3, 4, 100 }; 
        int[] nums1 = { 1, 1, 5, 5, 10, 8, 7 }; 
        int[] nums2 = { -10, -4, -2, -4, -2, 0 }; 

        int[] resultsArray = {
            centeredAverage(nums0),
            centeredAverage(nums1),
            centeredAverage(nums2),
        };


        TestCases_CenteredAverage.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_CenteredAverage.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_CenteredAverage.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_CenteredAverage.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
