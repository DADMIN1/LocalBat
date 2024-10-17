package Warmup2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p165666

/* Given a string, return a new string made of every other char starting with the first, 
so "Hello" yields "Hlo". */

class TestCases_StringBits
{
    // stringBits("Hello") → "Hlo"
    // stringBits("Hi") → "H"
    // stringBits("Heeololeo") → "Hello"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "stringBits(\"Hello\")");
        testcaseMap.put(1, "stringBits(\"Hi\")");
        testcaseMap.put(2, "stringBits(\"Heeololeo\")");
    }

    static String[] expectedResults = { "Hlo", "H", "Hello", };
}

public class StringBits
{
    public static String stringBits(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            stringBits("Hello"),
            stringBits("Hi"),
            stringBits("Heeololeo"),
        };


        TestCases_StringBits.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_StringBits.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_StringBits.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_StringBits.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
