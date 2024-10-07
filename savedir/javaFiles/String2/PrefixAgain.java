package String2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p136417

/* Given a string, consider the prefix string made of the first N chars of the string.
Does that prefix string appear somewhere else in the string? Assume that the string is not empty and that N is in the range 1..str.length(). */

class TestCases_PrefixAgain
{
    // prefixAgain("abXYabc", 1) → true
    // prefixAgain("abXYabc", 2) → true
    // prefixAgain("abXYabc", 3) → false

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "prefixAgain(\"abXYabc\", 1) → true");
        testcaseMap.put(1, "prefixAgain(\"abXYabc\", 2) → true");
        testcaseMap.put(2, "prefixAgain(\"abXYabc\", 3) → false");
    }

    static boolean[] expectedResults = { true, true, false, };
}

public class PrefixAgain
{
    public static boolean prefixAgain(String str, int n)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            prefixAgain("abXYabc", 1),
            prefixAgain("abXYabc", 2),
            prefixAgain("abXYabc", 3),
        };


        TestCases_PrefixAgain.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_PrefixAgain.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_PrefixAgain.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_PrefixAgain.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
