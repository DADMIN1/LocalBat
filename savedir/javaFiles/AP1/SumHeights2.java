package AP1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p157900

/* (A variation on the sumHeights problem.) We have an array of heights, 
representing the altitude along a walking trail. Given start/end indexes into the array, 
return the sum of the changes for a walk beginning at the start index and ending at the end index, 
however increases in height count double. For example, with the heights {5, 
3, 6, 7, 2} and start=2, end=4 yields a sum of 1*2 + 5 = 7. 
The start end end index will both be valid indexes into the array with start <= end. */

class TestCases_SumHeights2
{
    // sumHeights2([5, 3, 6, 7, 2], 2, 4) → 7
    // sumHeights2([5, 3, 6, 7, 2], 0, 1) → 2
    // sumHeights2([5, 3, 6, 7, 2], 0, 4) → 15

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "sumHeights2([5, 3, 6, 7, 2], 2, 4)");
        testcaseMap.put(1, "sumHeights2([5, 3, 6, 7, 2], 0, 1)");
        testcaseMap.put(2, "sumHeights2([5, 3, 6, 7, 2], 0, 4)");
    }

    static int[] expectedResults = { 7, 2, 15, };
}

public class SumHeights2
{
    public static int sumHeights2(int[] heights, int start, int end)
    {
        
    }


    public static void main(String[] args)
    {
        int[] heights0 = { 5, 3, 6, 7, 2 }; 
        int[] heights1 = { 5, 3, 6, 7, 2 }; 
        int[] heights2 = { 5, 3, 6, 7, 2 }; 

        int[] resultsArray = {
            sumHeights2(heights0, 2, 4),
            sumHeights2(heights1, 0, 1),
            sumHeights2(heights2, 0, 4),
        };


        TestCases_SumHeights2.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_SumHeights2.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_SumHeights2.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_SumHeights2.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
