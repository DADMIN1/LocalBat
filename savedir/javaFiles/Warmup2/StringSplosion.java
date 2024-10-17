package Warmup2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p117334

/* Given a non-empty string like "Code" return a string like "CCoCodCode". */

class TestCases_StringSplosion
{
    // stringSplosion("Code") → "CCoCodCode"
    // stringSplosion("abc") → "aababc"
    // stringSplosion("ab") → "aab"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "stringSplosion(\"Code\")");
        testcaseMap.put(1, "stringSplosion(\"abc\")");
        testcaseMap.put(2, "stringSplosion(\"ab\")");
    }

    static String[] expectedResults = { "CCoCodCode", "aababc", "aab", };
}

public class StringSplosion
{
    public static String stringSplosion(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            stringSplosion("Code"),
            stringSplosion("abc"),
            stringSplosion("ab"),
        };


        TestCases_StringSplosion.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_StringSplosion.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_StringSplosion.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_StringSplosion.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
