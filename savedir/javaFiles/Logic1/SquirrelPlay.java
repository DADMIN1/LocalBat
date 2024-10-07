package Logic1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p141061

/* The squirrels in Palo Alto spend most of the day playing.
In particular, they play if the temperature is between 60 and 90 (inclusive).
Unless it is summer, then the upper limit is 100 instead of 90.
Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise. */

class TestCases_SquirrelPlay
{
    // squirrelPlay(70, false) → true
    // squirrelPlay(95, false) → false
    // squirrelPlay(95, true) → true

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "squirrelPlay(70, false) → true");
        testcaseMap.put(1, "squirrelPlay(95, false) → false");
        testcaseMap.put(2, "squirrelPlay(95, true) → true");
    }

    static boolean[] expectedResults = { true, false, true, };
}

public class SquirrelPlay
{
    public static boolean squirrelPlay(int temp, boolean isSummer)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            squirrelPlay(70, false),
            squirrelPlay(95, false),
            squirrelPlay(95, true),
        };


        TestCases_SquirrelPlay.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_SquirrelPlay.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_SquirrelPlay.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_SquirrelPlay.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
