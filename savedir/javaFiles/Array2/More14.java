package Array2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p104627

/* Given an array of ints, return true if the number of 1's is greater than the number of 4's */

class TestCases_More14
{
    // more14([1, 4, 1]) → true
    // more14([1, 4, 1, 4]) → false
    // more14([1, 1]) → true

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "more14([1, 4, 1]) → true");
        testcaseMap.put(1, "more14([1, 4, 1, 4]) → false");
        testcaseMap.put(2, "more14([1, 1]) → true");
    }

    static boolean[] expectedResults = { true, false, true, };
}

public class More14
{
    public static boolean more14(int[] nums)
    {
        
    }


    public static void main(String[] args)
    {
        int[] nums0 = { 1, 4, 1 }; 
        int[] nums1 = { 1, 4, 1, 4 }; 
        int[] nums2 = { 1, 1 }; 

        boolean[] resultsArray = {
            more14(nums0),
            more14(nums1),
            more14(nums2),
        };


        TestCases_More14.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_More14.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_More14.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_More14.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
