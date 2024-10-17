package Warmup2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p198640

/* Given 2 strings, a and b, 
return the number of the positions where they contain the same length 2 substring. 
So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", 
and "az" substrings appear in the same place in both strings. */

class TestCases_StringMatch
{
    // stringMatch("xxcaazz", "xxbaaz") → 3
    // stringMatch("abc", "abc") → 2
    // stringMatch("abc", "axc") → 0

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "stringMatch(\"xxcaazz\", \"xxbaaz\")");
        testcaseMap.put(1, "stringMatch(\"abc\", \"abc\")");
        testcaseMap.put(2, "stringMatch(\"abc\", \"axc\")");
    }

    static int[] expectedResults = { 3, 2, 0, };
}

public class StringMatch
{
    public static int stringMatch(String a, String b)
    {
        
    }


    public static void main(String[] args)
    {
                        
        int[] resultsArray = {
            stringMatch("xxcaazz", "xxbaaz"),
            stringMatch("abc", "abc"),
            stringMatch("abc", "axc"),
        };


        TestCases_StringMatch.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_StringMatch.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_StringMatch.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_StringMatch.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
