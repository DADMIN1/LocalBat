package String1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p137729

/* Given a string of even length, return a string made of the middle two chars, 
so the string "string" yields "ri". The string length will be at least 2. */

class TestCases_MiddleTwo
{
    // middleTwo("string") → "ri"
    // middleTwo("code") → "od"
    // middleTwo("Practice") → "ct"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "middleTwo(\"string\")");
        testcaseMap.put(1, "middleTwo(\"code\")");
        testcaseMap.put(2, "middleTwo(\"Practice\")");
    }

    static String[] expectedResults = { "ri", "od", "ct", };
}

public class MiddleTwo
{
    public static String middleTwo(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            middleTwo("string"),
            middleTwo("code"),
            middleTwo("Practice"),
        };


        TestCases_MiddleTwo.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_MiddleTwo.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_MiddleTwo.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_MiddleTwo.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
