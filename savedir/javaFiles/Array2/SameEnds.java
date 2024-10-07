package Array2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p134300

/* Return true if the group of N numbers at the start and end of the array are the same.
For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2, and false for n=1 and n=3.
You may assume that n is in the range 0..nums.length inclusive. */

class TestCases_SameEnds
{
    // sameEnds([5, 6, 45, 99, 13, 5, 6], 1) → false
    // sameEnds([5, 6, 45, 99, 13, 5, 6], 2) → true
    // sameEnds([5, 6, 45, 99, 13, 5, 6], 3) → false

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "sameEnds([5, 6, 45, 99, 13, 5, 6], 1) → false");
        testcaseMap.put(1, "sameEnds([5, 6, 45, 99, 13, 5, 6], 2) → true");
        testcaseMap.put(2, "sameEnds([5, 6, 45, 99, 13, 5, 6], 3) → false");
    }

    static boolean[] expectedResults = { false, true, false, };
}

public class SameEnds
{
    public static boolean sameEnds(int[] nums, int len)
    {
        
    }


    public static void main(String[] args)
    {
        int[] nums0 = { 5, 6, 45, 99, 13, 5, 6 }; 
        int[] nums1 = { 5, 6, 45, 99, 13, 5, 6 }; 
        int[] nums2 = { 5, 6, 45, 99, 13, 5, 6 }; 

        boolean[] resultsArray = {
            sameEnds(nums0, 1),
            sameEnds(nums1, 2),
            sameEnds(nums2, 3),
        };


        TestCases_SameEnds.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_SameEnds.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_SameEnds.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_SameEnds.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
