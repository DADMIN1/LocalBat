package Array2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p137874

/* Return true if the array contains, somewhere, three increasing adjacent numbers like .... 
4, 5, 6, ... or 23, 24, 25. */

class TestCases_TripleUp
{
    // tripleUp([1, 4, 5, 6, 2]) → true
    // tripleUp([1, 2, 3]) → true
    // tripleUp([1, 2, 4]) → false

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "tripleUp([1, 4, 5, 6, 2])");
        testcaseMap.put(1, "tripleUp([1, 2, 3])");
        testcaseMap.put(2, "tripleUp([1, 2, 4])");
    }

    static boolean[] expectedResults = { true, true, false, };
}

public class TripleUp
{
    public static boolean tripleUp(int[] nums)
    {
        
    }


    public static void main(String[] args)
    {
        int[] nums0 = { 1, 4, 5, 6, 2 }; 
        int[] nums1 = { 1, 2, 3 }; 
        int[] nums2 = { 1, 2, 4 }; 

        boolean[] resultsArray = {
            tripleUp(nums0),
            tripleUp(nums1),
            tripleUp(nums2),
        };


        TestCases_TripleUp.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_TripleUp.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_TripleUp.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_TripleUp.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
