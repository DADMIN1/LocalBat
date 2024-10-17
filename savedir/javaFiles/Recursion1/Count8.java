package Recursion1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p192383

/* Given a non-negative int n, 
compute recursively (no loops) the count of the occurrences of 8 as a digit, 
except that an 8 with another 8 immediately to its left counts double, 
so 8818 yields 4. Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), 
while divide (/) by 10 removes the rightmost digit (126 / 10 is 12). */

class TestCases_Count8
{
    // count8(8) → 1
    // count8(818) → 2
    // count8(8818) → 4

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "count8(8)");
        testcaseMap.put(1, "count8(818)");
        testcaseMap.put(2, "count8(8818)");
    }

    static int[] expectedResults = { 1, 2, 4, };
}

public class Count8
{
    public static int count8(int n)
    {
        
    }


    public static void main(String[] args)
    {
                        
        int[] resultsArray = {
            count8(8),
            count8(818),
            count8(8818),
        };


        TestCases_Count8.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_Count8.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_Count8.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_Count8.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
