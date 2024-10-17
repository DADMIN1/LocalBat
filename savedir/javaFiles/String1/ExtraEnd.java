package String1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p108853

/* Given a string, return a new string made of 3 copies of the last 2 chars of the original string. 
The string length will be at least 2. */

class TestCases_ExtraEnd
{
    // extraEnd("Hello") → "lololo"
    // extraEnd("ab") → "ababab"
    // extraEnd("Hi") → "HiHiHi"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "extraEnd(\"Hello\")");
        testcaseMap.put(1, "extraEnd(\"ab\")");
        testcaseMap.put(2, "extraEnd(\"Hi\")");
    }

    static String[] expectedResults = { "lololo", "ababab", "HiHiHi", };
}

public class ExtraEnd
{
    public static String extraEnd(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            extraEnd("Hello"),
            extraEnd("ab"),
            extraEnd("Hi"),
        };


        TestCases_ExtraEnd.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_ExtraEnd.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_ExtraEnd.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_ExtraEnd.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
