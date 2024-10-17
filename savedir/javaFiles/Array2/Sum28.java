package Array2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p199612

/* Given an array of ints, return true if the sum of all the 2's in the array is exactly 8. */

class TestCases_Sum28
{
    // sum28([2, 3, 2, 2, 4, 2]) → true
    // sum28([2, 3, 2, 2, 4, 2, 2]) → false
    // sum28([1, 2, 3, 4]) → false

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "sum28([2, 3, 2, 2, 4, 2])");
        testcaseMap.put(1, "sum28([2, 3, 2, 2, 4, 2, 2])");
        testcaseMap.put(2, "sum28([1, 2, 3, 4])");
    }

    static boolean[] expectedResults = { true, false, false, };
}

public class Sum28
{
    public static boolean sum28(int[] nums)
    {
        
    }


    public static void main(String[] args)
    {
        int[] nums0 = { 2, 3, 2, 2, 4, 2 }; 
        int[] nums1 = { 2, 3, 2, 2, 4, 2, 2 }; 
        int[] nums2 = { 1, 2, 3, 4 }; 

        boolean[] resultsArray = {
            sum28(nums0),
            sum28(nums1),
            sum28(nums2),
        };


        TestCases_Sum28.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_Sum28.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_Sum28.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_Sum28.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
