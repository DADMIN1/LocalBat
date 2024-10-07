package Warmup1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p187868

/* The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
We sleep in if it is not a weekday or we're on vacation.
Return true if we sleep in. */

class TestCases_SleepIn
{
    // sleepIn(false, false) → true
    // sleepIn(true, false) → false
    // sleepIn(false, true) → true

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "sleepIn(false, false) → true");
        testcaseMap.put(1, "sleepIn(true, false) → false");
        testcaseMap.put(2, "sleepIn(false, true) → true");
    }

    static boolean[] expectedResults = { true, false, true, };
}

public class SleepIn
{
    public static boolean sleepIn(boolean weekday, boolean vacation)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            sleepIn(false, false),
            sleepIn(true, false),
            sleepIn(false, true),
        };


        TestCases_SleepIn.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_SleepIn.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_SleepIn.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_SleepIn.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
