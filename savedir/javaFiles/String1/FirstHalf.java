package String1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p172267

/* Given a string of even length, return the first half.
So the string "WooHoo" yields "Woo". */

class TestCases_FirstHalf
{
    // firstHalf("WooHoo") → "Woo"
    // firstHalf("HelloThere") → "Hello"
    // firstHalf("abcdef") → "abc"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "firstHalf(\"WooHoo\") → \"Woo\"");
        testcaseMap.put(1, "firstHalf(\"HelloThere\") → \"Hello\"");
        testcaseMap.put(2, "firstHalf(\"abcdef\") → \"abc\"");
    }

    static String[] expectedResults = { "Woo", "Hello", "abc", };
}

public class FirstHalf
{
    public static String firstHalf(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            firstHalf("WooHoo"),
            firstHalf("HelloThere"),
            firstHalf("abcdef"),
        };


        TestCases_FirstHalf.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_FirstHalf.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_FirstHalf.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_FirstHalf.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
