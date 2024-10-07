package String1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p139075

/* Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx".
The string may be any length, including 0.
Note: use .equals() to compare 2 strings. */

class TestCases_HasBad
{
    // hasBad("badxx") → true
    // hasBad("xbadxx") → true
    // hasBad("xxbadxx") → false

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "hasBad(\"badxx\") → true");
        testcaseMap.put(1, "hasBad(\"xbadxx\") → true");
        testcaseMap.put(2, "hasBad(\"xxbadxx\") → false");
    }

    static boolean[] expectedResults = { true, true, false, };
}

public class HasBad
{
    public static boolean hasBad(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            hasBad("badxx"),
            hasBad("xbadxx"),
            hasBad("xxbadxx"),
        };


        TestCases_HasBad.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_HasBad.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_HasBad.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_HasBad.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
