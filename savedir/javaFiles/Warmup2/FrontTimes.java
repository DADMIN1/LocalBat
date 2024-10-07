package Warmup2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p101475

/* Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3.
Return n copies of the front; */

class TestCases_FrontTimes
{
    // frontTimes("Chocolate", 2) → "ChoCho"
    // frontTimes("Chocolate", 3) → "ChoChoCho"
    // frontTimes("Abc", 3) → "AbcAbcAbc"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "frontTimes(\"Chocolate\", 2) → \"ChoCho\"");
        testcaseMap.put(1, "frontTimes(\"Chocolate\", 3) → \"ChoChoCho\"");
        testcaseMap.put(2, "frontTimes(\"Abc\", 3) → \"AbcAbcAbc\"");
    }

    static String[] expectedResults = { "ChoCho", "ChoChoCho", "AbcAbcAbc", };
}

public class FrontTimes
{
    public static String frontTimes(String str, int n)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            frontTimes("Chocolate", 2),
            frontTimes("Chocolate", 3),
            frontTimes("Abc", 3),
        };


        TestCases_FrontTimes.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_FrontTimes.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_FrontTimes.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_FrontTimes.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
