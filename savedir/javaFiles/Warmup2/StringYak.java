package Warmup2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p126212

/* Suppose the string "yak" is unlucky.
Given a string, return a version where all the "yak" are removed, but the "a" can be any char.
The "yak" strings will not overlap. */

class TestCases_StringYak
{
    // stringYak("yakpak") → "pak"
    // stringYak("pakyak") → "pak"
    // stringYak("yak123ya") → "123ya"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "stringYak(\"yakpak\") → \"pak\"");
        testcaseMap.put(1, "stringYak(\"pakyak\") → \"pak\"");
        testcaseMap.put(2, "stringYak(\"yak123ya\") → \"123ya\"");
    }

    static String[] expectedResults = { "pak", "pak", "123ya", };
}

public class StringYak
{
    public static String stringYak(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            stringYak("yakpak"),
            stringYak("pakyak"),
            stringYak("yak123ya"),
        };


        TestCases_StringYak.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_StringYak.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_StringYak.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_StringYak.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
