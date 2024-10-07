package Recursion1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p104029

/* Given a string, return recursively a "cleaned" string where adjacent chars that are the same have been reduced to a single char.
So "yyzzza" yields "yza". */

class TestCases_StringClean
{
    // stringClean("yyzzza") → "yza"
    // stringClean("abbbcdd") → "abcd"
    // stringClean("Hello") → "Helo"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "stringClean(\"yyzzza\") → \"yza\"");
        testcaseMap.put(1, "stringClean(\"abbbcdd\") → \"abcd\"");
        testcaseMap.put(2, "stringClean(\"Hello\") → \"Helo\"");
    }

    static String[] expectedResults = { "yza", "abcd", "Helo", };
}

public class StringClean
{
    public static String stringClean(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            stringClean("yyzzza"),
            stringClean("abbbcdd"),
            stringClean("Hello"),
        };


        TestCases_StringClean.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_StringClean.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_StringClean.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_StringClean.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
