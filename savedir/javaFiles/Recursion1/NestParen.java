package Recursion1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p183174

/* Given a string, return true if it is a nesting of zero or more pairs of parenthesis, like "(())" or "((()))".
Suggestion: check the first and last chars, and then recur on what's inside them. */

class TestCases_NestParen
{
    // nestParen("(())") → true
    // nestParen("((()))") → true
    // nestParen("(((x))") → false

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "nestParen(\"(())\") → true");
        testcaseMap.put(1, "nestParen(\"((()))\") → true");
        testcaseMap.put(2, "nestParen(\"(((x))\") → false");
    }

    static boolean[] expectedResults = { true, true, false, };
}

public class NestParen
{
    public static boolean nestParen(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            nestParen("(())"),
            nestParen("((()))"),
            nestParen("(((x))"),
        };


        TestCases_NestParen.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_NestParen.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_NestParen.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_NestParen.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
