package String1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p144623

/* Given a string and an index, return a string length 2 starting at the given index. 
If the index is too big or too small to define a string length 2, 
use the first 2 chars. The string length will be at least 2. */

class TestCases_TwoChar
{
    // twoChar("java", 0) → "ja"
    // twoChar("java", 2) → "va"
    // twoChar("java", 3) → "ja"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "twoChar(\"java\", 0)");
        testcaseMap.put(1, "twoChar(\"java\", 2)");
        testcaseMap.put(2, "twoChar(\"java\", 3)");
    }

    static String[] expectedResults = { "ja", "va", "ja", };
}

public class TwoChar
{
    public static String twoChar(String str, int index)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            twoChar("java", 0),
            twoChar("java", 2),
            twoChar("java", 3),
        };


        TestCases_TwoChar.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_TwoChar.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_TwoChar.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_TwoChar.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
