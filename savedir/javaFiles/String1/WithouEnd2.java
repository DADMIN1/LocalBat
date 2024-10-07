package String1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p174254

/* Given a string, return a version without both the first and last char of the string.
The string may be any length, including 0. */

class TestCases_WithouEnd2
{
    // withouEnd2("Hello") → "ell"
    // withouEnd2("abc") → "b"
    // withouEnd2("ab") → ""

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "withouEnd2(\"Hello\") → \"ell\"");
        testcaseMap.put(1, "withouEnd2(\"abc\") → \"b\"");
        testcaseMap.put(2, "withouEnd2(\"ab\") → \"\"");
    }

    static String[] expectedResults = { "ell", "b", "", };
}

public class WithouEnd2
{
    public static String withouEnd2(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            withouEnd2("Hello"),
            withouEnd2("abc"),
            withouEnd2("ab"),
        };


        TestCases_WithouEnd2.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_WithouEnd2.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_WithouEnd2.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_WithouEnd2.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
