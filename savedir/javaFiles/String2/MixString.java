package String2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p125185

/* Given two strings, a and b, create a bigger string made of the first char of a, 
the first char of b, the second char of a, the second char of b, 
and so on. Any leftover chars go at the end of the result. */

class TestCases_MixString
{
    // mixString("abc", "xyz") → "axbycz"
    // mixString("Hi", "There") → "HTihere"
    // mixString("xxxx", "There") → "xTxhxexre"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "mixString(\"abc\", \"xyz\")");
        testcaseMap.put(1, "mixString(\"Hi\", \"There\")");
        testcaseMap.put(2, "mixString(\"xxxx\", \"There\")");
    }

    static String[] expectedResults = { "axbycz", "HTihere", "xTxhxexre", };
}

public class MixString
{
    public static String mixString(String a, String b)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            mixString("abc", "xyz"),
            mixString("Hi", "There"),
            mixString("xxxx", "There"),
        };


        TestCases_MixString.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_MixString.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_MixString.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_MixString.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
