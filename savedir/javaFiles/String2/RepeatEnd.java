package String2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p152339

/* Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
You may assume that n is between 0 and the length of the string, inclusive. */

class TestCases_RepeatEnd
{
    // repeatEnd("Hello", 3) → "llollollo"
    // repeatEnd("Hello", 2) → "lolo"
    // repeatEnd("Hello", 1) → "o"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "repeatEnd(\"Hello\", 3) → \"llollollo\"");
        testcaseMap.put(1, "repeatEnd(\"Hello\", 2) → \"lolo\"");
        testcaseMap.put(2, "repeatEnd(\"Hello\", 1) → \"o\"");
    }

    static String[] expectedResults = { "llollollo", "lolo", "o", };
}

public class RepeatEnd
{
    public static String repeatEnd(String str, int n)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            repeatEnd("Hello", 3),
            repeatEnd("Hello", 2),
            repeatEnd("Hello", 1),
        };


        TestCases_RepeatEnd.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_RepeatEnd.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_RepeatEnd.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_RepeatEnd.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
