package Array2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p169260

/* Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array. */

class TestCases_Has12
{
    // has12([1, 3, 2]) → true
    // has12([3, 1, 2]) → true
    // has12([3, 1, 4, 5, 2]) → true

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "has12([1, 3, 2]) → true");
        testcaseMap.put(1, "has12([3, 1, 2]) → true");
        testcaseMap.put(2, "has12([3, 1, 4, 5, 2]) → true");
    }

    static boolean[] expectedResults = { true, true, true, };
}

public class Has12
{
    public static boolean has12(int[] nums)
    {
        
    }


    public static void main(String[] args)
    {
        int[] nums0 = { 1, 3, 2 }; 
        int[] nums1 = { 3, 1, 2 }; 
        int[] nums2 = { 3, 1, 4, 5, 2 }; 

        boolean[] resultsArray = {
            has12(nums0),
            has12(nums1),
            has12(nums2),
        };


        TestCases_Has12.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_Has12.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_Has12.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_Has12.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
