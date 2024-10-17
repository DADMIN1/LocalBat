package Array2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p109783

/* Given an array of ints, return true if the value 3 appears in the array exactly 3 times, 
and no 3's are next to each other. */

class TestCases_HaveThree
{
    // haveThree([3, 1, 3, 1, 3]) → true
    // haveThree([3, 1, 3, 3]) → false
    // haveThree([3, 4, 3, 3, 4]) → false

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "haveThree([3, 1, 3, 1, 3])");
        testcaseMap.put(1, "haveThree([3, 1, 3, 3])");
        testcaseMap.put(2, "haveThree([3, 4, 3, 3, 4])");
    }

    static boolean[] expectedResults = { true, false, false, };
}

public class HaveThree
{
    public static boolean haveThree(int[] nums)
    {
        
    }


    public static void main(String[] args)
    {
        int[] nums0 = { 3, 1, 3, 1, 3 }; 
        int[] nums1 = { 3, 1, 3, 3 }; 
        int[] nums2 = { 3, 4, 3, 3, 4 }; 

        boolean[] resultsArray = {
            haveThree(nums0),
            haveThree(nums1),
            haveThree(nums2),
        };


        TestCases_HaveThree.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_HaveThree.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_HaveThree.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_HaveThree.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
