package Array2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p136648

/* Given an array of ints, return true if it contains no 1's or it contains no 4's. */

class TestCases_No14
{
    // no14([1, 2, 3]) → true
    // no14([1, 2, 3, 4]) → false
    // no14([2, 3, 4]) → true

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "no14([1, 2, 3]) → true");
        testcaseMap.put(1, "no14([1, 2, 3, 4]) → false");
        testcaseMap.put(2, "no14([2, 3, 4]) → true");
    }

    static boolean[] expectedResults = { true, false, true, };
}

public class No14
{
    public static boolean no14(int[] nums)
    {
        
    }


    public static void main(String[] args)
    {
        int[] nums0 = { 1, 2, 3 }; 
        int[] nums1 = { 1, 2, 3, 4 }; 
        int[] nums2 = { 2, 3, 4 }; 

        boolean[] resultsArray = {
            no14(nums0),
            no14(nums1),
            no14(nums2),
        };


        TestCases_No14.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_No14.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_No14.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_No14.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
