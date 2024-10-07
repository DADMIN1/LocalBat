package Array3;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p189576

/* Consider the leftmost and righmost appearances of some value in an array.
We'll say that the "span" is the number of elements between the two inclusive.
A single value has a span of 1.
Returns the largest span found in the given array.
(Efficiency is not a priority.) */

class TestCases_MaxSpan
{
    // maxSpan([1, 2, 1, 1, 3]) → 4
    // maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
    // maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "maxSpan([1, 2, 1, 1, 3]) → 4");
        testcaseMap.put(1, "maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6");
        testcaseMap.put(2, "maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6");
    }

    static int[] expectedResults = { 4, 6, 6, };
}

public class MaxSpan
{
    public static int maxSpan(int[] nums)
    {
        
    }


    public static void main(String[] args)
    {
        int[] nums0 = { 1, 2, 1, 1, 3 }; 
        int[] nums1 = { 1, 4, 2, 1, 4, 1, 4 }; 
        int[] nums2 = { 1, 4, 2, 1, 4, 4, 4 }; 

        int[] resultsArray = {
            maxSpan(nums0),
            maxSpan(nums1),
            maxSpan(nums2),
        };


        TestCases_MaxSpan.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_MaxSpan.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_MaxSpan.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_MaxSpan.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
