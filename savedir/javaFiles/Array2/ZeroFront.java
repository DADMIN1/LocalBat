package Array2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p193753

/* Return an array that contains the exact same numbers as the given array, 
but rearranged so that all the zeros are grouped at the start of the array. 
The order of the non-zero numbers does not matter. So {1, 
0, 0, 1} becomes {0 ,0, 1, 1}. You may modify and return the given array or make a new array. */

class TestCases_ZeroFront
{
    // zeroFront([1, 0, 0, 1]) → [0, 0, 1, 1]
    // zeroFront([0, 1, 1, 0, 1]) → [0, 0, 1, 1, 1]
    // zeroFront([1, 0]) → [0, 1]

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "zeroFront([1, 0, 0, 1])");
        testcaseMap.put(1, "zeroFront([0, 1, 1, 0, 1])");
        testcaseMap.put(2, "zeroFront([1, 0])");
    }

    static int[][] expectedResults = { {0, 0, 1, 1}, {0, 0, 1, 1, 1}, {0, 1}, };
}

public class ZeroFront
{
    public static int[] zeroFront(int[] nums)
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
        int[] nums0 = { 1, 0, 0, 1 }; 
        int[] nums1 = { 0, 1, 1, 0, 1 }; 
        int[] nums2 = { 1, 0 }; 

        int[][] resultsArray = {
            zeroFront(nums0),
            zeroFront(nums1),
            zeroFront(nums2),
        };


        TestCases_ZeroFront.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (!resultsArray[i].equals(TestCases_ZeroFront.expectedResults[i]))
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_ZeroFront.testcaseMap.get(i));
                System.out.println("    received: "+printArray(resultsArray[i]));
                System.out.println("    expected: "+printArray(TestCases_ZeroFront.expectedResults[i]));
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
