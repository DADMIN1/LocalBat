package String1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p151359

/* Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged.
This is a little harder than it looks. */

class TestCases_WithoutX2
{
    // withoutX2("xHi") → "Hi"
    // withoutX2("Hxi") → "Hi"
    // withoutX2("Hi") → "Hi"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "withoutX2(\"xHi\") → \"Hi\"");
        testcaseMap.put(1, "withoutX2(\"Hxi\") → \"Hi\"");
        testcaseMap.put(2, "withoutX2(\"Hi\") → \"Hi\"");
    }

    static String[] expectedResults = { "Hi", "Hi", "Hi", };
}

public class WithoutX2
{
    public static String withoutX2(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            withoutX2("xHi"),
            withoutX2("Hxi"),
            withoutX2("Hi"),
        };


        TestCases_WithoutX2.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_WithoutX2.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_WithoutX2.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_WithoutX2.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
