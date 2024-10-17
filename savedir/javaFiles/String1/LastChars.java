package String1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p138183

/* Given 2 strings, a and b, 
return a new string made of the first char of a and the last char of b, 
so "yo" and "java" yields "ya". If either string is length 0, 
use '@' for its missing char. */

class TestCases_LastChars
{
    // lastChars("last", "chars") → "ls"
    // lastChars("yo", "java") → "ya"
    // lastChars("hi", "") → "h@"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "lastChars(\"last\", \"chars\")");
        testcaseMap.put(1, "lastChars(\"yo\", \"java\")");
        testcaseMap.put(2, "lastChars(\"hi\", \"\")");
    }

    static String[] expectedResults = { "ls", "ya", "h@", };
}

public class LastChars
{
    public static String lastChars(String a, String b)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            lastChars("last", "chars"),
            lastChars("yo", "java"),
            lastChars("hi", ""),
        };


        TestCases_LastChars.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_LastChars.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_LastChars.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_LastChars.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
