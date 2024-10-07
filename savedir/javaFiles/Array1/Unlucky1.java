package Array1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p197308

/* We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array. */

class TestCases_Unlucky1
{
    // unlucky1([1, 3, 4, 5]) → true
    // unlucky1([2, 1, 3, 4, 5]) → true
    // unlucky1([1, 1, 1]) → false

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "unlucky1([1, 3, 4, 5]) → true");
        testcaseMap.put(1, "unlucky1([2, 1, 3, 4, 5]) → true");
        testcaseMap.put(2, "unlucky1([1, 1, 1]) → false");
    }

    static boolean[] expectedResults = { true, true, false, };
}

public class Unlucky1
{
    public static boolean unlucky1(int[] nums)
    {
        
    }


    public static void main(String[] args)
    {
        int[] nums0 = { 1, 3, 4, 5 }; 
        int[] nums1 = { 2, 1, 3, 4, 5 }; 
        int[] nums2 = { 1, 1, 1 }; 

        boolean[] resultsArray = {
            unlucky1(nums0),
            unlucky1(nums1),
            unlucky1(nums2),
        };


        TestCases_Unlucky1.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_Unlucky1.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_Unlucky1.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_Unlucky1.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
