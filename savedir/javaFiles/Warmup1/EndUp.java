package Warmup1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p125268

/* Given a string, return a new string where the last 3 chars are now in upper case. 
If the string has less than 3 chars, uppercase whatever is there. 
Note that str.toUpperCase() returns the uppercase version of a string. */

class TestCases_EndUp
{
    // endUp("Hello") → "HeLLO"
    // endUp("hi there") → "hi thERE"
    // endUp("hi") → "HI"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "endUp(\"Hello\")");
        testcaseMap.put(1, "endUp(\"hi there\")");
        testcaseMap.put(2, "endUp(\"hi\")");
    }

    static String[] expectedResults = { "HeLLO", "hi thERE", "HI", };
}

public class EndUp
{
    public static String endUp(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            endUp("Hello"),
            endUp("hi there"),
            endUp("hi"),
        };


        TestCases_EndUp.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_EndUp.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_EndUp.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_EndUp.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
