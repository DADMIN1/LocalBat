package Array2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p162010

/* Return the number of even ints in the given array.
Note: the % "mod" operator computes the remainder, e.g.
5 % 2 is 1. */

class TestCases_CountEvens
{
    // countEvens([2, 1, 2, 3, 4]) → 3
    // countEvens([2, 2, 0]) → 3
    // countEvens([1, 3, 5]) → 0

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "countEvens([2, 1, 2, 3, 4]) → 3");
        testcaseMap.put(1, "countEvens([2, 2, 0]) → 3");
        testcaseMap.put(2, "countEvens([1, 3, 5]) → 0");
    }

    static int[] expectedResults = { 3, 3, 0, };
}

public class CountEvens
{
    public static int countEvens(int[] nums)
    {
        
    }


    public static void main(String[] args)
    {
        int[] nums0 = { 2, 1, 2, 3, 4 }; 
        int[] nums1 = { 2, 2, 0 }; 
        int[] nums2 = { 1, 3, 5 }; 

        int[] resultsArray = {
            countEvens(nums0),
            countEvens(nums1),
            countEvens(nums2),
        };


        TestCases_CountEvens.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_CountEvens.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_CountEvens.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_CountEvens.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
