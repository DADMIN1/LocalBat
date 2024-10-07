package String3;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p131516

/* Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping.
For example, sameEnds("abXab") is "ab". */

class TestCases_SameEnds
{
    // sameEnds("abXYab") → "ab"
    // sameEnds("xx") → "x"
    // sameEnds("xxx") → "x"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "sameEnds(\"abXYab\") → \"ab\"");
        testcaseMap.put(1, "sameEnds(\"xx\") → \"x\"");
        testcaseMap.put(2, "sameEnds(\"xxx\") → \"x\"");
    }

    static String[] expectedResults = { "ab", "x", "x", };
}

public class SameEnds
{
    public static String sameEnds(String string)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            sameEnds("abXYab"),
            sameEnds("xx"),
            sameEnds("xxx"),
        };


        TestCases_SameEnds.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_SameEnds.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_SameEnds.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_SameEnds.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
