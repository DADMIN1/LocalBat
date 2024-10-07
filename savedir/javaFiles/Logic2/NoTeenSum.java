package Logic2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p182879

/* Given 3 int values, a b c, return their sum.
However, if any of the values is a teen -- in the range 13..19 inclusive -- then that value counts as 0, except 15 and 16 do not count as a teens.
Write a separate helper "public int fixTeen(int n) {"that takes in an int value and returns that value fixed for the teen rule.
In this way, you avoid repeating the teen code 3 times (i.e.
"decomposition").
Define the helper below and at the same indent level as the main noTeenSum(). */

class TestCases_NoTeenSum
{
    // noTeenSum(1, 2, 3) → 6
    // noTeenSum(2, 13, 1) → 3
    // noTeenSum(2, 1, 14) → 3

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "noTeenSum(1, 2, 3) → 6");
        testcaseMap.put(1, "noTeenSum(2, 13, 1) → 3");
        testcaseMap.put(2, "noTeenSum(2, 1, 14) → 3");
    }

    static int[] expectedResults = { 6, 3, 3, };
}

public class NoTeenSum
{
    public static int noTeenSum(int a, int b, int c)
    {
        
    }


    public static void main(String[] args)
    {
                        
        int[] resultsArray = {
            noTeenSum(1, 2, 3),
            noTeenSum(2, 13, 1),
            noTeenSum(2, 1, 14),
        };


        TestCases_NoTeenSum.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_NoTeenSum.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_NoTeenSum.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_NoTeenSum.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
