package String2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p165312

/* Given a string, return a string where for every char in the original, 
there are two chars. */

class TestCases_DoubleChar
{
    // doubleChar("The") → "TThhee"
    // doubleChar("AAbb") → "AAAAbbbb"
    // doubleChar("Hi-There") → "HHii--TThheerree"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "doubleChar(\"The\")");
        testcaseMap.put(1, "doubleChar(\"AAbb\")");
        testcaseMap.put(2, "doubleChar(\"Hi-There\")");
    }

    static String[] expectedResults = { "TThhee", "AAAAbbbb", "HHii--TThheerree", };
}

public class DoubleChar
{
    public static String doubleChar(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            doubleChar("The"),
            doubleChar("AAbb"),
            doubleChar("Hi-There"),
        };


        TestCases_DoubleChar.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_DoubleChar.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_DoubleChar.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_DoubleChar.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
