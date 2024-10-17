package Array1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p120347

/* Given an int array length 3, if there is a 2 in the array immediately followed by a 3, 
set the 3 element to 0. Return the changed array. */

class TestCases_Fix23
{
    // fix23([1, 2, 3]) → [1, 2, 0]
    // fix23([2, 3, 5]) → [2, 0, 5]
    // fix23([1, 2, 1]) → [1, 2, 1]

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "fix23([1, 2, 3])");
        testcaseMap.put(1, "fix23([2, 3, 5])");
        testcaseMap.put(2, "fix23([1, 2, 1])");
    }

    static int[][] expectedResults = { {1, 2, 0}, {2, 0, 5}, {1, 2, 1}, };
}

public class Fix23
{
    public static int[] fix23(int[] nums)
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
        int[] nums1 = { 2, 3, 5 }; 
        int[] nums2 = { 1, 2, 1 }; 

        int[][] resultsArray = {
            fix23(nums0),
            fix23(nums1),
            fix23(nums2),
        };


        TestCases_Fix23.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (!resultsArray[i].equals(TestCases_Fix23.expectedResults[i]))
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_Fix23.testcaseMap.get(i));
                System.out.println("    received: "+printArray(resultsArray[i]));
                System.out.println("    expected: "+printArray(TestCases_Fix23.expectedResults[i]));
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
