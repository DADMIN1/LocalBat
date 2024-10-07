package Array2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p168357

/* Given an array of ints, return true if the array contains two 7's next to each other, or there are two 7's separated by one element, such as with {7, 1, 7}. */

class TestCases_Has77
{
    // has77([1, 7, 7]) → true
    // has77([1, 7, 1, 7]) → true
    // has77([1, 7, 1, 1, 7]) → false

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "has77([1, 7, 7]) → true");
        testcaseMap.put(1, "has77([1, 7, 1, 7]) → true");
        testcaseMap.put(2, "has77([1, 7, 1, 1, 7]) → false");
    }

    static boolean[] expectedResults = { true, true, false, };
}

public class Has77
{
    public static boolean has77(int[] nums)
    {
        
    }


    public static void main(String[] args)
    {
        int[] nums0 = { 1, 7, 7 }; 
        int[] nums1 = { 1, 7, 1, 7 }; 
        int[] nums2 = { 1, 7, 1, 1, 7 }; 

        boolean[] resultsArray = {
            has77(nums0),
            has77(nums1),
            has77(nums2),
        };


        TestCases_Has77.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_Has77.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_Has77.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_Has77.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
