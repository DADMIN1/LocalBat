package Array2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p105031

/* Return an array that is "left shifted" by one -- so {6, 
2, 5, 3} returns {2, 5, 3, 6}. You may modify and return the given array, 
or return a new array. */

class TestCases_ShiftLeft
{
    // shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
    // shiftLeft([1, 2]) → [2, 1]
    // shiftLeft([1]) → [1]

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "shiftLeft([6, 2, 5, 3])");
        testcaseMap.put(1, "shiftLeft([1, 2])");
        testcaseMap.put(2, "shiftLeft([1])");
    }

    static int[][] expectedResults = { {2, 5, 3, 6}, {2, 1}, {1}, };
}

public class ShiftLeft
{
    public static int[] shiftLeft(int[] nums)
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
        int[] nums0 = { 6, 2, 5, 3 }; 
        int[] nums1 = { 1, 2 }; 
        int[] nums2 = { 1 }; 

        int[][] resultsArray = {
            shiftLeft(nums0),
            shiftLeft(nums1),
            shiftLeft(nums2),
        };


        TestCases_ShiftLeft.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (!resultsArray[i].equals(TestCases_ShiftLeft.expectedResults[i]))
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_ShiftLeft.testcaseMap.get(i));
                System.out.println("    received: "+printArray(resultsArray[i]));
                System.out.println("    expected: "+printArray(TestCases_ShiftLeft.expectedResults[i]));
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
