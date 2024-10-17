package AP1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p130124

/* We'll say that a positive int n is "endy" if it is in the range 0..10 or 90..100 (inclusive). 
Given an array of positive ints, 
return a new array of length "count" containing the first endy numbers from the original array. 
Decompose out a separate isEndy(int n) method to test if a number is endy. 
The original array will contain at least "count" endy numbers. */

class TestCases_CopyEndy
{
    // copyEndy([9, 11, 90, 22, 6], 2) → [9, 90]
    // copyEndy([9, 11, 90, 22, 6], 3) → [9, 90, 6]
    // copyEndy([12, 1, 1, 13, 0, 20], 2) → [1, 1]

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "copyEndy([9, 11, 90, 22, 6], 2)");
        testcaseMap.put(1, "copyEndy([9, 11, 90, 22, 6], 3)");
        testcaseMap.put(2, "copyEndy([12, 1, 1, 13, 0, 20], 2)");
    }

    static int[][] expectedResults = { {9, 90}, {9, 90, 6}, {1, 1}, };
}

public class CopyEndy
{
    public static int[] copyEndy(int[] nums, int count)
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
        int[] nums0 = { 9, 11, 90, 22, 6 }; 
        int[] nums1 = { 9, 11, 90, 22, 6 }; 
        int[] nums2 = { 12, 1, 1, 13, 0, 20 }; 

        int[][] resultsArray = {
            copyEndy(nums0, 2),
            copyEndy(nums1, 3),
            copyEndy(nums2, 2),
        };


        TestCases_CopyEndy.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (!resultsArray[i].equals(TestCases_CopyEndy.expectedResults[i]))
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_CopyEndy.testcaseMap.get(i));
                System.out.println("    received: "+printArray(resultsArray[i]));
                System.out.println("    expected: "+printArray(TestCases_CopyEndy.expectedResults[i]));
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
