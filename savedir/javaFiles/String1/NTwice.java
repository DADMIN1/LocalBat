package String1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p174148

/* Given a string and an int n, return a string made of the first and last n chars from the string. 
The string length will be at least n. */

class TestCases_NTwice
{
    // nTwice("Hello", 2) → "Helo"
    // nTwice("Chocolate", 3) → "Choate"
    // nTwice("Chocolate", 1) → "Ce"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "nTwice(\"Hello\", 2)");
        testcaseMap.put(1, "nTwice(\"Chocolate\", 3)");
        testcaseMap.put(2, "nTwice(\"Chocolate\", 1)");
    }

    static String[] expectedResults = { "Helo", "Choate", "Ce", };
}

public class NTwice
{
    public static String nTwice(String str, int n)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            nTwice("Hello", 2),
            nTwice("Chocolate", 3),
            nTwice("Chocolate", 1),
        };


        TestCases_NTwice.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_NTwice.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_NTwice.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_NTwice.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
