package Array1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p199519

/* Given an array of ints of even length, 
return a new array length 2 containing the middle two elements from the original array. 
The original array will be length 2 or more. */

class TestCases_MakeMiddle
{
    // makeMiddle([1, 2, 3, 4]) → [2, 3]
    // makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
    // makeMiddle([1, 2]) → [1, 2]

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "makeMiddle([1, 2, 3, 4])");
        testcaseMap.put(1, "makeMiddle([7, 1, 2, 3, 4, 9])");
        testcaseMap.put(2, "makeMiddle([1, 2])");
    }

    static int[][] expectedResults = { {2, 3}, {2, 3}, {1, 2}, };
}

public class MakeMiddle
{
    public static int[] makeMiddle(int[] nums)
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
        int[] nums1 = { 7, 1, 2, 3, 4, 9 }; 
        int[] nums2 = { 1, 2 }; 

        int[][] resultsArray = {
            makeMiddle(nums0),
            makeMiddle(nums1),
            makeMiddle(nums2),
        };


        TestCases_MakeMiddle.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (!resultsArray[i].equals(TestCases_MakeMiddle.expectedResults[i]))
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_MakeMiddle.testcaseMap.get(i));
                System.out.println("    received: "+printArray(resultsArray[i]));
                System.out.println("    expected: "+printArray(TestCases_MakeMiddle.expectedResults[i]));
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
