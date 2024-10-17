package Warmup1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p178986

/* We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
Given 3 int values, return true if 1 or more of them are teen. */

class TestCases_HasTeen
{
    // hasTeen(13, 20, 10) → true
    // hasTeen(20, 19, 10) → true
    // hasTeen(20, 10, 13) → true

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "hasTeen(13, 20, 10)");
        testcaseMap.put(1, "hasTeen(20, 19, 10)");
        testcaseMap.put(2, "hasTeen(20, 10, 13)");
    }

    static boolean[] expectedResults = { true, true, true, };
}

public class HasTeen
{
    public static boolean hasTeen(int a, int b, int c)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            hasTeen(13, 20, 10),
            hasTeen(20, 19, 10),
            hasTeen(20, 10, 13),
        };


        TestCases_HasTeen.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_HasTeen.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_HasTeen.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_HasTeen.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
