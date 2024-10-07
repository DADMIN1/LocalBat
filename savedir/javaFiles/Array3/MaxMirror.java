package Array3;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p196409

/* We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array, the same group appears in reverse order.
For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part).
Return the size of the largest mirror section found in the given array. */

class TestCases_MaxMirror
{
    // maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) → 3
    // maxMirror([1, 2, 1, 4]) → 3
    // maxMirror([7, 1, 2, 9, 7, 2, 1]) → 2

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) → 3");
        testcaseMap.put(1, "maxMirror([1, 2, 1, 4]) → 3");
        testcaseMap.put(2, "maxMirror([7, 1, 2, 9, 7, 2, 1]) → 2");
    }

    static int[] expectedResults = { 3, 3, 2, };
}

public class MaxMirror
{
    public static int maxMirror(int[] nums)
    {
        
    }


    public static void main(String[] args)
    {
        int[] nums0 = { 1, 2, 3, 8, 9, 3, 2, 1 }; 
        int[] nums1 = { 1, 2, 1, 4 }; 
        int[] nums2 = { 7, 1, 2, 9, 7, 2, 1 }; 

        int[] resultsArray = {
            maxMirror(nums0),
            maxMirror(nums1),
            maxMirror(nums2),
        };


        TestCases_MaxMirror.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_MaxMirror.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_MaxMirror.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_MaxMirror.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
