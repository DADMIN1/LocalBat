package Array1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p118044

/* Given an array of ints, swap the first and last elements in the array. 
Return the modified array. The array length will be at least 1. */

class TestCases_SwapEnds
{
    // swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
    // swapEnds([1, 2, 3]) → [3, 2, 1]
    // swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "swapEnds([1, 2, 3, 4])");
        testcaseMap.put(1, "swapEnds([1, 2, 3])");
        testcaseMap.put(2, "swapEnds([8, 6, 7, 9, 5])");
    }

    static int[][] expectedResults = { {4, 2, 3, 1}, {3, 2, 1}, {5, 6, 7, 9, 8}, };
}

public class SwapEnds
{
    public static int[] swapEnds(int[] nums)
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
        int[] nums0 = { 1, 2, 3, 4 }; 
        int[] nums1 = { 1, 2, 3 }; 
        int[] nums2 = { 8, 6, 7, 9, 5 }; 

        int[][] resultsArray = {
            swapEnds(nums0),
            swapEnds(nums1),
            swapEnds(nums2),
        };


        TestCases_SwapEnds.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (!resultsArray[i].equals(TestCases_SwapEnds.expectedResults[i]))
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_SwapEnds.testcaseMap.get(i));
                System.out.println("    received: "+printArray(resultsArray[i]));
                System.out.println("    expected: "+printArray(TestCases_SwapEnds.expectedResults[i]));
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
