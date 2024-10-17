package Array2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p105771

/* Return an array that contains the exact same numbers as the given array, 
but rearranged so that all the even numbers come before all the odd numbers. 
Other than that, the numbers can be in any order. You may modify and return the given array, 
or make a new array. */

class TestCases_EvenOdd
{
    // evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
    // evenOdd([3, 3, 2]) → [2, 3, 3]
    // evenOdd([2, 2, 2]) → [2, 2, 2]

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "evenOdd([1, 0, 1, 0, 0, 1, 1])");
        testcaseMap.put(1, "evenOdd([3, 3, 2])");
        testcaseMap.put(2, "evenOdd([2, 2, 2])");
    }

    static int[][] expectedResults = { {0, 0, 0, 1, 1, 1, 1}, {2, 3, 3}, {2, 2, 2}, };
}

public class EvenOdd
{
    public static int[] evenOdd(int[] nums)
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
        int[] nums0 = { 1, 0, 1, 0, 0, 1, 1 }; 
        int[] nums1 = { 3, 3, 2 }; 
        int[] nums2 = { 2, 2, 2 }; 

        int[][] resultsArray = {
            evenOdd(nums0),
            evenOdd(nums1),
            evenOdd(nums2),
        };


        TestCases_EvenOdd.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (!resultsArray[i].equals(TestCases_EvenOdd.expectedResults[i]))
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_EvenOdd.testcaseMap.get(i));
                System.out.println("    received: "+printArray(resultsArray[i]));
                System.out.println("    expected: "+printArray(TestCases_EvenOdd.expectedResults[i]));
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
