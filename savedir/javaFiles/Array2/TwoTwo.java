package Array2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p102145

/* Given an array of ints, return true if every 2 that appears in the array is next to another 2. */

class TestCases_TwoTwo
{
    // twoTwo([4, 2, 2, 3]) → true
    // twoTwo([2, 2, 4]) → true
    // twoTwo([2, 2, 4, 2]) → false

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "twoTwo([4, 2, 2, 3]) → true");
        testcaseMap.put(1, "twoTwo([2, 2, 4]) → true");
        testcaseMap.put(2, "twoTwo([2, 2, 4, 2]) → false");
    }

    static boolean[] expectedResults = { true, true, false, };
}

public class TwoTwo
{
    public static boolean twoTwo(int[] nums)
    {
        
    }


    public static void main(String[] args)
    {
        int[] nums0 = { 4, 2, 2, 3 }; 
        int[] nums1 = { 2, 2, 4 }; 
        int[] nums2 = { 2, 2, 4, 2 }; 

        boolean[] resultsArray = {
            twoTwo(nums0),
            twoTwo(nums1),
            twoTwo(nums2),
        };


        TestCases_TwoTwo.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_TwoTwo.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_TwoTwo.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_TwoTwo.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
