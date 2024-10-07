package Array2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p169506

/* We'll say that an element in an array is "alone" if there are values before and after it, and those values are different from it.
Return a version of the given array where every instance of the given value which is alone is replaced by whichever value to its left or right is larger. */

class TestCases_NotAlone
{
    // notAlone([1, 2, 3], 2) → [1, 3, 3]
    // notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 2]
    // notAlone([3, 4], 3) → [3, 4]

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "notAlone([1, 2, 3], 2) → [1, 3, 3]");
        testcaseMap.put(1, "notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 2]");
        testcaseMap.put(2, "notAlone([3, 4], 3) → [3, 4]");
    }

    static int[][] expectedResults = { {1, 3, 3}, {1, 3, 3, 5, 5, 2}, {3, 4}, };
}

public class NotAlone
{
    public static int[] notAlone(int[] nums, int val)
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
        int[] nums1 = { 1, 2, 3, 2, 5, 2 }; 
        int[] nums2 = { 3, 4 }; 

        int[][] resultsArray = {
            notAlone(nums0, 2),
            notAlone(nums1, 2),
            notAlone(nums2, 3),
        };


        TestCases_NotAlone.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_NotAlone.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_NotAlone.testcaseMap.get(i));
                System.out.println("    expected: "+printArray(TestCases_NotAlone.expectedResults[i]));
                System.out.println("      result: "+printArray(resultsArray[i]));
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
