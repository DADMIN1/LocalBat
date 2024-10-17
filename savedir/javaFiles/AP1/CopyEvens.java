package AP1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p134174

/* Given an array of positive ints, 
return a new array of length "count" containing the first even numbers from the original array. 
The original array will contain at least "count" even numbers. */

class TestCases_CopyEvens
{
    // copyEvens([3, 2, 4, 5, 8], 2) → [2, 4]
    // copyEvens([3, 2, 4, 5, 8], 3) → [2, 4, 8]
    // copyEvens([6, 1, 2, 4, 5, 8], 3) → [6, 2, 4]

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "copyEvens([3, 2, 4, 5, 8], 2)");
        testcaseMap.put(1, "copyEvens([3, 2, 4, 5, 8], 3)");
        testcaseMap.put(2, "copyEvens([6, 1, 2, 4, 5, 8], 3)");
    }

    static int[][] expectedResults = { {2, 4}, {2, 4, 8}, {6, 2, 4}, };
}

public class CopyEvens
{
    public static int[] copyEvens(int[] nums, int count)
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
        int[] nums0 = { 3, 2, 4, 5, 8 }; 
        int[] nums1 = { 3, 2, 4, 5, 8 }; 
        int[] nums2 = { 6, 1, 2, 4, 5, 8 }; 

        int[][] resultsArray = {
            copyEvens(nums0, 2),
            copyEvens(nums1, 3),
            copyEvens(nums2, 3),
        };


        TestCases_CopyEvens.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (!resultsArray[i].equals(TestCases_CopyEvens.expectedResults[i]))
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_CopyEvens.testcaseMap.get(i));
                System.out.println("    received: "+printArray(resultsArray[i]));
                System.out.println("    expected: "+printArray(TestCases_CopyEvens.expectedResults[i]));
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
