package Array2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p187050

/* Return a version of the given array where each zero value in the array is replaced by the largest odd value to the right of the zero in the array. 
If there is no odd value to the right of the zero, leave the zero as a zero. */

class TestCases_ZeroMax
{
    // zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
    // zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
    // zeroMax([0, 1, 0]) → [1, 1, 0]

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "zeroMax([0, 5, 0, 3])");
        testcaseMap.put(1, "zeroMax([0, 4, 0, 3])");
        testcaseMap.put(2, "zeroMax([0, 1, 0])");
    }

    static int[][] expectedResults = { {5, 5, 3, 3}, {3, 4, 3, 3}, {1, 1, 0}, };
}

public class ZeroMax
{
    public static int[] zeroMax(int[] nums)
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
        int[] nums0 = { 0, 5, 0, 3 }; 
        int[] nums1 = { 0, 4, 0, 3 }; 
        int[] nums2 = { 0, 1, 0 }; 

        int[][] resultsArray = {
            zeroMax(nums0),
            zeroMax(nums1),
            zeroMax(nums2),
        };


        TestCases_ZeroMax.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (!resultsArray[i].equals(TestCases_ZeroMax.expectedResults[i]))
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_ZeroMax.testcaseMap.get(i));
                System.out.println("    received: "+printArray(resultsArray[i]));
                System.out.println("    expected: "+printArray(TestCases_ZeroMax.expectedResults[i]));
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
