package Array2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p111327

/* Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7).
Return 0 for no numbers. */

class TestCases_Sum67
{
    // sum67([1, 2, 2]) → 5
    // sum67([1, 2, 2, 6, 99, 99, 7]) → 5
    // sum67([1, 1, 6, 7, 2]) → 4

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "sum67([1, 2, 2]) → 5");
        testcaseMap.put(1, "sum67([1, 2, 2, 6, 99, 99, 7]) → 5");
        testcaseMap.put(2, "sum67([1, 1, 6, 7, 2]) → 4");
    }

    static int[] expectedResults = { 5, 5, 4, };
}

public class Sum67
{
    public static int sum67(int[] nums)
    {
        
    }


    public static void main(String[] args)
    {
        int[] nums0 = { 1, 2, 2 }; 
        int[] nums1 = { 1, 2, 2, 6, 99, 99, 7 }; 
        int[] nums2 = { 1, 1, 6, 7, 2 }; 

        int[] resultsArray = {
            sum67(nums0),
            sum67(nums1),
            sum67(nums2),
        };


        TestCases_Sum67.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_Sum67.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_Sum67.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_Sum67.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
