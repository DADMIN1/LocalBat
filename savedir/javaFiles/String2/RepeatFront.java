package String2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p128796

/* Given a string and an int n, return a string made of the first n characters of the string, followed by the first n-1 characters of the string, and so on.
You may assume that n is between 0 and the length of the string, inclusive (i.e.
n >= 0 and n <= str.length()). */

class TestCases_RepeatFront
{
    // repeatFront("Chocolate", 4) → "ChocChoChC"
    // repeatFront("Chocolate", 3) → "ChoChC"
    // repeatFront("Ice Cream", 2) → "IcI"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "repeatFront(\"Chocolate\", 4) → \"ChocChoChC\"");
        testcaseMap.put(1, "repeatFront(\"Chocolate\", 3) → \"ChoChC\"");
        testcaseMap.put(2, "repeatFront(\"Ice Cream\", 2) → \"IcI\"");
    }

    static String[] expectedResults = { "ChocChoChC", "ChoChC", "IcI", };
}

public class RepeatFront
{
    public static String repeatFront(String str, int n)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            repeatFront("Chocolate", 4),
            repeatFront("Chocolate", 3),
            repeatFront("Ice Cream", 2),
        };


        TestCases_RepeatFront.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_RepeatFront.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_RepeatFront.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_RepeatFront.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
