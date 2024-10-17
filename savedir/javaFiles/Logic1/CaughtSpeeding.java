package Logic1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p157733

/* You are driving a little too fast, and a police officer stops you. 
Write code to compute the result, encoded as an int value: 
0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, 
the result is 0. If speed is between 61 and 80 inclusive, 
the result is 1. If speed is 81 or more, the result is 2. 
Unless it is your birthday -- on that day, your speed can be 5 higher in all cases. */

class TestCases_CaughtSpeeding
{
    // caughtSpeeding(60, false) → 0
    // caughtSpeeding(65, false) → 1
    // caughtSpeeding(65, true) → 0

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "caughtSpeeding(60, false)");
        testcaseMap.put(1, "caughtSpeeding(65, false)");
        testcaseMap.put(2, "caughtSpeeding(65, true)");
    }

    static int[] expectedResults = { 0, 1, 0, };
}

public class CaughtSpeeding
{
    public static int caughtSpeeding(int speed, boolean isBirthday)
    {
        
    }


    public static void main(String[] args)
    {
                        
        int[] resultsArray = {
            caughtSpeeding(60, false),
            caughtSpeeding(65, false),
            caughtSpeeding(65, true),
        };


        TestCases_CaughtSpeeding.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_CaughtSpeeding.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_CaughtSpeeding.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_CaughtSpeeding.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
