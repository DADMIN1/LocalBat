package Array2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p199484

/* For each multiple of 10 in the given array, change all the values following it to be that multiple of 10, 
until encountering another multiple of 10. So {2, 10, 3, 
4, 20, 5} yields {2, 10, 10, 10, 20, 20}. */

class TestCases_TenRun
{
    // tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]
    // tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]
    // tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "tenRun([2, 10, 3, 4, 20, 5])");
        testcaseMap.put(1, "tenRun([10, 1, 20, 2])");
        testcaseMap.put(2, "tenRun([10, 1, 9, 20])");
    }

    static int[][] expectedResults = { {2, 10, 10, 10, 20, 20}, {10, 10, 20, 20}, {10, 10, 10, 20}, };
}

public class TenRun
{
    public static int[] tenRun(int[] nums)
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
        int[] nums0 = { 2, 10, 3, 4, 20, 5 }; 
        int[] nums1 = { 10, 1, 20, 2 }; 
        int[] nums2 = { 10, 1, 9, 20 }; 

        int[][] resultsArray = {
            tenRun(nums0),
            tenRun(nums1),
            tenRun(nums2),
        };


        TestCases_TenRun.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (!resultsArray[i].equals(TestCases_TenRun.expectedResults[i]))
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_TenRun.testcaseMap.get(i));
                System.out.println("    received: "+printArray(resultsArray[i]));
                System.out.println("    expected: "+printArray(TestCases_TenRun.expectedResults[i]));
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
