package String2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p147538

/* Given a string and a non-empty word string, 
return a string made of each char just before and just after every appearance of the word in the string. 
Ignore cases where there is no char before or after the word, 
and a char may be included twice if it is between two words. */

class TestCases_WordEnds
{
    // wordEnds("abcXY123XYijk", "XY") → "c13i"
    // wordEnds("XY123XY", "XY") → "13"
    // wordEnds("XY1XY", "XY") → "11"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "wordEnds(\"abcXY123XYijk\", \"XY\")");
        testcaseMap.put(1, "wordEnds(\"XY123XY\", \"XY\")");
        testcaseMap.put(2, "wordEnds(\"XY1XY\", \"XY\")");
    }

    static String[] expectedResults = { "c13i", "13", "11", };
}

public class WordEnds
{
    public static String wordEnds(String str, String word)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            wordEnds("abcXY123XYijk", "XY"),
            wordEnds("XY123XY", "XY"),
            wordEnds("XY1XY", "XY"),
        };


        TestCases_WordEnds.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_WordEnds.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_WordEnds.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_WordEnds.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
