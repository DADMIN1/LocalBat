package String1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p143825

/* Given 2 strings, return their concatenation, except omit the first char of each. 
The strings will be at least length 1. */

class TestCases_NonStart
{
    // nonStart("Hello", "There") → "ellohere"
    // nonStart("java", "code") → "avaode"
    // nonStart("shotl", "java") → "hotlava"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "nonStart(\"Hello\", \"There\")");
        testcaseMap.put(1, "nonStart(\"java\", \"code\")");
        testcaseMap.put(2, "nonStart(\"shotl\", \"java\")");
    }

    static String[] expectedResults = { "ellohere", "avaode", "hotlava", };
}

public class NonStart
{
    public static String nonStart(String a, String b)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            nonStart("Hello", "There"),
            nonStart("java", "code"),
            nonStart("shotl", "java"),
        };


        TestCases_NonStart.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_NonStart.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_NonStart.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_NonStart.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
