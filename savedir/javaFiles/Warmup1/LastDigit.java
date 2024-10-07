package Warmup1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p125339

/* Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57.
Note that the % "mod" operator computes remainders, so 17 % 10 is 7. */

class TestCases_LastDigit
{
    // lastDigit(7, 17) → true
    // lastDigit(6, 17) → false
    // lastDigit(3, 113) → true

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "lastDigit(7, 17) → true");
        testcaseMap.put(1, "lastDigit(6, 17) → false");
        testcaseMap.put(2, "lastDigit(3, 113) → true");
    }

    static boolean[] expectedResults = { true, false, true, };
}

public class LastDigit
{
    public static boolean lastDigit(int a, int b)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            lastDigit(7, 17),
            lastDigit(6, 17),
            lastDigit(3, 113),
        };


        TestCases_LastDigit.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_LastDigit.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_LastDigit.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_LastDigit.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
