package Warmup1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p159227

/* Given 2 int values, return true if one is negative and one is positive. 
Except if the parameter "negative" is true, then return true only if both are negative. */

class TestCases_PosNeg
{
    // posNeg(1, -1, false) → true
    // posNeg(-1, 1, false) → true
    // posNeg(-4, -5, true) → true

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "posNeg(1, -1, false)");
        testcaseMap.put(1, "posNeg(-1, 1, false)");
        testcaseMap.put(2, "posNeg(-4, -5, true)");
    }

    static boolean[] expectedResults = { true, true, true, };
}

public class PosNeg
{
    public static boolean posNeg(int a, int b, boolean negative)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            posNeg(1, -1, false),
            posNeg(-1, 1, false),
            posNeg(-4, -5, true),
        };


        TestCases_PosNeg.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_PosNeg.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_PosNeg.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_PosNeg.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
