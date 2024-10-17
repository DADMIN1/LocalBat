package String1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p163411

/* Given a string, return the string made of its first two chars, 
so the String "Hello" yields "He". If the string is shorter than length 2, 
return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". 
Note that str.length() returns the length of a string. */

class TestCases_FirstTwo
{
    // firstTwo("Hello") → "He"
    // firstTwo("abcdefg") → "ab"
    // firstTwo("ab") → "ab"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "firstTwo(\"Hello\")");
        testcaseMap.put(1, "firstTwo(\"abcdefg\")");
        testcaseMap.put(2, "firstTwo(\"ab\")");
    }

    static String[] expectedResults = { "He", "ab", "ab", };
}

public class FirstTwo
{
    public static String firstTwo(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            firstTwo("Hello"),
            firstTwo("abcdefg"),
            firstTwo("ab"),
        };


        TestCases_FirstTwo.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_FirstTwo.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_FirstTwo.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_FirstTwo.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
