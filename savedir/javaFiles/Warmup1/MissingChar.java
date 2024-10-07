package Warmup1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p190570

/* Given a non-empty string and an int n, return a new string where the char at index n has been removed.
The value of n will be a valid index of a char in the original string (i.e.
n will be in the range 0..str.length()-1 inclusive). */

class TestCases_MissingChar
{
    // missingChar("kitten", 1) → "ktten"
    // missingChar("kitten", 0) → "itten"
    // missingChar("kitten", 4) → "kittn"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "missingChar(\"kitten\", 1) → \"ktten\"");
        testcaseMap.put(1, "missingChar(\"kitten\", 0) → \"itten\"");
        testcaseMap.put(2, "missingChar(\"kitten\", 4) → \"kittn\"");
    }

    static String[] expectedResults = { "ktten", "itten", "kittn", };
}

public class MissingChar
{
    public static String missingChar(String str, int n)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            missingChar("kitten", 1),
            missingChar("kitten", 0),
            missingChar("kitten", 4),
        };


        TestCases_MissingChar.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_MissingChar.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_MissingChar.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_MissingChar.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
