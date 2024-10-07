package Warmup1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p140449

/* We have a loud talking parrot.
The "hour" parameter is the current hour time in the range 0..23.
We are in trouble if the parrot is talking and the hour is before 7 or after 20.
Return true if we are in trouble. */

class TestCases_ParrotTrouble
{
    // parrotTrouble(true, 6) → true
    // parrotTrouble(true, 7) → false
    // parrotTrouble(false, 6) → false

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "parrotTrouble(true, 6) → true");
        testcaseMap.put(1, "parrotTrouble(true, 7) → false");
        testcaseMap.put(2, "parrotTrouble(false, 6) → false");
    }

    static boolean[] expectedResults = { true, false, false, };
}

public class ParrotTrouble
{
    public static boolean parrotTrouble(boolean talking, int hour)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            parrotTrouble(true, 6),
            parrotTrouble(true, 7),
            parrotTrouble(false, 6),
        };


        TestCases_ParrotTrouble.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_ParrotTrouble.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_ParrotTrouble.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_ParrotTrouble.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
