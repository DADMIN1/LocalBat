package String1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p151940

/* Given a string, if the first or last chars are 'x', return the string without those 'x' chars, 
and otherwise return the string unchanged. */

class TestCases_WithoutX
{
    // withoutX("xHix") → "Hi"
    // withoutX("xHi") → "Hi"
    // withoutX("Hxix") → "Hxi"

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "withoutX(\"xHix\")");
        testcaseMap.put(1, "withoutX(\"xHi\")");
        testcaseMap.put(2, "withoutX(\"Hxix\")");
    }

    static String[] expectedResults = { "Hi", "Hi", "Hxi", };
}

public class WithoutX
{
    public static String withoutX(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        String[] resultsArray = {
            withoutX("xHix"),
            withoutX("xHi"),
            withoutX("Hxix"),
        };


        TestCases_WithoutX.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_WithoutX.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_WithoutX.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_WithoutX.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
