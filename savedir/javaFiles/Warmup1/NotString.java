package Warmup1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p191914

/* Given a string, return a new string where "not " has been added to the front. 
However, if the string already begins with "not", return the string unchanged. 
Note: use .equals() to compare 2 strings. */

class TestCases_NotString
{
    // notString("candy") → "not candy"
    // notString("x") → "not x"
    // notString("not bad") → "not bad"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "notString(\"candy\")");
        testcaseMap.put(1, "notString(\"x\")");
        testcaseMap.put(2, "notString(\"not bad\")");
    }

    static String[] expectedResults = { "not candy", "not x", "not bad", };
}

public class NotString
{
    public static String notString(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            notString("candy"),
            notString("x"),
            notString("not bad"),
        };


        TestCases_NotString.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_NotString.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_NotString.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_NotString.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
