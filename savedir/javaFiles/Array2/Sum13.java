package Array2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p127384

/* Return the sum of the numbers in the array, returning 0 for an empty array. 
Except the number 13 is very unlucky, 
so it does not count and numbers that come immediately after a 13 also do not count. */

class TestCases_Sum13
{
    // sum13([1, 2, 2, 1]) → 6
    // sum13([1, 1]) → 2
    // sum13([1, 2, 2, 1, 13]) → 6

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "sum13([1, 2, 2, 1])");
        testcaseMap.put(1, "sum13([1, 1])");
        testcaseMap.put(2, "sum13([1, 2, 2, 1, 13])");
    }

    static int[] expectedResults = { 6, 2, 6, };
}

public class Sum13
{
    public static int sum13(int[] nums)
    {
        
    }


    public static void main(String[] args)
    {
        int[] nums0 = { 1, 2, 2, 1 }; 
        int[] nums1 = { 1, 1 }; 
        int[] nums2 = { 1, 2, 2, 1, 13 }; 

        int[] resultsArray = {
            sum13(nums0),
            sum13(nums1),
            sum13(nums2),
        };


        TestCases_Sum13.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_Sum13.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_Sum13.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_Sum13.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
