package Warmup1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p161642

/* Given a string, take the last char and return a new string with the last char added at the front and back, 
so "cat" yields "tcatt". The original string will be length 1 or more. */

class TestCases_BackAround
{
    // backAround("cat") → "tcatt"
    // backAround("Hello") → "oHelloo"
    // backAround("a") → "aaa"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "backAround(\"cat\")");
        testcaseMap.put(1, "backAround(\"Hello\")");
        testcaseMap.put(2, "backAround(\"a\")");
    }

    static String[] expectedResults = { "tcatt", "oHelloo", "aaa", };
}

public class BackAround
{
    public static String backAround(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            backAround("cat"),
            backAround("Hello"),
            backAround("a"),
        };


        TestCases_BackAround.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_BackAround.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_BackAround.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_BackAround.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
