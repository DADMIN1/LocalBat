package AP1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p148138

/* We have an array of heights, representing the altitude along a walking trail.
Given start/end indexes into the array, return the sum of the changes for a walk beginning at the start index and ending at the end index.
For example, with the heights {5, 3, 6, 7, 2} and start=2, end=4 yields a sum of 1 + 5 = 6.
The start end end index will both be valid indexes into the array with start <= end. */

class TestCases_SumHeights
{
    // sumHeights([5, 3, 6, 7, 2], 2, 4) → 6
    // sumHeights([5, 3, 6, 7, 2], 0, 1) → 2
    // sumHeights([5, 3, 6, 7, 2], 0, 4) → 11

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "sumHeights([5, 3, 6, 7, 2], 2, 4) → 6");
        testcaseMap.put(1, "sumHeights([5, 3, 6, 7, 2], 0, 1) → 2");
        testcaseMap.put(2, "sumHeights([5, 3, 6, 7, 2], 0, 4) → 11");
    }

    static int[] expectedResults = { 6, 2, 11, };
}

public class SumHeights
{
    public static int sumHeights(int[] heights, int start, int end)
    {
        
    }


    public static void main(String[] args)
    {
        int[] heights0 = { 5, 3, 6, 7, 2 }; 
        int[] heights1 = { 5, 3, 6, 7, 2 }; 
        int[] heights2 = { 5, 3, 6, 7, 2 }; 

        int[] resultsArray = {
            sumHeights(heights0, 2, 4),
            sumHeights(heights1, 0, 1),
            sumHeights(heights2, 0, 4),
        };


        TestCases_SumHeights.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_SumHeights.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_SumHeights.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_SumHeights.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
