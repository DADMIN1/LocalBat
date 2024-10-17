package Array1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p146256

/* Given an array of ints length 3, figure out which is larger, 
the first or last element in the array, and set all the other elements to be that value. 
Return the changed array. */

class TestCases_MaxEnd3
{
    // maxEnd3([1, 2, 3]) → [3, 3, 3]
    // maxEnd3([11, 5, 9]) → [11, 11, 11]
    // maxEnd3([2, 11, 3]) → [3, 3, 3]

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "maxEnd3([1, 2, 3])");
        testcaseMap.put(1, "maxEnd3([11, 5, 9])");
        testcaseMap.put(2, "maxEnd3([2, 11, 3])");
    }

    static int[][] expectedResults = { {3, 3, 3}, {11, 11, 11}, {3, 3, 3}, };
}

public class MaxEnd3
{
    public static int[] maxEnd3(int[] nums)
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
        int[] nums1 = { 11, 5, 9 }; 
        int[] nums2 = { 2, 11, 3 }; 

        int[][] resultsArray = {
            maxEnd3(nums0),
            maxEnd3(nums1),
            maxEnd3(nums2),
        };


        TestCases_MaxEnd3.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (!resultsArray[i].equals(TestCases_MaxEnd3.expectedResults[i]))
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_MaxEnd3.testcaseMap.get(i));
                System.out.println("    received: "+printArray(resultsArray[i]));
                System.out.println("    expected: "+printArray(TestCases_MaxEnd3.expectedResults[i]));
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
