package Warmup1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p182873

/* Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10. */

class TestCases_Makes10
{
    // makes10(9, 10) → true
    // makes10(9, 9) → false
    // makes10(1, 9) → true

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "makes10(9, 10) → true");
        testcaseMap.put(1, "makes10(9, 9) → false");
        testcaseMap.put(2, "makes10(1, 9) → true");
    }

    static boolean[] expectedResults = { true, false, true, };
}

public class Makes10
{
    public static boolean makes10(int a, int b)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            makes10(9, 10),
            makes10(9, 9),
            makes10(1, 9),
        };


        TestCases_Makes10.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_Makes10.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_Makes10.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_Makes10.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
