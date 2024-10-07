package Array2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p194525

/* Given an array of ints, return true if the array contains no 1's and no 3's. */

class TestCases_Lucky13
{
    // lucky13([0, 2, 4]) → true
    // lucky13([1, 2, 3]) → false
    // lucky13([1, 2, 4]) → false

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "lucky13([0, 2, 4]) → true");
        testcaseMap.put(1, "lucky13([1, 2, 3]) → false");
        testcaseMap.put(2, "lucky13([1, 2, 4]) → false");
    }

    static boolean[] expectedResults = { true, false, false, };
}

public class Lucky13
{
    public static boolean lucky13(int[] nums)
    {
        
    }


    public static void main(String[] args)
    {
        int[] nums0 = { 0, 2, 4 }; 
        int[] nums1 = { 1, 2, 3 }; 
        int[] nums2 = { 1, 2, 4 }; 

        boolean[] resultsArray = {
            lucky13(nums0),
            lucky13(nums1),
            lucky13(nums2),
        };


        TestCases_Lucky13.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_Lucky13.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_Lucky13.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_Lucky13.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
