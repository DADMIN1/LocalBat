package String1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p197720

/* Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. 
The string length will be at least 2. */

class TestCases_Left2
{
    // left2("Hello") → "lloHe"
    // left2("java") → "vaja"
    // left2("Hi") → "Hi"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "left2(\"Hello\")");
        testcaseMap.put(1, "left2(\"java\")");
        testcaseMap.put(2, "left2(\"Hi\")");
    }

    static String[] expectedResults = { "lloHe", "vaja", "Hi", };
}

public class Left2
{
    public static String left2(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            left2("Hello"),
            left2("java"),
            left2("Hi"),
        };


        TestCases_Left2.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_Left2.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_Left2.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_Left2.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
