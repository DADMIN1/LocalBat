package Array2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p136254

/* Given arrays nums1 and nums2 of the same length, for every element in nums1, consider the corresponding element in nums2 (at the same index).
Return the count of the number of times that the two elements differ by 2 or less, but are not equal. */

class TestCases_MatchUp
{
    // matchUp([1, 2, 3], [2, 3, 10]) → 2
    // matchUp([1, 2, 3], [2, 3, 5]) → 3
    // matchUp([1, 2, 3], [2, 3, 3]) → 2

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "matchUp([1, 2, 3], [2, 3, 10]) → 2");
        testcaseMap.put(1, "matchUp([1, 2, 3], [2, 3, 5]) → 3");
        testcaseMap.put(2, "matchUp([1, 2, 3], [2, 3, 3]) → 2");
    }

    static int[] expectedResults = { 2, 3, 2, };
}

public class MatchUp
{
    public static int matchUp(int[] nums1, int[] nums2)
    {
        
    }


    public static void main(String[] args)
    {
        int[] nums10 = { 1, 2, 3 }; int[] nums20 = { 2, 3, 10 }; 
        int[] nums11 = { 1, 2, 3 }; int[] nums21 = { 2, 3, 5 }; 
        int[] nums12 = { 1, 2, 3 }; int[] nums22 = { 2, 3, 3 }; 

        int[] resultsArray = {
            matchUp(nums10, nums20),
            matchUp(nums11, nums21),
            matchUp(nums12, nums22),
        };


        TestCases_MatchUp.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_MatchUp.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_MatchUp.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_MatchUp.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
