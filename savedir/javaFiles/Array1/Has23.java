package Array1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p171022

/* Given an int array length 2, return true if it contains a 2 or a 3. */

class TestCases_Has23
{
    // has23([2, 5]) → true
    // has23([4, 3]) → true
    // has23([4, 5]) → false

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "has23([2, 5]) → true");
        testcaseMap.put(1, "has23([4, 3]) → true");
        testcaseMap.put(2, "has23([4, 5]) → false");
    }

    static boolean[] expectedResults = { true, true, false, };
}

public class Has23
{
    public static boolean has23(int[] nums)
    {
        
    }


    public static void main(String[] args)
    {
        int[] nums0 = { 2, 5 }; 
        int[] nums1 = { 4, 3 }; 
        int[] nums2 = { 4, 5 }; 

        boolean[] resultsArray = {
            has23(nums0),
            has23(nums1),
            has23(nums2),
        };


        TestCases_Has23.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_Has23.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_Has23.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_Has23.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
