package Warmup1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p191022

/* Given a string, return true if the string starts with "hi" and false otherwise. */

class TestCases_StartHi
{
    // startHi("hi there") → true
    // startHi("hi") → true
    // startHi("hello hi") → false

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "startHi(\"hi there\") → true");
        testcaseMap.put(1, "startHi(\"hi\") → true");
        testcaseMap.put(2, "startHi(\"hello hi\") → false");
    }

    static boolean[] expectedResults = { true, true, false, };
}

public class StartHi
{
    public static boolean startHi(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            startHi("hi there"),
            startHi("hi"),
            startHi("hello hi"),
        };


        TestCases_StartHi.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_StartHi.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_StartHi.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_StartHi.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
