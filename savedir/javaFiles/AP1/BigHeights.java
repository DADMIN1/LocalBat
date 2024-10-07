package AP1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p197710

/* (A variation on the sumHeights problem.) We have an array of heights, representing the altitude along a walking trail.
Given start/end indexes into the array, return the number of "big" steps for a walk starting at the start index and ending at the end index.
We'll say that step is big if it is 5 or more up or down.
The start end end index will both be valid indexes into the array with start <= end. */

class TestCases_BigHeights
{
    // bigHeights([5, 3, 6, 7, 2], 2, 4) → 1
    // bigHeights([5, 3, 6, 7, 2], 0, 1) → 0
    // bigHeights([5, 3, 6, 7, 2], 0, 4) → 1

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "bigHeights([5, 3, 6, 7, 2], 2, 4) → 1");
        testcaseMap.put(1, "bigHeights([5, 3, 6, 7, 2], 0, 1) → 0");
        testcaseMap.put(2, "bigHeights([5, 3, 6, 7, 2], 0, 4) → 1");
    }

    static int[] expectedResults = { 1, 0, 1, };
}

public class BigHeights
{
    public static int bigHeights(int[] heights, int start, int end)
    {
        
    }


    public static void main(String[] args)
    {
        int[] heights0 = { 5, 3, 6, 7, 2 }; 
        int[] heights1 = { 5, 3, 6, 7, 2 }; 
        int[] heights2 = { 5, 3, 6, 7, 2 }; 

        int[] resultsArray = {
            bigHeights(heights0, 2, 4),
            bigHeights(heights1, 0, 1),
            bigHeights(heights2, 0, 4),
        };


        TestCases_BigHeights.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_BigHeights.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_BigHeights.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_BigHeights.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
