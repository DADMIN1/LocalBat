package String1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p161056

/* Given two strings, a and b, 
return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi". */

class TestCases_MakeAbba
{
    // makeAbba("Hi", "Bye") → "HiByeByeHi"
    // makeAbba("Yo", "Alice") → "YoAliceAliceYo"
    // makeAbba("What", "Up") → "WhatUpUpWhat"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "makeAbba(\"Hi\", \"Bye\")");
        testcaseMap.put(1, "makeAbba(\"Yo\", \"Alice\")");
        testcaseMap.put(2, "makeAbba(\"What\", \"Up\")");
    }

    static String[] expectedResults = { "HiByeByeHi", "YoAliceAliceYo", "WhatUpUpWhat", };
}

public class MakeAbba
{
    public static String makeAbba(String a, String b)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            makeAbba("Hi", "Bye"),
            makeAbba("Yo", "Alice"),
            makeAbba("What", "Up"),
        };


        TestCases_MakeAbba.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_MakeAbba.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_MakeAbba.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_MakeAbba.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
