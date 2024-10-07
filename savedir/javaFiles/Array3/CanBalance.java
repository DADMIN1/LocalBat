package Array3;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p158767

/* Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side. */

class TestCases_CanBalance
{
    // canBalance([1, 1, 1, 2, 1]) → true
    // canBalance([2, 1, 1, 2, 1]) → false
    // canBalance([10, 10]) → true

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "canBalance([1, 1, 1, 2, 1]) → true");
        testcaseMap.put(1, "canBalance([2, 1, 1, 2, 1]) → false");
        testcaseMap.put(2, "canBalance([10, 10]) → true");
    }

    static boolean[] expectedResults = { true, false, true, };
}

public class CanBalance
{
    public static boolean canBalance(int[] nums)
    {
        
    }


    public static void main(String[] args)
    {
        int[] nums0 = { 1, 1, 1, 2, 1 }; 
        int[] nums1 = { 2, 1, 1, 2, 1 }; 
        int[] nums2 = { 10, 10 }; 

        boolean[] resultsArray = {
            canBalance(nums0),
            canBalance(nums1),
            canBalance(nums2),
        };


        TestCases_CanBalance.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_CanBalance.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_CanBalance.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_CanBalance.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
