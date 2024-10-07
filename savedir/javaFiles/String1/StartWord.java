package String1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p141494

/* Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string, except its first char does not need to match exactly.
On a match, return the front of the string, or otherwise return the empty string.
So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip".
The word will be at least length 1. */

class TestCases_StartWord
{
    // startWord("hippo", "hi") → "hi"
    // startWord("hippo", "xip") → "hip"
    // startWord("hippo", "i") → "h"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "startWord(\"hippo\", \"hi\") → \"hi\"");
        testcaseMap.put(1, "startWord(\"hippo\", \"xip\") → \"hip\"");
        testcaseMap.put(2, "startWord(\"hippo\", \"i\") → \"h\"");
    }

    static String[] expectedResults = { "hi", "hip", "h", };
}

public class StartWord
{
    public static String startWord(String str, String word)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            startWord("hippo", "hi"),
            startWord("hippo", "xip"),
            startWord("hippo", "i"),
        };


        TestCases_StartWord.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_StartWord.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_StartWord.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_StartWord.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
