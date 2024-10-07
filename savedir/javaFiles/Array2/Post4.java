package Array2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p164144

/* Given a non-empty array of ints, return a new array containing the elements from the original array that come after the last 4 in the original array.
The original array will contain at least one 4.
Note that it is valid in java to create an array of length 0. */

class TestCases_Post4
{
    // post4([2, 4, 1, 2]) → [1, 2]
    // post4([4, 1, 4, 2]) → [2]
    // post4([4, 4, 1, 2, 3]) → [1, 2, 3]

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "post4([2, 4, 1, 2]) → [1, 2]");
        testcaseMap.put(1, "post4([4, 1, 4, 2]) → [2]");
        testcaseMap.put(2, "post4([4, 4, 1, 2, 3]) → [1, 2, 3]");
    }

    static int[][] expectedResults = { {1, 2}, {2}, {1, 2, 3}, };
}

public class Post4
{
    public static int[] post4(int[] nums)
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
        int[] nums0 = { 2, 4, 1, 2 }; 
        int[] nums1 = { 4, 1, 4, 2 }; 
        int[] nums2 = { 4, 4, 1, 2, 3 }; 

        int[][] resultsArray = {
            post4(nums0),
            post4(nums1),
            post4(nums2),
        };


        TestCases_Post4.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_Post4.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_Post4.testcaseMap.get(i));
                System.out.println("    expected: "+printArray(TestCases_Post4.expectedResults[i]));
                System.out.println("      result: "+printArray(resultsArray[i]));
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
