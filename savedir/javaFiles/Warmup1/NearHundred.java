package Warmup1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p184004

/* Given an int n, return true if it is within 10 of 100 or 200. 
Note: Math.abs(num) computes the absolute value of a number. */

class TestCases_NearHundred
{
    // nearHundred(93) → true
    // nearHundred(90) → true
    // nearHundred(89) → false

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "nearHundred(93)");
        testcaseMap.put(1, "nearHundred(90)");
        testcaseMap.put(2, "nearHundred(89)");
    }

    static boolean[] expectedResults = { true, true, false, };
}

public class NearHundred
{
    public static boolean nearHundred(int n)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            nearHundred(93),
            nearHundred(90),
            nearHundred(89),
        };


        TestCases_NearHundred.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_NearHundred.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_NearHundred.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_NearHundred.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
