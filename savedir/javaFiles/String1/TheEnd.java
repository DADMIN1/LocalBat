package String1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p162477

/* Given a string, return a string length 1 from its front, 
unless front is false, in which case return a string length 1 from its back. 
The string will be non-empty. */

class TestCases_TheEnd
{
    // theEnd("Hello", true) → "H"
    // theEnd("Hello", false) → "o"
    // theEnd("oh", true) → "o"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "theEnd(\"Hello\", true)");
        testcaseMap.put(1, "theEnd(\"Hello\", false)");
        testcaseMap.put(2, "theEnd(\"oh\", true)");
    }

    static String[] expectedResults = { "H", "o", "o", };
}

public class TheEnd
{
    public static String theEnd(String str, boolean front)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            theEnd("Hello", true),
            theEnd("Hello", false),
            theEnd("oh", true),
        };


        TestCases_TheEnd.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_TheEnd.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_TheEnd.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_TheEnd.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
