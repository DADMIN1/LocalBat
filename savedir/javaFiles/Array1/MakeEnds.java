package Array1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p101230

/* Given an array of ints, 
return a new array length 2 containing the first and last elements from the original array. 
The original array will be length 1 or more. */

class TestCases_MakeEnds
{
    // makeEnds([1, 2, 3]) → [1, 3]
    // makeEnds([1, 2, 3, 4]) → [1, 4]
    // makeEnds([7, 4, 6, 2]) → [7, 2]

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "makeEnds([1, 2, 3])");
        testcaseMap.put(1, "makeEnds([1, 2, 3, 4])");
        testcaseMap.put(2, "makeEnds([7, 4, 6, 2])");
    }

    static int[][] expectedResults = { {1, 3}, {1, 4}, {7, 2}, };
}

public class MakeEnds
{
    public static int[] makeEnds(int[] nums)
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
        int[] nums1 = { 1, 2, 3, 4 }; 
        int[] nums2 = { 7, 4, 6, 2 }; 

        int[][] resultsArray = {
            makeEnds(nums0),
            makeEnds(nums1),
            makeEnds(nums2),
        };


        TestCases_MakeEnds.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (!resultsArray[i].equals(TestCases_MakeEnds.expectedResults[i]))
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_MakeEnds.testcaseMap.get(i));
                System.out.println("    received: "+printArray(resultsArray[i]));
                System.out.println("    expected: "+printArray(TestCases_MakeEnds.expectedResults[i]));
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
