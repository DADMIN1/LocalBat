package Recursion1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p154048

/* We'll say that a "pair" in a string is two instances of a char separated by a char. 
So "AxA" the A's make a pair. Pair's can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x. 
Recursively compute the number of pairs in the given string. */

class TestCases_CountPairs
{
    // countPairs("axa") → 1
    // countPairs("axax") → 2
    // countPairs("axbx") → 1

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "countPairs(\"axa\")");
        testcaseMap.put(1, "countPairs(\"axax\")");
        testcaseMap.put(2, "countPairs(\"axbx\")");
    }

    static int[] expectedResults = { 1, 2, 1, };
}

public class CountPairs
{
    public static int countPairs(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        int[] resultsArray = {
            countPairs("axa"),
            countPairs("axax"),
            countPairs("axbx"),
        };


        TestCases_CountPairs.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_CountPairs.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_CountPairs.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_CountPairs.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
