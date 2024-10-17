package Array2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p121853

/* Given an array of ints, return true if the array contains a 2 next to a 2 somewhere. */

class TestCases_Has22
{
    // has22([1, 2, 2]) → true
    // has22([1, 2, 1, 2]) → false
    // has22([2, 1, 2]) → false

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "has22([1, 2, 2])");
        testcaseMap.put(1, "has22([1, 2, 1, 2])");
        testcaseMap.put(2, "has22([2, 1, 2])");
    }

    static boolean[] expectedResults = { true, false, false, };
}

public class Has22
{
    public static boolean has22(int[] nums)
    {
        
    }


    public static void main(String[] args)
    {
        int[] nums0 = { 1, 2, 2 }; 
        int[] nums1 = { 1, 2, 1, 2 }; 
        int[] nums2 = { 2, 1, 2 }; 

        boolean[] resultsArray = {
            has22(nums0),
            has22(nums1),
            has22(nums2),
        };


        TestCases_Has22.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_Has22.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_Has22.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_Has22.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
