package Warmup2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p142270

/* Given a string and a non-negative int n, return a larger string that is n copies of the original string. */

class TestCases_StringTimes
{
    // stringTimes("Hi", 2) → "HiHi"
    // stringTimes("Hi", 3) → "HiHiHi"
    // stringTimes("Hi", 1) → "Hi"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "stringTimes(\"Hi\", 2)");
        testcaseMap.put(1, "stringTimes(\"Hi\", 3)");
        testcaseMap.put(2, "stringTimes(\"Hi\", 1)");
    }

    static String[] expectedResults = { "HiHi", "HiHiHi", "Hi", };
}

public class StringTimes
{
    public static String stringTimes(String str, int n)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            stringTimes("Hi", 2),
            stringTimes("Hi", 3),
            stringTimes("Hi", 1),
        };


        TestCases_StringTimes.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_StringTimes.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_StringTimes.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_StringTimes.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
