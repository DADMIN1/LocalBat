package Array2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p100246

/* Given a non-empty array of ints, 
return a new array containing the elements from the original array that come before the first 4 in the original array. 
The original array will contain at least one 4. Note that it is valid in java to create an array of length 0. */

class TestCases_Pre4
{
    // pre4([1, 2, 4, 1]) → [1, 2]
    // pre4([3, 1, 4]) → [3, 1]
    // pre4([1, 4, 4]) → [1]

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "pre4([1, 2, 4, 1])");
        testcaseMap.put(1, "pre4([3, 1, 4])");
        testcaseMap.put(2, "pre4([1, 4, 4])");
    }

    static int[][] expectedResults = { {1, 2}, {3, 1}, {1}, };
}

public class Pre4
{
    public static int[] pre4(int[] nums)
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
        int[] nums0 = { 1, 2, 4, 1 }; 
        int[] nums1 = { 3, 1, 4 }; 
        int[] nums2 = { 1, 4, 4 }; 

        int[][] resultsArray = {
            pre4(nums0),
            pre4(nums1),
            pre4(nums2),
        };


        TestCases_Pre4.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (!resultsArray[i].equals(TestCases_Pre4.expectedResults[i]))
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_Pre4.testcaseMap.get(i));
                System.out.println("    received: "+printArray(resultsArray[i]));
                System.out.println("    expected: "+printArray(TestCases_Pre4.expectedResults[i]));
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
