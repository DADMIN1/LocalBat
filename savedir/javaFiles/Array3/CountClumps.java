package Array3;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p193817

/* Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value.
Return the number of clumps in the given array. */

class TestCases_CountClumps
{
    // countClumps([1, 2, 2, 3, 4, 4]) → 2
    // countClumps([1, 1, 2, 1, 1]) → 2
    // countClumps([1, 1, 1, 1, 1]) → 1

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "countClumps([1, 2, 2, 3, 4, 4]) → 2");
        testcaseMap.put(1, "countClumps([1, 1, 2, 1, 1]) → 2");
        testcaseMap.put(2, "countClumps([1, 1, 1, 1, 1]) → 1");
    }

    static int[] expectedResults = { 2, 2, 1, };
}

public class CountClumps
{
    public static int countClumps(int[] nums)
    {
        
    }


    public static void main(String[] args)
    {
        int[] nums0 = { 1, 2, 2, 3, 4, 4 }; 
        int[] nums1 = { 1, 1, 2, 1, 1 }; 
        int[] nums2 = { 1, 1, 1, 1, 1 }; 

        int[] resultsArray = {
            countClumps(nums0),
            countClumps(nums1),
            countClumps(nums2),
        };


        TestCases_CountClumps.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_CountClumps.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_CountClumps.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_CountClumps.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
