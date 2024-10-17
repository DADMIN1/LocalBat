package Warmup1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p123384

/* Given a string, return a new string where the first and last chars have been exchanged. */

class TestCases_FrontBack
{
    // frontBack("code") → "eodc"
    // frontBack("a") → "a"
    // frontBack("ab") → "ba"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "frontBack(\"code\")");
        testcaseMap.put(1, "frontBack(\"a\")");
        testcaseMap.put(2, "frontBack(\"ab\")");
    }

    static String[] expectedResults = { "eodc", "a", "ba", };
}

public class FrontBack
{
    public static String frontBack(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            frontBack("code"),
            frontBack("a"),
            frontBack("ab"),
        };


        TestCases_FrontBack.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_FrontBack.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_FrontBack.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_FrontBack.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
