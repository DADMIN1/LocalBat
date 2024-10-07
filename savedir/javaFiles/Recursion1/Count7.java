package Recursion1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p101409

/* Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2.
(no loops).
Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12). */

class TestCases_Count7
{
    // count7(717) → 2
    // count7(7) → 1
    // count7(123) → 0

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "count7(717) → 2");
        testcaseMap.put(1, "count7(7) → 1");
        testcaseMap.put(2, "count7(123) → 0");
    }

    static int[] expectedResults = { 2, 1, 0, };
}

public class Count7
{
    public static int count7(int n)
    {
        
    }


    public static void main(String[] args)
    {
                        
        int[] resultsArray = {
            count7(717),
            count7(7),
            count7(123),
        };


        TestCases_Count7.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_Count7.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_Count7.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_Count7.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
