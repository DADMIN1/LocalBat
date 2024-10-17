package Array3;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p134022

/* Given two arrays of ints sorted in increasing order, outer and inner, 
return true if all of the numbers in inner appear in outer. 
The best solution makes only a single "linear" pass of both arrays, 
taking advantage of the fact that both arrays are already in sorted order. */

class TestCases_LinearIn
{
    // linearIn([1, 2, 4, 6], [2, 4]) → true
    // linearIn([1, 2, 4, 6], [2, 3, 4]) → false
    // linearIn([1, 2, 4, 4, 6], [2, 4]) → true

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "linearIn([1, 2, 4, 6], [2, 4])");
        testcaseMap.put(1, "linearIn([1, 2, 4, 6], [2, 3, 4])");
        testcaseMap.put(2, "linearIn([1, 2, 4, 4, 6], [2, 4])");
    }

    static boolean[] expectedResults = { true, false, true, };
}

public class LinearIn
{
    public static boolean linearIn(int[] outer, int[] inner)
    {
        
    }


    public static void main(String[] args)
    {
        int[] outer0 = { 1, 2, 4, 6 }; int[] inner0 = { 2, 4 }; 
        int[] outer1 = { 1, 2, 4, 6 }; int[] inner1 = { 2, 3, 4 }; 
        int[] outer2 = { 1, 2, 4, 4, 6 }; int[] inner2 = { 2, 4 }; 

        boolean[] resultsArray = {
            linearIn(outer0, inner0),
            linearIn(outer1, inner1),
            linearIn(outer2, inner2),
        };


        TestCases_LinearIn.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_LinearIn.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_LinearIn.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_LinearIn.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
