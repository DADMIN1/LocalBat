package Array1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p185685

/* Given an array of ints, 
return true if 6 appears as either the first or last element in the array. 
The array will be length 1 or more. */

class TestCases_FirstLast6
{
    // firstLast6([1, 2, 6]) → true
    // firstLast6([6, 1, 2, 3]) → true
    // firstLast6([13, 6, 1, 2, 3]) → false

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "firstLast6([1, 2, 6])");
        testcaseMap.put(1, "firstLast6([6, 1, 2, 3])");
        testcaseMap.put(2, "firstLast6([13, 6, 1, 2, 3])");
    }

    static boolean[] expectedResults = { true, true, false, };
}

public class FirstLast6
{
    public static boolean firstLast6(int[] nums)
    {
        
    }


    public static void main(String[] args)
    {
        int[] nums0 = { 1, 2, 6 }; 
        int[] nums1 = { 6, 1, 2, 3 }; 
        int[] nums2 = { 13, 6, 1, 2, 3 }; 

        boolean[] resultsArray = {
            firstLast6(nums0),
            firstLast6(nums1),
            firstLast6(nums2),
        };


        TestCases_FirstLast6.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_FirstLast6.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_FirstLast6.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_FirstLast6.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
