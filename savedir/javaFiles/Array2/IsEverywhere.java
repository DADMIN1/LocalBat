package Array2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p110222

/* We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array, at least one of the pair is that value.
Return true if the given value is everywhere in the array. */

class TestCases_IsEverywhere
{
    // isEverywhere([1, 2, 1, 3], 1) → true
    // isEverywhere([1, 2, 1, 3], 2) → false
    // isEverywhere([1, 2, 1, 3, 4], 1) → false

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "isEverywhere([1, 2, 1, 3], 1) → true");
        testcaseMap.put(1, "isEverywhere([1, 2, 1, 3], 2) → false");
        testcaseMap.put(2, "isEverywhere([1, 2, 1, 3, 4], 1) → false");
    }

    static boolean[] expectedResults = { true, false, false, };
}

public class IsEverywhere
{
    public static boolean isEverywhere(int[] nums, int val)
    {
        
    }


    public static void main(String[] args)
    {
        int[] nums0 = { 1, 2, 1, 3 }; 
        int[] nums1 = { 1, 2, 1, 3 }; 
        int[] nums2 = { 1, 2, 1, 3, 4 }; 

        boolean[] resultsArray = {
            isEverywhere(nums0, 1),
            isEverywhere(nums1, 2),
            isEverywhere(nums2, 1),
        };


        TestCases_IsEverywhere.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_IsEverywhere.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_IsEverywhere.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_IsEverywhere.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
