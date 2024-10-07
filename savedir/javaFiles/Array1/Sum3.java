package Array1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p175763

/* Given an array of ints length 3, return the sum of all the elements. */

class TestCases_Sum3
{
    // sum3([1, 2, 3]) → 6
    // sum3([5, 11, 2]) → 18
    // sum3([7, 0, 0]) → 7

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "sum3([1, 2, 3]) → 6");
        testcaseMap.put(1, "sum3([5, 11, 2]) → 18");
        testcaseMap.put(2, "sum3([7, 0, 0]) → 7");
    }

    static int[] expectedResults = { 6, 18, 7, };
}

public class Sum3
{
    public static int sum3(int[] nums)
    {
        
    }


    public static void main(String[] args)
    {
        int[] nums0 = { 1, 2, 3 }; 
        int[] nums1 = { 5, 11, 2 }; 
        int[] nums2 = { 7, 0, 0 }; 

        int[] resultsArray = {
            sum3(nums0),
            sum3(nums1),
            sum3(nums2),
        };


        TestCases_Sum3.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_Sum3.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_Sum3.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_Sum3.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
