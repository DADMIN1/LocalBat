package String1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p196652

/* Given a string, return true if the first 2 chars in the string also appear at the end of the string, 
such as with "edited". */

class TestCases_FrontAgain
{
    // frontAgain("edited") → true
    // frontAgain("edit") → false
    // frontAgain("ed") → true

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "frontAgain(\"edited\")");
        testcaseMap.put(1, "frontAgain(\"edit\")");
        testcaseMap.put(2, "frontAgain(\"ed\")");
    }

    static boolean[] expectedResults = { true, false, true, };
}

public class FrontAgain
{
    public static boolean frontAgain(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            frontAgain("edited"),
            frontAgain("edit"),
            frontAgain("ed"),
        };


        TestCases_FrontAgain.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_FrontAgain.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_FrontAgain.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_FrontAgain.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
