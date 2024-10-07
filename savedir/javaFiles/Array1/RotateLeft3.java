package Array1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p185139

/* Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}. */

class TestCases_RotateLeft3
{
    // rotateLeft3([1, 2, 3]) → [2, 3, 1]
    // rotateLeft3([5, 11, 9]) → [11, 9, 5]
    // rotateLeft3([7, 0, 0]) → [0, 0, 7]

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "rotateLeft3([1, 2, 3]) → [2, 3, 1]");
        testcaseMap.put(1, "rotateLeft3([5, 11, 9]) → [11, 9, 5]");
        testcaseMap.put(2, "rotateLeft3([7, 0, 0]) → [0, 0, 7]");
    }

    static int[][] expectedResults = { {2, 3, 1}, {11, 9, 5}, {0, 0, 7}, };
}

public class RotateLeft3
{
    public static int[] rotateLeft3(int[] nums)
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
        int[] nums0 = { 1, 2, 3 }; 
        int[] nums1 = { 5, 11, 9 }; 
        int[] nums2 = { 7, 0, 0 }; 

        int[][] resultsArray = {
            rotateLeft3(nums0),
            rotateLeft3(nums1),
            rotateLeft3(nums2),
        };


        TestCases_RotateLeft3.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_RotateLeft3.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_RotateLeft3.testcaseMap.get(i));
                System.out.println("    expected: "+printArray(TestCases_RotateLeft3.expectedResults[i]));
                System.out.println("      result: "+printArray(resultsArray[i]));
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
