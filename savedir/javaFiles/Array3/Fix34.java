package Array3;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p159339

/* Return an array that contains exactly the same numbers as the given array, but rearranged so that every 3 is immediately followed by a 4.
Do not move the 3's, but every other number may move.
The array contains the same number of 3's and 4's, every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4. */

class TestCases_Fix34
{
    // fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
    // fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
    // fix34([3, 2, 2, 4]) → [3, 4, 2, 2]

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "fix34([1, 3, 1, 4]) → [1, 3, 4, 1]");
        testcaseMap.put(1, "fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]");
        testcaseMap.put(2, "fix34([3, 2, 2, 4]) → [3, 4, 2, 2]");
    }

    static int[][] expectedResults = { {1, 3, 4, 1}, {1, 3, 4, 1, 1, 3, 4}, {3, 4, 2, 2}, };
}

public class Fix34
{
    public static int[] fix34(int[] nums)
    {
        
    }


    public static String printArray(int[] array)
    {
        String result = "[";
        for (int a: array) { result += a+", "; }
        if (result.length() > 2) result = result.substring(0, result.length()-2);
        return result + "]";
    }

    public static void main(String[] args)
    {
        int[] nums0 = { 1, 3, 1, 4 }; 
        int[] nums1 = { 1, 3, 1, 4, 4, 3, 1 }; 
        int[] nums2 = { 3, 2, 2, 4 }; 

        int[][] resultsArray = {
            fix34(nums0),
            fix34(nums1),
            fix34(nums2),
        };


        TestCases_Fix34.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_Fix34.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_Fix34.testcaseMap.get(i));
                System.out.println("    expected: "+printArray(TestCases_Fix34.expectedResults[i]));
                System.out.println("      result: "+printArray(resultsArray[i]));
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
