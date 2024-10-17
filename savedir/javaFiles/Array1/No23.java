package Array1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p175689

/* Given an int array length 2, return true if it does not contain a 2 or 3. */

class TestCases_No23
{
    // no23([4, 5]) → true
    // no23([4, 2]) → false
    // no23([3, 5]) → false

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "no23([4, 5])");
        testcaseMap.put(1, "no23([4, 2])");
        testcaseMap.put(2, "no23([3, 5])");
    }

    static boolean[] expectedResults = { true, false, false, };
}

public class No23
{
    public static boolean no23(int[] nums)
    {
        
    }


    public static void main(String[] args)
    {
        int[] nums0 = { 4, 5 }; 
        int[] nums1 = { 4, 2 }; 
        int[] nums2 = { 3, 5 }; 

        boolean[] resultsArray = {
            no23(nums0),
            no23(nums1),
            no23(nums2),
        };


        TestCases_No23.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_No23.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_No23.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_No23.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
