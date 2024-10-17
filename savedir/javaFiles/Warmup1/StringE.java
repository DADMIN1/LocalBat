package Warmup1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p173784

/* Return true if the given string contains between 1 and 3 'e' chars. */

class TestCases_StringE
{
    // stringE("Hello") → true
    // stringE("Heelle") → true
    // stringE("Heelele") → false

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "stringE(\"Hello\")");
        testcaseMap.put(1, "stringE(\"Heelle\")");
        testcaseMap.put(2, "stringE(\"Heelele\")");
    }

    static boolean[] expectedResults = { true, true, false, };
}

public class StringE
{
    public static boolean stringE(String str)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            stringE("Hello"),
            stringE("Heelle"),
            stringE("Heelele"),
        };


        TestCases_StringE.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_StringE.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_StringE.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_StringE.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
