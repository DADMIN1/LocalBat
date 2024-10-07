package Array1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p191991

/* Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element.
Both arrays will be length 1 or more. */

class TestCases_CommonEnd
{
    // commonEnd([1, 2, 3], [7, 3]) → true
    // commonEnd([1, 2, 3], [7, 3, 2]) → false
    // commonEnd([1, 2, 3], [1, 3]) → true

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "commonEnd([1, 2, 3], [7, 3]) → true");
        testcaseMap.put(1, "commonEnd([1, 2, 3], [7, 3, 2]) → false");
        testcaseMap.put(2, "commonEnd([1, 2, 3], [1, 3]) → true");
    }

    static boolean[] expectedResults = { true, false, true, };
}

public class CommonEnd
{
    public static boolean commonEnd(int[] a, int[] b)
    {
        
    }


    public static void main(String[] args)
    {
        int[] a0 = { 1, 2, 3 }; int[] b0 = { 7, 3 }; 
        int[] a1 = { 1, 2, 3 }; int[] b1 = { 7, 3, 2 }; 
        int[] a2 = { 1, 2, 3 }; int[] b2 = { 1, 3 }; 

        boolean[] resultsArray = {
            commonEnd(a0, b0),
            commonEnd(a1, b1),
            commonEnd(a2, b2),
        };


        TestCases_CommonEnd.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_CommonEnd.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_CommonEnd.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_CommonEnd.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
