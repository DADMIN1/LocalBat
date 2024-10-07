package Recursion1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p163932

/* Given a non-negative int n, return the sum of its digits recursively (no loops).
Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12). */

class TestCases_SumDigits
{
    // sumDigits(126) → 9
    // sumDigits(49) → 13
    // sumDigits(12) → 3

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "sumDigits(126) → 9");
        testcaseMap.put(1, "sumDigits(49) → 13");
        testcaseMap.put(2, "sumDigits(12) → 3");
    }

    static int[] expectedResults = { 9, 13, 3, };
}

public class SumDigits
{
    public static int sumDigits(int n)
    {
        
    }


    public static void main(String[] args)
    {
                        
        int[] resultsArray = {
            sumDigits(126),
            sumDigits(49),
            sumDigits(12),
        };


        TestCases_SumDigits.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_SumDigits.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_SumDigits.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_SumDigits.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
