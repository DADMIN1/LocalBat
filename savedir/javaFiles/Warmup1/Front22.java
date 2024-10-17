package Warmup1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p183592

/* Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, 
so "kitten" yields"kikittenki". If the string length is less than 2, 
use whatever chars are there. */

class TestCases_Front22
{
    // front22("kitten") → "kikittenki"
    // front22("Ha") → "HaHaHa"
    // front22("abc") → "ababcab"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "front22(\"kitten\")");
        testcaseMap.put(1, "front22(\"Ha\")");
        testcaseMap.put(2, "front22(\"abc\")");
    }

    static String[] expectedResults = { "kikittenki", "HaHaHa", "ababcab", };
}

public class Front22
{
    public static String front22(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            front22("kitten"),
            front22("Ha"),
            front22("abc"),
        };


        TestCases_Front22.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_Front22.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_Front22.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_Front22.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
