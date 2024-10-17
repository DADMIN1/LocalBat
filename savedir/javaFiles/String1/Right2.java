package String1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p130781

/* Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. 
The string length will be at least 2. */

class TestCases_Right2
{
    // right2("Hello") → "loHel"
    // right2("java") → "vaja"
    // right2("Hi") → "Hi"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "right2(\"Hello\")");
        testcaseMap.put(1, "right2(\"java\")");
        testcaseMap.put(2, "right2(\"Hi\")");
    }

    static String[] expectedResults = { "loHel", "vaja", "Hi", };
}

public class Right2
{
    public static String right2(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            right2("Hello"),
            right2("java"),
            right2("Hi"),
        };


        TestCases_Right2.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_Right2.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_Right2.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_Right2.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
