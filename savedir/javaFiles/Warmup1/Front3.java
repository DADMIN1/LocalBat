package Warmup1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p136351

/* Given a string, we'll say that the front is the first 3 chars of the string. 
If the string length is less than 3, the front is whatever is there. 
Return a new string which is 3 copies of the front. */

class TestCases_Front3
{
    // front3("Java") → "JavJavJav"
    // front3("Chocolate") → "ChoChoCho"
    // front3("abc") → "abcabcabc"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "front3(\"Java\")");
        testcaseMap.put(1, "front3(\"Chocolate\")");
        testcaseMap.put(2, "front3(\"abc\")");
    }

    static String[] expectedResults = { "JavJavJav", "ChoChoCho", "abcabcabc", };
}

public class Front3
{
    public static String front3(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            front3("Java"),
            front3("Chocolate"),
            front3("abc"),
        };


        TestCases_Front3.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_Front3.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_Front3.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_Front3.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
