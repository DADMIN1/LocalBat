package Recursion1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p167015

/* Given a string, compute recursively (no loops) the number of "11" substrings in the string.
The "11" substrings should not overlap. */

class TestCases_Count11
{
    // count11("11abc11") → 2
    // count11("abc11x11x11") → 3
    // count11("111") → 1

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "count11(\"11abc11\") → 2");
        testcaseMap.put(1, "count11(\"abc11x11x11\") → 3");
        testcaseMap.put(2, "count11(\"111\") → 1");
    }

    static int[] expectedResults = { 2, 3, 1, };
}

public class Count11
{
    public static int count11(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        int[] resultsArray = {
            count11("11abc11"),
            count11("abc11x11x11"),
            count11("111"),
        };


        TestCases_Count11.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_Count11.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_Count11.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_Count11.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
