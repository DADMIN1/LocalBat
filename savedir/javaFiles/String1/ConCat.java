package String1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p132118

/* Given two strings, append them together (known as "concatenation") and return the result.
However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat". */

class TestCases_ConCat
{
    // conCat("abc", "cat") → "abcat"
    // conCat("dog", "cat") → "dogcat"
    // conCat("abc", "") → "abc"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "conCat(\"abc\", \"cat\") → \"abcat\"");
        testcaseMap.put(1, "conCat(\"dog\", \"cat\") → \"dogcat\"");
        testcaseMap.put(2, "conCat(\"abc\", \"\") → \"abc\"");
    }

    static String[] expectedResults = { "abcat", "dogcat", "abc", };
}

public class ConCat
{
    public static String conCat(String a, String b)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            conCat("abc", "cat"),
            conCat("dog", "cat"),
            conCat("abc", ""),
        };


        TestCases_ConCat.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_ConCat.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_ConCat.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_ConCat.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
