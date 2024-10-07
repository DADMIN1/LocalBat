package Array1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p145365

/* Given an int array, return true if the array contains 2 twice, or 3 twice.
The array will be length 0, 1, or 2. */

class TestCases_Double23
{
    // double23([2, 2]) → true
    // double23([3, 3]) → true
    // double23([2, 3]) → false

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "double23([2, 2]) → true");
        testcaseMap.put(1, "double23([3, 3]) → true");
        testcaseMap.put(2, "double23([2, 3]) → false");
    }

    static boolean[] expectedResults = { true, true, false, };
}

public class Double23
{
    public static boolean double23(int[] nums)
    {
        
    }


    public static void main(String[] args)
    {
        int[] nums0 = { 2, 2 }; 
        int[] nums1 = { 3, 3 }; 
        int[] nums2 = { 2, 3 }; 

        boolean[] resultsArray = {
            double23(nums0),
            double23(nums1),
            double23(nums2),
        };


        TestCases_Double23.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_Double23.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_Double23.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_Double23.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
