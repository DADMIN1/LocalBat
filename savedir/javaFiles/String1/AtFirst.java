package String1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p139076

/* Given a string, return a string length 2 made of its first 2 chars. 
If the string length is less than 2, use '@' for the missing chars. */

class TestCases_AtFirst
{
    // atFirst("hello") → "he"
    // atFirst("hi") → "hi"
    // atFirst("h") → "h@"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "atFirst(\"hello\")");
        testcaseMap.put(1, "atFirst(\"hi\")");
        testcaseMap.put(2, "atFirst(\"h\")");
    }

    static String[] expectedResults = { "he", "hi", "h@", };
}

public class AtFirst
{
    public static String atFirst(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            atFirst("hello"),
            atFirst("hi"),
            atFirst("h"),
        };


        TestCases_AtFirst.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_AtFirst.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_AtFirst.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_AtFirst.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
