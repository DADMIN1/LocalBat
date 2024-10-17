package Array1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p190968

/* Given an array of ints, return the sum of the first 2 elements in the array. 
If the array length is less than 2, just sum up the elements that exist, 
returning 0 if the array is length 0. */

class TestCases_Sum2
{
    // sum2([1, 2, 3]) → 3
    // sum2([1, 1]) → 2
    // sum2([1, 1, 1, 1]) → 2

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "sum2([1, 2, 3])");
        testcaseMap.put(1, "sum2([1, 1])");
        testcaseMap.put(2, "sum2([1, 1, 1, 1])");
    }

    static int[] expectedResults = { 3, 2, 2, };
}

public class Sum2
{
    public static int sum2(int[] nums)
    {
        
    }


    public static void main(String[] args)
    {
        int[] nums0 = { 1, 2, 3 }; 
        int[] nums1 = { 1, 1 }; 
        int[] nums2 = { 1, 1, 1, 1 }; 

        int[] resultsArray = {
            sum2(nums0),
            sum2(nums1),
            sum2(nums2),
        };


        TestCases_Sum2.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_Sum2.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_Sum2.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_Sum2.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
