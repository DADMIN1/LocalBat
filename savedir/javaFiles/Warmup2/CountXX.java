package Warmup2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p194667

/* Count the number of "xx" in the given string.
We'll say that overlapping is allowed, so "xxx" contains 2 "xx". */

class TestCases_CountXX
{
    // countXX("abcxx") → 1
    // countXX("xxx") → 2
    // countXX("xxxx") → 3

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "countXX(\"abcxx\") → 1");
        testcaseMap.put(1, "countXX(\"xxx\") → 2");
        testcaseMap.put(2, "countXX(\"xxxx\") → 3");
    }

    static int[] expectedResults = { 1, 2, 3, };
}

public class CountXX
{
    int countXX(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        int[] resultsArray = {
            countXX("abcxx"),
            countXX("xxx"),
            countXX("xxxx"),
        };


        TestCases_CountXX.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_CountXX.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_CountXX.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_CountXX.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
