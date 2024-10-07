package String1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p172063

/* Given a string, return a new string made of 3 copies of the first 2 chars of the original string.
The string may be any length.
If there are fewer than 2 chars, use whatever is there. */

class TestCases_ExtraFront
{
    // extraFront("Hello") → "HeHeHe"
    // extraFront("ab") → "ababab"
    // extraFront("H") → "HHH"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "extraFront(\"Hello\") → \"HeHeHe\"");
        testcaseMap.put(1, "extraFront(\"ab\") → \"ababab\"");
        testcaseMap.put(2, "extraFront(\"H\") → \"HHH\"");
    }

    static String[] expectedResults = { "HeHeHe", "ababab", "HHH", };
}

public class ExtraFront
{
    public static String extraFront(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            extraFront("Hello"),
            extraFront("ab"),
            extraFront("H"),
        };


        TestCases_ExtraFront.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_ExtraFront.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_ExtraFront.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_ExtraFront.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
